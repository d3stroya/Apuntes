package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Leer el número que introduce el usuario y agregarlo a una lista.
    Preguntarle al usuario si quiere añadir otro número.
    Mostrar la lista
    Intercambiar las posiciones 2º y 4º entre sí.
    Mostrar la lista    
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        rellenarLista(listaNumeros);
        mostrarLista(listaNumeros);
        intercambiarPosiciones(listaNumeros, 2, 4);
        mostrarLista(listaNumeros);
    }
    
    public static boolean seguirAgrgandoNumeros() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quieres guardar más números?");
        return entrada.nextLine().equalsIgnoreCase("sí");
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");        
        return entrada.nextInt();
    }
    
    public static void rellenarLista(ArrayList<Integer> listaNumeros) {
        System.out.println("\n*** Rellenando lista ***");
        boolean seguirRellenando = true;
        
        do {
            listaNumeros.add(pedirNumero());            
            seguirRellenando = seguirAgrgandoNumeros();            
        } while(seguirRellenando);           
    }
    
    public static void mostrarLista(ArrayList<Integer> listaNumeros) {
        System.out.println("\n*** Lista de números ***");
        for(Integer elemento : listaNumeros) {
            System.out.println("- " + elemento);
        }
    }
    
    public static void intercambiarPosiciones(ArrayList<Integer> listaNumeros, int posicion1, int posicion2) {
        if(listaNumeros.size() >= 4) {
            System.out.println("\nIntercambiando posiciones");
            // Guardo los valores
            int a = listaNumeros.get(posicion1 - 1);
            int b = listaNumeros.get(posicion2 - 1);

            // Intercambio las posiciones
            listaNumeros.set(posicion1 - 1, b);
            listaNumeros.set(posicion2 - 1, a);
        } else {
            System.out.println("\nLa lista tiene menos de 4 elementos, por lo que no puedes "
                    + "acceder a la 4ª posición. Crea una lista con 4 o más elementos.");
        }
    }
}
