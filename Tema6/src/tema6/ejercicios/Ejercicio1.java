package tema6.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         int[] lista = new int[10];
        pedirNumeros(lista);
        mostrarNumeros(lista);
    }
    
    public static void pedirNumeros(int[] lista) { 
        System.out.println("Pidiendo datos...");
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.print("Escribe un número: ");
            int numero = entrada.nextInt();
            lista[i] = numero;
        }
    }
    
    public static void mostrarNumeros(int [] lista) {
        System.out.println("\nMostrando números pares...");
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] % 2 == 0) {
                System.out.print(lista[i] + " ");
            }
        }
    }
}
