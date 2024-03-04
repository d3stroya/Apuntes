
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        ArrayList<Producto> lProductos = new ArrayList<>();
        mostrarMenu(lProductos);
    }    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio: ");
        return entrada.nextFloat();
    }
    public static int pedirStock() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Stock: ");
        return entrada.nextInt();
    }
    
    public static String pedirConfirmacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Quieres seguir comprando? ");
        return entrada.nextLine();
    }
    
    
    
    // OPCIONES DE ADMINISTRACIÓN
    public static void insertar(ArrayList<Producto> lProductos) {
        String nombre = pedirNombre();
        float precio = pedirPrecio();
        int stock = pedirStock();
        
        Producto producto = new Producto(nombre, precio, stock);
        lProductos.add(producto);
                
        // Lo mismo en una línea
//        lProductos.add(new Producto(pedirNombre(), pedirPrecio(), pedirStock()));
        
        System.out.println("Producto añadido corectamente");
    }
    
    public static void mostrar(ArrayList<Producto> lProductos) {
        if(!lProductos.isEmpty()) {
            System.out.println("- LISTA DE PRODUCTOS -");
            lProductos.forEach(System.out::println);            
        } else {
            System.out.println("No hay productos");
        }
    }
    
    public static void eliminar(ArrayList<Producto> lProductos) {
        if(!lProductos.isEmpty()) {
            Producto producto = buscar(lProductos);
            lProductos.remove(producto);
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("No hay productos para borrar");
        }
    }
    
    public static Producto buscar(ArrayList<Producto> lProductos) {
        Producto producto = new Producto();
        if(!lProductos.isEmpty()) {
            int i = 0;
            boolean encontrado = false;
            String nombre = pedirNombre();
            
            while(!encontrado && i < lProductos.size()) {
                if(lProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    producto = lProductos.get(i);
                } else {                    
                    i++;
                }
            }
        } else {
            System.out.println("No hay productos en la lista");
        }
        return producto;
    }
    
    // OPCIONES DE COMPRA
    public static void actualizarStock(Producto producto, int unidades) {
        int stockActual = producto.getStock();
        producto.setStock(stockActual - unidades);
    }
    
    public static void comprar(ArrayList<Producto> lProductos) {
        float importeTotal = 0;
        
        do {
            mostrar(lProductos);

            System.out.println("Escribe el nombre del producto que quieres comprar:");
            Producto producto = buscar(lProductos);

            System.out.println("¿Cuántas unidades quieres llevarte?");
            int unidades = pedirStock();
            importeTotal += producto.getPrecio() * unidades;
            
            actualizarStock(producto, unidades);                                    
        } while(pedirConfirmacion().equalsIgnoreCase("sí"));
        
        System.out.println("Total: " + importeTotal + "€");
    }
    
    
    // MENÚS
    public static void mostrarMenu(ArrayList<Producto> lProductos) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENÚ - ");
            System.out.println("1. Menú admin");
            System.out.println("2. Menú compra");
            System.out.println("3. Salir");
            
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> mostrarSubmenuAdmin(lProductos);
                case 2 -> mostrarSubmenuCompra(lProductos);
                case 3 -> {}
                default -> System.out.println("Escribe una opción correcta");
            }
        } while (opcion != 3);
    }
    
    public static void mostrarSubmenuAdmin(ArrayList<Producto> lProductos) {
        Scanner entrada = new Scanner(System.in);
        int opcionAdmin = 0;
        
        do {
            System.out.println("- MENÚ - ");
            System.out.println("1. Añadir producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Eliminar productos");
            System.out.println("4. Volver al menú principal");
            
            System.out.print("Elige una opción: ");
            opcionAdmin = entrada.nextInt();
            
            switch(opcionAdmin) {

                case 1 -> insertar(lProductos);
                case 2 -> mostrar(lProductos);
                case 3 -> eliminar(lProductos);
                case 4 -> {}
                default -> System.out.println("Escribe una opción correcta");
            }
        } while (opcionAdmin != 4);
    }

    public static void mostrarSubmenuCompra(ArrayList<Producto> lProductos) {
        Scanner entrada = new Scanner(System.in);
        int opcionCompra = 0;
        
        do {
            System.out.println("- MENÚ - ");
            System.out.println("1. Comprar producto");
            System.out.println("2. Volver al menú principal");             
            
            System.out.print("Elige una opción: ");
            opcionCompra = entrada.nextInt();
            
            switch(opcionCompra) {
                case 1 -> comprar(lProductos);
                case 2 -> {}
                default -> System.out.println("Escribe una opción correcta");
            }
        } while (opcionCompra != 2);
    }
}

class Producto {
    // ATRIBUTOS
    private String nombre;
    private float precio;
    private int stock;
    
    // CONSTRUCTORES
    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    }
    
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // TO STRING
    @Override
    public String toString() {
        return " · " + nombre + " (" + stock + " unidades) - " + precio + "€" ;
    }    
}
