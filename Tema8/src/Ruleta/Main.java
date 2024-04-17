package Ruleta;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author anabel
 */
public class Main {
    public static int tirarDeLaRuleta(Ruleta ruleta, Jugador jugador) {
        int[] gajos = {0, 0, 0, 25, 50, 50, 50, 75, 75, 100, 100, 200, 1000};
        System.out.println("La ruleta está girando...");
        int gajo = (int)Math.floor(Math.random() * gajos.length);
        System.out.println("Has caído en el gajo de " + gajos[gajo] + "€");
        jugador.setPuntuacion(jugador.getPuntuacion() + gajos[gajo]);
        System.out.println("MARCADOR: " + jugador.getPuntuacion());
        
        return gajos[gajo];
    }
    
    
    
    public static void main(String[] args) {
        Ruleta ruleta = new Ruleta();
        Panel panel = new Panel("Bizcocho");
        
        
        Jugador jugador1 = new Jugador("Jugador 1", 0);
        Jugador jugador2 = new Jugador("Jugador 2", 0);
        
        String palabraSecreta = panel.getPalabraSecreta();
        char[] aPalabraSecreta = palabraSecreta.toCharArray();
        String palabraOcultada = panel.ocultarPalabra(palabraSecreta);
        char[] aPalabraOcultada = palabraOcultada.toCharArray();
        boolean turnoActivo = true;
                
        System.out.println("PANEL");
        System.out.println(panel.ocultarPalabra(panel.getPalabraSecreta()));

        while(turnoActivo && Arrays.toString(aPalabraOcultada).indexOf('*') != -1){
            System.out.println("Es el turno de " + jugador1.getNombre());
            do {
                int gajo = tirarDeLaRuleta(ruleta, jugador1);
                if(gajo == 0) {
                    System.out.println("Has caído en quiebra");
                    turnoActivo = false;
                }
                turnoActivo = jugarTurno(panel, palabraSecreta, turnoActivo, aPalabraSecreta, aPalabraOcultada);        
            } while(turnoActivo && Arrays.toString(aPalabraOcultada).indexOf('*') != -1);

            turnoActivo = true;
            System.out.println("Es el turno de " + jugador2.getNombre());
            do {
                int gajo = tirarDeLaRuleta(ruleta, jugador2);
                if(gajo == 0) {
                    turnoActivo = false;
                }
                turnoActivo = jugarTurno(panel, palabraSecreta, turnoActivo, aPalabraSecreta, aPalabraOcultada);        
            } while(turnoActivo && Arrays.toString(aPalabraOcultada).indexOf('*') != -1);
        }
        
    }

    private static boolean jugarTurno(Panel panel, String palabraSecreta, boolean turnoActivo, char[] aPalabraSecreta, char[] aPalabraOcultada) {
        char caracter = panel.decirLetra();
        if(caracter == '1') {
            Scanner entrada = new Scanner(System.in);
            System.out.println("De acuerdo: resolvemos.  Escribe tu respuesta:");
            String respuesta = entrada.nextLine();
            
            if(respuesta.equalsIgnoreCase(panel.getPalabraSecreta())) {
                System.out.println("¡¡Es correcto!!");
                turnoActivo = false;
            }
        } else if(palabraSecreta.indexOf(caracter) == -1) {
            System.out.println("Esa letra no está en el panel.");
            System.out.println("Pierdes el turno.");
            turnoActivo = false;
        } else {
            for(int i = 0; i < palabraSecreta.length(); i++) {
                if(aPalabraSecreta[i] == caracter) {
                    aPalabraOcultada[i] = caracter;
                }
            }
            System.out.println(aPalabraOcultada);
        }
        return turnoActivo;
    }
    
}
