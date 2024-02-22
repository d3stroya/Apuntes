package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero por pantalla: ");
        numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println(numero + " es negativo.");
        } else {
            System.out.println(numero + " es positivo.");
        }
    }
}
