/*
 * Ficheros
 */
package tema12;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public static void main(String[] args) throws IOException {
        
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


        // ¡OJO! con los objetos:
//        File a1 = new File("archivo1.txt"); // Objeto a1 que referencia al fichero archivo1.txt
//        try {
//            a1.createNewFile();
//        } catch(IOException e) {
//            e.getMessage();
//        }
////        
//        System.out.println(a1.getName());
////        
//        File a2 = new File("archivo2.txt"); // Objeto a2 que referencia al fichero archivo2.txt
////
//        a1.renameTo(a2); // Ahora a1 apunta a a2
//        System.out.println("a1 Renombrado: " + a1.getName());
//        System.out.println("a2: " + a2.getName());

        
//        a1.delete();    // No lo elimina
//        a2.delete();    // Sí lo elimina
        
//        a1 = new File("archivo2.txt");
//        a1.delete();    // Sí lo elimina
//        
//        a1.renameTo(new File("renombrado.txt")); // No hay forma de eliminarlo sin crear un nuevo objeto
//        
//        a1.delete();    // No lo elimina
//        File a3 = new File("renombrado.txt");
//        a3.delete();    // Sí lo elimina



        /*
            3. ENTRADA Y SALIDA DE DATOS       
        */
        
        // 3.1. FICHEROS DE TEXTO
        
        // 3.1.1. Leer un archivo de texto: I) Declarar - II) Inicializar y leer - III) Cerrar.
        // Declaramos un lector de caracteres
//        FileReader lector = null;
//        
//        // Declaramos un lector de líneas
//        BufferedReader bufer = null;
//
//        // Los inicializamos manejando las excepciones
//        try {
//            lector = new FileReader("README.md");
//            bufer = new BufferedReader(lector);
//            
//            // Leemos mientras haya líneas
//            String linea = bufer.readLine();
//            while(linea != null) {
//                System.out.println(linea);
//                linea = bufer.readLine();
//            }
//            
//        } catch(FileNotFoundException e) {          // Puede pasar que no se encuentre el archivo
//            System.out.println(e.getMessage());   
//        } catch(IOException e) {                    // O que haya un error de lectura
//            System.out.println(e.getMessage());               
//        } 
//        
//        // Cerramos el búfer y el archivo manejando las excepciones (IOException)
//        // y comprobando que archivo y bufer no son nulos (serán nulos si ha sucedido algún error en la apertura).
//          finally {
//            if(bufer != null) {
//                try {
//                    bufer.close();                                    
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());               
//                }
//            }
//            
//            if(lector != null) {
//                try {
//                    lector.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());                                   
//                }
//            }
//        }
        
        
        
        // 3.1.2. Escribir ficheros de texto: I) Declarar el fichero - II) Abrir y escribir - III) Cerrar
        
        // Inicializamos el escritor de líneas
//        FileWriter escriba = null;
//        
//        // Inicializamos la imprenta de caracteres
//        PrintWriter imprenta = null;
//        
//        // Abrimos el archivo manejando las excepciones
//        try {
//            escriba = new FileWriter("copia.txt", true);
//            imprenta = new PrintWriter(escriba);
//            
//            // Escribimos el fichero
//            for (int i = 0; i < 10; i++) {
//                imprenta.println("Línea " + (i + 1));
//                imprenta.flush();
//            }
//            
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        } 
//        
//        // Cerramos el fichero
//          finally {
//            if(imprenta != null) {
//                imprenta.close();
//            }
//            
//            if(escriba != null) {
//                escriba.close();
//            }
//        }





        /*
            3.2. FICHEROS BINARIOS
        */
        
        // 3.2.1. Escribir un fichero binario
        // Declaramos las variables
//        FileOutputStream fos = null;
//        DataOutputStream dos = null;
//        
//        // Instanciamos los objetos manejando las excepciones
//        try {
//            fos = new FileOutputStream("ficheroBinario.bin", true);
//            dos = new DataOutputStream(fos);
//            
//            // Escribimos los datos
//            dos.writeBoolean(true);
//            dos.writeByte(65);
//            dos.writeDouble(99.8);
//            dos.writeUTF("Hola, fichero binario.");
//            
//        } catch(FileNotFoundException e) {
//            System.out.println("Archivo no encontrado.");
//            System.out.println(e.getMessage());
//        } catch(IOException e) {
//            System.out.println("Error de E/S en la escritura.");
//            System.out.println(e.getMessage());                        
//        }
//        // Cerramos el flujo
//          finally {
//            if(dos != null) {
//                try {
//                    dos.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            
//            if(fos != null) {
//                try {
//                    fos.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
        
        // 3.2.2 Leer ficheros binarios
        // Declaramos las variables
//        FileInputStream fis = null;
//        DataInputStream dis = null;
//        
//        // Instanciamos los objetos
//        try {
//            fis = new FileInputStream("ficheroBinario.bin");
//            dis = new DataInputStream(fis);                        
//            
//            // Leemos los bytes por tipo de dato
//            while(true) {
//                System.out.println(dis.readBoolean());
//                System.out.println(dis.readByte());
//                System.out.println(dis.readDouble());
//                System.out.println(dis.readUTF());
//            }
//                        
//        } catch(FileNotFoundException e) {
//            System.out.println("Archivo no encontrado.");
//            System.out.println(e.getMessage());                
//        } catch(EOFException e) {
//            System.out.println("Has llegado al final del archivo.");
//            System.out.println(e.getMessage());            
//        } catch(IOException e) {
//            System.out.println("Error de E/S en la lectura.");
//            System.out.println(e.getMessage());                        
//        }
//        
//        // Cerramos el flujo
//          finally {
//            if(dis != null) {
//                try {
//                    dis.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            
//            if(fis != null) {
//                try {
//                    fis.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
        


        // Copiamos una imagen:
//        FileInputStream fis = null;
//        DataInputStream dis = null;
//        FileOutputStream fos = null;
//        DataOutputStream dos = null;
//        
//        try {
//            fis = new FileInputStream("supermario.jpeg");
//            dis = new DataInputStream(fis);
//            fos = new FileOutputStream("supermario(2).jpeg");
//            dos = new DataOutputStream(fos);
//                        
//            int b = dis.read();
//            while(b != -1) {
//                System.out.println(b);
//                dos.write(b);
//                b = dis.read();
//            }            
//            
//        } catch(FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if(dis != null) {
//                try {
//                    dis.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            
//            if(fis != null) {
//                try {
//                    fis.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            
//            if(dos != null) {
//                try {
//                    dos.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            
//            if(fos != null) {
//                try {
//                    fos.close();
//                } catch(IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }



        
        
    }
       
}
