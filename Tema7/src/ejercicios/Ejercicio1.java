package ejercicios;

import java.util.Scanner;
import tema7.Asignatura;

/**
 *
 * @author d3stroya
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String[] nombresAsignaturas = {"Programación", "Lenguaje de Marcas", "Bases de datos", "Entornos de desarrollo", "Sistemas Informáticos", "FOL"};
        Asignatura[] asignaturas = rellenarAsignaturas(nombresAsignaturas);
        System.out.print("Su nota media es: " + calcularNotaMedia(asignaturas));
    }

    /**
     * Método que pidse al usuario la nota de una asignatura pasada por parámetro
     *
     * @param asignatura
     * @return la nota
     */
    public static double pedirNota(String asignatura) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la calificación de " + asignatura + ": ");
        return entrada.nextDouble();
    }

    /**
     * Método que rellena un array de 6 posiciones utilizando el constructor
     * parametrizado, con el nombre de la asignatura y la nota de la misma, que
     * pide llamando al método pedirNota.
     *
     * @param nombresAsignatura
     * @return el array relleno
     */
    public static Asignatura[] rellenarAsignaturas(String[] nombresAsignatura) {
        Asignatura[] asignaturas = new Asignatura[6];
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura(nombresAsignatura[i], pedirNota(nombresAsignatura[i]));
        }
        return asignaturas;
    }

    /**
     * Método que calcula la nota media de todas las asignaturas
     *
     * @param asignaturas
     * @return la nota media
     */
    public static double calcularNotaMedia(Asignatura[] asignaturas) {
        double media = 0;
        for (Asignatura asignatura : asignaturas) {
            media += asignatura.getNota();
        }
        return media / asignaturas.length;
    }
}
