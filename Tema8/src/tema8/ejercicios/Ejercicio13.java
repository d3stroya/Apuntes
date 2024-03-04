
package tema8.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        // EJERCICIO 13
        String usuario = pedirUsuario();
        String clave = "";
        boolean claveCorrecta = false;

        while(!claveCorrecta){
            clave = pedirClave();
            claveCorrecta = comprobarCondiciones(clave, usuario);
        }
    }
    
    public static String pedirUsuario() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un nombre de usuario: ");
        return entrada.nextLine();
    }

    public static String pedirClave() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una contraseña: ");
        return entrada.nextLine();
    }

    // Verifico si la clave tiene al menos dos números
    public static boolean comprobarDigitos(String clave) {
        int numNumeros = 0;
        for (int i = 0; i < clave.length(); i++) {
            if ((int)clave.charAt(i) >= 48 && (int)clave.charAt(i) <= 57){
                numNumeros++;
            }
        }
        System.out.println("Nº números: " + numNumeros);

        return numNumeros >= 2;
    }

    // Leo el número de caracteres que tiene la clave
    public static boolean comprobarCaracteres(String clave) {
        int numCaracteres = clave.length();
        System.out.println("Nº caracteres: " + numCaracteres);
        return numCaracteres >= 6;
    }

    // Compruebo si la clave contiene el nombre de usuario
    public static boolean comprobarUsuarioEnClave(String clave, String usuario) {
        boolean contieneUsuario = clave.contains(usuario);
        System.out.println("Contiene usuario: " + contieneUsuario);
        return contieneUsuario;
    }
    
    // Otra forma de hacerlo
    public static boolean comprobarUsuarioEnClaveConIndexOf(String clave, String usuario) {
        int contieneUsuario = clave.indexOf(usuario);
        System.out.println("Contiene usuario: " + contieneUsuario);
        return contieneUsuario >= 0;
    }

    // Comprobar todas las condiciones
    public static boolean comprobarCondiciones(String clave, String usuario) {
        boolean claveCorrecta = false;

        if (comprobarCaracteres(clave) && 
                comprobarDigitos(clave) && 
                !comprobarUsuarioEnClave(clave, usuario)) {
            System.out.println("Clave guardada.");
            return true;
        } else {
            System.out.println("Clave no válida.");
        }
        return claveCorrecta;
    }
}
