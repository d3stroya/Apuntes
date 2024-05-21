
package tema12.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import static tema12.ejercicios.Ejercicio06.escribir;
import static tema12.ejercicios.Ejercicio06.leer;

/**
 *
 * @author d3stroya
 */
public class Ejercicio07 {
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static String pedirTexto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Texto: ");
        return entrada.nextLine();
    }
    
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quieres añadir otra línea? (s/n): ");
        return entrada.nextLine();
    }
    
    public static File crearArchivo(String nombreArchivo) {
        File dir = new File("ejercicio07");
        dir.mkdir();
                
        File archivo = new File(dir, nombreArchivo);
        try {
            archivo.createNewFile();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        return archivo;
    }
    
    public static void escribir(File archivo) throws IOException {
        FileWriter fw = new FileWriter(archivo);
        PrintWriter pw = new PrintWriter(fw);
        
        do {
            pw.print(pedirTexto());
        } while(pedirSeguir().equalsIgnoreCase("s"));
        
        pw.close();
        fw.close();
    }
    
    public static void leer(File archivo) throws IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        String linea = br.readLine();
        while(linea != null) {
            linea = convertirMayusMinus(linea);
            System.out.println(linea);
            linea = br.readLine();
        }
        
        br.close();
        fr.close();
    }
    
    public static String convertirMayusMinus(String linea) {
        // Mayúsculas: 65 - 90 
        // Minúsculas: 97 - 122
        String nuevaLinea = "";
        
        for(int i = 0; i < linea.length(); i++) {
            int letra = (int)linea.charAt(i);
            if(letra >= 97 && letra <= 122) {
                letra = letra - (97 - 65);
            } else if(letra >= 65 && letra <= 90) {
                letra = letra + (97 - 65);
            }
            
            nuevaLinea += (char)letra;
        }
        return nuevaLinea;
    }
    
    public static void main(String[] args) {
        File archivo = crearArchivo(pedirNombre());
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("1. Escribir");
                System.out.println("2. Leer");
                System.out.println("3. Salir");
                System.out.print("\nElige una opción: ");

                opcion = entrada.nextInt();   
                
                switch(opcion) {
                    case 1:
                        try {
                            escribir(archivo);       
                        } catch(IOException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2: 
                        try {
                            leer(archivo);
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
