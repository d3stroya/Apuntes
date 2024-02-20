package tema7;

/**
 *
 * @author anabel
 */
public class Pelicula {
    public static final int AFORO = 4;
    private String titulo;
    private double costeLicencia;
    private Socio[] aSocios;

    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0;
        this.aSocios = new Socio[AFORO];
    }
   
    public Pelicula(String titulo, double costeLicencia, Socio[] aSocios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.aSocios = aSocios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socio[] getaSocios() {
        return aSocios;
    }

    public void setaSocios(Socio[] aSocios) {
        this.aSocios = aSocios;
    }
    
    public void mostrarSocios() {
        for(Socio socio : aSocios) {
            System.out.println(socio);
        }
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", costeLicencia=" + costeLicencia + ", aSocios=" + aSocios + '}';
    }
    
    
}
