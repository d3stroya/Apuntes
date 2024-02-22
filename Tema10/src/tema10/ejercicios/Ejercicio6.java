package tema10.ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Crear una lista de enteros y
    mostrar un menú que permita:
    1. Introducir las ventas de coches de cada uno de los 12 meses del año. 
    2. Mostrar las ventas introducidas en el punto anterior.
    3. Mostrar las ventas introducidas al revés.
    4. Que muestre la suma total de ventas del año.
    5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra a.
    6. Que muestre el nombre del mes (o meses) con más ventas.
    7. Salir del programa.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static int pedirVentas() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void introducirVentas(ArrayList<Integer> ventas, String[] nombreMeses) {
        System.out.println("\nIntroduce el número de ventas de cada mes");
        for (int i = 0; i < nombreMeses.length; i++) {
            System.out.print(nombreMeses[i] + ": ");
            if(ventas.size() <= 12) {
                // Con add se añaden los valores al final de la lista
                ventas.add(pedirVentas());                
            } else {
                // Usar set permite sobreescribir. 
                ventas.set(i, pedirVentas());                
            }
            System.out.println("");
        }
    }
    
    public static void mostrarVentas(ArrayList<Integer> ventas, String[] nombreMeses) {
        System.out.println("\n- VENTAS POR MES -");
        for (int i = 0; i < nombreMeses.length; i++) {
            System.out.println(nombreMeses[i] + ": " + ventas.get(i));            
        }
    }
    
    public static void mostrarVentasAlreves(ArrayList<Integer> ventas, String[] nombreMeses) {
        System.out.println("\n- VENTAS POR MES (AL REVÉS) -");
        for (int i = nombreMeses.length - 1; i >= 0; i--) {
            System.out.println(nombreMeses[i] + ": " + ventas.get(i));            
        }
    }
    
    public static void mostrarVentasTotales(ArrayList<Integer> ventas) {
        int ventasTotales = ventas.stream().reduce(0, (a, b) -> a + b);
        System.out.println("\n- VENTAS TOTALES -\n" + ventasTotales);
    }
    
    public static void mostrarVentasMesesConA(ArrayList<Integer> ventas, String[] nombreMeses) {
        for (int i = 0; i < nombreMeses.length; i++) {
            if(nombreMeses[i].toLowerCase().contains("a")) {
                System.out.println(nombreMeses[i] + ": " + ventas.get(i) + " ventas");
            }            
        }
    }
    
    public static void mostrarMesesConMasVentas(ArrayList<Integer> ventas, String[] nombreMeses) {
        System.out.println("\n- MESES CON MÁS VENTAS -");
        int max = ventas.stream().max((a, b) -> a - b).get();

        for(int i = 0; i < ventas.size(); i++) {
            if(ventas.get(i) == max) {
                System.out.println(nombreMeses[i] + ": " + ventas.get(i) + " ventas");                
            }
        }
    }
    
    public static void menu() {
        System.out.println("- MENU -");
        System.out.println("1. Introducir las ventas de coches de cada uno de los 12 meses del año.");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
        System.out.println("3. Mostrar las ventas introducidas al revés.");
        System.out.println("4. Que muestre la suma total de ventas del año.");
        System.out.println("5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra a.");
        System.out.println("6. Que muestre el nombre del mes (o meses) con más ventas.");
        System.out.println("7. Salir del programa.");
    }
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void lanzarOpcion(int opcion, ArrayList<Integer> ventas, String[] nombreMeses) {
        switch(opcion) {
            case 1 -> introducirVentas(ventas, nombreMeses);
            case 2 -> mostrarVentas(ventas, nombreMeses);
            case 3 -> mostrarVentasAlreves(ventas, nombreMeses);
            case 4 -> mostrarVentasTotales(ventas);
            case 5 -> mostrarVentasMesesConA(ventas, nombreMeses);
            case 6 -> mostrarMesesConMasVentas(ventas, nombreMeses);
            case 7 -> System.out.println("Cerrando programa...");
            default -> System.out.println("Escribe un número entre 1 y 7");
        }
    }
    
    public static void mostrarMenu() {
        ArrayList<Integer> ventas = new ArrayList<>();
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int opcion = 0;
        
        try {
            do {
                
                menu();
                opcion = pedirOpcion();
                lanzarOpcion(opcion, ventas, nombreMeses);
                
            } while(opcion != 7);
            
        } catch(InputMismatchException e) {
            System.out.println("Introduce un número");
        }
    }

    

}
