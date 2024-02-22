/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Ejercicio7 {
    final static int NUM_SEMANAS = 4;
    final static int NUM_DIAS_SEMANA = 7;
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("[1] Rellenar temperaturas");
            System.out.println("[2] Mostrar temperaturas");
            System.out.println("[3] Ver temperatura media del mes");
            System.out.println("[4] Ver día más caluroso del mes");
            System.out.println("[5] Salir");
        
            opcion = entrada.nextInt();
        
            switch(opcion) {
                case 1 -> rellenarMes(mes);
                case 2 -> mostrarTemperatura(mes);
                case 3 -> temperaturaMedia(mes);
                case 4 -> diaMasCaluroso(mes);
                case 5 -> {}
                default -> System.out.println("Elige una opción correcta (1-5)");
            }
        
        } while(opcion != 5);
    }
    
     /**
     * Método que pide al usuario un número entero para registrar la temperatura de un día
     * @return la temperatura
     */
    public static int pedirTemperatura() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca temperatura: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que rellena la lista del mes con la temperatura de cada día, introducida por el usuario
     * @param mes 
     */
    public static void rellenarMes(ArrayList<ArrayList<Integer>> mes) {
        System.out.println("\nRellenando temperaturas...");
        String[] nombresDia = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        for(int i = 0; i < NUM_SEMANAS; i++) {
            mes.add(new ArrayList<>());
            
            for(int j = 0; j < NUM_DIAS_SEMANA; j++) {
                System.out.println(nombresDia[j] + " de la semana "+ (i + 1));
                mes.get(i).add(pedirTemperatura());
            }
        }
    }

    public static void mostrarTemperatura(ArrayList<ArrayList<Integer>> mes) {
        System.out.println("\nMostrando temperaturas...");
        String[] nombresDia = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for(int i = 0; i < NUM_SEMANAS; i++) {
            System.out.println("\nSEMANA " + (i + 1));
            for(int j = 0; j < NUM_DIAS_SEMANA; j++) {
                System.out.println(nombresDia[j] + ": "+ mes.get(i).get(j) + "ºC");
            }
        }
    }
    
    public static void temperaturaMedia(ArrayList<ArrayList<Integer>> mes) {
        System.out.println("\nCalculando temperatura media...");
        double media = 0;
        for(int i = 0; i < NUM_SEMANAS; i++) {
            for(int j = 0; j < NUM_DIAS_SEMANA; j++) {
                media += mes.get(i).get(j);
            }
        }
        media /= (NUM_SEMANAS * NUM_DIAS_SEMANA);
        
        // Mostrar solo 2 decimales: https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-decimales-de-un-double
        System.out.printf("%.2fºC\n", media);
    }    
    
    public static void diaMasCaluroso(ArrayList<ArrayList<Integer>> registro) {
        System.out.println("\nBuscando día más caluroso");
        String[] nombresDia = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int mayor = registro.get(0).get(0);
        int i = 0, j= 0, diaActual = 0;
        
        for(i = 0; i < NUM_SEMANAS; i++) {
            for(j = 0; j < NUM_DIAS_SEMANA; j++) {
                diaActual = registro.get(i).get(j);
                if(diaActual > mayor) {
                    mayor = diaActual;
                }
            }
        }
        
        System.out.println("El día o días más caluros(os) fue(ron): ");
        for(i = 0; i < NUM_SEMANAS; i++) {            
            for(j = 0; j < NUM_DIAS_SEMANA; j++) {
                diaActual = registro.get(i).get(j);
                if(diaActual == mayor) {
                    System.out.println("El " + nombresDia[j] + " de la semana " + (i + 1) + 
                            " con " + diaActual + "ºC");
                }
            }
        }
    }
}
