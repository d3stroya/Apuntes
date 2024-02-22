package tema3.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int num = 1;
        int numeroDePares = 0;

        do {
            if (num % 2 == 0) {
                System.out.println(num);
                numeroDePares++;
            }
            num++;
        } while (numeroDePares < 100);
    }
}
