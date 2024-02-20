package ejercicios;

import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        mostrarVectorEnteros(crearVectorEnteros());
    }

    public static int[] crearVectorEnteros() {
        int[] vectorEnteros = new int[30];
        Arrays.fill(vectorEnteros, 0, 10, 0);
        Arrays.fill(vectorEnteros, 10, 20, 1);
        Arrays.fill(vectorEnteros, 20, 30, 5);

        return vectorEnteros;
    }

    public static void mostrarVectorEnteros(int[] vectorEnteros) {
        int posicion = 1;
        for (int numero : vectorEnteros) {
            System.out.println("Posición " + posicion + ": " + numero);
            posicion++;
        }
    }
}
