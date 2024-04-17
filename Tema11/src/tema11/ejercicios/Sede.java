
package tema11.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Sede implements Comparable<Sede> {
    private String nombre;
    private float ingresos;

    public Sede() {
        this.nombre = "";
        this.ingresos = 0.0f;
    }
    
    public Sede(String nombre, float ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }
    
    
    // MÉTODOS
    @Override
    public int compareTo(Sede s) {
        if(s.getIngresos() > ingresos) {
            return 1;
        } else if(s.getIngresos() < ingresos) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }        
}
