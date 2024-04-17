
package tema11.ejercicios;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author d3stroya
 */
public class Ejercicio07 {
    final static Set<Campania> campanias = new LinkedHashSet();
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de campaña: ");
        return entrada.nextLine();
    }
    
    public static void insertar() {
        System.out.println("INSERTANDO CAMPAÑA...");
        campanias.add(new Campania(pedirNombre()));
    }
    
    private static Campania buscar() {        
        String nombre = pedirNombre();
        Campania campania = null;
        boolean enc = false;
        
        Iterator<Campania> it = campanias.iterator();
        while(it.hasNext() && !enc) {
            Campania c = it.next();
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                campania = c;
                enc = true;
            }
        }
        return campania;
    }
    
    public static void insertarDonacionACampania() {
        System.out.println("INSERTANDO DONACIÓN EN CAMPAÑA...");
        Campania campania = buscar();
        if(campania != null) {
            campania.insertarDonacion();
        }
    }
    
    public static void mostrar() {
        System.out.println("MOSTRANDO CAMPAÑAS...");
        for(Campania c : campanias) {
            System.out.println("\nCAMPAÑA: " + c.getNombre());
            System.out.println("  -> DONANTES:");
            for(Donacion d : c.getDonaciones()) {
                System.out.println(d);
            }
        }
    }
    
    // Consideramos que puede haber varais campañas con el mismo nombre
    public static void mostrarPorNombreFuncional() {
        System.out.println("MOSTRANDO CAMPAÑAS POR NOMBRE...");
        String nombre = pedirNombre();
        campanias.stream()
                .filter(c ->c.getNombre().equalsIgnoreCase(nombre))
                .toList()
                .forEach(System.out::println);
    }
    
    public static void mostrarPorNombre() {
        System.out.println("MOSTRANDO CAMPAÑAS POR NOMBRE...");
        String nombre = pedirNombre();
        for(Campania c : campanias) {
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c);
            }
        }
    }
    
    // Si consideramos que no hay varias campañas con el mismo nombre
    public static void mostrarPorNombreUnico() {
        System.out.println("MOSTRANDO CAMPAÑA POR NOMBRE...");
        Campania campania = buscar();
        if(campania != null) {
            campania.mostrarDonaciones();            
        }
    }
    
    public static void mostrarTotalRecaudado() {
        System.out.println("CALCULANDO EL TOTAL RECAUDADO...");
        int total = 0;
        for(Campania c : campanias) {
            total += c.calcularDineroRecaudado();
        }
        System.out.println(total + "€");
    }
    
    public static void mostrarMayorDonacion() {
        Donacion mayor = new Donacion();
        for(Campania c : campanias) {
            for(Donacion d : c.getDonaciones()) {
                if(d.getCantidad() > mayor.getCantidad()) {
                    mayor = d;
                }
            }
        }
        System.out.println(mayor);
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        
        do {
            System.out.println("\n- MENÚ -");
            System.out.println("1. Insertar campaña");
            System.out.println("2. Insertar donación");
            System.out.println("3. Mostrar campañas con sus donaciones");
            System.out.println("4a. Mostrar campaña por nombre");
            System.out.println("4b. Mostrar campaña por nombre (funcional)");
            System.out.println("4c. Mostrar campaña por nombre (nombre único)");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Mostrar mayor donación");
            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextLine();
            
            switch(opcion) {
                case "1" -> insertar();
                case "2" -> insertarDonacionACampania();
                case "3" -> mostrar();
                case "4a" -> mostrarPorNombre();
                case "4b" -> mostrarPorNombreFuncional();
                case "4c" -> mostrarPorNombreUnico();
                case "5" -> mostrarTotalRecaudado();
                case "6" -> mostrarMayorDonacion();
                case "7" -> System.out.println("Cerrando...");
            }
        } while(!opcion.equalsIgnoreCase("7"));
    }
}
