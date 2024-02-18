package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        double[][] notas = new double[6][4];
        mostrarMenu();
    }

    public static String[] crearAlumnos() {
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        return alumnos;
    }

    public static String[] crearAsignaturas() {
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        return asignaturas;
    }

    public static double pedirNota(String asignatura) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(asignatura + ": ");
        return entrada.nextDouble();
    }

    public static void rellenarNotas(String[] asignaturas, String[] alumnos, double[][] notas) {
        // Creo una matriz para almacenar las notas de cada asignatura
        // Cada fila corresponde a un alumno y cada columna a una materia  
        /*
         * Pepe -> | Lengua | Mates | Historia | Física |
         * Juan -> | Lengua | Mates | Historia | Física |
         * ...
         */
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Notas de " + alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                notas[i][j] = pedirNota(asignaturas[j]);
            }
        }
    }

    public static void mostrarNotas(String[] asignaturas, String[] alumnos, double[][] notas) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("NOTAS DE " + alumnos[i].toUpperCase() + ":");
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.print(" · " + asignaturas[j] + ": " + notas[i][j]);
            }
        }
    }

    public static double notaMedia(double[] notas) {
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];

        }
        return media / notas.length;
    }

    /**
     * Calcula la media de cada fila (alumno) y almacena el valor máximo y su
     * índice de fila
     *
     * @param alumnos
     * @param notas
     */
    public static void buscarAlumnoConMayorMedia(String[] alumnos, double[][] notas) {
        double max = notas[0][0];
        double media = 0;
        int indiceAlumno = 0;

        for (int i = 0; i < notas.length; i++) {
            media = notaMedia(notas[i]);

            if (media > max) {
                max = media;
                indiceAlumno = i;
            }
        }

        System.out.println("El/La alumno/a con la nota media más alta es "
                + alumnos[indiceAlumno] + " con un " + max);
    }

    public static int contarSuspensos(double[] notasAlumno) {
        int suspensos = 0;

        for (int i = 0; i < notasAlumno.length; i++) {
            if (notasAlumno[i] < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    public static void buscarAlumnoConMasSuspensos(String[] alumnos, double[][] notas) {
        int indiceAlumno = 0;
        int suspensos = 0;
        double max = 0;

        for (int i = 0; i < notas.length; i++) {
            suspensos = contarSuspensos(notas[i]);
            if (suspensos > max) {
                max = suspensos;
                indiceAlumno = i;
            }
        }

        System.out.println("El/La alumno/a con más suspensos es " + alumnos[indiceAlumno]
                + " con " + max + " asignaturas suspendidas.");
    }

    /**
     * Calcula la media de cada columna (asignatura)
     *
     * @param notas
     * @param asignaturas
     */
    public static void buscarAsignaturaConMenorMedia(double[][] notas, String[] asignaturas) {
        int i = 0;
        double media = 0;
        double min = 11;
        int indiceAsignatura = 0;

        for (int j = 0; j < notas[0].length; j++) {
            media = notaMedia(notas[j]);
            if (media < min) {
                min = media;
                indiceAsignatura = i;
            }
        }

        System.out.println("La asignatura con la nota media más baja es "
                + asignaturas[indiceAsignatura] + " con un " + min);
    }

    public static void mostrarMenu() {
        String[] asignaturas = crearAsignaturas();
        String[] alumnos = crearAlumnos();
        double[][] notas = new double[6][4];
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elige una opción");
            System.out.println("1. Rellenar notas");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Alumno con mejor nota media");
            System.out.println("4. Alumno con más suspensos");
            System.out.println("5. Asignatura con peor media");
            System.out.println("6. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    rellenarNotas(asignaturas, alumnos, notas);
                case 2 ->
                    mostrarNotas(asignaturas, alumnos, notas);
                case 3 ->
                    buscarAlumnoConMayorMedia(alumnos, notas);
                case 4 ->
                    buscarAlumnoConMasSuspensos(alumnos, notas);
                case 5 ->
                    buscarAsignaturaConMenorMedia(notas, asignaturas);
                case 6 ->
                    System.out.println("Cerrando...");
            }

        } while (opcion != 6);
    }
}
