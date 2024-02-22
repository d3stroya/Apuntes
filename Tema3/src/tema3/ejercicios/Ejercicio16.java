package tema3.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int num = 0;
        int numeroDeImpares = 0;
        while (num < 100) {
            if (num % 2 != 0) {
                System.out.println(num);
                numeroDeImpares++;
            }
            num++;
        }

        System.out.println("Hay un total de " + numeroDeImpares + " impares.");

    }
}
