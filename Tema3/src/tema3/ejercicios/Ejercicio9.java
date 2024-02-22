package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, aux;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = entrada.nextInt();

        System.out.print("Introduce el tercer número: ");
        num3 = entrada.nextInt();

        System.out.print("Introduce el cuarto número: ");
        num4 = entrada.nextInt();

        // Comprobamos por pares si un número es mayor que otro y, en su caso, intercambiamos los valores
        // 1ª vuelta
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        // 2ª vuelta
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        // 3ª vuelta
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        // Ahora hacemos lo mismo pero usando un bucle for
        for (int i = 0; i < 4; i++) {
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        System.out.println(num1 + "" + num2 + "" + num3 + "" + num4);

    }
}
