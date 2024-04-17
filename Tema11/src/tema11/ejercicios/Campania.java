
package tema11.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author d3stroya
 */
public class Campania {
    private String nombre;
    private Set<Donacion> donaciones;

    public Campania() {
        this.nombre = "";
        this.donaciones = new LinkedHashSet();
    }
    
    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new LinkedHashSet();
    }
    
    public Campania(String nombre, Set<Donacion> donaciones) {
        this.nombre = nombre;
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    
    // MÉTODOS
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public int pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad: ");
        return entrada.nextInt();
    }
    
    public void insertarDonacion() {
        System.out.println("\nINSERTANDO DONACIÓN...");
        donaciones.add(new Donacion(pedirNombre(), pedirCantidad()));
    }
    
    public void mostrarDonaciones() {
        System.out.println("\nDONACIONES");
        donaciones.forEach(System.out::println);
    }
    
    
    // MOSTRAR POR NOMBRE
    public void mostrarDonacionesPorNombreFuncional() {
        System.out.println("\nFILTRANDO POR NOMBRE...");
        String nombre = pedirNombre();
        donaciones.stream()
                .filter(
                        d -> d.getNombre().equalsIgnoreCase(nombre)
                )
                .toList()
                .forEach(System.out::println);
    }
    
    public void mostrarDonacionesPorNombre() {
        System.out.println("\nFILTRANDO POR NOMBRE...");
        String nombre = pedirNombre();
        
        for(Donacion d : donaciones) {
            if(d.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(d);
            }
        }
    }
    
    public void mostrarDonacionesPorNombreUnico() {
        System.out.println("\nFILTRANDO POR NOMBRE ÚNICO...");
        
        String nombre = pedirNombre();
        Iterator<Donacion> it = donaciones.iterator();
        boolean enc = false;
        
        while(it.hasNext() && !enc) {
            Donacion donacion = it.next();
            if(donacion.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(donacion);
                enc = true;
            }
        }
    }
    
    public void mostrarNumeroDonaciones() {
        System.out.println(donaciones.size());
    }
    
    
    public int calcularDineroRecaudado() {
        int total = 0;
        
        for(Donacion d : donaciones) {
            total += d.getCantidad();
        }
        
        return total;
    }
    
    
    // ORDENAR POR CANTIDAD DE MAYOR A MENOR
    /**
     * Método que copia los datos del conjunto
     * a un TreeSet (orden ascendente).
     * Luego lo pasa a una pila, que le da la vuelta
     * (Last In, First Out)
     * Finalmente, recorre la pila y muestra los
     * elementos por pantalla.
     * 
     * Complejidad: O(n log n)
     */
    public void ordenarDonacionesConEstructuras() { // Es necesario implementar Comparable en Donacion
        System.out.println("\nDONACIONES ORDENADAS");
        
        Set<Donacion> donacionesArbol = new TreeSet();
        donacionesArbol.addAll(donaciones);
        
        Stack<Donacion> pila = new Stack<>();
        pila.addAll(donacionesArbol);
        
        pila.forEach(System.out::println);         
    }
    
    /**
     * Método que vuelca todos los elementos del conjunto
     * a un array. Luego, ordena el array con el método de la burbuja.
     * Finalmente, recorre el vector para mostrar sus elementos.
     * 
     * Complejidad: O(n^2)
     */
    public void ordenarDonacionesConBurbuja() {
        System.out.println("\nDONACIONES ORDENADAS");
        // Creo un vector de tamaño igual al número de donaciones que tiene el conjunto
        int tamanioVector = donaciones.size();
        Donacion[] vDonaciones = new Donacion[tamanioVector];
        int i = 0;
        
        // Almaceno las donaciones en un vector
        Iterator<Donacion> it = donaciones.iterator();
        while(it.hasNext()) {
            Donacion donacion = it.next();
            vDonaciones[i] = donacion;
            i++;
        }
        
        // Ordeno el vector con el método de la burbuja
        Donacion aux = null;
        for(i = 0; i < vDonaciones.length - 1; i++) {
            for(int j = 1; j < vDonaciones.length; j++) {
                if(vDonaciones[i].getCantidad() < vDonaciones[j].getCantidad()) {
                    aux = vDonaciones[i];
                    vDonaciones[i] = vDonaciones[j];
                    vDonaciones[j] = aux;
                }
            }
        }  
        
        // Muestro el vector
        for (i = 0; i < vDonaciones.length; i++) {
            System.out.println(vDonaciones[i]);
            
        }
    }
    
    /**
     * Método que vuelca todos los elementos del conjunto
     * a un array para luego ordenarlo con .sort().
     * Es necesario implementar la interfaz Comparable en
     * la clase Donacion.
     * Finalmente, recorre el array para mostrarlo.
     * 
     * Complejidad: O(n log n)
     */
    public void ordenarDonacionesConSort() {    // Es necesario implementar Comparable en Donacion
        System.out.println("\nDONACIONES ORDENADAS");
        // Creo un vector de tamaño igual al número de donaciones que tiene el conjunto
        int tamanioVector = donaciones.size();
        Donacion[] vDonaciones = new Donacion[tamanioVector];
        int i = 0;
        
        // Almaceno las donaciones en un vector
        Iterator<Donacion> it = donaciones.iterator();
        while(it.hasNext()) {
            Donacion donacion = it.next();
            vDonaciones[i] = donacion;
            i++;
        }
        
        // Ordeno el vector con sort
        Arrays.sort(vDonaciones);
        
        // Muestro el vector
        for (i = 0; i < vDonaciones.length; i++) {
            System.out.println(vDonaciones[i]);
            
        }
    }
    
    /**
     * Método que recorre el conjunto y va insertando
     * sus elementos en un vector en orden descendente.
     * 
     * Complejidad: O(n log n)
     */
    public void ordenarConVector() {
        int tamanioVector = donaciones.size();
        Donacion[] vDonaciones = new Donacion[tamanioVector];
        
        Iterator<Donacion> it = donaciones.iterator();
        while(it.hasNext()) {
            Donacion donacion = it.next();  // Obtenemos cada una de las donaciones del conjunto
            insertarOrdenados(vDonaciones, donacion);
        }
        
        for(Donacion d : vDonaciones) {
            System.out.println(d);
        }
    }
    
    /**
     * Método que inserta los elementos en orden descendente en un vector.
     * @param vDonaciones
     * @param donacion 
     */
    private void insertarOrdenados(Donacion[] vDonaciones, Donacion donacion) {
        int i = 0;
        boolean enc = false;    // Controla si la nueva donación es mayor
        
        // Busca hueco para una donación mayor
        while(vDonaciones[i] != null && !enc) {
            if(donacion.getCantidad() > vDonaciones[i].getCantidad()) {
                enc = true;
            } else {
                i++;
            }
        }
        
        // Si no hay hueco libre, desplazamos todos los elementos una posición a la derecha
        if(vDonaciones[i] != null) {
            for(int j = vDonaciones.length - 1; j > i; j--) {
                vDonaciones[j] = vDonaciones[j-1];
            }
        }
        
        // Insertamos la donación
        vDonaciones[i] = donacion;
    }

    @Override
    public String toString() {
        return "Campaña " + nombre + "\nDonaciones:" + donaciones;
    }        
}
