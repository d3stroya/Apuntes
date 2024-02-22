package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        rellenarLista(nombres);
        mostrarLista(nombres);
    }
    
    public static boolean seguirAgrgandoNombres() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quieres guardar más nombres?");
        return entrada.nextLine().equalsIgnoreCase("sí");
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe el nombre que quieres guardar: ");        
        return entrada.nextLine();
    }
    
    public static void rellenarLista(ArrayList<String> listaNombres) {
        System.out.println("\n*** Rellenando lista ***");
        boolean seguirRellenando = true;
        
        do {
            listaNombres.add(pedirNombre());            
            seguirRellenando = seguirAgrgandoNombres();            
        } while(seguirRellenando);           
    }
    
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("\n*** Lista de nombres ***");
        for(String elemento : lista) {
            System.out.println("- " + elemento);
        }
    }
}
