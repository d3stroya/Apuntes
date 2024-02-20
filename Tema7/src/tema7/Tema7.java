package tema7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Tema7 {

    public static void main(String[] args) {
        /*
            1. USO BÁSICO DE ARRAYS DE OBJETOS
        */
        
        // Creo un arreglo de bicicletas con 10 posiciones
        Bicicleta [] vBicicletas = new Bicicleta[10];
        
        // Agrego una bici en la posición 3 con el constructor parametrizado
//        vBicicletas[3] = new Bicicleta("azul", 1, 5);
        
        // Agrego una bici en la posición 6 con el constructor por defecto
//        vBicicletas[6] = new Bicicleta();
        
        // Le asigno valores a la bici de la posición 6
//        vBicicletas[6].setColor("rojo");
//        vBicicletas[6].setPlatos(3);
//        vBicicletas[6].setMarchas(7);
        
        
        // Recorro el arreglo (las posiciones 0-2, 4, 5 y 7-9 son nulas porque no hemos asignado valores).
//        System.out.println("BUCLE FOR-EACH");
//        for(Bicicleta bicicleta : vBicicletas) {
//            System.out.println(bicicleta);
//        }
//                
//        // Recorro el arreglo con un bucle for
//        System.out.println("\nBUCLE FOR");
//        for(int i = 0; i < vBicicletas.length; i++) {
//            System.out.println(vBicicletas[i]);
//        }
        
        
        
        
        /*
            2. LA CLASE ARRAYS
        */
        
        // Relleno el arreglo con bicis por defecto
//        Arrays.fill(vBicicletas, new Bicicleta());
        
        // Recorro el arreglo (ahora no hay valores nulos).
//        for(Bicicleta bicicleta : vBicicletas) {
//            System.out.println(bicicleta);
//            /* Como en la clase Bicicleta he creado el método toString(), se imprimen
//             * los valores de los atributos de cada objeto. Si no tuviera el método toString()
//            * se imprimiría la referencia a la posición en memoria donde está almacenado cada objeto.
//            */
//        }
        
        // Rellenar el arreglo desde una posición hasta el final
        // (!) Llena el array con el mismo objeto 
        // (Comenta el método toString en Bicicleta y fíjate en la posición en memoria 
        // que imprime por pantalla: es siempre la misma)
//        Arrays.fill(vBicicletas, 6, vBicicletas.length, new Bicicleta("rosa", 1, 3));
//        for(Bicicleta bicicleta : vBicicletas) {
//            System.out.println("Color: " + bicicleta.getColor());
//        }
        
        // Si cambiamos el color de la bici ubicada en el índice 7, 
        // se modifica el color de todas las bicis hasta el final
        // (porque es el mismo objeto)
//        System.out.println("\nModificando el color de la bici en el índice 7...");
//        vBicicletas[7].setColor("rojo");
//        
//        for(Bicicleta bicicleta : vBicicletas) {
//            System.out.println("Color: " + bicicleta.getColor());
//        }
        

        // Rellenar un array con objetos distitnos
//        for(int i = 0; i < vBicicletas.length; i++) {
//            vBicicletas[i] = new Bicicleta();
//        }
//        
//        for(Bicicleta bicicleta : vBicicletas) {
//            System.out.println(bicicleta);
//        }

        // Recorrer una matriz con for-each
        // (!) Lo ideal es usar for para tipos de datos simple y for-each para objetos
//        System.out.println("\nRECORRER UNA MATRIZ CON FOR-EACH");
//        int[][] matriz = new int[2][2];
//        matriz[0][0] = 1;
//        matriz[0][1] = 3;
//        matriz[1][0] = 2;
//        matriz[1][1] = 4;
//        
//        for(int[] fila : matriz) {
//            for(int columna : fila) {
//                System.out.print("[" + columna + "]");
//            }
//            System.out.println("");
//        }
        
        // Crear una matriz de objetos y recorrerla con for-each
//        Bicicleta[] vector1 = new Bicicleta[5];
//        Arrays.fill(vector1, new Bicicleta("verde", 3, 5));
//        
//        Bicicleta[] vector2 = new Bicicleta[2];
//        Arrays.fill(vector2, new Bicicleta("negro", 1, 6));
//        
//        Bicicleta[][] vBicis = new Bicicleta[2][];
//        vBicis[0] = vector1;
//        vBicis[1] = vector2;
//        
//        System.out.println("\nBUCLE FOR-EACH EN MATRIZ DE OBJETOS");
//        for(Bicicleta[] fila : vBicis) {
//            for(Bicicleta bici : fila) {
//                System.out.print("[" + bici + "] ");
//            }
//            System.out.println("");
//        }

        // Ordenar un array de tipos simples
//        int[] arrayParaOrdenar = {1,5,8,0,3,7,2,9};
        
//        Arrays.sort(arrayParaOrdenar);        
//        for(int numero : arrayParaOrdenar) {
//            System.out.print(numero);
//        }

        // Ordenar un array de objetos (en la clase Bicicleta, 
        // hay que sobreescribir compareTo de la clase Comparable)
//        for(int i = 0; i < vBicicletas.length; i++) {
//            vBicicletas[i] = new Bicicleta();
//        }
//        vBicicletas[3] = new Bicicleta("azul", 1, 7);
//        vBicicletas[8] = new Bicicleta("negro", 3, 5);
//        
//        Arrays.sort(vBicicletas);
//        for(Bicicleta bici : vBicicletas) {
//            System.out.println(bici);
//        }
        
        // Convertir a string
//        System.out.println("Tipo de dato: " + arrayParaOrdenar.getClass().getTypeName());
//        System.out.println("como int: " + arrayParaOrdenar);
//        System.out.println("como string: " + Arrays.toString(arrayParaOrdenar));
        
        // Saber si dos vectores son iguales
//        int[] arrayDiferente = new int[8];
//        System.out.println("¿Son iguales? " + Arrays.equals(arrayParaOrdenar, arrayDiferente));
        
//        int[] arrayIgual = {1,5,8,0,3,7,2,9};
//        System.out.println("¿Son iguales? " + Arrays.equals(arrayParaOrdenar, arrayIgual));

        // Buscar un elemento con binarySearch (el array tiene que estar ordenado)
        // Si comentas la línea 131, arrayParaOrdenar no se ordena y obtendrás un número negativo
//        System.out.println("\nEl número 1 está en el índice: " + Arrays.binarySearch(arrayParaOrdenar, 1));

    }
     
}