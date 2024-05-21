
package tema12.ejercicios;

import java.io.File;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio04 {
    
    public static String pedirExtension() throws InputMismatchException, IllegalStateException, NoSuchElementException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nExtensión: ");
        return entrada.nextLine();
    }
    
    public static void mostrarPorExtension(String extension) throws SecurityException {
        File dir = new File("ejercicio04/DiasSemana");
        String[] archivos = dir.list();
        for(int i = 0; i < archivos.length; i++) {
            if(archivos[i].contains(extension)) {
                System.out.println(archivos[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Pulsa s para salir");
        String opcion = pedirExtension();
        
        do {
            try {
                mostrarPorExtension(opcion);                
            } catch(SecurityException e) {
                System.out.println(e.getMessage());
            }
            
            try {
                opcion = pedirExtension();                
            } catch(IllegalStateException e) {
                System.out.println(e.getMessage());                
            } catch(NoSuchElementException e) {
                System.out.println(e.getMessage());                
            }
        } while(!opcion.equalsIgnoreCase("s"));
    }
}
