
package tema12.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author d3stroya
 */
public class Ejercicio08 {
    public static void main(String[] args) {        
        File fichero = new File("README.md");
        FileReader fr = null;
        int letra = 0;
        
        try {
            fr = new FileReader(fichero); 
            letra = fr.read();
            while(letra != -1) {    // -1 es el final del fichero
                if(letra != 32) {   // 32 es el caracter de espacio
                    System.out.print((char)letra);
                }
                letra = fr.read();
            }
            
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());            
        } finally {
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
