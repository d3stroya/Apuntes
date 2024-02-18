package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        int numeroCifras = contarCifras(numero);
        int arreglo[] = dividirNumero(numero, numeroCifras);
        mostrarArreglo(arreglo);
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }

    public static int contarCifras(int numero) {
        // https://es.stackoverflow.com/questions/36106/c%C3%B3mo-obtener-total-d%C3%ADgitos-de-un-numero-en-java
        int numeroCifras = 0;
        if (numero == 0) {
            numeroCifras++;
        } else {
            numeroCifras = (int) Math.log10(Math.abs(numero)) + 1;
        }
        return numeroCifras;
    }

    public static int[] dividirNumero(int numero, int numeroCifras) {
        int[] arreglo = new int[numeroCifras];

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
        System.out.println("");
    }
}
