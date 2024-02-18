package tema6.ejercicios;


/**
 *
 * @author d3stroya
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int[] array = new int[10];
        rellenarArray(array);
        System.out.println("Antes");
        mostrarArray(array);
        sustituirRepetidos(array);
        System.out.println("\nDespués");
        mostrarArray(array);
    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random() * 8 + 1;
        }
    }

    public static void sustituirRepetidos(int[] array) {
        boolean encontrado = false;

        // Recorro del array
        for (int i = 0; i < array.length - 1; i++) {
            // Si el número es 0, ya está sustituido y no tenemos que comprobar nada
            if (array[i] != 0) {
                // Dentro de cada iteración, recorro el array desde la posición siguiente hasta el final 
                // en busca de números iguales al actual
                for (int j = i + 1; j < array.length; j++) {
                    // Si el número es igual, lo cambio a 0
                    if (array[j] == array[i]) {
                        array[j] = 0;
                        encontrado = true;
                    }
                }
            }
            if (encontrado) {
                encontrado = false;
                array[i] = 0;
            }
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }
}
