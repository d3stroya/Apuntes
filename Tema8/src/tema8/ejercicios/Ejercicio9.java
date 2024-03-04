
package tema8.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio9 {
    public static final String RESPUESTA1 = "Madrid";
    public static final String RESPUESTA2 = "Cristóbal Colón";
    
    public static void main(String[] args) {
        // EJERCICIO 9
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        
        System.out.println("¿Cuál es la capital de España?");
        String respuesta1Usuario = entrada.nextLine();
        
        if(respuesta1Usuario.equalsIgnoreCase(RESPUESTA1)) {
            nota += 5;
        }
        
        System.out.println("¿Quién colonizó América?");
        String respuesta2Usuario = entrada.nextLine();
        
        if(respuesta2Usuario.equalsIgnoreCase(RESPUESTA2)) {
            nota += 5;
        }
        System.out.print("Nota final: " + nota);
    }
}
