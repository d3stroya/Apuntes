
package tema8.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        // EJERCICIO 7
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una frase:");
        String despedida = entrada.nextLine();
        for(int i = 0; i < despedida.length(); i++) {
            System.out.println(despedida.charAt(i));
        }
    }
}
