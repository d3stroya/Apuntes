
package tema8.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16 {
    public static void main(String[] args) {
         System.out.println(comprobarNombreArchivo("usuarios.txt"));
        System.out.println(comprobarNombreArchivo(".txt"));
        System.out.println(comprobarNombreArchivo("hola"));
    }
    
    public static boolean comprobarNombreArchivo(String archivo) {
        boolean nombreValido = false;
        
        // ¿Tiene .?
        if(!archivo.contains(".")) {
            System.out.println("El archivo no tiene extensión.");
        } else {
            // Divido el nombre del archivo en nombre (archivos[0] y extensión archivos[1]
            String[] archivos = archivo.split("\\.", 2);
            
            // Tiene entre 1 y 10 caracteres antes del .
            if(archivos[0].length() >= 1 && archivos[0].length() <= 10) {
                
                // Tiene entre 1 y 4 caracteres después del .
                if(archivos[1].length() >= 1 && archivos[1].length() <= 4) {
                    nombreValido = true;
                }
            }
        }
        return nombreValido;
    }
    
    
    // Otra forma
    public static boolean comprobarNombreArchivoConSubstring(String archivo) {
        boolean archivoValido = false;
        if(!archivo.contains(".")) {
            System.out.println("El archivo no tiene extensión");
        } else {
            int posicionPunto = archivo.indexOf(".");
            System.out.println("La posición del punto es " + posicionPunto);
            
            String nombreArchivo = archivo.substring(0, posicionPunto);
            String nombreExtension = archivo.substring( posicionPunto + 1, archivo.length() - 1);
            
            if(nombreArchivo.length() >= 1 && nombreArchivo.length() <= 10) {
                System.out.println("Longitud del nombre correcta");
                
                if(nombreExtension.length() >= 1 && nombreExtension.length() <= 4) {
                    System.out.println("Extensión correcta");
                    archivoValido = true;
                }
            }
        }
        return archivoValido;
    }
}
