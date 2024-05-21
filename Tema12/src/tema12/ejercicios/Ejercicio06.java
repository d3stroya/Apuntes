
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
import static tema12.ejercicios.Ejercicio05.escribir;
import static tema12.ejercicios.Ejercicio05.leer;

/**
 *
 * @author d3stroya
 */
public class Ejercicio06 {
    
    public static void escribir(File archivo) throws FileNotFoundException, IOException {
        FileWriter fw = new FileWriter(archivo);
        PrintWriter pw = new PrintWriter(fw);
        
        volcarNumeros(pw, rellenarArray());
        
        pw.close();
        fw.close();
    }
    
    public static int[] rellenarArray() {
        int[] pares = new int[100];
        int contador = 0, i = 0;
        
        while(contador < 100) {
            if(i % 2 == 0) {
                pares[contador] = i;
                contador++;
            }
            i++;
        }
        
        return pares;
    }
    
    public static void volcarNumeros(PrintWriter pw, int[] pares) {        
        for(int i = 0; i < pares.length; i++) {
            pw.print(pares[i] + ", ");            
        }
    }
    
    public static void leer(File archivo) throws IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        String linea = br.readLine();
        while(linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        
        br.close();
        fr.close();
    }
    
    public static void main(String[] args) {
        File dir = new File("ejercicio06");
        dir.mkdir();
        
        File archivo = new File(dir, "numeros.txt");
        try {
            archivo.createNewFile();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("1. Escribir números");
                System.out.println("2. Leer archivo");
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
