package ejercicios;

import java.util.Scanner;
import tema7.Producto;

/**
 *
 * @author d3stroya
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("-- Bienvenidx a Decathron --\n");
        Producto[] listaProductos = mostrarMenuAdmin();
        mostrarMenuVenta(listaProductos);
    }

    /**
     * Método que crea una lista de productos de una longitud definida por el
     * usuario
     *
     * @return el arreglo
     */
    public static Producto[] crearListaProductos() {
        System.out.print("¿Cuántos productos quieres crear? ");
        Scanner entrada = new Scanner(System.in);
        int longitud = entrada.nextInt();
        return new Producto[longitud];
    }

    /**
     * Método que crea un producto preguntándole al usuario los datos del mismo
     *
     * @return el producto creado
     */
    public static Producto crearProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        String nombre = entrada.nextLine();

        System.out.print("Stock: ");
        int stock = entrada.nextInt();

        System.out.print("Precio: ");
        double precio = entrada.nextDouble();

        return new Producto(nombre, stock, precio);
    }

    /**
     * Método que muestra el menú de administración. Usando los métodos
     * anteriores
     *
     * @return la lista de productos
     */
    public static Producto[] mostrarMenuAdmin() {
        System.out.println("[ Menú de administración ]");
        Producto[] listaProductos = crearListaProductos();

        for (int i = 0; i < listaProductos.length; i++) {
            System.out.println("PRODUCTO " + (i + 1));
            listaProductos[i] = crearProducto();
        }

        return listaProductos;
    }

    /**
     * Método que pregunta al usuario qué producto quiere comprar de la lista de
     * productos creada
     *
     * @param productos
     * @return el producto seleccionado
     */
    public static Producto elegirProducto(Producto[] productos) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Elige el producto que quieres comprar:");

        // Uso el bucle for porque necesito acceder al índice del producto
        for (int i = 0; i < productos.length; i++) {
            System.out.println("\n[" + (i + 1) + "] " + productos[i].toString());
        }
        opcion = entrada.nextInt();

        System.out.println("\n[·] Has elegido comprar " + productos[opcion - 1].getNombre());
        return productos[opcion - 1];
    }

    /**
     * Método que pregunta al usuario cuántas unidades quiere comprar del
     * producto seleccionado
     *
     * @return las unidades
     */
    public static int pedirUnidades() {
        System.out.print("\n¿Cuántas unidades quieres llevarte? ");
        Scanner entrada = new Scanner(System.in);
        int unidades = entrada.nextInt();
        return unidades;
    }

    /**
     * Método que pregunta al usuario si quiere seguir comprando o salir
     *
     * @return true si el usuario pulsa 1 para seguir comprando y false si pulsa
     * 2 para salir
     */
    public static boolean preguntarSeguirComprando() {
        System.out.println("[1] Seguir comprando");
        System.out.println("[2] Salir");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        return opcion == 1;
    }

    /**
     * Método que actualiza el stock del producto
     *
     * @param producto
     * @param unidades
     */
    public static void actualizarStock(Producto producto, int unidades) {
        producto.setStock(producto.getStock() - unidades);
    }

    /**
     * Método que muestra el menú de venta. Permite al usuario elegir el
     * producto que quiere comprar, las unidades y si quiere seguir comprando o
     * salir. Finalmente, muestra el importe total de la compra.
     *
     * @param productos
     */
    public static void mostrarMenuVenta(Producto[] productos) {
        System.out.println("\n[ Menú de venta ]");

        double precioTotal = 0;
        boolean seguirComprando = false;
        int contador = 0;
        Producto productoComprado = new Producto();
        int cantidadProductoComprado = 0;

        do {
            Producto[] cesta = new Producto[productos.length];
            productoComprado = elegirProducto(productos);
            cesta[contador] = productoComprado;

            // Compruebo si hay suficiente stock
            int stockDisponible = productoComprado.getStock();
            do {
                cantidadProductoComprado = pedirUnidades();
                if (cantidadProductoComprado > stockDisponible) {
                    System.out.println("¡No hay stock! " + productoComprado.getNombre() + " tiene "
                            + productoComprado.getStock() + " unidades disponibles.");
                }
            } while (cantidadProductoComprado > stockDisponible);

            actualizarStock(productoComprado, cantidadProductoComprado);
            System.out.println("\n[·] Venta realizada con éxito\n");

            precioTotal += productoComprado.getPrecio() * cantidadProductoComprado;
            contador++;
            seguirComprando = preguntarSeguirComprando();

        } while (seguirComprando);

        System.out.println("\n[·] El total de la compra asciende a " + precioTotal + "€");
        System.out.println("*** Muchas gracias, vuelve pronto :) ***");
    }
}
