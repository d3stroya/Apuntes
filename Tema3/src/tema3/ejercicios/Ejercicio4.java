package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();

        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.print(num1 + " es el menor.");
        } else if (num2 < num3) {
            System.out.print(num2 + " es el menor.");
        } else {
            System.out.println(num3 + " es el menor.");
        }
    }
}
