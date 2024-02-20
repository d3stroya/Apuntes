package tema7;

/**
 *
 * @author anabel
 */
public class Socio {
    private String nombre;
    private double precioAbonado;

    public Socio() {
        this.nombre = "";
        this.precioAbonado = 0;
    }
    
    public Socio(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", precioAbonado=" + precioAbonado + '}';
    }
    
    
}
