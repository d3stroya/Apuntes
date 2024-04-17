package Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Ahorcado {
    
    /**
     * Método que dibuja el ahorcado en función del número de errores.
     * @param numeroError 
     */
    public static void dibujarAhorcado(int numeroError) {
        System.out.println("Te quedan " + (6 - numeroError) + " errores.");
        switch (numeroError) {
            case 1:
                System.out.println("  ---");
                for(int i = 0; i < 7; i++) {
                    System.out.println("  |");
                }
                for(int j = 0; j < 8; j++) {
                    System.out.print("_");
                }
                break;
            case 2: 
                System.out.println("  ·---·");
                System.out.println("  |   |");
                System.out.println("  |   0");
                for(int i = 0; i < 5; i++) {
                    System.out.println("  |");
                }
                for(int j = 0; j < 8; j++) {
                    System.out.print("_");
                }
                break;
                
            case 3: 
                System.out.println("  ·---·");
                System.out.println("  |   |");
                System.out.println("  |   0");
                System.out.println("  |  / \\");

                for(int i = 0; i < 4; i++) {
                    System.out.println("  |");
                }
                for(int j = 0; j < 8; j++) {
                    System.out.print("_");
                }
                break;
                
            case 4:
                System.out.println("  ·---·");
                System.out.println("  |   |");
                System.out.println("  |   0");
                System.out.println("  |  /|\\");
                System.out.println("  |   |");

                for(int i = 0; i < 4; i++) {
                    System.out.println("  |");
                }
                for(int j = 0; j < 8; j++) {
                    System.out.print("_");
                }
                break;
                
            case 5:
                System.out.println("  ·---·");
                System.out.println("  |   |");
                System.out.println("  |   0");
                System.out.println("  |  /|\\");
                System.out.println("  |   |");
                System.out.println("  |  /");
                for(int i = 0; i < 3; i++) {
                    System.out.println("  |");
                }
                for(int j = 0; j < 8; j++) {
                    System.out.print("_");
                }
                break;
                
            case 6:
                System.out.println("  ·---·");
                System.out.println("  |   |");
                System.out.println("  |   0");
                System.out.println("  |  /|\\");
                System.out.println("  |   |");
                System.out.println("  |  / \\");
                for(int i = 0; i < 3; i++) {
                    System.out.println("  |");
                }
                for(int j = 0; j < 8; j++) {
                    System.out.print("_");
                }
                System.out.println("\nHAS PERDIDO");
                break;                
        }
                
              
    }
    
    /**
     * Método que pide al usuario que escriba un caracter
     * @return el caracter
     */
    public static char pedirCaracter() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIntroduzca una letra: ");
        return entrada.nextLine().charAt(0);
    }
    
    /**
     * Método que convierte las letras en guiones bajos
     * @param palabra
     * @return 
     */
    public static String cifrarPalabra(String palabra) {
        String palabraCifrada = "";
        for(int i = 0; i < palabra.length(); i++) {
            palabraCifrada = palabraCifrada.concat("_");
        }
        return palabraCifrada;
    }
    
    
    
    public static void main(String[] args) {
        String palabra = "arroz";
        char[] aPalabra = palabra.toCharArray();
        char[] palabraCifrada = cifrarPalabra(palabra).toCharArray();
        int errores = 0;
        char caracter;
        
        System.out.println("Adivina la palabra:");
        System.out.println(palabraCifrada);
        
        do {
            caracter = pedirCaracter();
            
            // Si la palabra no contiene el caracter escrito por el usuario, sumamos 1 error
            if(palabra.indexOf(caracter) == -1) {
                errores++;
            } else { // Si la palabra sí contiene el caracter, reemplazamos _ por el caracter
                for(int i = 0; i < palabra.length(); i++) {
                    if(caracter == aPalabra[i]) {
                        palabraCifrada[i] = caracter;
                    } 
                }
            }
            System.out.println(palabraCifrada);
            System.out.println("");
            
            System.out.println("****************");
            System.out.println(  "*  Errores: " + errores + "  *");
            System.out.println("****************");
            System.out.println("");
            dibujarAhorcado(errores);
            System.out.println("");
            
        } while(errores < 6 && Arrays.toString(palabraCifrada).contains("_"));
        
    }
}
