
package tema12.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio05 {
    
    public static File crearArchivo() throws IOException {
        File agenda = new File("ejercicio05/agenda.txt");
        if(!agenda.exists()) {
            agenda.createNewFile();            
        }
        return agenda;
    }
    
    public static String pedirNombre() throws InputMismatchException, NoSuchElementException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirEdad() throws InputMismatchException, NoSuchElementException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        return entrada.nextInt();
    }
    
    public static String pedirTfn() throws InputMismatchException, NoSuchElementException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Teléfono: ");
        return entrada.nextLine();
    }
    
    public static void escribir(File agenda) throws IOException {
        // 1. Inicializo en null
        FileWriter fw = null;
        PrintWriter pw = null;
        
        // 2. Instancio objetos
        fw = new FileWriter(agenda, true);
        pw = new PrintWriter(fw);
            
        // 3. Escribo los datos
        insertarContacto(pw, pedirNombre(), pedirEdad(), pedirTfn());
            
        // 4. Cierro el fichero
        pw.close();           
        fw.close();
    }
    
    public static void insertarContacto(PrintWriter pw, String nombre, int edad, String tfn) {
        pw.println(nombre + ";" + edad + ";" + tfn + ";");
    }
    
    public static void leer(File agenda) throws IOException {
        // 1. Abro el archivo
        FileReader fr = new FileReader(agenda);
        BufferedReader br = new BufferedReader(fr);
        
        // 2. Leo todas las líneas
        String linea = br.readLine();
        while(linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        
        // 3. Cierro el archivo
        br.close();
        fr.close();
    }
    
    public static void main(String[] args) {
        File agenda = new File("ejercicio05/agenda.txt");
        agenda.delete();
        
        try {
            agenda = crearArchivo();            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("1. Escribir contacto");
                System.out.println("2. Leer contactos");
                System.out.println("3. Salir");
                System.out.print("\nElige una opción: ");

                opcion = entrada.nextInt();   
                
                switch(opcion) {
                    case 1:
                        try {
                            // Este método contiene llamadas a otros métodos dentro. 
                            // Esos métodos lanzan las mismas excepciones, 
                            // así que las capturo aquí, sólo 1 vez, y ahorro código.
                            escribir(agenda);       
                        } catch(IOException e) {
                            System.out.println(e.getMessage());
                        } catch(InputMismatchException e) {
                            System.out.println(e.getMessage());                            
                        } catch(NoSuchElementException e) {
                            System.out.println(e.getMessage());                                                        
                        }
                        break;
                    case 2: 
                        try {
                            leer(agenda);
                        } catch(IOException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        break;
                }
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            
        } while(opcion != 3);
        
    }
}
