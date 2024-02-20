package ejercicios;

import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int[] arrayEnteros = crearArrayEnterosDel9Al0();

        System.out.println("Array sin ordenar:");
        mostrarArrayEnteros(arrayEnteros);

        System.out.println("\nArray ordenado ascendentemente:");
        Arrays.sort(arrayEnteros);
        mostrarArrayEnteros(arrayEnteros);
    }

    public static int[] crearArrayEnterosDel9Al0() {
        int[] arrayEnteros = new int[10];
        int valor = 9;

        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = valor;
            valor--;
        }

        return arrayEnteros;
    }

    // (?) Otra opción
//    public static int[] crearArrayEnterosDel9Al0() {
//        int[] arrayEnteros = new int[10];
//        for (int i = 0; i < arrayEnteros.length; i++) {
//            arrayEnteros[i] = arrayEnteros.length - 1 - i;
//        }
//        return arrayEnteros;
//    }

    // (??) Otra opción 
//    public static int[] crearArrayEnterosDel9Al0() {
//        int[] arrayEnteros = new int[10];
//        int numero = 0;
//
//        for (int i = arrayEnteros.length - 1; i >= 0; i--) {
//            arrayEnteros[i] = numero;
//            numero++;
//        }
//        return arrayEnteros;
//    }

    public static void mostrarArrayEnteros(int[] arrayEnteros) {
        for (int entero : arrayEnteros) {
            System.out.print(entero + " ");
        }
        System.out.println("");
    }
}
