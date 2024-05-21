
package tema12;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class VolcadoALista {
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
    
    
    public static void rellenarLista(ArrayList<Pelicula> lista) {
        do {
            lista.add(new Pelicula(
                    pedirTitulo(), 
                    pedirDire()
            ));
        } while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void volcarLista(File archivo, ArrayList<Pelicula> lista) throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            
            Pelicula c;
            while(true) {
                c = (Pelicula) ois.readObject();
                lista.add(c);
            }
            
        }  catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(EOFException e) {
            System.out.println("Final del archivo");
        } catch(IOException e) {
            System.out.println("Error de salida");
        } catch(ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            } catch(IOException e) {
                System.out.println("Error en entrada/salida");                
            }
            
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch(IOException e) {
                System.out.println("Error en entrada/salida");                
            }
        }                
    }
    
    public static void leerFichero(File archivo, ArrayList<Pelicula> lista) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            
            Pelicula c;
            while(true) {
                c = (Pelicula) ois.readObject();
                System.out.println(c);
            }
            
        }  catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(EOFException e) {
            System.out.println("Final del archivo");
        } catch(ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch(IOException e) {
            System.out.println("Error de salida");
            
        }  finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            } catch(IOException e) {
                System.out.println("Error en entrada/salida");                
            }
            
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch(IOException e) {
                System.out.println("Error en entrada/salida");                
            }
        }
    }
    
    public static void escribirFichero(File archivo, ArrayList<Pelicula> lista) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            
            rellenarLista(lista);
            
            for(Pelicula c : lista) {
                oos.writeObject(c);
            }             
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(IOException e) {
            System.out.println("Error de entrada/salida");
        } finally {

            try {
                if(fos != null) {
                    fos.close();
                }
            } catch(IOException e) {
                System.out.println("Error en entrada/salida");                
            }
            
            try {
                if(oos != null) {
                    oos.close();
                }
            } catch(IOException e) {
                System.out.println("Error en entrada/salida");                
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Pelicula> lista = new ArrayList<>();
        File archivo = new File("lista-pelis.obj");
        
        if(!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch(IOException e) {
                System.out.println("Error al crear el archivo");
            }
            escribirFichero(archivo, lista);
        } else {
            try {
                volcarLista(archivo, lista);
                escribirFichero(archivo, lista);
            } catch (IOException ex) {
                System.out.println("Error de entrada/salida");            
            } catch (ClassNotFoundException ex) {
                System.out.println("Clase no encontrada");
            }
        }
        
        leerFichero(archivo, lista);
    }
}