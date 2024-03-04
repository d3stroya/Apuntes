/**
 * Los strings son objetos inmutables, por lo que aplicar los métodos
 * no modifica el string, hay que almacenar el resultado en la misma variable
 * o en una nueva.
 */
package tema8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author d3stroya
 */
public class Tema8 {

    public static void main(String[] args) {
        /*
            1. DECLARAR E INICIALIZAR
        */
        String saludo = "hola";
        
        /*
            ¡OJO! Un objeto String representa una cadena de caracteres NO modificable.
            Debes guardar en una variable el resultado de la manipulación de la cadena.
        */
        // Concatenar 2 strings (no guarda el nuevo string)
        saludo.concat(", ¿qué tal?");
        System.out.println(saludo); // hola
        
        // Concatenar 2 strings y almacenarlos en la variable saludo (sí guarda el nuevo string)
        saludo = saludo.concat(", ¿qué tal?");
        System.out.println(saludo); // hola, ¿qué tal?
        
        /*
            ¡OJO con los nulos!
        */
//        System.out.println("NULL POINTER EXCEPTION");
//        String nulo = null;
//        String cadenaNula = new String(nulo);
//        System.out.println(cadenaNula);

        /*
            Conversión de tipos
        */
        // Convertir caracteres a código ASCII usando un array de char
        System.out.println("\nCÓDIGO ASCII");
        for(int i = 0; i < saludo.length(); i++) {
            char[] aSaludo = saludo.toCharArray();
            int caracterActual = (int)aSaludo[i];
            System.out.print(caracterActual + " ");
        }
        

        
        /*
            2. MÉTODOS
        */
        
        // equals y equalsIgnoreCase: compara dos cadenas y nos dice si son iguales
        System.out.println("\n\nEQUALS | EQUALS IGNORE CASE");
        String manana = "Mañana";
        String tarde = "Tarde";
        System.out.println(manana.equalsIgnoreCase(tarde));
        

        // compareTo(): comparación lexicográfica
            // > 0: cadena1 es mayor
            // == 0: son iguales
            // < 0: cadena1 es menor
        System.out.println("\nCOMPARE TO");
        String cadena1 = "abc";
        String cadena2 = "def";
        String cadena3 = "abc abc";
        System.out.println(cadena1.compareTo(cadena2));
       

        // valueOf: convierte a cadena de texto algo que no lo es
        System.out.println("\nVALUE OF");
        float pi = 3.14159f;
        System.out.println("Antes de usar valueOf, valorPi es de tipo " + 
                ((Object)pi).getClass().getSimpleName());
//        
        String valorPi = String.valueOf(pi);
        System.out.println("Después de usar valueOf, valorPi es de tipo " + 
                valorPi.getClass().getSimpleName() + 
                " y tiene el valor " + valorPi);

        // length(): devuelve el tamaño del string. Se usa mucho para recorrer el string
        System.out.println("\nRECORRER UN STRING CON LENGTH()");
        for (int i = 0; i < saludo.length(); i++) {
            System.out.print(saludo.toCharArray()[i]);
        }
//        
        // concat: concatena cadenas
        System.out.println("\n\nCONCAT");
        cadena1 = cadena1.concat(cadena2);
        System.out.println(cadena1);
//        
        // charAt: devuelve el caracter en la posición indicada
        System.out.println("\nCHAR AT");
        System.out.println("La letra en la posición 1 de la cadena1 es " + cadena1.charAt(1));
//    
        // substring: (aplica la sobrecarga de métodos). 
        // Extrae los caracteres desde y hasta la posición indicada (en su caso). 
        // Si no se indica, extrae hasta el final.
        System.out.println("\nSUBSTRING");
        System.out.println(saludo.substring(1));
        System.out.println(saludo.substring(1, 3));
//        
        // indexOf y lastIndexOf (aplica la sobrecarga de métodos).
        // Encuentra el primer o último índice desde el principio de la cadena
        // o, en su caso, desde el índice indicado.
        System.out.println("\nINDEX OF");
        System.out.println("Analizamos la cadena: " + cadena3);
        System.out.println(cadena3.indexOf("a"));
        System.out.println(cadena3.lastIndexOf("a"));
        System.out.println(cadena3.indexOf(cadena2));
        System.out.println(cadena3.indexOf(cadena1));
        
        System.out.println("\nAnalizamos la cadena: " + manana);
        System.out.println("La primera a está en el índice " + manana.indexOf('a'));
        System.out.println("La primera a desde el índice 2 está en el índice " + manana.indexOf('a', 2));
        System.out.println("La última a está en el índice " + manana.lastIndexOf('a'));
        System.out.println("La letra l está en el índice " + manana.indexOf('l'));
        
        // startsWith y endsWith: devuelve true o false si la cadena empieza o termina por el string indicado
        System.out.println("\nSTARTS/ENDS WITH");
        System.out.println("¿" + cadena1 + " empieza por a? " + cadena1.startsWith("a"));
        System.out.println("¿" + cadena1 + " termina por a? " + cadena1.endsWith("a"));
        
        // replace: reemplaza un string por otro
        System.out.println("\nREPLACE (ALL)");
        String saludo1 = "Hola qué tal";
        System.out.println("Reemplazamos espacios por guiones: " + saludo.replace(" ","-"));
        System.out.println("Reemplazamos ab por " + cadena2 + ": " + cadena1.replace("ab", cadena2));
        
        // toUpperCase y toLowerCase: convierte todas las letras a mayúscula o minúscula
        System.out.println("\nTO UPPERCASE");
        System.out.println(cadena1.toUpperCase());
        
        // split: divide un string por el patrón indicado y lo almacena en un array de strings
        System.out.println("\nSPLIT");
        String listaCompra = "leche, harina, azúcar";
        String[] arrayCompra = listaCompra.split(", ");
        for(int i = 0; i < arrayCompra.length; i++) {
            System.out.println(arrayCompra[i]);
        }





        /* 
            3. CLASES ENVOLTORIO
        */
        System.out.println("\nCLASES ENVOLTORIO");
        
        int edad = 23;
        
        // AutoBoxing
        Integer edadEnvoltorio = edad;
        edadEnvoltorio = edad;
        
        // AutoUnBoxing
//        Integer numeroEnteroDeprecated = new Integer(3);  // Depracated
        Integer numeroEntero = Integer.valueOf(3);
        int numeroEntero_int = numeroEntero;
        
//        System.out.println("TYPE: " + edadEnvoltorio.TYPE);
//        System.out.println("SIZE: " + edadEnvoltorio.SIZE);
//        System.out.println("BYTES: " + edadEnvoltorio.BYTES);
//        System.out.println("MAX_VALUE: " + edadEnvoltorio.MAX_VALUE);
//        System.out.println("MIN_VALUE: " + edadEnvoltorio.MIN_VALUE);
        
//        String edadCadena = "23";
//        int edadInt = Integer.parseInt(edadCadena);
//        System.out.println(edadInt + " es de tipo " + edadInt.getClass().getName()); // ERROR: no es objeto
        
//        String edadString = Integer.toString(edadInt);
//        System.out.println(edadString + " es de tipo " + edadString.getClass().getName());



        /*
            4. STRING BUFFER: cadenas mutables
        */

        // Stringbuffer: cadenas mutables 
        System.out.println("STRING BUFFER");
        StringBuffer cadena = new StringBuffer();
//        System.out.println("Capacidad: " + cadena.capacity());  // Capacidad disponible
//        System.out.println("Tamaño: " + cadena.length());   // Tamaño real del string
//      
//        System.out.println("\nSetteamos una longitud igual a 25...");
//        cadena.setLength(25);
//        System.out.println("Nueva longitud: " + cadena.length());
//        System.out.println("Nueva capacidad: " + cadena.capacity());
       
        // append: Añadir una cadena al final
        System.out.println("\nAñadimos una cadena al final con append(cadena)");
        cadena.append("Me encanta programar");
        System.out.println(cadena);
        
        // insert: Insertar una cadena en una posición (offset)
        System.out.println("\nInsertamos una cadena al final con insert(offset, cadena)");
        cadena.insert(cadena.length(), " en Java");
        System.out.println(cadena);
       
        // replace: Reemplazar una parte del string por otro string
            // ontando caracteres
        cadena.replace(0, 10, "Odio");
        System.out.println(cadena);
       
            // Dinámico
        cadena.delete(cadena.indexOf(" programar"), cadena.indexOf(" Java"));
        System.out.println(cadena);

        
        
        
        /*
            5. STRING TOKENIZER: cadena divisible en tokens
        */
        
        // StringTokenizer
        System.out.println("STRING TOKENIZER");
        String listaCompra1 = "harina, aceite, espinacas";
        System.out.println(listaCompra);
        
        System.out.println("\nLISTA DE LA COMPRA");
        StringTokenizer listaCompraTokens = new StringTokenizer(listaCompra, ", ");
        while(listaCompraTokens.hasMoreTokens()) {
            System.out.println(listaCompraTokens.nextToken());
        }
               
    }

}
