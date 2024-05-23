
package tema5.apuntes;

/**
 * La herencia nos permite crear clases que contienen atriutos y/o métodos comunes
 * y clases hijas que heredan esos atributos y métodos pero además añaden
 * otros atributos y/o métodos.
 * 
 * Para heredar de una clase usamos la palabra "extends" seguida del nombre de la clase de
 * la que queremos heredar.
 * @author d3stroya
 */
public class Herencia extends Tema5 {
    // ATRIBUTOS
    private float version;

    // CONSTRUCTORES
    public Herencia() {
        super();    // Llama al constructor de la clase padre
        this.version = 0.0f;
    }
    
    public Herencia(float version) {
        super();
        this.version = version;
    }

    public Herencia(float version, int numeroTema, String nombre) {
        super(numeroTema, nombre);
        this.version = version;
    }
    
    // GETTER Y SETTER
    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Herencia{" + "version=" + version + '}';
    }
    
}
