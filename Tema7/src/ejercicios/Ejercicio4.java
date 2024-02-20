package ejercicios;

import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        mostrarArrayChar(crearArrayChar());
    }

    public static char[] crearArrayChar() {
        char[] arrayChar = new char[6];
        Arrays.fill(arrayChar, 0, arrayChar.length / 2, 'a');
        Arrays.fill(arrayChar, arrayChar.length / 2, arrayChar.length, 'b');
        return arrayChar;
    }

    public static void mostrarArrayChar(char[] arrayChar) {
        for (char caracter : arrayChar) {
            System.out.print(caracter + " ");
        }
        System.out.println("");
    }
}
