package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int dinero, copiaDinero, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros: ");
        dinero = entrada.nextInt();
        copiaDinero = dinero;

        billetes50 = dinero / 50;
        dinero %= 50;
        billetes20 = dinero / 20;
        dinero %= 20;
        billetes10 = dinero / 10;
        dinero %= 10;
        billetes5 = dinero / 5;
        dinero %= 5;
        monedas2 = dinero / 2;
        monedas1 = dinero % 2;

        System.out.println(copiaDinero + " hacen un total de:");
        if (billetes50 > 0) {
            System.out.println(billetes50 + " billetes de 50");
        }
        if (billetes20 > 0) {
            System.out.println(billetes20 + " billetes de 20");
        }
        if (billetes10 > 0) {
            System.out.println(billetes10 + " billetes de 10");
        }
        if (billetes5 > 0) {
            System.out.println(billetes5 + " billetes de 5");
        }
        if (monedas2 > 0) {
            System.out.println(monedas2 + " monedas de 2");
        }
        if (monedas1 > 0) {
            System.out.println(monedas1 + " monedas de 1 euro");
        }
    }
}
