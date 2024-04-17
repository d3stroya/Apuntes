
package tema11.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        Campania campania = new Campania();
        
        
        do {
            System.out.println("- MENÚ -");
            System.out.println("1. Insertar donación");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3a. Mostrar donaciones por nombre");
            System.out.println("3b. Mostrar donaciones por nombre (funcional)");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6a. Ordenar y mostrar donaciones (con árbol y pila)");
            System.out.println("6b. Ordenar y mostrar donaciones (con burbuja)");
            System.out.println("6c. Ordenar y mostrar donaciones (con Arrays.sort)");
            System.out.println("6d. Ordenar y mostrar donaciones (insertando ordenados en vector)");
            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextLine();
            
            switch(opcion) {
                case "1" -> campania.insertarDonacion();
                case "2" -> campania.mostrarDonaciones();
                case "3a" -> campania.mostrarDonacionesPorNombre();
                case "3b" -> campania.mostrarDonacionesPorNombreFuncional();
                case "4" -> campania.mostrarNumeroDonaciones();
                case "5" -> System.out.println(campania.calcularDineroRecaudado());
                case "6a" -> campania.ordenarDonacionesConEstructuras();
                case "6b" -> campania.ordenarDonacionesConBurbuja();
                case "6c" -> campania.ordenarDonacionesConSort();
                case "6d" -> campania.ordenarConVector();
                case "7" -> System.out.println("Cerrando...");
            }
        } while(!opcion.equalsIgnoreCase("7"));
    }        
}
