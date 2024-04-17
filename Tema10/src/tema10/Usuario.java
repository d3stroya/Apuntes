package tema10;

public class Usuario {
    private static int ID;
    private String nombre;
    private String foto;
    private int edad;

    public Usuario() {
        this.ID = generarId();
        this.nombre = "";
        this.foto = "";
        this.edad = 0;
    }
    public Usuario(String nombre, String foto, int edad) {
        this.ID = generarId();
        this.nombre = nombre;
        this.foto = foto;
        this.edad = edad;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static int generarId() {
        return (int) (Math.random() * 5000);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", foto=" + foto + ", edad=" + edad + '}';
    }    
}
