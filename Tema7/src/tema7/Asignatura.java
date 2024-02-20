/*
 * EJERCICIO 1
 */
package tema7;

/**
 *
 * @author anabel
 */
public class Asignatura {
    // ATRIBUTOS
    private String nombre;
    private double nota;
    
    // CONSTRUCTORES
    public Asignatura() {
        nombre = "";
        nota = 0.0;
    }
    
    public Asignatura(String nombre) {
        this.nombre = nombre;
        nota = 0.0;
    }
    
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
