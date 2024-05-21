
package tema12.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09 {
    public static String leer(File archivo) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String frase = br.readLine();        
        
        br.close();
        fr.close();
        
        return frase;
    }    
    
    public static void escribir(String frase, File archivo) throws IOException {
        FileWriter fw = new FileWriter("ejercicio09/fraseinvertida.txt");
        PrintWriter pw = new PrintWriter(fw);

        for(int i = frase.length() - 1; i >= 0; i--) {
            pw.print(frase.charAt(i));            
        }
        
        pw.close();
        fw.close();                
    }
    
    public static void main(String[] args) {
        File archivo = new File("ejercicio09/frase.txt");
        try {
            String frase = leer(archivo);
            System.out.println(frase);
            escribir(frase, archivo);            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
