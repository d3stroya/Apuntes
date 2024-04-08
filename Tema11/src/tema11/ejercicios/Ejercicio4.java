
package tema11.ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author d3stroya
 */
public class Ejercicio4 {
    private static Map<String, Actividad> actividades = new HashMap<>();
    private static Set<String> categorias = new TreeSet<>();
    
    public static void main(String[] args) {
        System.out.println("- CATÁLOGO DE ACTIVIDADES PARA TURISTAS -");
        insertarActividades();
        mostrarActividades();
        insertarCategorias();
        mostrarCategorias();
    }
    
    private static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    private static String pedirCategoria() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Categoría: ");
        return entrada.nextLine();
    }
    
    private static int pedirHoras() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Horas: ");
        return entrada.nextInt();
    }
    
    private static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Quieres añadir otra actividad? (s/n): ");
        return entrada.nextLine();
    }
    
    /**
     * Método que genera un código compuesto por las 3 primeras letras de
     * la categoría de la actividad seguidas de un número aleatorio entre 0 y 999.
     * @param actividad
     * @return 
     */
    public static String generarCodigo(Actividad actividad) {
        String cat = actividad.getCategoria().substring(0, 3).toUpperCase();
        int num = (int)(Math.random() * 1000);
        return cat + num;
    }
    
    /**
     * Método que crea una actividad y genera un código
     * para almacenarlos en un mapa.
     */
    public static void insertarActividades() {
        System.out.println("\n-> Insertando actividad...");
        
        do {
            Actividad actividad = new Actividad(pedirNombre(), pedirCategoria(), pedirHoras());
            actividades.put(generarCodigo(actividad), actividad);
            
        } while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrarActividades() {
        System.out.println("\n-> Mostrando actividades...");
        
        Iterator<String> it = actividades.keySet().iterator();
        while(it.hasNext()) {
            String clave = it.next();
            System.out.println(clave + " - " + actividades.get(clave));
        }
    }
    
    public static void insertarCategorias() {
        System.out.println("\n-> Insertando categorías...");
        
        Iterator<String> it = actividades.keySet().iterator();
        while(it.hasNext()) {
            String clave = it.next();
            categorias.add(actividades.get(clave).getCategoria());
        }
    }
    
    public static void mostrarCategorias() {
        System.out.println("\n-> Mostrando categorías...");
        
        Iterator<String> it = categorias.iterator();
        while(it.hasNext()) {
            String categoria = it.next();
            System.out.println(categoria);
        }
    }
        
}

class Actividad {
    private String nombre;
    private String categoria;
    private int horas;

    public Actividad() {
        this.nombre = "";
        this.categoria = "";
        this.horas = 0;
    }
    
    public Actividad(String nombre, String categoria, int horas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + "): " + horas + "horas";
    }  
}
