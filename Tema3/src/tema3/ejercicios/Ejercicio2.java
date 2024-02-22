package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero por pantalla: ");
        numero1 = entrada.nextInt();

        System.out.print("Introduce otro número entero: ");
        numero2 = entrada.nextInt();

        if (numero1 > 10) {
            resultado = numero1 * numero2;
            System.out.println("El producto de " + numero1 + " y " + numero2 + " es " + resultado);
        } else {
            resultado = numero1 + numero2;
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + resultado);

        }
    }
}
