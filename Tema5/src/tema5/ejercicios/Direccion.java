/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicios;

/**
 *
 * @author anabel
 */
public class Direccion {
    // ATRIBUTOS
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    
    // CONSTRUCTORES
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.piso = "";
        this.ciudad = "";
    }
    
    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    // GETTER Y SETTER
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return  "\n   Calle: " + calle +
                "\n   Número: " + numero +
                "\n   Puerta: " + piso + 
                "\n   Ciudad: " + ciudad;
    }
    
    
}
