/*
 * Listas
 */
package tema10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author anabel
 */
public class Tema10 {
    /*
        AMPLIACIÓN:
            - Data Structures: https://www.youtube.com/watch?v=RBSGKlAvoiM
            - Algorithms & data structures: https://www.youtube.com/watch?v=8hly31xKli0
    */

    public static void main(String[] args) {
        /*
            0. ESTRUCTURAS DINÁMICAS
        */
        
        // Vectores y ArrayList por debajo son arrays y su capacidad 
        // se va duplicando a medida que lo necesitamos
//        Vector<Integer> vector = new Vector<>();
//        
//        System.out.println("Tamaño: " + vector.size());
//        System.out.println("Capacidad:" + vector.capacity());
//        
//        for(int i = 0; i < 21; i++) {
//            vector.add(i);
//        }
////        
//        System.out.println("Nuevo tamaño: " + vector.size());
//        System.out.println("Nueva capacidad:" + vector.capacity());
        
        
        /*
            1. LISTAS DE TIPOS SIMPLES
        */
        // Instanciar una lista        
        List<Integer> numeros = List.of(1,2,3); 
        
        // (!) Mejor estructura para insertar/eliminar
        LinkedList<String> nombres = new LinkedList<>();

        // (!) Mejor estructura para acceder
        ArrayList<Integer> lista1 = new ArrayList<>();
        
        // Agregar valores
        int a = 3, b = 201, c = 32;
        lista1.add(a);
        lista1.add(b);
        lista1.add(c);
        lista1.add(3, 8);        
        
        // Recuperar un elemento
//        System.out.println(lista1.get(2));
        
        // Recorrer la lista con for
//        System.out.println("Lista 1 - BUCLE FOR");
//        for(int i = 0; i < lista1.size(); i++) {
//            System.out.print("[" + lista1.get(i) + "]");
//        }

        // Recorrer la lista con forEach
//        System.out.println("\n\nLista 1 - BUCLE FOR EACH");
//        lista1.forEach(numero -> System.out.print("[" + numero + "]"));

        // Recorrer la lista con forEach y referencia métodos
//        lista1.forEach(System.out::println);
        
        // Clonar una lista. (!) No es lo mismo clonar que igualar
//        System.out.println("\nClonando lista1 en lista3...");
        ArrayList<Integer> lista3 = (ArrayList) lista1.clone();     // Es una copia de lista1
//        
//        System.out.println("\nIgualando lista2 a lista1...");
        ArrayList<Integer> lista2 = lista1;     // Es una variable que apunta a la lista1
        
        // Aparentemente son lo mismo...
//        lista1.forEach(System.out::println);
//        lista2.forEach(System.out::println);
//        lista3.forEach(System.out::println);
        
        // ...pero no son lo mismo
//        System.out.println("Lista 1: " + System.identityHashCode(lista1));
//        System.out.println("Lista 2: " + System.identityHashCode(lista2));
//        System.out.println("Lista 3: " + System.identityHashCode(lista3));
        
        
//        // Modificar el valor de un elemento
//        System.out.println("\nModificando el valor de la posición 1 en lista1: 201 -> 200...");
//        lista1.set(1, 200);        
//        System.out.println("\nLista 1");
//        lista1.forEach(numero -> System.out.println(numero));
//
//        System.out.println("\nLista 2 (igualada a lista1)");
//        lista2.forEach(numero -> System.out.println(numero));
//        
//        System.out.println("\nLista 3 (clonada de lista1)");
//        lista3.forEach(numero -> System.out.println(numero));
//        
//        // Tamaño de la lista
//        System.out.println("\nLa lista 1 tiene un tamaño de " + lista1.size());
//        
//        // Saber si está vacía
//        System.out.println("¿Está vacía la lista 1? " + lista1.isEmpty());
//        
        // (+) Combinación con el operador ternario (condición ? retorno si true : retorno si false;)
//        String resultado = lista1.isEmpty() ? "sí" : "no";
//        System.out.println(resultado);
//        
//        // Eliminar un elemento por su índice 
        lista2.remove(1);
//        System.out.println("\nEliminando elemento 1 de la lista 2...");
//        lista2.forEach(elemento -> System.out.println(elemento));
//        
//        // Eliminar un elemento por su valor (debemos pasar por parámetro el objeto)    
//        lista3.remove(Integer.valueOf(c)); // lista3.remove(Integer.valueOf(32));
//        System.out.println("\nEliminando elemento con el valor 32 de la lista 3...");
//        lista3.forEach(elemento -> System.out.println(" · " + elemento)); 
//        System.out.println("");
      
//        // Vaciar la lista
//        lista2.clear();
//        System.out.println("\nVaciando lista 2...");
//        lista2.forEach(elemento -> System.out.println(elemento));        
//        System.out.println("¿Está vacía la lista 2? " + lista2.isEmpty());
//        System.out.println(lista1.isEmpty() ? 0 : -1);
//        
//        // Buscar si existe un elemento
//        System.out.println("\n¿Contiene la lista 3 el número 8? " + lista3.contains(8));
//        
//        // Obtener el índice de un elemento
//        System.out.println("¿En qué índice está el número 8 en la lista 3? " + lista3.indexOf(8));
//        lista3.add(8);
//        System.out.println("¿Cuál es el último índice del número 8 en la lista 3? " + lista3.lastIndexOf(8));
//        
//        // Convertir una lista en array
//        System.out.println("\nConvirtiendo lista3 en array...");
//        Object[] aLista3 = lista3.toArray();
//        System.out.println("Accediendo al elemento en la posición 1 de la lista 3: " + aLista3[2]);
        



        /*
            2. LISTAS DE LISTAS

            / \         /  \   /  \   /  \   /  \     
           | 0 |  -->  | 00 | | 01 | | 02 | | 03 |
            \ /         \  /   \  /   \  /   \  /

            / \         /  \   /  \   /  \   /  \     
           | 1 |  -->  | 10 | | 11 | | 12 | | 13 |
            \ /         \  /   \  /   \  /   \  /

        */
        
//                   ·-----------------·
//      notasAlumno1 | [ ] [ ] [ ] [ ] |  n
//                   ·-----------------·  o
//                                        t
//                   ·-----------------·  a
//      notasAlumno2 | [ ] [ ] [ ] [ ] |  s
//                   ·-----------------·  

//        // Creo dos listas con las notas de 2 alumnos
//        ArrayList<Integer> notasAlumno1 = ArrayList<>(); 
//        notasAlumno1.add(3);
//        notasAlumno1.add(5);
//        notasAlumno1.add(2);
//        notasAlumno1.add(8);
////
//        ArrayList<Integer> notasAlumno2 = new ArrayList<>();
//        notasAlumno2.add(8);
//        notasAlumno2.add(5);
//        notasAlumno2.add(7);
//        notasAlumno2.add(8);
////        
////        // Creo una lista para almacenar las listas anteriores
//        ArrayList<ArrayList<Integer>> alumnos = new ArrayList<>();        
//        alumnos.add(notasAlumno1);
//        alumnos.add(notasAlumno2);
////        
////        // Recorro la lista de listas (igual que una matriz)
//        for(int i = 0; i < alumnos.size(); i++) {
//            System.out.println("\nAlumno " + (i + 1));
//            for(int j = 0; j < alumnos.get(0).size(); j++) {
//                System.out.println("Nota " + (j + 1) + ": " + alumnos.get(i).get(j));
//            }            
//        }
       




        /*
            3. LISTAS DE OBJETOS DEFINIDOS POR EL USUARIO
        */
        
        
        // Creamos 2 usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario franky = new Usuario(
                "Franky", 
                "https://64.media.tumblr.com/0b125d177e20e6e784ad60a40a2e9b25/tumblr_nvrrysFW7N1uwb6u7o1_1280.jpg", 
                27
        );
        
        Usuario elliot = new Usuario(
                "Elliot", 
                "https://64.media.tumblr.com/cb0f6fa6abad9ebf05be06bdc0dddd04/tumblr_obcj28mtTM1vcs6uso1_1280.jpg", 
                34
        );
//        
//        // Agregamos usuarios a la lista
        usuarios.add(franky);
        usuarios.add(elliot);
//        
//        // Mostramos nombre y foto de cada usuario
//        for(Usuario usuario : usuarios) {
//            System.out.println(usuario.getNombre() + " | " + usuario.getFoto());
//        }
//        
//        System.out.println("");
//        
//        // Lo mismo con otra sintaxis
//        usuarios.forEach(usuario -> System.out.println(usuario.getNombre() + " | " + usuario.getFoto()));

        /*
            4. RECORRER LISTAS CON ITERADORES
        */
        System.out.println("\nITERADORES");
        // Instanciamos el iterador
        Iterator<Usuario> it = usuarios.iterator();
        
        // Mientras haya más elementos, avanzamos por la lista de pasando de uno a otro
        while(it.hasNext()) {
            // Eliminamos el elemento
            it.remove();  // Si descomentas esta línea, se eliminará el elemento antes de guardarlo en usuario y no se imprimirá
            
            // Accedemos al siguiente elemento y lo guardamos en la variable usuario
            Usuario usuario = it.next();
            
            // Imprimimos sus valores por pantalla
            System.out.println(usuario);
            

            
        }
    }
}
