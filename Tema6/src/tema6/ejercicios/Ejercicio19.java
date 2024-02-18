package tema6.ejercicios;

import static tema6.Tema6.generarNumeroAleatorio;
import static tema6.Tema6.mostrarArray;

/**
 *
 * @author d3stroya
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        int[] array = crearArray1080();
        mostrarArray(array);
        System.out.println("Mayor: " + buscarMayor(array));
        System.out.println("Menor: " + buscarMenor(array));
        buscarMasRepetido(array);
        System.out.println("Media: " + calcularMedia(array));
    }

    public static int[] crearArray1080() {
        int[] array = new int[80];
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(10, 80);
        }
        return array;
    }

    public static double calcularMedia(int[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        return media / array.length;
    }

    public static int buscarMayor(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static int buscarMenor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static void buscarMasRepetido(int[] array) {
        // Creo un array donde guardar cuántas veces aparece cada número.
        int[] contador = new int[71];
        int numero = 0;

        // Recorro el array original. Cada vez que aparece un número,
        // sumo 1 a su correspondiente posición en el array contador.
        // El 10 se guardará en la posición 0, el 11 en la posición 1, ... 
        // Para ello, le resto 10 al número y obtengo el índice del array contador
        for (int i = 0; i < array.length; i++) {
            numero = array[i];
            contador[numero - 10]++;
        }

        mostrarArray(contador);

        // Busco el mayor valor en contador, que me da el índice - 10 del número más repetido
        int masRepetido = 10, mayor = 0;

        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > mayor) {
                mayor = contador[i];
                masRepetido = i + 10;
            }
        }

        System.out.println("El número más repetido es el " + masRepetido + ", que está " + mayor + " veces.");
    }
}
