package Ruleta;

import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Panel {
    // Atributos
    private String palabraSecreta;
    
    // Constructores
    public Panel() {
        palabraSecreta = "";
    }
    
    public Panel(String palabra) {
        palabraSecreta = palabra;
    }
    
    // Getter y setter
    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }
    
    // Métodos
    public String ocultarPalabra(String palabra) {
        String palabraOcultada = "";
        for(int i = 0; i < palabra.length(); i++) {
                palabraOcultada = palabraOcultada.concat("*");
        }
        return palabraOcultada;
    }
    
    public char decirLetra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una letra o pulsa el número 1 para resolver");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }
    
    public char [] comprobarLetra(char caracter) {
        char[] aPalabraSecreta = palabraSecreta.toCharArray();
        char[] aPalabraOcultada = ocultarPalabra(palabraSecreta).toCharArray();
        
        if(palabraSecreta.indexOf(caracter) == -1) {
            System.out.println("Esa letra no está en el panel.");
            System.out.println("Pierdes el turno.");
        } else {
            for(int i = 0; i < palabraSecreta.length(); i++) {
                if(aPalabraSecreta[i] == caracter) {
                    aPalabraOcultada[i] = caracter;
                }
            }
        }
        return aPalabraOcultada;
    }
    
    // toString
    @Override
    public String toString() {
        return "Panel{" + "palabraSecreta=" + palabraSecreta + '}';
    }
    
    
}
