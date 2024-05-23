/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicios;

/**
 *
 * @author anabel
 */
public class Enunciado {
    // ATRIBUTOS
    private String pregunta;
    private String respuesta;
    
    // CONSTRUCTORES
    public Enunciado() {
        this.pregunta = "";
        this.respuesta = "";
    }

    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    // GETTER Y SETTER
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Enunciado{" + "pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    }
    
}
