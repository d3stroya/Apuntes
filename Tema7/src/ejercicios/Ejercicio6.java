package ejercicios;

import java.util.Scanner;
import tema7.Empleado;

/**
 *
 * @author d3stroya
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Empleado[] listaEmpleados = crearArrayEmpleados();
        crearEmpleados(listaEmpleados);
        mostrarEmpleados(listaEmpleados);
    }

    public static Empleado[] crearArrayEmpleados() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos/as empleados/as vas a crear?");
        int numeroEmpleados = entrada.nextInt();

        return new Empleado[numeroEmpleados];
    }

    public static void crearEmpleados(Empleado[] empleados) {

        for (int i = 0; i < empleados.length; i++) {
            // Creamos un empleado con el constructor por defecto
            empleados[i] = new Empleado();

            // Le pedimos al usuario los datos del empleado
            System.out.println("--- FICHA DEL/A EMPLEADO/A ---");
            Scanner entrada = new Scanner(System.in);

            System.out.println("[1] Nombre del/a empleado/a: ");
            empleados[i].setNombre(entrada.nextLine());

            System.out.println("[2] Número de horas trabajadas este mes: ");
            empleados[i].setHoras(entrada.nextInt());

            System.out.println("[3] Tarifa (€/hora): ");
            empleados[i].setTarifa(entrada.nextDouble());

            System.out.println("\n[√] Empleado/a creado/a correctamente\n");
        }
    }

    public static double calcularSueldoBruto(Empleado empleado) {
        System.out.println("\n[·] Calculando sueldo bruto...");
        int horas = empleado.getHoras();
        double tarifa = empleado.getTarifa();
        double sueldo = 0;

        if (horas <= 40) {
            sueldo = horas * tarifa;
            System.out.println(horas + " horas -> " + sueldo + "€");
        } else {
            sueldo = 40 * tarifa;
            sueldo += (horas - 40) * (1.5 * tarifa);
            System.out.println("40 horas + " + (horas - 40) + " horas extra -> " + sueldo + "€");
        }

        return sueldo;
    }

    public static void mostrarEmpleados(Empleado[] empleados) {
        System.out.println("\n[·] Recuperando empleados...");
        for (Empleado empleado : empleados) {
            System.out.println("\n" + empleado);
            calcularSueldoBruto(empleado);
        }
    }
}
