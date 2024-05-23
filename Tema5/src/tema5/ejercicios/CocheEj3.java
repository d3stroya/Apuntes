// EJERCICIO 3
package tema5.ejercicios;

public class CocheEj3 {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private Rueda rueda;
    
    // MÉTODOS
    public void establecerMarca(String mar) {
        marca = mar;
    }
    public void establecerModelo(String mod) {
        modelo = mod;
    }
    public String obtenerMarca() {
        return marca;
    }
    public String obtenerModelo() {
        return modelo;
    }
    public void establecerRueda(Rueda ru) {
        rueda = ru;
    }
    public Rueda obtenerRueda() {
        return rueda;
    }
}
