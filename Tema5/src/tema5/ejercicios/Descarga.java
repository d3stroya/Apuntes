
package tema5.ejercicios;

public class Descarga {
    // ATRIBUTOS
    private String nombreDescarga;
    private double tamañoDescarga;
    private double velocidadDescarga;

    // CONSTRUCTORES
    public Descarga() {
    }

    public Descarga(String nombreDescarga, double tamañoDescarga, double velocidadDescarga) {
        this.nombreDescarga = nombreDescarga;
        this.tamañoDescarga = tamañoDescarga;
        this.velocidadDescarga = velocidadDescarga;
    }
    
    // GETTER Y SETTER
    public String getNombreDescarga() {
        return nombreDescarga;
    }

    public void setNombreDescarga(String nombreDescarga) {
        this.nombreDescarga = nombreDescarga;
    }

    public double getTamañoDescarga() {
        return tamañoDescarga;
    }

    public void setTamañoDescarga(double tamañoDescarga) {
        this.tamañoDescarga = tamañoDescarga;
    }

    public double getVelocidadDescarga() {
        return velocidadDescarga;
    }

    public void setVelocidadDescarga(double velocidadDescarga) {
        this.velocidadDescarga = velocidadDescarga;
    }
    
    @Override
    public String toString() {
        return "[Descarga: nombre=" + nombreDescarga + 
                "; tamaño=" + tamañoDescarga +
                "; velocidad=" + velocidadDescarga + "]";
    }
}
