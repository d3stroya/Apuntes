/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author anabel
 */
public class Nota {
    public static void muestraCalificacion(int num) {
        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5: 
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8: 
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Por favor, introduzca un número entero entre el 0 y el 10.");
        }
    }
}
