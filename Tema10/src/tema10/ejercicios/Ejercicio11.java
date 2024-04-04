
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el nombre del empleado: ");
        return entrada.nextLine();
    }
    public static int pedirHoras() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántas horas trabajó este mes? ");
        return entrada.nextInt();
    }
    public static double pedirTarifa() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
        return entrada.nextDouble();
    }
    
    public static String pedirConfirmacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Desea introducir otro empleado? (s/n): ");
        return entrada.nextLine();
    }
    
    public static void agregarEmpleado(ArrayList<EmpleadoEj11> empleados) {
        empleados.add(new EmpleadoEj11(pedirNombre(), pedirHoras(), pedirTarifa()));
    }
    
    public static void mostrarEmpleados(ArrayList<EmpleadoEj11> empleados) {
        empleados.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        ArrayList<EmpleadoEj11> empleados = new ArrayList<>();
        do {
            agregarEmpleado(empleados);            
        } while(pedirConfirmacion().equalsIgnoreCase("s"));
        mostrarEmpleados(empleados);
    }
    

}

class EmpleadoEj11 {
    private String nombre;
    private int horas;
    private double tarifa;

    public EmpleadoEj11() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    public EmpleadoEj11(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double calcularSueldoBruto() {
        if(horas <= 40) {
            return horas * tarifa;
        } else {
            return 40 * tarifa + (horas - 40) * 1.5 * tarifa;
        }
    }

    @Override
    public String toString() {
        return nombre + " trabajó " + horas + " horas, cobra " + tarifa + "€ la hora, "
                + "por lo que corresponde un sueldo bruto de " + calcularSueldoBruto() + "€";
    }    
}