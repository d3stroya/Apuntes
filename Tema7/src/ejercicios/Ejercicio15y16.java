package ejercicios;

import java.util.Scanner;
import tema7.Pelicula;
import tema7.Socio;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15y16 {

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }

    public static double pedirPrecioAbonado() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio abonado: ");
        return entrada.nextDouble();
    }

    public static Socio crearSocio() {
        return new Socio(pedirNombre(), pedirPrecioAbonado());
    }

    public static String pedirTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Título: ");
        return entrada.nextLine();
    }

    public static double pedirCosteLicencia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Coste de la licencia: ");
        return entrada.nextDouble();
    }

    public static Socio[] rellenarSocios() {
        System.out.println("¿Quiénes han visto la película?");
        Socio[] aSocios = new Socio[Pelicula.AFORO];
        for (int i = 0; i < aSocios.length; i++) {
            aSocios[i] = crearSocio();
        }
        return aSocios;
    }

    public static Pelicula crearPelicula() {
        System.out.println("Agregando película...");
        return new Pelicula(pedirTitulo(), pedirCosteLicencia(), rellenarSocios());
    }

    public static void rellenarPeliculas(Pelicula[] aPeliculas) {
        for (int i = 0; i < aPeliculas.length; i++) {
            aPeliculas[i] = crearPelicula();
        }
    }

    public static void mostrarPeliculasYSocios(Pelicula[] aPeliculas) {
        for (Pelicula pelicula : aPeliculas) {
            System.out.println(pelicula);
            pelicula.mostrarSocios();
        }
    }

    public static double calcularIngresos(Pelicula pelicula) {
        double ingresos = 0;
        for (Socio socio : pelicula.getaSocios()) {
            ingresos += socio.getPrecioAbonado();
        }
        return ingresos;
    }

    public static double calcularBeneficios(Pelicula pelicula) {
        return calcularIngresos(pelicula) - pelicula.getCosteLicencia();
    }

    public static void mostrarPeliculaMasRentable(Pelicula[] aPeliculas) {
        Pelicula peli = aPeliculas[0];
        double beneficio = 0;

        for (Pelicula pelicula : aPeliculas) {
            beneficio = -pelicula.getCosteLicencia();
            if (calcularBeneficios(pelicula) > beneficio) {
                beneficio = calcularBeneficios(pelicula);
                peli = pelicula;
            }
        }

        System.out.println("La película más rentable es " + peli.getTitulo()
                + " con " + beneficio + "€");
    }

    public static void mostrarPeliculaMenosRentable(Pelicula[] aPeliculas) {
        Pelicula peli = aPeliculas[0];
        double beneficio = 99999;

        for (Pelicula pelicula : aPeliculas) {
            if (calcularBeneficios(pelicula) < beneficio) {
                beneficio = calcularBeneficios(pelicula);
                peli = pelicula;
            }
        }
        System.out.println("La película menos rentable es " + peli.getTitulo()
                + " con " + beneficio + "€");
    }

    public static Pelicula buscarPelicula(Pelicula[] aPeliculas) {
        String nombre = pedirTitulo();
        int i = 0;
        boolean encontrado = false;
        Pelicula peli = aPeliculas[0];

        while (i < aPeliculas.length && !encontrado) {
            if (aPeliculas[i].getTitulo().equalsIgnoreCase(nombre)) {
                encontrado = true;
                peli = aPeliculas[i];
            }
            i++;
        }
        return peli;
    }

    public static void mostrarInfoPeli(Pelicula[] aPeliculas) {
        Pelicula peli = buscarPelicula(aPeliculas);
        System.out.println("Película: " + peli.getTitulo());
        System.out.println("Beneficios: " + calcularBeneficios(peli) + "€");
        System.out.println("Socios:");
        peli.mostrarSocios();
    }

    public static void contarSociosConAportacionSuperior(Pelicula[] aPeliculas) {
        double aportacion = pedirPrecioAbonado();
        int contador = 0;

        for (Pelicula pelicula : aPeliculas) {
            for (Socio socio : pelicula.getaSocios()) {
                if (socio.getPrecioAbonado() > aportacion) {
                    contador++;
                }
            }
        }
        System.out.println(contador + " socios han aportado más de " + aportacion + "€");
    }

    public static void mostrarMenu() {
        System.out.println("NOS GUSTA EL CINE\n");

        Pelicula[] aPeliculas = new Pelicula[2];
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Rellenar películas y socios");
            System.out.println("2. Mostrar películas y socios");
            System.out.println("3. Mostrar película más rentable");
            System.out.println("4. Mostrar película menos rentable");
            System.out.println("5. Buscar película por título");
            System.out.println("6. Contar cuántos socios han pagado más de...");
            System.out.println("7. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    rellenarPeliculas(aPeliculas);
                case 2 ->
                    mostrarPeliculasYSocios(aPeliculas);
                case 3 ->
                    mostrarPeliculaMasRentable(aPeliculas);
                case 4 ->
                    mostrarPeliculaMenosRentable(aPeliculas);
                case 5 ->
                    mostrarInfoPeli(aPeliculas);
                case 6 ->
                    contarSociosConAportacionSuperior(aPeliculas);
                case 7 ->
                    System.out.println("Salir");
                default ->
                    System.out.println("Elige una opción válida");
            }

        } while (opcion != 7);
    }
}
