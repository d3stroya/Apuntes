package tema7;

/**
 *
 * @author anabel
 */
public class Bicicleta implements Comparable<Bicicleta> {
    // ATRIBUTOS
    private String color;
    private int platos;
    private int marchas;
    
    // CONSTRUCTORES
    public Bicicleta() {
        this.color = "";
        this.platos = 0;
        this.marchas = 0;
    }

    public Bicicleta(String color, int platos, int marchas) {
        this.color = color;
        this.platos = platos;
        this.marchas = marchas;
    }
    
    // GETTER Y SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
    
    // MÉTODOS
    /**
     * Método que ordena las bicicletas de mayor a menor según el número de platos
     * @param bici
     * @return un 1 si bici es mayor, un -1 si es menor y 0 si es igual
     */
    @Override
    public int compareTo(Bicicleta bici) {
        if(bici.getPlatos() < this.platos) {
            return 1;
        } else if(bici.getPlatos() > this.platos) {
            return -1;
        } else {
            return 0;
        }
    }   
    
    // TO STRING
    @Override
    public String toString() {
        return "Bicicleta{" + "color=" + color + ", platos=" + platos + ", marchas=" + marchas + '}';
    }
    
}
