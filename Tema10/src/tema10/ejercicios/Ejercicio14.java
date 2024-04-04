
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static void introducirAlumno(ArrayList<AlumnoEj14> lAlumnos) {
        System.out.println("Agregando alumno...");
        AlumnoEj14 alumno = new AlumnoEj14(pedirNombre());
        lAlumnos.add(alumno);
    }
    
    public static void mostrarAlumnos(ArrayList<AlumnoEj14> lAlumnos) {
        lAlumnos.forEach(System.out::println);
    }
    
    public static void mostrarAlumnoMejorMedia(ArrayList<AlumnoEj14> lAlumnos) {
        float media = 0;
        AlumnoEj14 alumno = lAlumnos.get(0);
        
        for(AlumnoEj14 a : lAlumnos) {
            if(a.calcularMedia() > media) {
                alumno = a;
                media = alumno.calcularMedia();
            }
        }
        System.out.println(alumno);
    }
    
    public static void mostrarAsignaturaMasDificil(ArrayList<AlumnoEj14> lAlumnos) {
        ArrayList<AlumnoEj14> filas = lAlumnos;
        AsignaturaEj14[] columnas = lAlumnos.get(0).getaAsignaturas();
        AsignaturaEj14 masDificil = columnas[0];
        float suma = 0, media = 10; 
        
        // Recorremos las columnas
        for(int j = 0; j < filas.size(); j++) {
            AsignaturaEj14 asignatura = columnas[j];
            
            // Recorremos las filas de cada columna
            for(int i = 0; i < columnas.length; i++) {
                AlumnoEj14 alumno = filas.get(i);
                AsignaturaEj14 alumnoAsignatura = alumno.getaAsignaturas()[i];
                
                // Accedemos a la nota de la asignatura y la sumamos
                suma += alumnoAsignatura.getNota();
            }
            
            // Calculamos la media y, si es menor que la actual, la guardamos
            if((suma / filas.size()) < media) {
                media = suma / filas.size();
                masDificil = columnas[j];
            }
        }
        
        System.out.println(masDificil);
    }
    
    public static void mostrarMenu() {
        ArrayList<AlumnoEj14> lAlumnos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENU -");
            System.out.println("1. Introducir un nuevo alumno junto a sus notas.");
            System.out.println("2. Mostrar los alumnos con sus notas");
            System.out.println("3. Alumno con nota media más alta");
            System.out.println("4. Asignatura con nota media más baja");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1 :
                    introducirAlumno(lAlumnos);
                    break;
                case 2:
                    mostrarAlumnos(lAlumnos);
                    break;
                case 3:
                    mostrarAlumnoMejorMedia(lAlumnos);
                    break;
                case 4:
                    mostrarAsignaturaMasDificil(lAlumnos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
            }
            
        } while(opcion != 5);
    }
}

final class AlumnoEj14 {
    // ATRIBUTOS
    private final String[] NOMBRES_ASIGNATURA = {"Lengua", "Mates", "Física"};
    private String nombre;
    private AsignaturaEj14[] aAsignaturas;

    // CONSTRUCTORES
    public AlumnoEj14() {
        this.nombre = "";
        this.aAsignaturas = new AsignaturaEj14[3];
    }
    // Creo un constructor que pide el nombre 
    // del alumno, rellena los nombres de las asignaturas
    // y pide la nota de cada asignatura
    public AlumnoEj14(String nombre) {
        this.nombre = nombre;
        this.aAsignaturas = new AsignaturaEj14[3];
        
        for(int i = 0; i < aAsignaturas.length; i++) {            
            aAsignaturas[i] = new AsignaturaEj14();
            aAsignaturas[i].setNombre(NOMBRES_ASIGNATURA[i]);
            System.out.println(NOMBRES_ASIGNATURA[i]);
            aAsignaturas[i].setNota(pedirNota());
            
        }
    }    
    
    public AlumnoEj14(String nombre, AsignaturaEj14[] aAsignaturas) {
        this.nombre = nombre;
        this.aAsignaturas = aAsignaturas;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AsignaturaEj14[] getaAsignaturas() {
        return aAsignaturas;
    }

    public void setaAsignaturas(AsignaturaEj14[] aAsignaturas) {
        this.aAsignaturas = aAsignaturas;
    }
    
    // MÉTODOS  
    public float pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota: ");
        return entrada.nextFloat();
    }
    
    public float calcularMedia() {
        float suma = 0;
        for(int i = 0; i < aAsignaturas.length; i++) {
            suma += aAsignaturas[i].getNota();
        }
        return suma / aAsignaturas.length;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return nombre.toUpperCase() + "\n" + Arrays.toString(aAsignaturas) + " - Media: " + calcularMedia();
    }        
}

class AsignaturaEj14 {
    // ATRIBUTOS
    private String nombre;
    private float nota;

    // CONSTRUCTORES
    public AsignaturaEj14() {
        this.nombre = "";
        this.nota = 0;
    }
    
    public AsignaturaEj14(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }    

    // TO STRING
    @Override
    public String toString() {
        return " · " + nombre + " - " + nota + "\n";
    }
    
    
}