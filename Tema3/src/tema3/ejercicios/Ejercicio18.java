package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        int pass = 1234;
        int userPass;
        int contador = 3;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Por favor, indique la contraseña:");
            userPass = entrada.nextInt();
            if (userPass == pass) {
                System.out.println("¡Enhorabuena!");
            } else {
                contador--;
                System.out.println("Contraseña incorrecta. Quedan " + contador + " intentos.");
            }
        } while (contador > 0 && userPass != pass);
    }
}
