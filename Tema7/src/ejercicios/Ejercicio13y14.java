package ejercicios;

import java.util.Scanner;
import tema7.Alumno;

/**
 *
 * @author d3stroya
 */
public class Ejercicio13y14 {

    public static void main(String[] args) {
        mostrarMenu();
    }
    
    // Vale para pedir edad e índice en el que insertar el alumno
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextDouble();
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static Alumno crearAlumno() {
        System.out.println("Creando alumno/a...");
        System.out.print("Nombre: ");
        String nombre = pedirNombre();

        System.out.print("Edad: ");
        int edad = pedirNumero();

        System.out.print("Nota media: ");
        double nota = pedirNota();

        return new Alumno(nombre, edad, nota);
    }

    public static void rellenarAlumno(Alumno[] aAlumnos, Alumno alumno) {
        System.out.println("Insertando alumno/a...");
        System.out.println("\n¿En qué índice quieres insertarlo?");
        int indice = pedirNumero();
        aAlumnos[indice] = alumno;
    }

    public static void mostrarAlumnos(Alumno[] aAlumnos) {
        for (Alumno alumno : aAlumnos) {
            if (alumno != null) {
                System.out.println(alumno.getNombre() + " tiene " + alumno.getEdad() + " años y "
                        + "una nota media de " + alumno.getNotaMedia());
            }
        }
    }

    public static void mostrarAlumnosConNotaSuperior(Alumno[] aAlumnos) {
        System.out.println("Indica una nota para mostrar los/as alumnos/as con una nota media superior:");
        int nota = pedirNumero();
        for (Alumno alumno : aAlumnos) {
            if (alumno != null && alumno.getNotaMedia() > nota) {
                System.out.println(alumno.getNombre() + ": " + alumno.getNotaMedia());
            }
        }
    }

    public static void contarAlumnosSuspensos(Alumno[] aAlumnos) {
        int contador = 0;
        for (Alumno alumno : aAlumnos) {
            if (alumno != null && alumno.getNotaMedia() < 5) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " alumnos con una nota media suspensa.");
    }

    public static void buscarAlumnoPorNombre(Alumno[] aAlumnos) {
        boolean encontrado = false;
        int i = 0;
        System.out.println("Escribe el nombre del alumno/a que quieres buscar:");
        String nombre = pedirNombre();

        while (i < aAlumnos.length && !encontrado) {
            if (aAlumnos[i] != null
                    && aAlumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
            }
            i++;
        }

        if (encontrado) {
            System.out.println(nombre + " está matriculado/a.");
        } else {
            System.out.println(nombre + " no está matriculado/a.");
        }
    }

    public static void mostrarMenu() {
        Alumno[] aAlumnos = new Alumno[5];
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Rellenar alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mostrar alumnos con nota media superior");
            System.out.println("4. Mostrar número de suspensos");
            System.out.println("5. Buscar alumno");
            System.out.println("6. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    rellenarAlumno(aAlumnos, crearAlumno());
                case 2 ->
                    mostrarAlumnos(aAlumnos);
                case 3 ->
                    mostrarAlumnosConNotaSuperior(aAlumnos);
                case 4 ->
                    contarAlumnosSuspensos(aAlumnos);
                case 5 ->
                    buscarAlumnoPorNombre(aAlumnos);
                default ->
                    System.out.println("\nElige una opción válida");
            }
        } while (opcion != 6);
    }
}
