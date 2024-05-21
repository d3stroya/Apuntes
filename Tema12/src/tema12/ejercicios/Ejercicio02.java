
package tema12.ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 *
 * @author d3stroya
 */
public class Ejercicio02 {
    public static File crearDirectorioEjemplo() {
        File dirEjemplo = new File("ejercicio01");
        dirEjemplo.mkdir();
        System.out.println("Directorio '" + dirEjemplo.getName() + "' creado correctamente");
        return dirEjemplo;
    }
    
    public static File crearFicheros(File directorio, String nombre) {
        File fichero = new File(directorio, nombre);
        try {
            fichero.createNewFile();
            System.out.println("Archivo '" + nombre + "' creado correctamente");
        } catch(IOException | SecurityException e) {
            e.getMessage();
        }
        return fichero;
    }    
    
    public static void renombrarFichero1(File directorio, File fichero) {
        String nombreAntiguo = fichero.getName();        
        String nuevoNombre = "renombrado.txt";
        
        try {
            fichero.renameTo(new File(directorio, nuevoNombre));            
        } catch(SecurityException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Archivo '" + nombreAntiguo + "' renombrado a '" + nuevoNombre + "'");
    }
    
    public static void eliminarFichero(File fichero) {
        String nombre = fichero.getName();
        
        try {
            fichero.delete();            
        } catch(SecurityException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Archivo '" + nombre + "' eliminado correctamente");
    }
    
    public static void main(String[] args) {
        File directorio = crearDirectorioEjemplo();
        File fichero1 = crearFicheros(directorio, "fichero1");
        File fichero2 = crearFicheros(directorio, "fichero2");
        renombrarFichero1(directorio, fichero1);
        eliminarFichero(fichero2);
    }
}
