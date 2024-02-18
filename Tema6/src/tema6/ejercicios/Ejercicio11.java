package tema6.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int[] array = crearArray();
        rellenarArrayConValoresUnicos(array);
        mostrarArray(array);
    }

    public static int generarNumeroAleatorio() {
        return (int) Math.floor(Math.random() * 10);
    }

    // Por defecto, un array de enteros incializa todos los valores en 0,
    // por lo que solo me dejaría insertar un 0 en la última posición,
    // y no es lo que buscamos. 
    // Inicalizando el array a -1 sí puedo insertar 0 en cualquier posición.
    public static int[] crearArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        return array;
    }

    // Comparo el número actual con los anteriores
    public static boolean esRepetido(int[] array, int numero) {
        int i = 0;
        boolean encontrado = false;
        while ((i < array.length) && (!encontrado)) {
            if (array[i] == numero) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    public static void rellenarArrayConValoresUnicos(int[] array) {
        int numero = 0;
        boolean repetido = false;

        for (int i = 0; i < array.length; i++) {
            do {
                numero = generarNumeroAleatorio();
                repetido = esRepetido(array, numero);
                if (!repetido) {
                    array[i] = numero;
                }
            } while ((repetido) && (i < array.length));
        }

    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| " + array[i] + " | ");
        }
    }
}
