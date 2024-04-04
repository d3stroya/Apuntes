package ampliacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Vivienda[] aViviendas = new Vivienda[3];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        Vivienda vivienda = new Vivienda();


        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Rellenar viviendas");
            System.out.println("2. Añadir actividad");
            System.out.println("3. Mostrar viviendas con sus actividades");
            System.out.println("4. Mostrar actividades para toda la familia");
            System.out.println("5. Mostrar actividades por tipo");
            System.out.println("6. Mostrar número de actividades");
            System.out.println("7. Salir del programa");

            try {
                opcion = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("¡ERROR! Introduce un número entre 1 y 6");
            }

            switch (opcion) {
                case 1 -> insertarViviendas();
                case 2 -> vivienda.insertarActividad(aViviendas);
                case 3 -> mostrarViviendas();
                case 4 -> mostrarActividadesEnFamilia();
                case 5 -> mostrarActividadesPorTipo();
                case 6 -> mostrarCantidadActividades();
                case 7 -> System.out.println("Cerrando programa...\nAdiós");
            }

        } while (opcion != 7);
    }


    public static String pedirDireccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dirección: ");
        return entrada.nextLine();
    }

    public static void insertarViviendas() {
        for (int i = 0; i < aViviendas.length; i++) {
            System.out.println("\nVIVIENDA " + (i + 1));
            aViviendas[i] = new Vivienda(pedirDireccion());
        }
    }

    private static void mostrarViviendas() {
        for (int i = 0; i < aViviendas.length; i++) {
            System.out.println("VIVIENDA " + (i + 1));
            System.out.println(aViviendas[i].getDireccion());
            aViviendas[i].mostrarActividades();
        }
    }


    public static void mostrarActividadesEnFamilia() {
        for (int i = 0; i < aViviendas.length; i++) {
            aViviendas[i].mostrarActividadesEnFamilia();
        }
    }

    public static String pedirTipoActividad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tipo: ");
        return entrada.nextLine();
    }

    public static void mostrarActividadesPorTipo() {
        String tipo = pedirTipoActividad();
        for (int i = 0; i < aViviendas.length; i++) {
            aViviendas[i].mostrarActividadesPorTipo(tipo);
        }
    }

    public static void mostrarCantidadActividades() {
        int contador = 0;
        for (int i = 0; i < aViviendas.length; i++) {
            contador += aViviendas[i].cantidadActividades();
        }
        System.out.println("Número total de actividades: " + contador);
    }
}