package tema6.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] lista = new int[7];
        pedirNumeros(lista);
        mostrarLista(lista);
        int[] nuevaLista = intercambiarPosiciones2y4(lista);
        mostrarLista(nuevaLista);
    }
    
    public static void pedirNumeros(int[] lista) { 
        System.out.println("Pidiendo datos...");
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            System.out.print("Escribe un número: ");
            int numero = entrada.nextInt();
            lista[i] = numero;
        }
    }
    
    public static void mostrarLista(int [] lista) {
        System.out.println("\nMostrando números...");
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] % 2 == 0) {
                System.out.print(lista[i] + " ");
            }
        }
    }
    
    public static int [] intercambiarPosiciones2y4(int [] lista) {
        int[] nuevaLista = lista;

        int aux = nuevaLista[2];
        nuevaLista[2] = nuevaLista[4];
        nuevaLista[4] = aux;

        return nuevaLista;
    }
}
