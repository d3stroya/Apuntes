package tema8.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        transformarCadena("Vivo en la calle Olivo 3 y tengo 21 años.");
    }

    public static void transformarCadena(String cadena) {
        String cadenaTransformada = "";
        // Mayúsculas: del 65 al 90
        // Minúsculas: del 97 al 122
        // Números: del 48 al 57
        // . : 46
        // ñ: 241 - Ñ: 209

        // Recorremos la cadena
        for (int i = 0; i < cadena.length(); i++) {
            int caracterActual = (int) cadena.charAt(i);

            if (caracterActual >= 65 && caracterActual <= 90) { // Mayúsculas -> Minúsculas
                caracterActual = Character.toLowerCase(caracterActual);
                cadenaTransformada += (char) caracterActual;
            } else if (caracterActual >= 97 && caracterActual <= 122) { // Minúsculas -> Mayúsculas
                caracterActual = Character.toUpperCase(caracterActual);
                cadenaTransformada += (char) caracterActual;
            } else if (caracterActual >= 48 && caracterActual <= 57) { // Números -> .
                caracterActual = 46;
                cadenaTransformada += (char) caracterActual;
            } else if (caracterActual == 209) {                      // Ñ -> ñ
                caracterActual = 241;
                cadenaTransformada += (char) caracterActual;
            } else if (caracterActual == 241) {                      // ñ -> Ñ
                caracterActual = 209;
                cadenaTransformada += (char) caracterActual;
            } else {                                             // Otros como espacios o puntos
                cadenaTransformada += (char) caracterActual;
            }
        }
        System.out.println(cadenaTransformada);
    }
}
