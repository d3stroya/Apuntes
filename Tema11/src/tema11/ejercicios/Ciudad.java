
package tema11.ejercicios;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author d3stroya
 */
public class Ciudad {
    // ATRIBUTOS
    private String nombre;
    private Set<Sede> cSedes;

    // CONSTRUCTORES
    public Ciudad() {
        this.nombre = "";
        this.cSedes = new LinkedHashSet();
    }
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.cSedes = new LinkedHashSet();
    }
    
    public Ciudad(String nombre, LinkedHashSet<Sede> cSedes) {
        this.nombre = nombre;
        this.cSedes = cSedes;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getcSedes() {
        return cSedes;
    }

    public void setcSedes(Set<Sede> cSedes) {
        this.cSedes = cSedes;
    }

    // MÉTODOS
    
    /*
        Crear sedes
    */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la sede: ");
        return entrada.nextLine();
    }
    
    public float pedirIngresos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        return entrada.nextFloat();
    }
    
    public void insertarSede() {
        System.out.println("-> Insertando sede...");
        cSedes.add(new Sede(pedirNombre(), pedirIngresos()));
    }
    
    /*
        Mostrar sedes
    */
    public void mostrarSedes() {
        System.out.println("-> Mostrando sedes...");
        cSedes.forEach(System.out::println);
    }
    
    /*
        Filtrar por ingresos anuales superiores a la media
    */
    public float calcularMedia() {  
        float total = 0f;
        
        for(Sede sede : cSedes) {
            total += sede.getIngresos();
        }
        
        return total / cSedes.size();
    }
    
    public void filtrarPorIngresos() {
        cSedes.stream()
                .filter(sede -> sede.getIngresos() > calcularMedia())
                .toList().forEach(System.out::println);
    }
    
    /*
        Filtrar por nombre
    */
    public boolean filtrarPorNombre(String nombre) {
        boolean enc = false;
        
        Iterator<Sede> it = cSedes.iterator();
        while(it.hasNext() && !enc) {
            Sede s = it.next();
            if(s.getNombre().equalsIgnoreCase(nombre)) {
                enc = true;
            }
        }
        
        return enc;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", cSedes=" + cSedes + '}';
    }            
}
