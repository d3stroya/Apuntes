
package tema12;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class ManejoCabeceraStream {
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Quieres añadir otra película a la lista? (s/n): ");
        return entrada.nextLine();
    }
    
    public static String pedirTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Título: ");
        return entrada.nextLine();
    }
    
    public static String pedirDire() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Director/a: ");
        return entrada.nextLine();
    }
    
    public static void insertarPeliculas(ObjectOutputStream oos) throws IOException {        
        do {
            System.out.println("\nInsertando nueva película...");
            Pelicula p = new Pelicula(pedirTitulo(), pedirDire());
            oos.writeObject(p);
        } while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void escribirFichero() {
        File archivo = new File("objetos-pelicula.obj");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            if(!archivo.exists()) {
                fos = new FileOutputStream("objetos-pelicula.obj");
                oos = new ObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream("objetos-pelicula.obj", true);
                oos = new MiObjectOutputStream(fos);
            }
            
            insertarPeliculas(oos);
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(IOException e) {
            System.out.println("Error en E/S en la escritura");
            
        } finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch(IOException e) {
                    System.out.println("Error de E/S al cerrar el flujo");
                }
            }
            
            if(fos != null) {
                try {
                    fos.close();
                } catch(IOException e) {
                    System.out.println("Error de E/S al cerrar el flujo");
                }
            }
        }
        
    }
    
    public static void leerPeliculas(ObjectInputStream ois) throws IOException, ClassNotFoundException, EOFException {
        System.out.println("\n- LISTA DE PELÍCULAS -");
        
        while(true) {
            Pelicula p = (Pelicula) ois.readObject();
            System.out.println(p);
        }
        
//        System.out.println("Películas leídas correctamente");
    }
    
    public static void leerFichero() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream("objetos-pelicula.obj");
            ois = new ObjectInputStream(fis);
            
            leerPeliculas(ois);
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        }catch(EOFException e) {
            System.out.println("Final del archivo");
        } catch(IOException e) {
            System.out.println("Error de E/S en la lectura");
            
        } finally {
            if(ois != null) {
                try {
                    ois.close();
                } catch(IOException e) {
                    System.out.println("Error al cerrar el flujo");
                }
            }
            
            if(fis != null) {
                try {
                    fis.close();
                } catch(IOException e) {
                    System.out.println("Error al cerrar el flujo");
                }
            }            
        }
    }
    
    public static void main(String[] args) {
        escribirFichero();
        leerFichero();
    }
}
