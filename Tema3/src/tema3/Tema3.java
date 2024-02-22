package tema3;

import java.util.Scanner;

public class Tema3 {

    public static void main(String[] args) { 
        int a = 3, b = 2;
        /*
            1. ESTRUCTURAS CONDICIONALES
        */
        System.out.println("IF ELSE");
        // Una condición
        if(a < b) {
            System.out.println(a + " es menor que " + b);
        }
        
        if(a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es mayor que " + b);
        }
        
        System.out.println("IF - ELSE IF - ELSE");
        // Doble condición
        if(a < b) {
            System.out.println(a + " es menor que " + b);
        } else if(a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(a + " es igual que " + b);
        }

        System.out.println("SWITCH");
        // Múltiples condiciones
        switch(a) {
            // Si a = 1
            case 1:
                System.out.println("a es 1");
                break;  // rompe el bucle. Si no lo ponemos, pasaría a los siguientes casos
            // Si a = 2
            case 2:
                System.out.println("a es 2");
                break;
            // Si a = 3
            case 3:
                System.out.println("a es 3");
                break;
            // Cualquier otra opción
            default:
                System.out.println("a no es 1 ni 2 ni 3");
        }
        
        /*
            2. ESTRUCTURAS DE REPETICIÓN (BUCLES)
        */
        System.out.println("BUCLE WHILE");
        // Mientras se cumpla la condición, haz esto
        while(a >= 0) {
            System.out.println(a);
            a--;    // (!) La variable que controla el bucle debe cambiar para no provocar un bucle infinito
        }
        
        System.out.println("BUCLE DO WHILE");
        // Haz esto mientras se cumpla la condición. "Esto" siempre se ejecuta al menos una vez.
        do {
            System.out.println(a);
            a--;
        } while(a >= 0);
        
        System.out.println("BUCLE FOR");
        // Para esta condición, haz esto
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
    }
    
}
