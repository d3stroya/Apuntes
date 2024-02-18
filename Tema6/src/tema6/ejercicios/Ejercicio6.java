package tema6.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] lista80 = new int[80];
        rellenarArray(lista80);
        mostrarArray(lista80);
    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        int i = 2;
        while (primo && i < n) {
            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return primo;
    }

    public static void rellenarArray(int[] array) {
        int numero = 1;
        int contador = 0;

        while (contador < 80) {
            if (esPrimo(numero)) {
                array[contador] = numero;
                contador++;
            }
            numero++;
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
