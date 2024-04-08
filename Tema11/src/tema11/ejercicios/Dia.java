/*
 * Ejercicio 1
 */
package tema11.ejercicios;

/**
 *
 * @author anabel
 */
public class Dia implements Comparable<Dia> {
    // ATRIBUTOS
    private String nombre;
    private int temperatura;

    // CONSTRUCTORES
    public Dia() {
        this.nombre = "";
        this.temperatura = 0;
    }

    public Dia(String nombre, int temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }
    
    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    // MÉTODOS
    @Override    
    public int compareTo(Dia o) {
        if(o.temperatura < temperatura) {
            return 1;
        } else if(o.temperatura == temperatura) {
            return 0;
        } else {
            return -1;
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return "Dia{" + "nombre=" + nombre + ", temperatura=" + temperatura + '}';
    }
    
    
    
}
