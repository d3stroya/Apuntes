package tema6.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio12y13 {

    public static void main(String[] args) {
        int matriz[][] = crearMatriz();
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
    }

    public static int[][] crearMatriz() {
        int[][] matriz = new int[8][];
        int j = 15;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[j];
            j -= 2;
        }
        return matriz;
    }

    public static void rellenarMatriz(int[][] matriz) {
        int numero = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                if (j < matriz[i].length / 2) {
                    numero++;
                } else {
                    numero--;
                }
            }
            numero = 1;
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
