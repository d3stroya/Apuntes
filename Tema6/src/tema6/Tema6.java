package tema6;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Tema6 {

    final static int FILAS = 6;
    final static int COLUMNAS = 3;

    public static void main(String[] args) {

        // 1. VECTORES
//        // Declarar e inicalizar un array
//        int[] edad = new int[8];
//        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
//        
//        // Agregar valores a un array: asignar un valor a la posición
//        edad[0] = 12;
//        edad[1] = 30;
//        edad[5] = 67;
//        
//        // Recorrer un array
//        for(int i = 0; i < edad.length; i++) {
//            System.out.println(edad[i]);
//        }

        // 2. MATRICES
//        int[][] matriz = new int[FILAS][COLUMNAS];
//        
//        // Rellenar matriz
//        System.out.println("\nRellenando matriz...");
//        Scanner entrada = new Scanner(System.in);
//        for(int i = 0; i < matriz.length; i++) {
//            for(int j = 0; j < matriz[i].length; j++) {
//                //System.out.print("Introduce un número: ");
//                //matriz[i][j] = entrada.nextInt();
//                matriz[i][j] = (int)Math.floor(Math.random() * 9);
//            }
//        }
//        
//        // 2.1. Recorrer matriz con constantes
//        System.out.println("\nCaso 1");
//        for(int i = 0; i < FILAS; i++) {
//            for(int j = 0; j < COLUMNAS; j++) {
//                System.out.print("[" + i + j + "] -> " + matriz[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        
//        // 2.2. Recorrer matriz con length
//        System.out.println("\nCaso 2");
//        for(int i = 0; i < matriz.length; i++) {
//            for(int j = 0; j < matriz[i].length; j++) {
//                System.out.print("[" + i + j + "] -> " + matriz[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        
//        // 2.3. Recorrer matriz alrevés con constantes
//        System.out.println("\nCaso 3");
//        for(int j = 0; j < COLUMNAS; j++) {
//            for(int i = 0; i < FILAS; i++) {
//                System.out.print("[" + i + j + "] -> " + matriz[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        
//        // 2.4. Recorrer matriz alrevés con length
//        System.out.println("\nCaso 4");
//        for(int j = 0; j < matriz[0].length; j++) {
//            for(int i = 0; i < matriz.length; i++) {
//                System.out.print("[" + i + j + "] -> " + matriz[i][j] + " ");
//            }
//            System.out.println("");
//        }

        // 3. ARRAYS QUE CONTIENEN ARRAYS
//        System.out.println("Matriz que contiene arrays");
//        int[][] multidimensional = new int[2][];
//        int[] array = new int[6];
//        int[] array2 = {1, 2, 3, 4};
//        
//        multidimensional[0] = array;
//        multidimensional[1] = array2;
//
//        
//        for(int i = 0; i < multidimensional.length; i++) {
//            for(int j = 0; j < multidimensional[i].length; j++) {
//                System.out.print("[" + multidimensional[i][j] + "]");
//            }
//            System.out.println("");
//        }
//        
//        System.out.println("\nArray multidemensional que contiene matriz");
//        int[][][] multi = new int[2][][];
//        int[][] matriz = new int[2][2];
//        int[][] matriz2 = new int[6][6];
//        
//        multi[0] = matriz;
//        multi[1] = matriz2;
//
//        for(int i = 0; i < multi.length; i++) {
//            System.out.println("Matriz " + i);
//            for(int j = 0; j < multi[i].length; j++) {
//                System.out.print("Fila " + j + ": ");
//                for(int k = 0; k < multi[i][j].length; k++) {
//                    System.out.print("[" + multi[i][j][k] + "]");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//        }
        
    }

   
    
    // MÉTODOS FRECUENTES
    public static void mostrarArray(int [] arreglo) {
        for(int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    
    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min) + min + 1);
    }
    
    public static void mostrarMatriz(int [][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
    public static double calcularMedia(int[] array) {
        double media = 0;
        for(int i = 0; i < array.length; i++) {
            media += array[i];
        }
        return media / array.length;
    }
    
    public static int buscarMayor(int[] array) {
        int mayor = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static int buscarMenor(int[] array) {
        int menor = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
    
   
    
}
