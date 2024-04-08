
package tema11.ejercicios;

import java.util.logging.Logger;

/**
 *
 * @author d3stroya
 */
public class Hotel {
    // ATRIBUTOS
    private int idHotel;
    private String zona;
    private int precio;
    
    // CONSTRUCTORES
    public Hotel() {
        this.idHotel = 0;
        this.zona = "";
        this.precio = 0;
    }
    public Hotel(int idHotel, String zona, int precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    // GETTER Y SETTER
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // TO STRING
    @Override
    public String toString() {
        return idHotel + "\t(" + zona + ") -> " + precio + "€";
    }
    
}
