package tema6.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import static tema6.Tema6.mostrarArray;

/**
 *
 * @author d3stroya
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] arreglo = rellenarArray(pedirLongitud());
        mostrarArray(arreglo);
    }

    /**
     * Método que pide al usuario la longitud del arreglo. Controla la excepción
     * si el usuario no introduce un número entero. Vuelve a pedir el número
     * hasta que el usuario introduzca uno entre 1 y 10.
     *
     * @return la longitud que introduce el usuario
     */
    public static int pedirLongitud() {
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Introduzca la longitud del arreglo (entre 1 y 10): ");
            try {
                longitud = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Error. Introduzca un número entero entre 1 y 10");
            }
        } while (longitud < 0 || longitud > 10);
        return longitud;
    }

    /**
     * Método que crea un arreglo de la longitud pasada por parámetro y lo
     * rellena con números aleatorios entre 1 y 6.
     *
     * @param longitud
     * @return el arreglo relleno.
     */
    public static int[] rellenarArray(int longitud) {
        int[] arreglo = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = generarNumeroAleatorio(1, 6);
        }
        return arreglo;
    }

    /**
     * Método que genera un número aleatorio dentro de un rango especificado por
     * parámetro.
     *
     * @param numeroInferior
     * @param numeroSuperior
     * @return el número entero aleatorio.
     */
    public static int generarNumeroAleatorio(int numeroInferior, int numeroSuperior) {
        double numeroAleatorio = Math.floor(Math.random() * numeroSuperior) + numeroInferior;
        return (int) numeroAleatorio;
    }

    public static void mostrarArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
