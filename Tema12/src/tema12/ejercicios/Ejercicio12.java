
package tema12.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author d3stroya
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        File resultados = new File("ejercicio12/resultados.txt");
        FileReader fr1 = null;
        BufferedReader br1 = null;        
        FileReader fr2 = null;
        BufferedReader br2 = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        String par = "", impar = "";  
        int resultado = 0;
        
        try {
            fr1 = new FileReader("ejercicio12/impares.txt");
            br1 = new BufferedReader(fr1);
            fr2 = new FileReader("ejercicio12/pares.txt");
            br2 = new BufferedReader(fr2);
            fw = new FileWriter(resultados);
            pw = new PrintWriter(fw);
            
            impar = br1.readLine();
            par = br2.readLine();
            
            while(impar != null & par != null) {
                resultado = Integer.parseInt(impar) + Integer.parseInt(par);

                pw.println(resultado);
//                pw.flush();
                
                impar = br1.readLine();
                par = br2.readLine();
            }
            
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());            
        } finally {
            
            if(br1 != null) {
                try {
                    br1.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            if(fr1 != null) {
                try {
                    fr1.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            if(br2 != null) {
                try {
                    br2.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            if(fr2 != null) {
                try {
                    fr2.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());                    
                }
            }
            
            if(pw != null) {
                pw.close();
                
            }
        }
    }
}
