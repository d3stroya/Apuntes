/*
 * Ejercicio 7
 */
package tema7;

/**
 *
 * @author anabel
 */
public class Dia implements Comparable<Dia> {
    // ATRIBUTOS
    private String nombre;
    private int temperatura;
    private int numeroDia;

    // CONSTRUCTORES
    public Dia() {
        nombre = "";
        temperatura = 0;
        numeroDia = 0;
    }

    public Dia(String nombre) {
        this.nombre = nombre;
        this.temperatura = 0;
        this.numeroDia = 0;
    }
    
    
    public Dia(String nombre, int numeroDia) {
        this.nombre = nombre;
        this.temperatura = 0;
        this.numeroDia = numeroDia;
    }
    
    public Dia(String nombre, int temperatura, int numeroDia) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.numeroDia = numeroDia;
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

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }
    
    // MÉTODOS
    /**
     * Compara los días por su temperatura
     * @param diaUsuario
     * @return 1 si la temperatura de diaUsuario es mayor, 0 si es igual y -1 si es menor
     */
    @Override
    public int compareTo(Dia diaUsuario) {
        if(diaUsuario.getTemperatura() > this.temperatura) {
            return 1;
        } else if(diaUsuario.getTemperatura() == this.temperatura) {
            return 0;
        } else {
            return -1;
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return "Dia{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", numeroDia=" + numeroDia + '}';
    }
    
    
    
}
