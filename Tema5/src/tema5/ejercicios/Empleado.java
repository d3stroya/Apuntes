/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicios;

/**
 *
 * @author anabel
 */
public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private double salario;
    private Direccion direccion;
    
    // CONSTRUCTORES

    public Empleado() {
        this.nombre = "";
        this.salario = 0.0;
        this.direccion = new Direccion();
    }

    public Empleado(String nombre, double salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nSalario: " + salario +
                "\nDireccion: " + direccion;
    }
    
}
