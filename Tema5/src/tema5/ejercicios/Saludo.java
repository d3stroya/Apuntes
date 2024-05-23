package tema5.ejercicios;

public class Saludo {
    // ATRIBUTOS
    private String frase;
    
    // CONSTRUCTORES
    public Saludo() {
        frase = "";
    }
    
    public Saludo(String frase) {
        this.frase = frase;
    }
    
    // GETTER Y SETTER
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
}
