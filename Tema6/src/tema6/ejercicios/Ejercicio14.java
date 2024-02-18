package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int[][] temperaturas = new int[4][7];
        mostrarMenu(temperaturas, dias);
    }

    public static void rellenarTemperaturas(int[][] matriz, String[] dias) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n* * * Vamos a rellenar las temperaturas del mes * * *");
        for (int i = 0; i < 4; i++) { // 4 semanas
            System.out.println("Semana " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) { // 7 días por semana
                System.out.print(dias[j] + ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public static void mostrarTemperaturas(int matriz[][], String[] dias) {
        for (int i = 0; i < 4; i++) { // 4 semanas
            System.out.println("Semana " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) { // 7 días por semana
                System.out.println(dias[j] + ": " + matriz[i][j]);
            }
        }
    }

    public static double temperaturaMedia(int matriz[][]) {
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                media += matriz[i][j];
            }
        }
        return media / matriz.length * matriz[0].length;
    }

    public static void diasMasCalurosos(int matriz[][], String[] dias) {
        int temperatura = matriz[0][0];
        int semana = 0;
        int indiceDia = 0;
        System.out.println("El día o días más caluroso(s) fue(ron):");

        // Busco el día más caluroso
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > temperatura) {
                    temperatura = matriz[i][j];
                }

            }
        }

        // Muestro el día o días con la misma temperatura que la máxima
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == temperatura) {
                    semana = i + 1;
                    indiceDia = j;
                    System.out.println("El " + dias[indiceDia] + " de la semana " + semana + " con " + temperatura + " grados.");
                }
            }
        }
    }

    public static void mostrarMenu(int[][] matriz, String[] dias) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Días más calurosos");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    rellenarTemperaturas(matriz, dias);
                case 2 ->
                    mostrarTemperaturas(matriz, dias);
                case 3 ->
                    System.out.println("La temperatura media del mes fue: " + temperaturaMedia(matriz) + " grados");
                case 4 ->
                    diasMasCalurosos(matriz, dias);
                case 5 ->
                    System.out.println("Cerrando programa...");
            }
        } while (opcion != 5);
    }
}
