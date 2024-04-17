
package tema11.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author d3stroya
 */
public class Ejercicio08 {
    private static List<Ciudad> lCiudades = new ArrayList<>();
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la ciudad: ");
        return entrada.nextLine();
    }
    
    /*
        Insertar ciudad y sus sedes
    */
    public static void insertar() {
        System.out.println("-> Insertando ciudad...");
        
        Ciudad ciudad = new Ciudad(pedirNombre());
        Scanner entrada = new Scanner(System.in);
        
        do {
            ciudad.insertarSede();
            System.out.print("¿Añadir otra sede? (s/n): ");
        } while(entrada.nextLine().equalsIgnoreCase("s"));
        
        lCiudades.add(ciudad);
    }
    
    /*
        Mostrar ciudades y sus sedes
    */
    public static void mostrarCiudades() {
        System.out.println("-> Mostrando ciudades con sus sedes...");
        for(Ciudad ciudad : lCiudades) {
            System.out.println(ciudad.getNombre());
            ciudad.mostrarSedes();
        }
    }
    
    /*
        Filtrar por ingresos superiores a la media
    */
    public static void filtrarPorIngresos() {
        System.out.println("-> Mostrando sedes con ingresos superiores a la media...");
        for(Ciudad ciudad : lCiudades) {
            ciudad.filtrarPorIngresos();
        }
    }
    
    /*
        Buscar sede por nombre
    */
    public static boolean buscarSedePorNombre() {
        int i = 0;
        boolean enc = false;
        String nombre = Ciudad.pedirNombre();
        
        while(i < lCiudades.size() && !enc) {
            Ciudad ciudad = lCiudades.get(i);
            enc = ciudad.filtrarPorNombre(nombre);
        }
        System.out.println(enc);
        return enc;
    }
    
    /*
        Insertar sede en ciudad por nombre
    */
    public static Ciudad buscarCiudad() {
        System.out.println("-> Buscando ciudad...");
        
        int i = 0;
        boolean enc = false;
        Ciudad ciudad = null;
        String nombre = pedirNombre();
        
        while(i < lCiudades.size() && !enc) {
            Ciudad c = lCiudades.get(i);
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                ciudad = c;
                enc = true;
            }
        }
        
        System.out.println("[√] Ciudad encontrada.");
        
        return ciudad;
    }
    
    public static void insertarSedeEn(Ciudad ciudad) {
        if(ciudad != null) {
            ciudad.insertarSede();            
        }
    }
    
    /*
        Mostrar todas las sedes ordenadas descendentemente por ingresos
    */
    public static void mostrarSedesPorIngresos() {
        Set<Sede> arbol = new TreeSet<>();
        
        for(Ciudad ciudad : lCiudades) {
            arbol.addAll(ciudad.getcSedes());
        }
        
        arbol.forEach(sede -> System.out.println(sede.getNombre()));
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENÚ -");
            System.out.println("1. Insertar ciudad y sus sedes");
            System.out.println("2. Mostrar ciudades con sus sedes");
            System.out.println("3. Mostrar sedes con ingresos superiores a la media");
            System.out.println("4. Buscar sede por nombre");
            System.out.println("5. Insertar sede en una ciudad existente");
            System.out.println("6. Mostra sedes ordendas por ingresos (descendente)");
            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> insertar();
                case 2 -> mostrarCiudades();
                case 3 -> filtrarPorIngresos();
                case 4 -> buscarSedePorNombre();
                case 5 -> insertarSedeEn(buscarCiudad());
                case 6 -> mostrarSedesPorIngresos();
                case 7 -> System.out.println("Cerrando programa...");
            }
        } while(opcion != 6);
        
    }
}
