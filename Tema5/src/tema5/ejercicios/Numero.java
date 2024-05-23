/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicios;

/**
 *
 * @author anabel
 */
public class Numero {
    private int valor;

    
    public Numero() {
        valor = 0;
    }

    public Numero(int numero) {
        valor = numero;
    }

    public int getNumero() {
        return valor;
    }

    public void setNumero(int numero) {
        valor = numero;
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + valor + '}';
    }
    
    
}
