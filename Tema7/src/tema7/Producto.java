/*
 * Ejercicio 8
 */
package tema7;

/**
 *
 * @author anabel
 */
public class Producto {
    // ATRIBUTOS
    private String nombre;
    private int stock;
    private double precio;

    // CONSTRUCTORES
    public Producto() {
        this.nombre = "";
        this.stock = 0;
        this.precio = 0;
    }
    
    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    // GETTER y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // TO STRING
    @Override
    public String toString() {
        return stock + " unidades | " + nombre.toUpperCase() + ": " + precio + "€";
    } 
    
}
