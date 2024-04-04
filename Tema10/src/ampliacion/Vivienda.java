package ampliacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Vivienda {
    // ATRIBUTOS
    private String direccion;
    ArrayList<Actividad> lActividades ;


    // CONSTRUCTORES
    public Vivienda() {
        this.direccion = "";
        this.lActividades = new ArrayList<>();
    }

    public Vivienda(String direccion) {
        this.direccion = direccion;
        this.lActividades = new ArrayList<>();
    }

    public Vivienda(String direccion, ArrayList<Actividad> lActividades) {
        this.direccion = direccion;
        this.lActividades = lActividades;
    }

    // GETTER Y SETTER
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Actividad> getlActividades() {
        return lActividades;
    }

    public void setlActividades(ArrayList<Actividad> lActividades) {
        this.lActividades = lActividades;
    }

    // MÉTODOS
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }

    public String pedirTipo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tipo: ");
        return entrada.nextLine();
    }

    public boolean pedirEnFamilia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Recomendable para toda la familia? ");
        return entrada.nextLine().equalsIgnoreCase("si");
    }

    public int pedirPosicionVivienda() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elige una vivienda: ");
        return entrada.nextInt() - 1;
    }

    public void insertarActividad(Vivienda[] aViviendas) {
        int posicionVivienda = pedirPosicionVivienda();
        Actividad actividad = new Actividad(pedirNombre(), pedirTipo(), pedirEnFamilia());

        aViviendas[posicionVivienda].getlActividades().add(actividad);
        System.out.println("✔ Actividad añadida correctamente");
    }

    public void mostrarActividades() {
        for(int i = 0; i < lActividades.size(); i++) {
            System.out.println("ACTIVIDAD " + (i + 1));
            lActividades.get(i).mostrar();
        }
    }

    public void mostrarActividadesEnFamilia() {
        for(int i = 0; i < lActividades.size(); i++) {
            if(lActividades.get(i).isEnFamilia()) {
                System.out.println("ACTIVIDAD " + (i + 1));
                lActividades.get(i).mostrar();
            }
        }
    }

    public void mostrarActividadesPorTipo(String tipo) {
        for(int i = 0; i < lActividades.size(); i++) {
            if(lActividades.get(i).getTipo().equalsIgnoreCase(tipo)) {
                System.out.println("ACTIVIDAD " + (i + 1));
                lActividades.get(i).mostrar();
            }
        }
    }

    public int cantidadActividades() {
        return lActividades.size();
    }

    // TO STRING
    @Override
    public String toString() {
        return "Vivienda{" +
                "direccion='" + direccion + '\'' +
                ", lActividades=" + lActividades +
                '}';
    }
}
