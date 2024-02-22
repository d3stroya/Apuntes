package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarListaAntesYDespues(lista);
        recorrerLista(lista);
        System.out.println("");
        mostrarListaAntesYDespues(lista);
        System.out.println("");
    }
    
     public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);        
        System.out.println("[·] Escribe un número mayor que 0");
        System.out.println("[·] Escribe un número negativo para salir del programa");

        return entrada.nextInt();
    }
    
    public static boolean esRepetido(ArrayList<Integer> lista, int numero, int posicion) {
        boolean encontrado = false;
        int i = posicion;
        
        while(i < lista.size() && !encontrado) {
            int numeroActual = lista.get(i);
            if(numeroActual == numero) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        int numero = pedirNumero();
        while (numero > 0) {       
            lista.add(numero);
            numero = pedirNumero();
        }
    }
    
    public static void sustituirRepetidos(ArrayList<Integer> lista, int numero) {
        int indicePrimero = lista.indexOf(numero);
        int indiceUltimo = lista.lastIndexOf(numero);
        
        for(int i = indicePrimero; i <= indiceUltimo; i++) {
            if(lista.get(i) == numero) {
                lista.set(i, 0);
            }
        }
    }
    
    public static void recorrerLista(ArrayList<Integer> lista) {
        int numeroActual = 0;
        
        for(int i = 0; i < lista.size(); i++) {
            numeroActual = lista.get(i);
            if(numeroActual != 0) {
                if(esRepetido(lista, numeroActual, i+1)) {
                    sustituirRepetidos(lista, numeroActual);
                }
            }
        }
    }
    
    public static void mostrarListaAntesYDespues(ArrayList<Integer> lista) {
        lista.forEach(System.out::print);
    }
}
