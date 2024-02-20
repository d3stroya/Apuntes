package tema7;

/**
 *
 * @author anabel
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private Asignatura[] asignaturas;
    private int edad;
    private double notaMedia;

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
//        this.asignaturas = new Asignatura[4];
        this.edad = 0;
        this.notaMedia = 0;
    }

    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }        

    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }       
}
