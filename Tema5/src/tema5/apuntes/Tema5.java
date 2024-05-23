
package tema5.apuntes;

/**
 * Las clases nos permiten crear objetos con características comunes
 * pero que pueden tener valores distintos. Son como moldes.
 * Las clases siempre tienen nombres que comienzan con mayúsculas.
 * Sus atributos y métodos comienzan con minúscula.
 * Luego usamos camelCase.
 * Fíjate en cómo está organizada la clase y crea las tuyas siempre con este orden,
 * porque es la convención.
 * @author d3stroya
 */
public class Tema5 {
    // ATRIBUTOS
    private int numeroTema;
    private String nombre;
    
    // CONSTRUCTORES:    
    
    /**
     * Constructor por defecto: crea una nueva instancia de la clase (un objeto)
     * con valores por defecto.
     * SIEMPRE inicializamos todos los atributos en los constructores.
     */
    public Tema5() {
        this.numeroTema = 0;
        this.nombre = "";
    }
    
    /**
     * Constructor parametrizado: crea una nueva instancia de la clase (un objeto)
     * con los valores pasados por parámetro.
     * @param numeroTema
     * @param nombre 
     */
    public Tema5(int numeroTema, String nombre) {
        this.numeroTema = numeroTema;
        this.nombre = nombre;
    }
    
    /**
     * En las clases a menudo vamos a usar la palabra reservada "this".
     * Esta palabra hace referencia a la propia clase y nos sirve para diferenciar
     * los atributos de otras variables que se llaman igual y que pasamos por parámetro. 
     * Por ejemplo, en el constructor parametrizado pasamos por parámetro "nombre".
     * Ese "nombre" es el que le damos de entrada al constructor, pero es una variable
     * distinta al atributo "this.nombre". 
     * De esta forma, podemos usar el mismo identificador para la variable del parámetro
     * que para el atributo, pero diferenciándolas.
     * Lo que conseguimos es pasar el nombre por parámetro y asignárselo al atributo sin
     * tener que pensar en otros nombres para las variables.
     */
    
    /**
     * Otros constructores: crea una nueva instancia de la clase (un objeto)
     * combinando valores por defecto y valores pasados por parámetro.
     * 
     * Los constructores aplican la sobrecarga de métodos, es decir, 
     * el mismo método admite diferente número de parámetros. Esto nos da
     * flexibilidad a la hora de crear objetos de la clase. 
     * Podemos crear métodos con valores por defecto para después
     * rellenarlos, podemos crear objetos con todos los valores directamente
     * o un híbrido.
     * @param nombre 
     */
    public Tema5(String nombre) {
        this.numeroTema = 5;
        this.nombre = nombre;
    }
    
    // GETTER Y SETTER

    /**
     * Método que nos permite obtener el valor del atributo
     * numeroTema desde otras clase.
     * Necesitamos los getter porque los atributos son privados
     * (sólo podemos acceder a ellos desde la propia clase, pero no
     * desde otras).
     * @return el número de tema (int)
     */
    public int getNumeroTema() {
        return numeroTema;
    }

    /**
     * Método que permite darle un valor al atributo del objeto
     * desde otra clase.
     * Necesitamos los setter porque los atributos son privados
     * (sólo podemos acceder a ellos desde la propia clase, pero no
     * desde otras).
     * @param numeroTema 
     */
    public void setNumeroTema(int numeroTema) {
        this.numeroTema = numeroTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // MÉTODOS
    /**
     * Método que muestar un saludo seguido del número del tema.
     * Podemos crear otros métodos aparte de los típicos de las clases:
     *      - Constructores
     *      - Getter y setter
     *      - To String
     */
    public void mostrarSaludo() {
        System.out.println("Bienvenidxs al tema " + this.numeroTema);
    }

    // TO STRING
    
    /**
     * Método que permite visualizar el objeto con sus datos
     * en lugar de mostrar su referencia en memoria.
     * Este método nos ahorra tener que llamar a todos los getter
     * para mostrar los valores de los atributos del objeto.
     * Al llamar al objeto ya se muestran sus valores.
     * @return los datos del objeto (String).
     */
    @Override
    public String toString() {
        return "Tema5{" + "numeroTema=" + numeroTema + ", nombre=" + nombre + '}';
    }
    
    
}
