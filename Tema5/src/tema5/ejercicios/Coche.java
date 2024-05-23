// EJERCICIO 1

package tema5.ejercicios;

public class Coche {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    
    // MÉTODOS
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }
    
    public void arrancarCoche() {
        if(!motorEncendido) {
            motorEncendido = true;
            velocidad = 10;            
        }
    }
    
    public void apagarCoche() {
        if(motorEncendido) {
            motorEncendido = false;
            velocidad = 0;            
        }
    }
    
    public void acelerarCoche() {
        velocidad += 20;
    }
    
    public void frenarCoche() {
        velocidad -= 6;
    }
    
    public void obtenerEstado() {
        System.out.println("El estado del coche es: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("velocidad: " + velocidad);
        System.out.println("Motor encendido: " + motorEncendido);
    }
}
