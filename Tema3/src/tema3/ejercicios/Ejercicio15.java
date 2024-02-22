package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un número para ver su tabla de multiplicar: ");
        int num = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
