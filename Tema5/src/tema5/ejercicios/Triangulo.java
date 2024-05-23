package tema5.ejercicios;

public class Triangulo {
    // ATRIBUTOS
    private double cateto1;
    private double cateto2;
    
    // CONSTRUCTORES

    public Triangulo() {
        cateto1 = 0;
        cateto2 = 0;
    }
    
    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    // GETTER Y SETTER

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }


    // TO STRING
    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + '}';
    }
    
    
}
