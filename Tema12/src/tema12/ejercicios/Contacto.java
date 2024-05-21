/*
 * Ejercicio 1
 */
package tema12.ejercicios;

/**
 *
 * @author anabel
 */
public class Contacto implements Comparable<Contacto> {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private int numero;

    // CONSTRUCTORES
    public Contacto() {
        this.nombre = "";
        this.edad = 0;
        this.numero = 0;
    }
    
    public Contacto(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // MÉTODOS
    @Override
    public int compareTo(Contacto contactoUsuario) {
        int edadUsuario = contactoUsuario.edad;
        
        if(edad < edadUsuario) {
            return -1;
        } else if(edad == edadUsuario) {
            return 0;
        } else {
            return 1;
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return nombre + " (" + edad + " años): " + numero;
    }
    
    
}
