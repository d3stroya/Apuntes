package tema4;

import java.util.Scanner;
import tema4.calculadora.Operaciones;

/**
 *
 * @author anabel
 */
public class Tema4 {
    // EJERCICIO 12
    final static int PASSWORD = 1234;

    // EJERCICIO 1
    public static void esPositivo(int numero) {
        if(numero > 0) {
           System.out.println("Sí, " + numero + " es positivo.");

        } else if(numero < 0) {
            System.out.println("No, " + numero + " es negativo.");
        } else {
            System.out.println(numero + " es neutro.");
        }
    }
    
    public static void main(String[] args) {
        /*
        
        0. MÉTODOS
        
            Cuando empezamos a programar, podemos trabajar en el main
            porque tenemos pocas líneas de código, pero, a medida que
            nuestros programan crecen, tener todo el código en el main
            sería muy incómodo. Por eso modularizamos el código en métodos.
        
        
        1. MÉTODOS ESTÁTICOS
        
            Los métodos estáticos son los que pertenecen a una clase y son comunes
            a todos sus objetos.
        
            Sólo podemos llamar a  métodos estáticos desde ámbitos estáticos.
        
            El método main es estático, por lo que todos los métodos que utilicemos
            en la clase pricnipal también deben serlo.
            
            IMPORTANTE: Esto no significa que tengamos que crear todos los métodos estáticos 
            en todas las clases.
        
            Para llamar a un método estático no tenemos que crear un objeto de esa clase,
            sino:
                1. Importar con la sentencia import el paquete que contiene 
                la clase que queremos usar
                2. Anteponer el nombre de la clase 
            O bien:
                1. Anteponer el nombre del paquete
                2. Seguido del nombre de la clase
        
            Si el método está en la misma clase desde la que lo estamos llamando,
            no tennemos que anteponer el nombre de la clase; lo llamamos directamente.
        */
        
        // Llamar a un método estático de la propia clase
        esPositivo(3);
        
        // Llamar a un método estático de otra clase
        System.out.println(Math.random());
        
        // Llamar a un método sin importar el paquete completo
        tema4.calculadora.Operaciones.sumar(3, 2);
        
        // No puedo llamar a sumar creando un objeto de la clase Operaciones
//        Operaciones o = new Operaciones();
//        System.out.println(o.sumar(3, 2));
        
        /*
            2. TIPOS DE MÉTODOS
                
                Los métodos son un conjunto de acciones que procesan datos.
                Por ello, pueden obtener datos de entrada a través de parámetros
                y devolver unos datos de salida con la sentencia return.

                ENTRADA (parámetro)                              SALIDA (return)
                int a --->
                                     suma { ...proceso... }     ---> int (a + b)
                int b --->

                Los métodos pueden devolver datos de distintos tipos o no devolver nada.
                Dependiendo del tipo de dato que devuelvan, será de un tipo u otro.
                Por ejemplo, si devuelven un int, serán de tipo int:
                    public static int sumar(int a, int b) {
                        return a + b;
                    }

                Los métodos que no devuelven nada son de tipo void:
                    public static void mostrarMensaje() {
                        System.out.println("Hola");
                    }
        */  
               
        
        // EJERCICIO 1
//        int numero;
        Scanner entrada = new Scanner(System.in);
//        System.out.print("Por favor, introduzca un número: ");
//        numero = entrada.nextInt();
//        esPositivo(numero);
        
        // EJERCICIO 2
//        int num1, num2;
//        System.out.print("Por favor, introduzca un número: ");
//        num1 = entrada.nextInt();
//        System.out.print("Ahora, introduzca un segundo número: ");
//        num2 = entrada.nextInt();
//        
//        if(num1 > 10) {
//            System.out.print("La operación que se realizó es producto y el resultado es ");
//            SumaMultiplica.multiplica(num1, num2);
//        } else {
//            System.out.print("La operación que se realizó es suma y el resultado es ");
//            SumaMultiplica.suma(num1, num2);
//        }

        // EJERCICIO 3
//        int a, b, c;
//        System.out.print("Por favor, introduzca un número: ");
//        a = entrada.nextInt();
//        System.out.print("Por favor, introduzca un segundo número: ");
//        b = entrada.nextInt();
//        System.out.print("Por favor, introduzca un tercer número: ");
//        c = entrada.nextInt();
        //System.out.println("El número mayor de los introducidos es el " + Comparador.imprimeElMayor(a, b, c));
    
        // EJERCICIO 4
//        System.out.println("El número menor de los introducidos es el " + Comparador.imprimerElMenor(a, b, c));
        
        // EJERCICIO 5
//        int numero;
//        System.out.print("Por favor, introduzca un número: ");
//        numero = entrada.nextInt();
//        Comparador.esPar(numero);

        // EJERCICIO 6
//        int nota;
//        System.out.print("Por favor, ingrese la nota: ");
//        nota = entrada.nextInt();
//        Nota.muestraCalificacion(nota);

        // EJERCICIO 7
//        int a, b, c, d;
//        System.out.print("Por favor, introduzca el primero número: ");
//        a = entrada.nextInt();
//        System.out.print("Por favor, introduzca el segundo número: ");
//        b = entrada.nextInt();
//        System.out.print("Por favor, introduzca el tercer número: ");
//        c = entrada.nextInt();
//        System.out.print("Por favor, introduzca el cuarto número: ");
//        d = entrada.nextInt();
//        Comparador.ordenAscente(a, b, c, d);

        // EJERCICIO 8
//        int dinero;
//        System.out.print("Por favor, indique una cantidad de dinero:  ");
//        dinero = entrada.nextInt();
//        Cajero.billetesMonedas(dinero);

        // EJERCICIO 9
//        int a, b, c;
//        
//        System.out.print("Por favor, introduzca el primero número: ");
//        a = entrada.nextInt();
//        System.out.print("Por favor, introduzca el segudno número: ");
//        b = entrada.nextInt();
//        System.out.print("Por favor, introduzca el tercer número: ");
//        c = entrada.nextInt();
//        
//        System.out.println(Comparador.menor(a, b, c));

        // EJERCICIO 10
        //tablaDeMultiplicar(pideNumero());
        
        // EJERCICIO 11
        //muestraResultado(raizCuadrada(pideNumero()));
        
        
    }
    // EJERCICIO 10
    public static int pideNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número: ");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static void tablaDeMultiplicar(int numero) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + i * numero);
        }
    }
    
    // EJERCICIO 11
    // Hace uso de pideNumero()
    public static double raizCuadrada(int numero) {
        return Math.sqrt(numero);
    }
    
    public static void muestraResultado(double raizCuadrada) {
        System.out.println("El resultado es: " + raizCuadrada);
    }
    
    
}
