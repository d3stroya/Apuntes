
package tema11.ejercicios;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio01 {
/**
     * Método que calcula una temperatura aleatoria entre -10 y 40 grados.
     *
     * @return
     */
    public static int generarTemperaturaAleatoria() {
        return (int) Math.floor(Math.random() * 50 - 10);
    }

    /**
     * Método que rellena el mapa con una clave 1-31 y un valor Dia con el
     * nombre del día de la semana y una temperatura que se genera
     * aleatoriamente. El primer día de la semana se calcula aleatoriamente, ya
     * que no tiene por qué ser el lunes.
     *
     * @param mapa
     */
    public static void rellenarTemperaturas(HashMap mapa) {
        System.out.println("\nRellenando mapa de temperaturas...");
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int indicePrimerDia = (int) Math.floor(Math.random() * 7);

        for (int i = 1; i < 32; i++) {
            mapa.put(i, new Dia(nombreDias[indicePrimerDia % 7], generarTemperaturaAleatoria()));
            indicePrimerDia++;
        }
    }

    /**
     * Método que recorre el mapa y muestra cada día con su nombre, número y
     * temperatura.
     *
     * @param mapa
     */
    public static void mostrarTemperaturas(HashMap mapa) {
        System.out.println("\nMostrando temperaturas...");
        int clave = 0;
        Dia dia = new Dia();
        Iterator iterador = mapa.keySet().iterator();
        while (iterador.hasNext()) {
            clave = (int) iterador.next();
            dia = (Dia) mapa.get(clave);
            System.out.println(dia.getNombre() + " día " + clave + ": " + dia.getTemperatura() + " grados.");
        }
    }

    /**
     * Método que calcula la temperatura media de los días que contiene el mapa
     *
     * @param mapa
     * @return la temperatura media
     */
    public static int calcularTemperaturaMedia(HashMap mapa) {
        int media = 0;
        Iterator iterador = mapa.keySet().iterator();
        int clave = 0;
        Dia dia = new Dia();

        while (iterador.hasNext()) {
            clave = (int) iterador.next();
            dia = (Dia) mapa.get(clave);
            media += dia.getTemperatura();
        }
        return media / mapa.size();
    }

    /**
     * Método que recorre el mapa en busca del día con la temperatura más alta y
     * lo muestra por pantalla. Después lo vuelve a recorres para encontrar, si
     * los hay, días con la misma temperatura, y los muestra por pantalla.
     *
     * @param mapa
     */
    public static void buscarDiasMasCalurosos(HashMap mapa) {
        System.out.println("\nMostrando día(s) más caluroso(s)...");

        Iterator<Integer> iterador = mapa.keySet().iterator();
        int clave = 1;

        Dia diaMasCaluroso = (Dia) mapa.get(clave);
        Dia diaActual = new Dia();

        int numeroDia = 0;

        while (iterador.hasNext()) {
            clave = (int) iterador.next();
            diaActual = (Dia) mapa.get(clave);

            if (diaActual.getTemperatura() > diaMasCaluroso.getTemperatura()) {
                diaMasCaluroso = diaActual;
                numeroDia = clave;
            }

        }
        System.out.println("El " + diaMasCaluroso.getNombre() + " día "
                + numeroDia + " con " + diaMasCaluroso.getTemperatura() + " grados.");

        while (iterador.hasNext()) {
            clave = (int) iterador.next();
            diaActual = (Dia) mapa.get(clave);

            if (clave != numeroDia && diaActual.getTemperatura() == diaMasCaluroso.getTemperatura()) {
                System.out.println("El " + diaActual.getNombre() + " día "
                        + clave + " con " + diaActual.getTemperatura() + " grados.");
            }
        }
    }

    public static void lanzarEjercicio1() {
        HashMap mapa = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\nElige una opción:");
                System.out.println("[1] Rellenar temperaturas");
                System.out.println("[2] Mostrar temperaturas");
                System.out.println("[3] Visualizar temperatura media del mes");
                System.out.println("[4] Mostrar días más calursosos");
                System.out.println("[5] Salir");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 ->
                        rellenarTemperaturas(mapa);
                    case 2 ->
                        mostrarTemperaturas(mapa);
                    case 3 ->
                        System.out.println("Temperatura media del mes: " + calcularTemperaturaMedia(mapa) + " grados.");
                    case 4 ->
                        buscarDiasMasCalurosos(mapa);
                    case 5 ->
                        System.out.println("Cerrando programa...");
                    default ->
                        System.out.println("Elige una opción válida");
                }
            } catch (InputMismatchException e) {
                e.getMessage();
            }
        } while (opcion != 5);

    }
    
    public static void main(String[] args) {
        lanzarEjercicio1();
    }
}
