package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][2];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("El número mayor es: " + buscarMayor(matriz));
        System.out.println("El número menor es: " + buscarMenor(matriz));
        System.out.println("La suma de todos los números es: " + sumar(matriz));

    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numeroUsuario = entrada.nextInt();
        return numeroUsuario;
    }

    public static int[][] rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = pedirNumero();
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int buscarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    public static int buscarMenor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int sumar(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
