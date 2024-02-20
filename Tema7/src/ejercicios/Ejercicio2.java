package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] array = new int[pedirLongitud()];
        rellenarArray(array);
        mostrarArray(array);
    }

    /**
     * Método que pide al usuario la longitud de un array. Esa longitud debe
     * estar entre 1 y 10. Si no se cumple, se imprime un mensaje y se vuelve a
     * pedir el número. También se controla que el usuario introduzca un número
     * entero y no otro tipo de dato.
     *
     * @return el número
     */
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        do {
            try {
                System.out.print("Elige la longitud del array (entre 1 y 10): ");
                numero = entrada.nextInt();
                if (numero < 1 || numero > 10) {
                    System.out.println("Por favor, introudce un número entre 1 y 10");
                }

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (numero < 1 || numero > 10);
        return numero;
    }
//    

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(1, 6);
        }
    }

    public static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print("[" + numero + "]");
        }
    }
}
