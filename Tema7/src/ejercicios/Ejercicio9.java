package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import tema7.Alumno;
import tema7.Asignatura;

/**
 *
 * @author d3stroya
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        String[] nombreAsignaturas = {"Lengua", "Mates", "Historia", "Física"};
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"};
        mostrarMenu(nombreAsignaturas, nombreAlumnos);
    }

    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextDouble();
    }

    public static Asignatura[] crearAsignaturas(String[] nombreAsignaturas) {
        Asignatura[] asignaturas = new Asignatura[4];

        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura();
            asignaturas[i].setNombre(nombreAsignaturas[i]);
        }

        return asignaturas;
    }

    public static Alumno[] crearAlumnos(String[] nombreAlumnos, String[] nombreAsignaturas) {
        Alumno[] alumnos = new Alumno[3];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(nombreAlumnos[i], crearAsignaturas(nombreAsignaturas));
        }
        return alumnos;
    }

    public static void rellenarNotas(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("NOTAS DE " + alumno.getNombre());
            for (Asignatura asignatura : alumno.getAsignaturas()) {
                System.out.print("Nota de " + asignatura.getNombre() + ": ");
                asignatura.setNota(pedirNota());
            }
        }
    }

    public static void mostrarNotas(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());

            for (Asignatura asignatura : alumno.getAsignaturas()) {
                System.out.println("Nota de " + asignatura.getNombre() + ": " + asignatura.getNota());
            }
        }
    }

    public static double calcularMedia(Alumno alumno) {
        double media = 0;

        for (Asignatura asignatura : alumno.getAsignaturas()) {
            media += asignatura.getNota();
        }

        return media / alumno.getAsignaturas().length;
    }

    public static void alumnoConMejorMedia(Alumno[] alumnos) {
        Alumno alumnoMejorMedia = alumnos[0];
        double mejorMedia = 0;
        double media = 0;

        for (Alumno alumno : alumnos) {
            media = calcularMedia(alumno);
            if (media > mejorMedia) {
                mejorMedia = media;
                alumnoMejorMedia = alumno;
            }
        }

        System.out.println(alumnoMejorMedia.getNombre() + " tiene la nota media más alta: " + mejorMedia);
    }

    public static int contarSuspensos(Alumno alumno) {
        int numeroSuspensos = 0;
        for (Asignatura asignatura : alumno.getAsignaturas()) {
            if (asignatura.getNota() < 5) {
                numeroSuspensos++;
            }
        }
        return numeroSuspensos;
    }

    public static void alumnoConMasSuspensos(Alumno[] alumnos) {
        Alumno alumnoMasSuspensos = alumnos[0];
        int numeroSuspensos = 0;

        for (Alumno alumno : alumnos) {
            if (contarSuspensos(alumno) > numeroSuspensos) {
                numeroSuspensos = contarSuspensos(alumno);
                alumnoMasSuspensos = alumno;
            }
        }

        System.out.println("El/La alumno/a con más suspensos es " + alumnoMasSuspensos.getNombre()
                + " con " + numeroSuspensos + " suspensos.");
    }

    public static void asignaturaConPeorMedia(Alumno[] alumnos) {
        Asignatura asignaturaPeorMedia = alumnos[0].getAsignaturas()[0];
        double media = 0;
        double peorMedia = 10;

        // Recorro las asignaturas
        for (int i = 0; i < alumnos[0].getAsignaturas().length; i++) {
            // Recorro los alumnos
            for (int j = 0; j < alumnos.length; j++) {
                // Sumo la nota de cada alumno en cada asignatura
                media += alumnos[j].getAsignaturas()[i].getNota();
            }
            // Calculo la media
            media /= alumnos.length;

            // Si la media es menor que la actual, se guarda en media
            // Guarda también la asignatura
            if (media < peorMedia) {
                peorMedia = media;
                asignaturaPeorMedia = alumnos[0].getAsignaturas()[i];
            }
        }
        System.out.println("La asignatura con peor media es " + asignaturaPeorMedia.getNombre()
                + " con un " + peorMedia);
    }

    public static void mostrarMenu(String[] nombreAsignaturas, String[] nombreAlumnos) {
        Alumno[] alumnos = crearAlumnos(nombreAlumnos, nombreAsignaturas);

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Rellenar notas");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Mostrar alumno con mejor media");
            System.out.println("4. Alumno con más suspensos");
            System.out.println("5. Asignatura con peor media");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 ->
                        rellenarNotas(alumnos);
                    case 2 ->
                        mostrarNotas(alumnos);
                    case 3 ->
                        alumnoConMejorMedia(alumnos);
                    case 4 ->
                        alumnoConMasSuspensos(alumnos);
                    case 5 ->
                        asignaturaConPeorMedia(alumnos);
                    case 6 ->
                        System.out.println("Cerrando programa...");
                    default ->
                        System.out.println("Elige una opción válida");
                }

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 6);

    }
}
