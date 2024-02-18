package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        int arreglo[] = dividirNumero(numero);
        mostrarArreglo(arreglo);
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número de 5 cifras: ");
        return entrada.nextInt();
    }

    public static int[] dividirNumero(int numero) {
        int[] arreglo = new int[5];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numero % 10;
            numero /= 10;
        }
        return arreglo;
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
    }
}
