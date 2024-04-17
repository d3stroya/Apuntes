/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruleta;

/**
 *
 * @author anabel
 */
public class Ruleta {
    // Atributos
    private int dinero;
    
    // Constructores
    public Ruleta() {
        dinero = 0;
    }

    public Ruleta(int dinero) {
        this.dinero = dinero;
    }
    
    // Getter y setter
    public int getDinero() {
        return dinero;
    }
    
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    // Métodos
    
    
    // toString
    @Override
    public String toString() {
        return "Ruleta{" + "dinero=" + dinero + '}';
    }
    
}
