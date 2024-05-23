// EJERCICIO 2
package tema5.ejercicios;

public class Curso {
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos= 0;

    
    public void establecerNombreyHoras(String n, int h) {
        nombre = n;
        numeroHoras = h;
        sumarCursos();
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerHoras() {
        return numeroHoras;
    }
    
    public static void sumarCursos() {
        numeroDeCursos++;
    }
    
    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
}
