
package tema11.ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author d3stroya
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Set<Hotel> sHoteles = new HashSet<>();
        String[] zonas = {"Playa", "Montaña", "Rural"};

        System.out.println("\nRellenando hoteles...\nUn momento por favor.");
        rellenarHoteles(zonas, sHoteles);
        
        System.out.println("\nLISTA DE HOTELES");
        mostrarHoteles(sHoteles);
        
        filtrarPorZona(zonas, sHoteles);
        
        reservar(sHoteles);
        
    }
    
    public static Set<Hotel> rellenarHoteles(String[] zonas, Set<Hotel> sHoteles) {
        int id, precio;
        String zona;
        
        for(int i = 0; i < 12; i++) {
            id = (int) (Math.random() * 200);
            precio = (int) (Math.random() * 300 + 50);
            zona = zonas[id % zonas.length];
            sHoteles.add(new Hotel(id, zona, precio));
        }
        
        return sHoteles;
    }
    
    public static void mostrarHoteles(Set<Hotel> sHoteles) {
        Iterator<Hotel> it = sHoteles.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public static String pedirZona() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ZONAS DISPONIBLES:");
        System.out.println("1. Playa");
        System.out.println("2. Montaña");
        System.out.println("3. Rural");
        System.out.print("Elige zona de hotel: ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                return "Playa";
            case 2:
                return "Montaña";
            default:
                return "Rural";
        }        
    }
    
    public static void filtrarPorZona(String[] zonas, Set<Hotel> sHoteles) {
        Iterator<Hotel> it = sHoteles.iterator();
        Hotel hotel;
        String zona = pedirZona();
        
        while(it.hasNext()) {
            hotel = it.next();
            if(hotel.getZona().equalsIgnoreCase(zona)) {
                System.out.println(hotel);                
            }
        }
        
    }
    
    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String pedirFecha() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static Hotel buscar(Set<Hotel> sHoteles, int id) {
        Iterator<Hotel> it = sHoteles.iterator();
        Hotel hotel = null;
        
        while(it.hasNext()) {
            Hotel h = it.next();
            if(h.getIdHotel() == id) {
                hotel = h;
            }
        }
        
        return hotel;
    }
    
    public static void reservar(Set<Hotel> sHoteles) {
        System.out.println("\nPÁGINA DE RESERVAS");
        System.out.println("\nPor favor, indique los datos de su reserva");
        
        System.out.print("Id del hotel: ");
        int idHotel = pedirInt();
        Hotel hotel = buscar(sHoteles, idHotel);
        
        System.out.print("Noches: ");
        int numNoches = pedirInt();
        
        System.out.print("Habitaciones: ");
        int numHabitaciones = pedirInt();
        
        System.out.print("Check in: ");
        String fechaIn = pedirFecha();
        
        System.out.print("Check out: ");
        String fechaOut = pedirFecha();
        
        int precioTotal = (numNoches * hotel.getPrecio()) + (hotel.getPrecio() * numNoches);
        
        System.out.println("\nProcesando...\n");
        
        System.out.println("Reserva realizada correctamente. Estos son los datos:");
        System.out.println(hotel);
        System.out.println("Entrada: " + fechaIn + ". Salida: " + fechaOut + ". " + numNoches + " noches.");
        System.out.println("Precio: " + precioTotal + "€");
    }
    
}
