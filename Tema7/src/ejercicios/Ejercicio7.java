package ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import tema7.Dia;

/**
 *
 * @author d3stroya
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Dia[] dias = new Dia[30];
        mostrarMenu(dias);
    }

    /**
     * Método que registra las temperaturas de cada día.
     *
     * @param dias
     * @return
     */
    public static Dia[] registrarTemperaturasPorDia(Dia[] dias) {
        rellenarDias(dias);

        for (Dia dia : dias) {
            dia.setTemperatura((int) generarTemperaturaAleatoria());
        }

        return dias;
    }

    /**
     * Método que rellena todas las posiciones del array con objetos de la clase
     * día con valores de nombre (Lunes - Domingo) y número de día (1 - 30). El
     * día 1 no tiene por qué ser lunes; es un número aleatorio del array de
     * nombreDias
     *
     * @param dias
     * @return el array relleno
     */
    public static Dia[] rellenarDias(Dia[] dias) {
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Le asignamos al primer día un nombre aleatorio del array nombreDias
        int numeroAleatorio = (int) (Math.random() * 7);
        dias[0] = new Dia(nombreDias[numeroAleatorio], 1);

        /* Recorremos el array de días creando nuevos objetos de la clase Dia
        * con el nombre y el número
        * IMPORTANTE: usamos el módulo con la longitud de nombreDias para que, cuando
        * llegue al final, vuelva a 0 y se repita cíclicamente.
         */
        for (int i = 1; i < dias.length; i++) {
            numeroAleatorio++;
            dias[i] = new Dia(nombreDias[numeroAleatorio % nombreDias.length], (i + 1));
        }

        return dias;
    }

    /**
     * Método que genera temperaturas aleatorias entre -5 y 44 grados
     *
     * @return la temperatura
     */
    public static double generarTemperaturaAleatoria() {
        return Math.floor(Math.random() * 50 - 5);
    }

    /**
     * Método que recorre el array de días imprimiendo cada día por pantalla
     *
     * @param dias
     */
    public static void mostrarTemperaturas(Dia[] dias) {
        for (Dia dia : dias) {
            System.out.println(dia.getNombre() + " día " + dia.getNumeroDia() + ": " + dia.getTemperatura() + " grados.");
        }
    }

    /**
     * Método que calcula la temperatura media y la muestra por pantalla
     *
     * @param dias
     */
    public static void visualizarTemperaturaMedia(Dia[] dias) {
        int media = 0;
        for (Dia dia : dias) {
            media += dia.getTemperatura();
        }
        System.out.println("Temperatura media: " + media / dias.length);
    }

    /**
     * Método que ordena descendentemente el array de días por temperatura y
     * muestra el día o días más calurosos, si hay varios con la máxima
     * temperatura.
     *
     * @param dias
     */
    public static void buscarDiaMasCalurosos(Dia[] dias) {
        // Creo una copia del array para no modificar el original
        Dia[] diasOrdenados = dias.clone();
        // Ordeno el array por temperatura
        Arrays.sort(diasOrdenados);
        System.out.println("El día o días más caluroso(s) fue(ron):");

        // Por defecto, el día más caluroso será el primero. Lo muestro por pantalla
        Dia diaMasCaluroso = diasOrdenados[0];
        System.out.println("El " + diaMasCaluroso.getNombre() + " día "
                + diaMasCaluroso.getNumeroDia() + " con "
                + diaMasCaluroso.getTemperatura() + " grados.");

        // Recorro el array a partir del segundo día 
        //para ver si hay más días con la misma temperatura.
        // Si los hay, los muestro.
        for (int i = 1; i < diasOrdenados.length; i++) {
            if (diasOrdenados[i].getTemperatura() == diaMasCaluroso.getTemperatura()) {
                System.out.println("El " + diasOrdenados[i].getNombre() + " día " + diasOrdenados[i].getNumeroDia()
                        + " con " + diasOrdenados[i].getTemperatura() + " grados.");
            }
        }
    }

    /**
     * Método que muestra el menú del programa
     *
     * @param dias
     */
    public static void mostrarMenu(Dia[] dias) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n*** REGISTRO DE TEMPERATURAS ***");
            System.out.println("[1] Rellenar temperaturas");
            System.out.println("[2] Mostrar temperaturas");
            System.out.println("[3] Visualizar temperatura media del mes");
            System.out.println("[4] Mostrar día(s) más caluroso(s)");
            System.out.println("[5] Salir\n");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 ->
                        registrarTemperaturasPorDia(dias);
                    case 2 ->
                        mostrarTemperaturas(dias);
                    case 3 ->
                        visualizarTemperaturaMedia(dias);
                    case 4 ->
                        buscarDiaMasCalurosos(dias);
                    case 5 ->
                        System.out.println("Cerrando programa...");
                    default ->
                        System.out.println("Por favor, selecciona una opción válida (1-5)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Debes introducir un número del 1 al 5.");
            }

        } while (opcion != 5);
    }
}
