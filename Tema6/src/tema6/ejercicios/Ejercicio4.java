package tema6.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = crearMatriz(4, 3);
        mostrarMatriz(matriz);
    }

    /**
     * Método que crea una matriz con el número de filas y columnas pasadas por
     * parámetro
     *
     * @param filas
     * @param columnas
     * @return la matriz
     */
    public static int[][] crearMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeroAleatorio(100, 200);
            }
        }

        return matriz;
    }

    /**
     * Método que genera un número aleatorio dentro de un rango especificado por
     * parámetro.
     *
     * @param numeroInferior
     * @param numeroSuperior
     * @return el número entero aleatorio.
     */
    public static int generarNumeroAleatorio(int numeroInferior, int numeroSuperior) {
        double numeroAleatorio = Math.floor(Math.random() * (numeroSuperior - numeroInferior)) + numeroInferior;
        return (int) numeroAleatorio;
    }

    /**
     * Método que muestra por pantalla una matriz
     *
     * @param matriz
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
