package ejercicios;

import static ejercicios.Ejercicio2.generarNumeroAleatorio;
import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int[] array = new int[10];
        rellenarArray(array);
        mostrarArray(array);
        ordenarArrayDescendentemente(array);
        mostrarArray(array);
    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(0, 10);
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void ordenarArrayDescendentemente(int[] array) {
        int aux = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
