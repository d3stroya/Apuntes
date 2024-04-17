
package tema11.ejercicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {
    private static Set<Alumno> cAlumnos = new TreeSet();
    
    public static String pedirDni() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        return entrada.nextLine();
    }
    
    public static float pedirMedia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota media: ");
        return entrada.nextFloat();
    }
    
    public static int pedirNumExpediente() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nº de expediente: ");
        return entrada.nextInt();
    }
    
    public static void insertarAlumno() {
        System.out.println("\n-> Añadiendo alumno/a...");
        
        String dni = pedirDni();
        float media = pedirMedia();
        int numExpediente = pedirNumExpediente();
        
        Alumno alumno = new Alumno(dni, numExpediente, media);
        cAlumnos.add(alumno);
        
        System.out.println("Alumno/a agregado correctamente");
    }
    
    public static void mostrarOrdenadosPorNumExpediente() {
        System.out.println("\n-> Mostrando alumnos ordenados");
        
        for(Alumno alumno : cAlumnos) {
            System.out.println(alumno);
        }
    }
    
    public static void buscarPorNumExpediente() {
        System.out.println("\n-> Buscando...");
        
        boolean enc = false;
        Iterator<Alumno> it = cAlumnos.iterator();
        Alumno alumno = null;
        int numExpediente = pedirNumExpediente();
        
        while(it.hasNext() && !enc) {
            Alumno a = it.next();
            if(a.getNumExpediente() == numExpediente) {
                enc = true;
                alumno = a;
            }
        }
        
        System.out.println("¡Encontrado!: " + alumno);
    }
    
    public static void mostrarPorNota() {
        System.out.println("\n-> Mostrando por nota...");
        
        float nota = pedirMedia();
        
        for(Alumno alumno : cAlumnos) {
            if(alumno.getMedia() == nota) {
                System.out.println(alumno);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n- MENÚ -");
            System.out.println("1. Insertar alumno");
            System.out.println("2. Mostrar alumnos ordenadores ascendentemente por nº expediente");
            System.out.println("3. Buscar alumno por nº expediente");
            System.out.println("4. Mostra alumnos por nota media");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> insertarAlumno();
                case 2 -> mostrarOrdenadosPorNumExpediente();
                case 3 -> buscarPorNumExpediente();
                case 4 -> mostrarPorNota();
                case 5 -> System.out.println("Cerrando programa...");
            }
        } while(opcion != 5);
    }
}
