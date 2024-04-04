/* IMPORTANTE: Por simplicidad para consultar el ejercicio
se implementan todas las clases en un mismo archivo.
Esto no es lo óptimo, sería más correcto implementar
cada clase en un archivo .java homónimo.
*/
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase con manejo de ArrayList de empresas
 * @author d3stroya
 */
public class Ejercicio15 {
    /**
     * Crea una empresa y le pregunta al usuario si quiere añadir otra
     * @param lEmpresas 
     */
    public static void insertarEmpresa(ArrayList<Empresa> lEmpresas) {
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("\nCreando empresa...");
            lEmpresas.add(new Empresa());
            
            System.out.print("¿Desea añadir más empresas? ");
        } while(entrada.nextLine().equalsIgnoreCase("sí"));
    }
    
    /**
     * Imprime por pantalla las empresas que hay en la lista.
     * Aprovecha el método toString de la clase Empresa para
     * mostrar el valor de los atributos de cada objeto.
     * @param lEmpresas 
     */
    public static void mostrarEmpresas(ArrayList<Empresa> lEmpresas) {
        lEmpresas.forEach(System.out::println);
    }
    
    /**
     * Filtra la lista por nombres que contengan la A y muestra
     * las empresas resultantes
     * @param lEmpresas 
     */
    public static void mostrarEmpresasConA(ArrayList<Empresa> lEmpresas) {
        lEmpresas.stream()
                .filter(e -> e.getNombre().toUpperCase().contains("A"))
                .forEach(System.out::println);
    }
    
    /**
     * Guardamos todos los empleados de todas las empresas en una nueva lista.
     * Ordenamos esa lista y mostramos por pantalla los empleados
     * @param lEmpresas 
     */
    public static void mostrarTodosLosEmpleadosPorSueldo(ArrayList<Empresa> lEmpresas) {
        ArrayList<EmpleadoEj15> empleados = new ArrayList<>();
        int index = 0;
        
        for(Empresa empresa : lEmpresas) {
            for(EmpleadoEj15 empleado : empresa.getlEmpleados()) {
                empleados.add(index, empleado);
                index++;
            }
        }
        // Hay varias formas:        
        // 1. El método de la burbuja
        EmpleadoEj15 aux;
        for(int i = 0; i < empleados.size() - 1; i++) {
            for(int j = i + 1; j < empleados.size(); j++) {
                if(empleados.get(i).getSueldo() < empleados.get(j).getSueldo()) {
                    aux = empleados.get(i);
                    empleados.set(i, empleados.get(j));
                    empleados.set(j, aux);
                }
            }
        }
        
        // 2. Usando .sort() e Integer.compare(o1, o2)
//        empleados.sort((e1, e2) -> Integer.compare(e1.getSueldo(), e2.getSueldo()));
        
        // 3. Usando Collections.sort. Es necesario implementar la interfaz Comparable en Empleado
//        Collections.sort(empleados);
        
        empleados.forEach(System.out::println);
    }
    
    /**
     * Menú con el que interacciona el usuario
     */
    public static void mostrarMenu() {
        ArrayList<Empresa> lEmpresas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENU -");
            System.out.println("1. Introducir empresa con sus empleados");
            System.out.println("2. Mostrar empresas y sus empleados");
            System.out.println("3. Mostrar empresas cuyo nombre contenga la 'A'");
            System.out.println("4. Mostrar todos los empleados por sueldo");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1 :
                    insertarEmpresa(lEmpresas);
                    break;
                case 2:
                    mostrarEmpresas(lEmpresas);
                    break;
                case 3:
                    mostrarEmpresasConA(lEmpresas);
                    break;
                case 4:
                    mostrarTodosLosEmpleadosPorSueldo(lEmpresas);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
            }
            
        } while(opcion != 5);
    }
    
    /**
     * Método main
     * @param args 
     */
    public static void main(String[] args) {
        mostrarMenu();
    }
}

/**
 * 
 * @author d3stroya
 */
class Empresa {
    // ATRIBUTOS
    private String nombre;
    private ArrayList<EmpleadoEj15> lEmpleados;

    // CONSTRUCTORES
    public Empresa() {
        this.nombre = pedirNombre();
        this.lEmpleados = insertarEmpleados();
    }
    
    public Empresa(String nombre, ArrayList<EmpleadoEj15> lEmpleados) {
        this.nombre = nombre;
        this.lEmpleados = lEmpleados;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<EmpleadoEj15> getlEmpleados() {
        return lEmpleados;
    }

    public void setlEmpleados(ArrayList<EmpleadoEj15> lEmpleados) {
        this.lEmpleados = lEmpleados;
    }
    
    // MÉTODOS
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static Integer pedirSueldo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sueldo (€): ");
        return entrada.nextInt();
    }
    
    /**
     * Crea un arrayList en el que va insertando nuevos empleados.
     * Esos empleados se crean con el constructor parametrizado
     * usando los métodos pedirNombre() y pedirSueldo().
     * Sigue añadiendo empleados mientras el usuario escriba "sí"
     * @return 
     */
    public final ArrayList<EmpleadoEj15> insertarEmpleados() {
        ArrayList<EmpleadoEj15> empleados = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);        
        int index = 1;  // Leva la cuenta de los empleados
        
        do {
            System.out.println("\nCreando empleado " + index + "...");
            empleados.add(new EmpleadoEj15(pedirNombre(), pedirSueldo()));
            index++;            
            
            System.out.print("¿Desea añadir más empleados? ");
        } while(entrada.nextLine().equalsIgnoreCase("sí"));
        
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa " + nombre + " -  Empleados" + lEmpleados.toString();
    }        
}

/**
 * Implementamos la interfaz Comparable para poder
 * comparar objetos por uno de sus atributos (sueldo)
 * y ordenar la lista de empleados que contiene cada 
 * objeto de la clase Empresa.
 * @author d3stroya
 */
class EmpleadoEj15 implements Comparable<EmpleadoEj15> {
    // ATRIBUTOS
    private String nombre;
    private int sueldo;

    // CONSTRUCTORES
    public EmpleadoEj15() {
        this.nombre = "";
        this.sueldo = 0;
    }
    
    public EmpleadoEj15(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Compara dos valores utilizando el método estático
     * compare de la clase Integer.
     * Comparamos el sueldo de 2 empleados
     * @param e
     * @return 1 si this.sueldo es mayor, 0 si es igual y -1 si es menor que 
     * el sueldo del Empleado pasado por parámetro
     */
    @Override
    public int compareTo(EmpleadoEj15 e) {
        return Integer.compare(e.getSueldo(), this.sueldo);
    }

    @Override
    public String toString() {
        return " · " + nombre + ": " + sueldo + "€";
    }        
}
