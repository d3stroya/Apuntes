
package tema12.ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio01 {
 public static String pedirNombre() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirEdad() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        return entrada.nextInt();
    }
    
    public static int pedirTelefono() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Teléfono: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que crea un nuevo contacto
     * con los datos que introduce el usuario
     * @return el nuevo contacto
     */
    public static Contacto crearContacto() {
        System.out.println("\n[·] Creando nuevo contacto...");       
        String nombre = ""; 
        int edad = 0;
        int telefono = 0;
        Contacto contacto = new Contacto();
        
        try {
            nombre = pedirNombre();
            edad = pedirEdad();
            telefono= pedirTelefono();            
            contacto = new Contacto(nombre, edad, telefono);
        } catch(InputMismatchException e) {
            System.out.println("Introduce un valor válido");
        }

        System.out.println("\n[✓] Contacto creado correctamente");
        System.out.println(contacto);
        return contacto;
    }
    
    /**
     * Método que añade un contacto a la lista
     * @param agenda 
     */
    public static void agregarContacto(ArrayList<Contacto> agenda) throws IndexOutOfBoundsException {
        System.out.println("\n[·] Agregando contacto a la agenda...");
        agenda.add(crearContacto());
        System.out.println("\n[✓] Contacto añadido");
    }
    
    /**
     * Método que muestra todos los contactos de la lista
     * @param agenda 
     */
    public static void mostrarContactos(ArrayList<Contacto> agenda) throws IndexOutOfBoundsException, NullPointerException {
        if(!agenda.isEmpty()) {
            System.out.println("\n[·] Mostrando contactos...");
            agenda.forEach(contacto -> System.out.println("· " + contacto));
        } else {
            System.out.println("\n[!] La agenda está vacía");
        }
    }
    
    /**
     * Método que elimina un contacto por su número de teléfono,
     * que se le pide al usuario
     * @param agenda 
     */
    public static void eliminarContactoPorNumero(ArrayList<Contacto> agenda) throws IndexOutOfBoundsException {
        System.out.println("\n[·] Eliminando contactos...");
        Contacto contacto = new Contacto();
        
        try {
            contacto = buscarContactoPorNumero(agenda);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Error de índice: " + e.getMessage());
        } catch(NullPointerException e) {
            System.out.println("Acceso a posición nula: " + e.getMessage());
        }
          
        if(contacto != null) {
            try {
                agenda.remove(contacto);
                System.out.println("\n[✓] Contacto eliminado correctamente");            
            } catch(IndexOutOfBoundsException e) {
                System.out.println("Error de índice: " + e.getMessage());
            }                   
        }
    }
    
    /**
     * Método que busca un contacto por su número de teléfono,
     * que se le pide al usuario
     * @param agenda
     * @return el contacto encontrado
     */
    public static Contacto buscarContactoPorNumero(ArrayList<Contacto> agenda) throws IndexOutOfBoundsException, NullPointerException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nEscribe el número de teléfono del contacto que quieres eliminar:");
        int numero = entrada.nextInt(), i = 0;
        Contacto contacto = new Contacto();
        boolean encontrado = false;

        while(i < agenda.size() && !encontrado) {
            if(agenda.get(i).getNumero() == numero) {
                contacto = agenda.get(i);
                System.out.println("[✓] Contacto encontrado");
                encontrado = true;
            }  
            i++;
        }
        
        return encontrado ? contacto : null;
    }
    
    /**
     * Método que ordena los contactos por su edad
     * @param agenda 
     */
    public static void ordenarPorEdad(ArrayList<Contacto> agenda) {
        if(!agenda.isEmpty()) {
            ArrayList<Contacto> agendaOrdenada = (ArrayList)agenda.clone();
            System.out.println("\nOrdenando contactos por edad...");
            agendaOrdenada.sort((a, b) -> a.getEdad() - b.getEdad());
            
            try {
                mostrarContactos(agendaOrdenada);
                
            } catch(IndexOutOfBoundsException e) {
                System.out.println("Error de índice: " + e.getMessage());
            } catch(NullPointerException e) {
                System.out.println("Acceso a una posición nula: " + e.getMessage());
            }
            
        } else {
            System.out.println("\n[!] La agenda está vacía");
        }
    }
    
    /**
     * Método que muestra el menú al usuario y le permite
     * seleccionar una opción.
     * Según la opción elegida, se ejecutará la acción correspondiente.
     * El programa se mantiene lanzado mientras el usuario no pulse 5 (salir).
     */
    public static void lanzarAgenda() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Contacto> agenda = new ArrayList<>();
        
        do {
            try {
                System.out.println("\nElige una opción:");
                System.out.println("[1] Añadir contacto");
                System.out.println("[2] Mostrar contactos");
                System.out.println("[3] Eliminar contacto");
                System.out.println("[4] Mostrar contactos ordenados por edad");
                System.out.println("[5] Salir");
                opcion = entrada.nextInt();

                switch(opcion) {
                    case 1:
                        try {
                            agregarContacto(agenda);                            
                        } catch(IndexOutOfBoundsException e) {
                            System.out.println("Error de índice: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            mostrarContactos(agenda);                            
                            } catch(IndexOutOfBoundsException e) {
                                System.out.println("Error de índice: " + e.getMessage());
                            } catch(NullPointerException e) {
                                System.out.println("Acceso a posición nula: " + e.getMessage());
                            }
                        break;
                    case 3:
                        try {
                            eliminarContactoPorNumero(agenda);                        
                        } catch(IndexOutOfBoundsException e) {
                            System.out.println("Error de índice: " + e.getMessage());
                        }                        
                        break;
                    case 4:
                        ordenarPorEdad(agenda);                
                        break;
                    case 5:
                        System.out.println("[·] Cerrando programa...");
                        break;
                    default:
                        System.out.println("Selecciona una opción válida");
                }
            } catch(InputMismatchException e) {
                System.out.println("[x] ¡ERROR! Introduce un número");
            } catch(IndexOutOfBoundsException e) {
                System.out.println("La lista está vacía");
            }
        } while(opcion != 5);
    }
    
    public static void main(String[] args) {
        lanzarAgenda();
    }
}
