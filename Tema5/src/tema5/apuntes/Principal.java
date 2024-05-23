
package tema5.apuntes;

/**
 *
 * @author d3stroya
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto
        Tema5 tema5 = new Tema5(5, "Programación Orientada a Objetos");
        
        // Obtener valores de los atributos con los getters
        System.out.println(tema5.getNombre());
        System.out.println(tema5.getNumeroTema());

        // Crear un objeto de la clase hija
        Herencia herencia = new Herencia(1.0f);
        
        // Asignar valores a los atributos con los setters
        herencia.setVersion(1.1f);
        herencia.setNumeroTema(5);
        
        // Obtener valores de los atributos de la clase hija y padre
        float version = herencia.getVersion();
        System.out.println(version);
        System.out.println(herencia.getNombre());

        // Crear un objeto de la clase hija guardándolo en una variable del tipo de la clase padre
        Tema5 tema5heredero = new Herencia(2.0f);
        
        // Llamar a un método de la clase padre desde un objeto de la clase hija
        tema5heredero.mostrarSaludo();
        
        // Mostrar datos del objeto gracias al toString()
        System.out.println(tema5);
        System.out.println(herencia);
    }
}
