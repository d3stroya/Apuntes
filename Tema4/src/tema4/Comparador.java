/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author anabel
 */
public class Comparador {
    // EJERCICIO 3
    public static int imprimeElMayor(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3) {
            return num1;
        } else if(num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
    
    // EJERCICIO 4
    public static int imprimerElMenor(int num1, int num2, int num3) {
        if(num1 < num2 && num1 < num3) {
            return num1;
        } else if(num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
    
    // EJERCICIO 5
    public static void esPar(int num) {
        if(num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
    // EJERCICIO 7
    public static void ordenAscente(int a, int b, int c, int d) {
        int temp;
        for(int i = 0; i < 4; i++) {
            if(a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if(b > c) {
                temp = b;
                b = c;
                c = b;
            }
            if(c > d) {
                temp = c;
                c = d;
                d = temp;
            }
        }
        System.out.println(a + ", " + b + ", " + c + ", " + d);
    }
    
    public static int menor(int a, int b, int c){
        if(a < b && a < c) {
            return a;
        } else if(b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
