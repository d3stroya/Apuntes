package Ruleta;

import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Jugador {
    // Atributos
    private String nombre;
    private int puntuacion;

    // Constructores
    public Jugador() {
    }

    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    
    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    // Métodos
    public int elegirOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("Elige una opción");
        System.out.println("1. Resolver el panel");
        System.out.println("2. Decir una letra");
        
        opcion = entrada.nextInt();
        return opcion; 
    }
    
    
    
    // toString
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + '}';
    }
    
    
}
