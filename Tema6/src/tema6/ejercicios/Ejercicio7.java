package tema6.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        // Creo un array de 15 posiciones
        int[] arreglo = new int[15];

        // Agrego un número en cada posición
        for (int i = 0; i < arreglo.length; i++) {
            // Genero el número aleatorio entre 0 y 50
            arreglo[i] = (int) Math.floor(Math.random() * 51);
        }

        // Ordeno el arreglo aplicando el método de la burbuja
        int aux = 0;
        for (int j = 0; j < arreglo.length - 1; j++) {
            for (int i = 1; i < arreglo.length; i++) {

                if (arreglo[i] > arreglo[i - 1]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = aux;
                }
            }
        }

        // Imprimo los 10 primeros números por pantalla
        System.out.println("Mostrando los 10 números mayores:");
        for (int l = 0; l < 10; l++) {
            System.out.println(arreglo[l]);
        }
    }
}
