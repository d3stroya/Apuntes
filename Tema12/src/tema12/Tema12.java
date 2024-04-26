/*
 * Ficheros
 */
package tema12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Tema12 {

    /*
        1. EXCEPCIONES
    
        Son errores en el tiempo de ejecución.
        El programa compila y, aparentemente, está bien,
        pero durante la ejecución del programa sucede algún error,
        por ejemplo:
            - porque dividimos por 0 (Arithmetic Exception)
            - porque desbordamos un array (ArrayIndexOutOfBounds)
            - porque intentamos acceder a un objeto nulo (NullPointerException)
            - ...
    
        Existen 2 formas de tratar estos errores:
            1) En el poripo método (try-catch)
            2) En otro método cuando llamamos al primero (throws)
    
    */
    public static void rellenarArray(int[] numeros) throws ArrayIndexOutOfBoundsException {        
        for(int i = 0; i < 12; i++) {
            numeros[i] = i + 2;
        }
    }
    
    public static void dividir(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }
    
    public static void getObjeto(Alumno[] aAlumnos) throws NullPointerException {
        System.out.println(aAlumnos[0].getNumExpediente());
    }
    
    public static void main(String[] args) {
        
        /*
            1.1. Sin manejo de excepciones:
        */
//        System.out.println("Iniciando programa...");
//        
//        // Fuerzo el error creando un array de 10 posiciones
//        int[] numeros = new int[10];
//        
//        // y la excepción, que detiene el programa
//        rellenarArray(numeros);
//        
//        // El código posterior no se ejecuta
//        System.out.println("...finalizando programa");
        
        
        /*
            1.2. Con manejo de excepciones
        */
//        System.out.println("Iniciando programa...");
//        int[] numeros = new int[10];
//        Alumno[] aAlumnos = new Alumno[25];
////        
//        try {
//            rellenarArray(numeros); 
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("\nERROR");
//            System.out.println(e.getMessage());
//        } 
//        
//        try {
//            dividir(1, 0);            
//        } catch(ArithmeticException e) {
//            System.out.println("\nERROR");
//            System.out.println(e.getMessage());
//        }
//        
//        try {
//            getObjeto(aAlumnos);
//        } catch(NullPointerException e) {
//            System.out.println("\nERROR");
//            System.out.println(e.getMessage());
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("\nERROR");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("\nEste es el bloque final, que se ejecuta siempre"
//                    + ", se dé o no la excepción.");
//            System.out.println("¡¡¡IMPORTANTE!!!: Lo usaremos SIEMPRE para cerrar ficheros.");
//        }
//        
//        System.out.println("\n...finalizando programa");
      
        





        /*
            2. LA CLASE FILE: https://docs.oracle.com/javase/8/docs/api/
        */
        // Crear un archivo
//        File archivo = new File("README.md");
////        archivo.createNewFile();
//
//        try {
//            archivo.createNewFile();
//        } catch(IOException e) {
//            e.getMessage();
//        }
//
//        // Crear un directorio
//        File directorio = new File("/Users/nombres.txt");
//        directorio.mkdir();
//
//        // Crear un fichero en un directorio específico
//        File archivoNombres = new File(directorio, "nombres.txt");
//        try {
//            archivoNombres.createNewFile();
//        } catch(IOException e) {
//            e.getMessage();
//        }
//
////        // Comprobar si un archivo o directorio existe
//        System.out.println(archivo.exists());
//        
////        // Obtener nombre del archio
//        System.out.println("Nombre: " + archivo.getName());
////        
////        // Obtener ruta del archivo
//        System.out.println("Ruta: " + archivo.getPath());
//        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
////        
////        // Eliminar un archivo
////         archivo.delete();         
////         System.out.println("Archivo eliminado");
////
////        // Obtener el tamaño del archivo
//        System.out.println("Tamaño: " + archivoNombres.length());
//        
//        // Renombrar archivo
//        archivoNombres.renameTo(new File(directorio, "animales.txt"));
//        
//        
//        // Obtener la lista de archivos que contiene el directorio
//        String[] lista = directorio.list();
//        for(int i = 0; i < lista.length; i++) {
//            System.out.println(i + " - " + lista[i]);  
//        }
//                
//        // Saber si es un directorio
//        System.out.println("¿Es  Documentos un directorio? " + directorio.isDirectory());
//        System.out.println("¿Es  Documentos un archivo? " + directorio.isFile());
//        
//        // Crear los directorios especificados en la ruta si no existen
//        File ejemplo = new File("Documentos/ejemplo/parte1");
//        ejemplo.mkdirs();
        
        
    }
       
}
