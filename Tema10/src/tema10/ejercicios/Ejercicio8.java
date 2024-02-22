
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        rellenarLista(alumnos);
        mostrarLista(alumnos);
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirCurso() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Curso: ");
        return entrada.nextInt();
    }
    
    public static void agregarAlumno(ArrayList<Alumno> alumnos) {
        System.out.println("\n- AGREGAR NUEVO/A ALUMNO/A -");
        alumnos.add(new Alumno(pedirNombre(), pedirCurso()));
    }
    
    public static void rellenarLista(ArrayList<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "";
        do {
            agregarAlumno(alumnos);
            System.out.print("¿Quieres añadir otro/a alumno/a?: ");
            respuesta = entrada.nextLine();
        } while(respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("si"));
    }
    
    public static void mostrarLista(ArrayList<Alumno> alumnos) {
        System.out.println("\n- LISTA DE ALUMNOS/AS -");
        alumnos.forEach(System.out::println);
    }
}

class Alumno {
    private String nombre;
    private int curso;

    public Alumno() {
        this.nombre = "";
        this.curso = 0;
    }
    
    public Alumno(String nombre, int curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", curso=" + curso + '}';
    }    
}
