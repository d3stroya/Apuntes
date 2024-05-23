/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author anabel
 */
public class Cajero {
    public static void billetesMonedas(int cantidad) {
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        billetes50 = cantidad / 50;
        cantidad %= 50;
        billetes20 = cantidad / 20;
        cantidad %= 20;
        billetes10 = cantidad / 10;
        cantidad %= 10;
        billetes5 = cantidad / 5;
        cantidad %= 5;
        monedas2 = cantidad / 2;
        monedas1 = cantidad % 2;
        if(billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);        
        }
        if(billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if(billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if(billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if(monedas2 > 0) {
            System.out.println("Monedas de 2: " + monedas2);
        }
        if(monedas1 > 0) {
            System.out.println("Monedas de 1: " + monedas1);
        }

    } 
}
