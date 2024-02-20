package ejercicios;

import java.util.Scanner;
import tema7.Mueble;

/**
 *
 * @author d3stroya
 */
public class Ejercicios11y12 {

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static double pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio: ");
        return entrada.nextDouble();
    }

    public static String pedirDescripcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Descripción: ");
        return entrada.nextLine();
    }

    public static Mueble crearMueble() {
        System.out.println("\nIntroduzca los datos del mueble: ");
        return new Mueble(pedirPrecio(), pedirDescripcion());
    }

    public static void rellenarMuebles(Mueble[] aMuebles) {
        for (int i = 0; i < aMuebles.length; i++) {
            aMuebles[i] = crearMueble();
        }
    }

    public static void mostrarMuebles(Mueble[] aMuebles) {
        for (Mueble mueble : aMuebles) {
            System.out.println(mueble);
        }
    }

    public static void mostrarMueblesPorPrecio(Mueble[] aMuebles) {
        System.out.println("Introduzca el precio máximo de los muebles que quiere mostrar");
        double precioMax = pedirPrecio();
        for (Mueble mueble : aMuebles) {
            if (mueble.getPrecio() <= precioMax) {
                System.out.println(mueble);
            }
        }
    }

    public static void mostrarMenu() {
        Mueble[] aMuebles = new Mueble[4];
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nElige una opción:");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("4. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    rellenarMuebles(aMuebles);
                case 2 ->
                    mostrarMuebles(aMuebles);
                case 3 ->
                    mostrarMueblesPorPrecio(aMuebles);
                default ->
                    System.out.println("\nElige una opción válida");
            }
        } while (opcion != 4);

    }
}
