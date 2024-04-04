package ampliacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        Vivienda vivienda = new Vivienda();

        do {
            System.out.println("1. Añadir actividad");
            System.out.println("2. Mostrar actividades");
            System.out.println("3. Mostrar actividades para toda la familia");
            System.out.println("4. Mostrar actividades por tipo");
            System.out.println("5. Mostrar número de actividades");
            System.out.println("6. Salir del programa");

            try {
                opcion = entrada.nextInt();
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("¡ERROR! Introduce un número entre 1 y 6");
            }

            switch(opcion) {
                case 1 -> vivienda.insertarActividad();
                case 2 -> vivienda.mostrarActividades();
                case 3 -> vivienda.mostrarActividadesEnFamilia();
                case 4 -> vivienda.mostrarActividadesPorTipo();
                case 5 -> vivienda.mostrarCantidadActividades();
                case 6 -> System.out.println("Cerrando programa...\nAdiós");
            }

        } while(opcion != 6);
    }
}
