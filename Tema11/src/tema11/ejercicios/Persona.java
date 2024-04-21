
package tema11.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Persona implements Comparable<Persona> {
    // ATRIBUTOS
    private String nombre;
    private int edad;

    // CONSTRUCTORES    
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTER Y SETTER    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // MÉTODOS
    @Override
    public int compareTo(Persona p) {
        if(p.getEdad() > edad) {
            return 1;
        } else if(p.getEdad() < edad) {
            return -1;
        } else {
            return 0;
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return nombre + " tiene " + edad + " años.";
    }
    
}

