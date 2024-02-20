/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

/**
 *
 * @author anabel
 */
public class Empleado {
    // ATRIBUTOS
    String nombre;
    int horas;
    double tarifa;

    // CONSTRUCTORES
    public Empleado() {
        nombre = "";
        horas = 0;
        tarifa = 0;
    }

    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + '}';
    }
    
    
}
