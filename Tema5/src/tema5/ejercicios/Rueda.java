// EJERCICIO 3
package tema5.ejercicios;

public class Rueda {
    // ATRIBUTOS
    private String material;
    private int pulgadas;
    
    // MÉTODOS
    public void establecerMaterial(String mat) {
        material = mat;
    }
    public void establecerPulgadas(int pul) {
        pulgadas = pul;
    }
    public String obtenerMaterial() {
        return material;
    }
    public int obtenerPulgadas() {
        return pulgadas;
    }
}
