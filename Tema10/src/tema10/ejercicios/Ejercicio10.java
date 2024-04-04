
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */

/*
        ·-----------------------------------------·
Nombre: | PROG |  LM  | BBDD |  ED  |  SI  | FOL  | 
Nota:   | Nota | Nota | Nota | Nota | Nota | Nota | 
        ·-----------------------------------------·
    
*/
public class Ejercicio10 {
    private static String[] nombresAsignaturas = {
        "Programación", 
        "Lenguane de Marcas", 
        "Bases de datos",
        "Entornos de desarrollo",
        "Sistemas informáticos",
        "FOL"
    };   
    
    public static int pedirNota(String asignatura) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca la nota de " + asignatura + ": ");
        return entrada.nextInt();
    }
    
    public static void rellenarLista(ArrayList<AsignaturaEj14> asignaturas) {
        for(int i = 0; i < nombresAsignaturas.length; i++) {
            asignaturas.add(new AsignaturaEj14(nombresAsignaturas[i], pedirNota(nombresAsignaturas[i])));
        }
    }
    
    public static void mostrarNotaMedia(ArrayList<AsignaturaEj14> asignaturas) {
        double media = 0;
        for(AsignaturaEj14 asignatura : asignaturas) {
            media += asignatura.getNota();
        }
        media /= asignaturas.size();
        System.out.println("Nota media: " + media);
    }
    
    public static void main(String[] args) {
        ArrayList<AsignaturaEj14> asignaturas = new ArrayList<>();
        rellenarLista(asignaturas);
        mostrarNotaMedia(asignaturas);
    }
}

class Asignatura {
    private String nombre;
    private int nota;

    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    public Asignatura(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }        
}
