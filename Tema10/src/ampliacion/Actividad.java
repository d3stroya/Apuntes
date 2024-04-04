package ampliacion;

public class Actividad {
    // ATRIBUTOS
    private String nombre;
    private String tipo;
    private boolean enFamilia;

    // CONSTRUCTORES
    public Actividad() {
        this.nombre = "";
        this.tipo = "";
        this.enFamilia = false;
    }
    public Actividad(String nombre, String tipo, boolean enFamilia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.enFamilia = enFamilia;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEnFamilia() {
        return enFamilia;
    }

    public void setEnFamilia(boolean enFamilia) {
        this.enFamilia = enFamilia;
    }

    // MOSTRAR
    public void mostrar() {
        String tp = enFamilia ? "SÍ recomendada para toda la familia" : "NO recomendada para toda la familia";
        System.out.println(
                "Nombre: " + nombre + '\n' +
                "Tipo: " + tipo + '\n' +
                tp
        );
    }
}
