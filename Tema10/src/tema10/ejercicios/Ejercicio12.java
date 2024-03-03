
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio12 {
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static String pedirConfirmacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Desea seguir? ");
        return entrada.nextLine();
    }
    
    public static void rellenarLista(ArrayList<String> lNombres) {
        do {
            System.out.println("Agregando persona...");
            lNombres.add(pedirNombre());            
        } while(pedirConfirmacion().equalsIgnoreCase("si"));
    }
    
    public static void mostrarLista(ArrayList<String> lNombres) {
        System.out.println("\nMostrando personas...");
        Iterator<String> it = lNombres.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> lNombres = new ArrayList<>();
        rellenarLista(lNombres);
        mostrarLista(lNombres);
    }
}
