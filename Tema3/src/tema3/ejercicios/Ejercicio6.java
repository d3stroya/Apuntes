package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la nota del alumno/a: ");
        nota = entrada.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Por favor, ingrese una calificación entre 0 y 10.");
        } else {
            if (nota < 5 && nota >= 0) {
                System.out.println("Suspenso");
            } else if (nota <= 6) {
                System.out.println("Bien");
            } else if (nota <= 8) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        }

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Por favor, introduce una nota entre 0 y 10");
        }
    }
}
