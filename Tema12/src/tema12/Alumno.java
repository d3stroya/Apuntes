package tema12;

/**
 *
 * @author d3stroya
 */
public class Alumno implements Comparable<Alumno> {
    private String dni;
    private int numExpediente;
    private float media;

    public Alumno() {
        this.dni = "";
        this.numExpediente = 0;
        this.media = 0f;
    }
    
    public Alumno(String dni, int numExpediente, float media) {
        this.dni = dni;
        this.numExpediente = numExpediente;
        this.media = media;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    @Override
    public int compareTo(Alumno a) {
        if(a.numExpediente > numExpediente) {
            return -1;
        } else if(a.numExpediente < numExpediente) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Nº expediente: " + numExpediente + " - DNI: " + dni + " - Nota media: " + media;
    }        
}
