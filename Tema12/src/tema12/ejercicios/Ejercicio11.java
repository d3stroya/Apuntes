
package tema12.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader("ejercicio11/numeros.txt");
            br = new BufferedReader(fr);
            
            int suma = 0;
            String linea = br.readLine();
            
            while(linea != null) {
                suma += Integer.valueOf(linea);
                linea = br.readLine();
            }
            
            System.out.println("La suma es: " + suma);
            
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());            
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            if(fr != null) {
                try {
                    fr.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
