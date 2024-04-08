
package tema11.ejercicios;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio2 {
    private static Map<Integer, Producto> productos = new HashMap<>();
    
    private static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    private static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio: ");
        return entrada.nextFloat();
    }
    
    private static int pedirUnidades() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Unidades: ");
        return entrada.nextInt();
    }
    
    private static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Quieres añadir más productos? (s/n) ");
        return entrada.nextLine();
    }
    
    public static void insertar() {
        System.out.println("\n-> Insertando producto...");
        int codigo = 1;
        do {
            System.out.println("PRODUCTO " + codigo);
            productos.put(codigo, new Producto(pedirNombre(), pedirPrecio(), pedirUnidades()));
            codigo++;
        } while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrar() {
        System.out.println("\n-> Mostrando productos...");
        Iterator<Integer> it = productos.keySet().iterator();
        int clave = 0;
        
        while(it.hasNext()) {
            clave = it.next();
            System.out.println(clave + " - " + productos.get(clave));
        }
    }
   
    private static int pedirCodigo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Código: ");
        return entrada.nextInt();
    }
    
    public static Producto buscar(int codigo) {
        Producto producto = null;
        Iterator<Integer> it = productos.keySet().iterator();
        int clave = 0;
        
        while(it.hasNext()) {
            clave = it.next();
            if(clave == codigo) {
                producto = productos.get(clave);
            }
        }
        
        return producto;
    }
    
    public static void eliminar(int codigo) {
        System.out.println("\n-> Eliminando producto...");
        Producto producto = buscar(codigo);
        productos.remove(codigo, producto);        
    }
    
    public static void menuAdmin() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n- MENÚ ADMIN -");
            System.out.println("1. Insertar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Volver al menú principal");

            try {
                opcion = entrada.nextInt();
                
                switch(opcion) {
                    case 1 -> insertar();
                    case 2 -> mostrar();
                    case 3 -> eliminar(pedirCodigo());
                    case 4 -> System.out.println("Abandonando menú admin...");
                }
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }            
        } while(opcion != 4);
        
    }
    
    public static void menuCompra() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n- MENÚ DE COMPRA -");
            System.out.println("1. Comprar");
            System.out.println("2. Volver al menú principal");

            try {
                opcion = entrada.nextInt();
                
                switch(opcion) {
                    case 1 -> comprar();
                    case 2 -> System.out.println("Abandonando menú de compra...");
                }
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }            
        } while(opcion != 2);
        
    }
    
    public static void actualizarStock(Producto producto, int unidades) {
        producto.setStock(producto.getStock() - unidades);
    }

    private static void comprar() {
        float total = 0;
        
        do {
            mostrar();
            Producto producto = buscar(pedirCodigo());
            int unidades = pedirUnidades();
            
            total += producto.getPrecio() * unidades;
            actualizarStock(producto, unidades);
            
        } while(pedirSeguir().equalsIgnoreCase("s"));
     
        System.out.println("IMPORTE TOTAL: " + total + "€");
    }
    
    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n- MENÚ PRINCIPAL -");
            System.out.println("1. Menú admin");
            System.out.println("2. Menú de compra");
            System.out.println("3. Salir");

            try {
                opcion = entrada.nextInt();
                
                switch(opcion) {
                    case 1 -> menuAdmin();
                    case 2 -> menuCompra();
                    case 3 -> System.out.println("Cerrando programa...");
                }
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }            
        } while(opcion != 3);
        
    }
    
    public static void main(String[] args) {
        mostrarMenu();
    }

}
