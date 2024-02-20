// PAQUETES
package tema2;

// IPMORTACIÓN DE PAQUETES
import java.util.Scanner;   // Nos permite usar la clase Scanner del paquete java.util

// COMENTARIOS
/**
 *
 * @author d3stroya
 */

// CLASE
public class Tema2 {
    // ATRIBUTOS: variables de la clase
    private static int dificultad;     // variable
    private final static int NUMERO_TEMA = 2;   // constante

    // MÉTODO PRINCIPAL (punto de acceso a la aplicación)
    public static void main(String[] args) {
       /*
            1. VARIABLES: guardan datos para poder acceder a ellos en cualquier momento
        */
       // Declarar una variable
        int media;  // Reserva un espacio en memoria para guardar un tipo de dato entero (4 bytes)
        
        // Inicializar la variable
        media = 6;  // Guarda el valor 6 en la variable media.Cuando llamemos a media, obtendremos el valor 6.
        
        // Declarar e inicalizar una variable
        int nota = 9;   // Lo mismo que antes pero en una línea
        
        // Declarar - inicalizar más de una variable del mismo tipo
        int nota1, nota2, nota3;
        int nota4 = 5, nota5 = 7;
        
        // (!) Sigue las buenas prácticas para nombrar variables
        /*
            · Tienen que ser significativos. (esto es, que el nombre tenga relación con lo que almacenen)
            · No llevan espacios en blanco.
            · No pueden empezar por un número.
            · No es recomendable que lleven acentos.
            · No es recomendable que contengan la letra ñ/Ñ.
            · Distinguen entre mayúsculas y minúsculas.
            · Aceptan _ y $.
        */
        // Las variables y los métodos empeizan por minúscula y usan camelCase: notaMedia, generarNumeroAleatorio()
        // Las clases empiezan por mayúscula y usan camelCase: CocheElectrico
        // Las constantes se escriben en mayúscula: NUMERO_TEMA
        
        /*
            2. TIPOS DE DATOS SIMPLES
        */
        // Números enteros
        byte tamanio = 3;   // 1 byte
        short edad = 27;    // 2 bytes
        int radio = 50;     // 4 bytes
        long id = 47381018; // 8 bytes
        
        // Números decimales
        float notaMedia = 8.325f;       // 4 bytes
        double temperatura = 42.15938;  // 8 bytes
        
        // Caracter
        char inicial = 'A';
        
        // Boolean
        boolean encendido = true;
        boolean cicloTerminado = false;
        
        /*
            3. ÁMBITO DE LAS VARIABLES (SCOPE): rango de actuación de una variable. Puede ser 
            a nivel de clase (global) o a nivel del método donde se declara (local).
            Una variable local "nace" en el método y "muere" con él, es decir, no sale del método.
        */
        dificultad = 1;
        indicarDificultad();
        System.out.println("Dificultad: " + dificultad); // dificultad es una variable global (de la clase) y su valor se modifica de manera también global
//        System.out.println(nivel);    // Da error porque la variable solo existe dentro de indicarDificultad

        /*
            4. OPERADORES
        */
        int a = 5;
        int b = 2;
        
        // 4.1. ARITMÉTICOS
        System.out.println("\nOPERADORES ARITMÉTICOS");
        // Suma ( + )
        System.out.println(a + " + " + b + " = " + (a + b));
        // Resta ( - )
        System.out.println(a + " - " + b + " = " + (a - b));
        // Producto ( * )
        System.out.println(a + " * " + b + " = " + (a * b));
        // División ( / )
        System.out.println(a + " / " + b + " = " + (a / b));
        // Módulo ( % ): devuelve el resto de la división
        System.out.println(a + " % " + b + " = " + (a % b));
        
        // 4.2. RELACIONALES
        System.out.println("\nOPERADORES RELACIONALES");
        // Mayor que ( > )
        System.out.println(a + " > " + b + " = " + (a > b));
        
        // Menor que ( < )
        System.out.println(a + " < " + b + " = " + (a < b));
        
        // También podemos usar mayor o igual que ( >= ) y menor o igual que ( <= )
        
        // No es igual que ( != )
        System.out.println(a + " != " + b + " = " + (a != b));
        
        // Igual que ( == )
        // (!) = es el operador de asignación; == es el operador de igualdad
        System.out.println(a + " == " + b + " = " + (a == b));
        
        // 4.3. LÓGICOS
        System.out.println("\nOPERADORES LÓGICOS");
        // And ( && ): deben cumplirse ambas condiciones
        System.out.println(a + " > " + b + " && " + a + " != " + b + " = " + ((a > b) && (a != b)));
        
        // Or ( || ): debe cumplirse una condición u otra, u ambas
        System.out.println(a + " < " + b + " || " + a + " != " + b + " = " + ((a < b) || (a != b)));
        
        // Xor (  ): debe cumplirse una condición u otra, pero no ambas
        System.out.println(a + " > " + b + " ^ " + a + " != " + b + " = " + ((a > b) ^ (a != b)));
        
        // Not ( ! ): negación. Si una variable es true la convierte en false y viceversa
        System.out.println("!(" + a + " > " + b + ") = " + !(a > b));
        
        // 4.4. UNARIOS
        System.out.println("OPERADORES UNARIOS");
        // Complemento a 1 ( ~ )
        System.out.println("~ " + a + " = " + ~a);
        // Not ( ! )
        
        // Cambio de signo ( - )
        System.out.println("- " + a + " = " + -a);
        
        // Decremento ( -- )
        System.out.println(a-- + " -- => " + a);
        
        // Incremento
        System.out.println(a++ + " ++ => " + a);
        
        // 4.5. DE BITS
        // And ( & )
        // Or ( | )
        // Xor ( ^ )
        // Desplazamiento a la izquierda ( << )
        // Desplazamiento a la derecha ( >> )
        
        // 4.6. DE ASIGNACIÓN
        System.out.println("OPERADORES DE ASIGNACIÓN");
        // Asignación ( = )
        int c = 2;
        System.out.println("c = 2 => " + c);
        
        // Multiplicar por el propio número y asignar ( *= )
        a *= b; // Es lo mismo que a = a * b;
        System.out.println(a + " *= " + b + " = " + a);
        
        // Dividir por el propio número y asignar ( /= )
        a /= b; // Es lo mismo que a = a * b;
        System.out.println(a + " /= " + b + " = " + a);
        
        // Sumar por el propio número y asignar ( += )
        a += b; // Es lo mismo que a = a * b;
        System.out.println(a + " += " + b + " = " + a);
        
        // Restar por el propio número y asignar ( -= )
        a -= b; // Es lo mismo que a = a * b;
        System.out.println(a + " -= " + b + " = " + a);
        
        // Calcular el módulo del propio número y asignar ( %= )
        a %= b; // Es lo mismo que a = a * b;
        System.out.println(a + " %= " + b + " = " + a);
        
        /*
            5. CONVERSIÓN DE TIPOS: convertir un valor de un tipo de dato a otro
        */
        // Implícita
        short corto = 3;
        int entero = corto;
        
        // Explícita
        double pi = 3.14;
        int piEntero = (int)pi;
        
        /*
            6. ENTRADA DE DATOS POR TECLADO
        */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número de opción:");
        int opcion = entrada.nextInt();
        
        // Contamos con métodos para cada tipo de dato: nextByte(), nextShort(), nextDouble(), nextFloat(), nextBoolean()
        
    }
    
    // OTROS MÉTODOS
    public static void saludar() {
        System.out.println("Hola");
    }
    
    public static void indicarDificultad() {
        dificultad = 3; // variable global (ver línea 13)
        int nivel = 3;  // variable local
    }
    
}
