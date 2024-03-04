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
        
        String saludo = "hola";
        saludo.concat(saludo + " , ¿qué tal?");
        System.out.println(saludo); // hola
        
//        System.out.println("NULL POINTER EXCEPTION");
//        String nulo = null;
//        String cadenaNula = new String(nulo);
//        System.out.println(cadenaNula);

        System.out.println("\nCÓDIGO ASCII");
        for(int i = 0; i < saludo.length(); i++) {
            char[] aSaludo = saludo.toCharArray();
            int caracterActual = (int)aSaludo[i];
            System.out.println(caracterActual);
        }
        // equals y equalsIgnoreCase: compara dos cadenas y nos dice si son iguales
        System.out.println("\nEQUALS | EQUALS IGNORE CASE");
        String manana = "Mañana";
        String tarde = "Tarde";
        System.out.println(manana.equalsIgnoreCase(tarde));
        

        // compareTo(): comparación lexicográfica
//        System.out.println("\nCOMPARE TO");
        String cadena1 = "abc";
        String cadena2 = "def";
        String cadena3 = "abc abc";
//        System.out.println(cadena1.compareTo(cadena2));
       

        // valueOf: convierte a cadena de texto algo que no lo es
//        System.out.println("\nVALUE OF");
//        float pi = 3.14159f;
//        System.out.println("Antes de usar valueOf, valorPi es de tipo " + 
//                ((Object)pi).getClass().getSimpleName());
//        
//        String valorPi = String.valueOf(pi);
//        System.out.println("Después de usar valueOf, valorPi es de tipo " + 
//                valorPi.getClass().getSimpleName() + 
//                " y tiene el valor " + valorPi);

//        System.out.println("RECORRER UN STRING CON LENGTH()");
//        for (int i = 0; i < saludo.length(); i++) {
//            System.out.println(saludo.toCharArray()[i]);
//        }
//        
//        // concat: concatena cadenas
//        System.out.println("\nCONCAT");
//        cadena1 = cadena1.concat(cadena2);
//        System.out.println(cadena1);
//        
//        // charAt: devuelve el caracter en la posición indicada
//        System.out.println("\nCHAR AT");
//        System.out.println("La letra en la posición 1 de la cadena1 es " + cadena1.charAt(1));
//    
//        // substring: (aplica la sobrecarga de métodos) 
//        // extrae los caracteres desde y hasta la posición indicada
//        System.out.println("\nSUBSTRING");
//        System.out.println(saludo.substring(1));
//        System.out.println(saludo.substring(1, 3));
//        
//        // indexOf y lastIndexOf
//        System.out.println("\nINDEX OF");
//        System.out.println(cadena3.indexOf("a"));
//        System.out.println(cadena3.lastIndexOf("a"));
//        System.out.println(cadena3.indexOf(cadena2));
//        System.out.println(cadena3.indexOf(cadena1));
//        System.out.println("La primera a está en la posición " + manana.indexOf('a'));
//        System.out.println("La primera a desde la posición 2 está en " + manana.indexOf('a', 2));
//        System.out.println("La última a está en la posición " + manana.lastIndexOf('a'));
//        System.out.println(manana.indexOf('l'));
//        
//        // startsWith y endsWith
//        System.out.println("\nSTARTS/ENDS WITH");
//        System.out.println(cadena1.startsWith("a"));
//        System.out.println(cadena1.endsWith("a"));
//        
//        // replace
        System.out.println("\nREPLACE (ALL)");
//        String saludo = "Hola qué tal";
//        System.out.println(saludo.replace(" ","-"));
//        System.out.println(cadena1.replace("ab", cadena2));
//        
//        // toUpperCase y toLowerCase
//        System.out.println("\nTO UPPERCASE");
//        System.out.println(cadena1.toUpperCase());
//        
//        // split: divide un string por el caracter indicado y lo almacena en un array de strings
//        System.out.println("\nSPLIT");
//        String listaCompra = "Leche, harina, azúcar";
//        String[] arrayCompra = listaCompra.split(", ");
//        for(int i = 0; i < arrayCompra.length; i++) {
//            System.out.println(arrayCompra[i]);
//        }





        // Clases envoltorio
//        int edad = 23;
        // AutoBoxing
//        Integer edadEnvoltorio = edad;
//        edadEnvoltorio = edad;
//        // AutoUnBoxing
//        Integer numeroEntero = new Integer(3);
//        int numeroEntero_int = numeroEntero;
//        
//        System.out.println("TYPE: " + edadEnvoltorio.TYPE);
//        System.out.println("SIZE: " + edadEnvoltorio.SIZE);
//        System.out.println("BYTES: " + edadEnvoltorio.BYTES);
//        System.out.println("MAX_VALUE: " + edadEnvoltorio.MAX_VALUE);
//        System.out.println("MIN_VALUE: " + edadEnvoltorio.MIN_VALUE);
//        
//        String edadCadena = "23";
//        int edadInt = Integer.parseInt(edadCadena);
        // System.out.println(edadInt + " es de tipo " + edadInt.getClass().getName()); ERROR: no es objeto
        
//        String edadString = Integer.toString(edadInt);
//        System.out.println(edadString + " es de tipo " + edadString.getClass().getName());


        // Stringbuffer: cadenas mutables 
//        StringBuffer cadena = new StringBuffer();
//        System.out.println(cadena.capacity());
//        System.out.println(cadena.length());
//      
//        cadena.setLength(25);
//        System.out.println(cadena.length());
//        System.out.println(cadena.capacity());
       
//        cadena.append("Me encanta programar");
//        System.out.println(cadena);
        
//        cadena.insert(cadena.length(), " en Java");
//        System.out.println(cadena);
       
        // Contando caracteres
//        cadena.replace(0, 10, "Odio");
//        System.out.println(cadena);
       
//       // Dinámico
//        cadena.delete(cadena.indexOf(" programar"), cadena.indexOf(" Java"));
//        System.out.println(cadena);

        // StringTokenizer
//        String listaCompra = "harina, aceite, espinacas";
//        System.out.println(listaCompra);
//        
//        System.out.println("\nLISTA DE LA COMPRA");
//        StringTokenizer listaCompraTokens = new StringTokenizer(listaCompra, ", ");
//        while(listaCompraTokens.hasMoreTokens()) {
//            System.out.println(listaCompraTokens.nextToken());
//        }
               
    }

}
