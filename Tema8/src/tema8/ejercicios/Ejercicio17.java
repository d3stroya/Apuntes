package tema8.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        System.out.println(comprobarIP("192.168.1.1"));
        System.out.println(comprobarIP("255.255.255.255"));
        System.out.println(comprobarIP("0.1.1"));
    }

    public static boolean comprobarIP(String ip) {
        boolean ipValida = false;

        // Compruebo si tiene .
        if (ip.contains(".")) {

            // Divido la cadena por los puntos
            String[] ips = ip.split("\\.", 4);

            // Compruebo si tiene 4 grupos de números (si se han formado 4 subcadenas)
            if (ips.length == 4) {
                for (int i = 0; i < ips.length; i++) {

                    // Convierto cada cadena a número
                    int cuarteto = Integer.parseInt(ips[i]);

                    // Verifico si están entre 0 y 255
                    if (cuarteto >= 0 && cuarteto <= 255) {
                        ipValida = true;
                    }
                }
            }

        }
        return ipValida;
    }
}
