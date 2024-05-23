// EJERCICIO 5
package tema5.ejercicios;

public class Asignatura {
    // Atributos
    private String nombre;
    private double nota;    
    
    // Constructor
    public Asignatura() {
        nombre = "";
        nota = 0.0;
    }

    public Asignatura(String nom) {
        nombre = nom;
    }
    
    // Getter y setter
    public void setNombre(String nom) {
        nombre = nom;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNota(double not) {
        nota = not;
    } 
    
    public double getNota() {
        return nota;
    }
    
    // Métodos
    public static double notaMedia(double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        double notaMedia = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;
        return notaMedia;
    }
    
}
