
package tema11.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Donacion implements Comparable<Donacion> {
    private String nombre;
    private int cantidad;

    public Donacion() {
        this.nombre = "";
        this.cantidad = 0;
    }
    
    public Donacion(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public int compareTo(Donacion d) {         
        if(d.getCantidad() > cantidad) {
            return 1;
        } else if(d.getCantidad() < cantidad) {
            return -1;
        } else {
            return 0;
        }
    }        

    @Override
    public String toString() {
        return nombre + " -> " + cantidad;
    }        
}
