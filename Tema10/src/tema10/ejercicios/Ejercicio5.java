package tema10.ejercicios;

import java.util.Scanner;
import java.util.ArrayList;

/*
    Crear una lista del tamaño indicado por el usuario.
    Pedirle números y añadirlos a la lista.
    Calcular el mayor par y el menor impar.
    Mostrar la lista por pantalla.
    Intercambiar sus posiciones.
    Mostrar la lista por pantalla.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        
        int mayorPar = mayorPar(lista);
        if(mayorPar != 0) {
            System.out.println("El número par mayor es: " + mayorPar(lista));
        }
        
        int menorImpar = menorImpar(lista);
        if(menorImpar != 0) {
            System.out.println("El número impar menor es: " + menorImpar(lista));
        }
        mostrar(lista);
        
        intercambiarMayorParyMenorImpar(lista);
        mostrar(lista);        
    }
    
    // Vale para pedir longitud y números que insertar en la lista.
    // Mostraré el mensaje en otro método.
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        System.out.println("¿Cuántos números (distintos de 0) quieres insertar?");
        int longitud = pedirNumero();
        
        while(longitud > 0) {
            System.out.print("Número: ");
            lista.add(pedirNumero());
            longitud--;
            System.out.println("");
        }
    }
    
    public static boolean contienePar(ArrayList<Integer> lista) {
        boolean esPar = false;
        int i = 0;
        while(!esPar && i < lista.size()) {
            if(lista.get(i) % 2 == 0) {
                esPar = true;
            } else {
                i++;
            }            
        }
        return esPar;
    }
    
    public static boolean contieneImpar(ArrayList<Integer> lista) {
        boolean esImpar = false;
        int i = 0;
        while(!esImpar && i < lista.size()) {
            if(lista.get(i) % 2 != 0) {
                esImpar = true;
            } else {
                i++;
            }            
        }
        return esImpar;
    }
    
    /**
     * Devuelve el número par mayor de la lista.
     * @param lista
     * @return el número par o 0 si no hay números pares
     */
    public static int mayorPar(ArrayList<Integer> lista) {
        if(!lista.isEmpty() && contienePar(lista)) {
            return lista.stream().filter(numero -> numero % 2 == 0)
                .max((a, b) -> a - b).get();            
        } else {
            System.out.println("La lista no contiene ningún número par.");
            return 0;
        } 
    }
    
    /**
     * Devuelve el número impar menor de la lista
     * @param lista
     * @return el menor impar o 0 si no hay ningún impar
     */
    public static int menorImpar(ArrayList<Integer> lista) {
        if(!lista.isEmpty() && contieneImpar(lista)) {
            return lista.stream().filter(numero -> numero % 2 != 0)
                    .min((a, b) -> a - b).get();            
        } else {
            System.out.println("La lista no contiene ningún número impar");
            return 0;
        }
    }
    
    /**
     * Intercambia las posiciones del mayor par y del menor impar
     * siempre que ambos se hayan encontrado.
     * @param lista 
     */
    public static void intercambiarMayorParyMenorImpar(ArrayList<Integer> lista) {
        System.out.println("\nIntercambiando posiciones...");
        int mayor = mayorPar(lista);
        int menor = menorImpar(lista);
        int iMayor = lista.indexOf(mayor);
        int iMenor = lista.indexOf(menor);
        
        if(mayor != 0 && menor != 0) {            
            lista.set(iMenor, mayor);
            lista.set(iMayor, menor);            
        }
    }
    
    public static void mostrar(ArrayList<Integer> lista) {
        System.out.println("\nMostrando lista...");
        lista.forEach(System.out::println);
    }
    
    //    public static int calcularMayorPar(ArrayList<Integer> lista) {
//        int mayor = lista.get(0);
//
//        for(int i = 1; i < lista.size(); i++) {
//            if(lista.get(i) % 2 == 0 && lista.get(i) > mayor) {
//                mayor = lista.get(i);
//            }
//        }
//
//        return mayor;
//    }
//    
//    public static int calcularMenorImpar(ArrayList<Integer> lista) {
//        int menor = lista.get(0);
//        
//        for(int i = 0; i < lista.size(); i++) {
//            if(lista.get(i) % 2 != 0 && lista.get(i) < menor) {
//                menor = lista.get(i);
//            }
//        }
//        return menor;
//    }

}
