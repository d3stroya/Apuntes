
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio13 {
    public static int pedirVentas() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nº ventas: ");
        return entrada.nextInt();
    }
    
    public static void rellenarLista(ArrayList<Venta> lVentas, String[] nombreMeses) {
        if(lVentas.isEmpty()) {
            for(int i = 0; i < 12; i++) {
                System.out.println(nombreMeses[i]);
                lVentas.add(new Venta(nombreMeses[i], pedirVentas()));
            }            
        } else {
            System.out.println("La lista ya está llena.");
        }
    }
    
    public static void mostrarLista(ArrayList<Venta> lVentas) {
        lVentas.forEach(System.out::println);
    }
    
    public static void mostrarVentasTotales(ArrayList<Venta> lVentas) {
        int total = 0;
        
        for(Venta venta : lVentas) {
            total += venta.getNumVentas();
        }
        
        System.out.println("Ventas totales del año: " + total);
    }
    
    public static void mostrarVentasMesesA(ArrayList<Venta> lVentas) {
        int total = 0;
        for(Venta venta : lVentas) {
            if(venta.getNombreMes().startsWith("A")) {
                total += venta.getNumVentas();
            }
        }
        System.out.println("Ventas totales de los meses que comienzan por A: " + total);
    }
    
    public static void mostrarMesMasVentas(ArrayList<Venta> lVentas) {
        Venta mayor = lVentas.stream().max((a, b) -> a.getNumVentas() - b.getNumVentas()).get();
        for(Venta venta : lVentas) {
            if(venta.getNumVentas() == mayor.getNumVentas()) {
                System.out.println("El mes con más ventas es " + venta);                
            }
        }
    }
    
    public static void mostrarMenu() {
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        ArrayList<Venta> lVentas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENU -");
            System.out.println("1. Introducir las ventas de coches de cada uno de los meses del año.");
            System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
            System.out.println("3. Que muestre la suma total de ventas de coches del año.");
            System.out.println("4. Que muestre las ventas totales de los meses que empiezan por la letra A");
            System.out.println("5. Que muestre el nombre del mes con más ventas.");
            System.out.println("6. Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1 :
                    rellenarLista(lVentas, nombreMeses);
                    break;
                case 2:
                    mostrarLista(lVentas);
                    break;
                case 3:
                    mostrarVentasTotales(lVentas);
                    break;
                case 4:
                    mostrarVentasMesesA(lVentas);
                    break;
                case 5:
                    mostrarMesMasVentas(lVentas);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
            }
            
        } while(opcion != 6);
    }
    
    public static void main(String[] args) {
        mostrarMenu();
    }
}

class Venta {
    // ATRIBUTOS
    private String nombreMes;
    private int numVentas;
    
    // CONSTRUCTORES
    public Venta() {
        this.nombreMes = "";
        this.numVentas = 0;
    }

    public Venta(String nombreMes, int numVentas) {
        this.nombreMes = nombreMes;
        this.numVentas = numVentas;
    }
    
    // GETTER Y SETTER
    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return nombreMes + " - " + numVentas + " ventas";
    }
    
}