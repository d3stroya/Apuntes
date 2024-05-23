
package tema5.ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // EJERCICIO 1
//        Coche miCoche = new Coche();
//        Coche cochePadre = new Coche();
//        
//        miCoche.setMarca("Volkswagen");
//        miCoche.setModelo("Polo");
//        miCoche.setColor("Rojo");
//        
//        cochePadre.setMarca("Renault");
//        cochePadre.setModelo("Clio");
//        cochePadre.setColor("Negro");
//        
//        miCoche.arrancarCoche();
//        cochePadre.arrancarCoche();
//        
//        for(int i = 0; i < 5; i++) {
//            miCoche.acelerarCoche();
//        }
//        
//        miCoche.frenarCoche();
//        miCoche.frenarCoche();
//        
//        for(int i = 0; i < 2; i++) {
//            cochePadre.acelerarCoche();
//        }
//        
//        cochePadre.apagarCoche();
//        
//        miCoche.obtenerEstado();
//        cochePadre.obtenerEstado();  
//        
//        
//        // EJERCICIO 2
//        Curso curso1 = new Curso();
//        Curso curso2 = new Curso();
//
//        curso1.establecerNombreyHoras("DAW", 224);
//        curso2.establecerNombreyHoras("DAM", 224);
//        System.out.println("Curso: " + curso1.obtenerNombre() + " | Horas: " + curso1.obtenerHoras());
//        System.out.println("Curso: " + curso2.obtenerNombre() + " | Horas: " + curso2.obtenerHoras());
//        System.out.println("Número de cursos: " + Curso.verNumeroCursos());
//        
//        // EJERCICIO 3
//        Rueda rueda1 = new Rueda();
//        Rueda rueda2 = new Rueda();
//        
//        rueda1.establecerMaterial("aluminio");
//        rueda1.establecerPulgadas(25);
//        rueda2.establecerMaterial("oro");
//        rueda2.establecerPulgadas(34);
//        
//        System.out.println("Material de la rueda 1: " + rueda1.obtenerMaterial());
//        System.out.println("Pulgadas de la rueda 1: " + rueda1.obtenerPulgadas());       
//        System.out.println("Material de la rueda 2: " + rueda2.obtenerMaterial());
//        System.out.println("Pulgadas de la rueda 2: " + rueda2.obtenerPulgadas());
//        
//        CocheEj3 coche1 = new CocheEj3();
//        CocheEj3 coche2 = new CocheEj3();
//        CocheEj3 coche3 = new CocheEj3();
//        
//        coche1.establecerMarca("Ferrari");
//        coche2.establecerMarca("Bugatti");
//        coche3.establecerMarca("Porsche");        
//        coche1.establecerModelo("Spider");
//        coche2.establecerModelo("Type 29");
//        coche3.establecerModelo("911");
//        
//        coche1.establecerRueda(rueda1);
//        coche2.establecerRueda(rueda1);
//        coche3.establecerRueda(rueda2);
//        
//        System.out.println(coche1.obtenerMarca() 
//                + " " + coche1.obtenerModelo() + " " 
//                + coche1.obtenerRueda().obtenerMaterial() + " " 
//                + coche1.obtenerRueda().obtenerPulgadas()
//        );
//        System.out.println(coche2.obtenerMarca() 
//                + " " + coche2.obtenerModelo() + " " 
//                + coche2.obtenerRueda().obtenerMaterial() + " " 
//                + coche2.obtenerRueda().obtenerPulgadas()
//        );
//        System.out.println(coche3.obtenerMarca() + " " 
//                + coche3.obtenerModelo() + " " 
//                + coche3.obtenerRueda().obtenerMaterial() + " " 
//                + coche3.obtenerRueda().obtenerPulgadas()
//        );
//        
//        // EJERCICIO 5

        // 1. Opción válida
//        // Creo los objetos pasando el nombre por parámetro
//        Asignatura programacion = new Asignatura("Programación");
//        Asignatura lenguajeDeMarcas = new Asignatura("Lenguaje de Marcas");
//        Asignatura basesDeDatos = new Asignatura("Bases de Datos:");
//        Asignatura entornosDeDesarrollo = new Asignatura("Entornos de Desarrollo");
//        Asignatura sistemasInformáticos = new Asignatura("Sistemas Informáticos");
//        Asignatura fol = new Asignatura("Formación y Orientación Laboral");
//        
//        //Esto también es un objeto
//        Scanner entrada = new Scanner(System.in);
//        
//        // Pido la nota y se la asigno al atributo de cada asignatura con su setter
//        System.out.print("Por favor, introduzca la nota de Programación: ");
//        pideNota(programacion, entrada.nextDouble());
//        
//        System.out.print("Por favor, introduzca la nota de Lenguaje de Marcas: ");
//        pideNota(lenguajeDeMarcas, entrada.nextDouble());
//        
//        System.out.print("Por favor, introduzca la nota de Bases de Datos: ");
//        pideNota(basesDeDatos, entrada.nextDouble());
//        
//        System.out.print("Por favor, introduzca la nota de Entornos de Desarrollo: ");
//        pideNota(entornosDeDesarrollo, entrada.nextDouble());
//        
//        System.out.print("Por favor, introduzca la nota de Sistemas Informáticos: ");
//        pideNota(sistemasInformáticos, entrada.nextDouble());
//        
//        System.out.print("Por favor, introduzca la nota de Formación y Orientación Laboral: ");
//        pideNota(fol, entrada.nextDouble());

        // 2. Opción optimizada
//        double notaMedia = Asignatura.notaMedia(
//                pideNota("Programacion").getNota(),
//                pideNota("Lenguaje de Marcas").getNota(),
//                pideNota("Bases de Datos").getNota(),
//                pideNota("Entornos de Desarrollo").getNota(),
//                pideNota("Sistemas Informáticos").getNota(),
//                pideNota("Formación y Orientación Laboral").getNota()
//        );
//
//        
//        // Imprimo el resultado
//        System.out.println("Tu nota media es: " + Math.floor(notaMedia));        
     
        
        // EJERCICIO 6
//        Descarga descarga1 = new Descarga(
//                "30_coins_s02", 
//                600.23, 
//                40.5
//        );
//       
//        Descarga descarga2 = new Descarga(
//                "30_coins_s01",
//                593.2,
//                40.5
//        );
//        
//        muestraNombreyTiempo(descarga1.getNombreDescarga(), 
//                descarga1.getTamañoDescarga(), 
//                descarga1.getVelocidadDescarga());
//        
//        muestraNombreyTiempo(descarga2.getNombreDescarga(), 
//                descarga2.getTamañoDescarga(), 
//                descarga2.getVelocidadDescarga());
//        

        // EJERCICIO 7
//        int opcion;
//        
//        do {
//            Scanner entrada = new Scanner(System.in);
//            
//            System.out.print("Nombre del archivo: ");
//            String nombre = entrada.nextLine();
//            
//            System.out.print("Tamaño del archivo: ");
//            double tamaño = entrada.nextDouble();
//            
//            System.out.print("Velocidad de descarga (en MB): ");
//            double velocidad = entrada.nextDouble();
//            
//            Descarga descarga = new Descarga(nombre, tamaño, velocidad);            
//            System.out.println(descarga.toString());
//            System.out.println(muestraNombreyTiempo(descarga));
//            System.out.println();
//            
//            System.out.println("¿Quieres crear otro objeto?");
//            System.out.println("1. Sí");
//            System.out.println("2. No");
//            opcion = entrada.nextInt();
//        } while(opcion != 2);
        
//        // EJERCICIO 8
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Escribe un número y te diré si es para o impar ");
//        
//        Numero numero = new Numero(entrada.nextInt());
//        System.out.println(esPar(numero.getNumero()));

        // EJERCICIO 9
//        int numero1 = creaNumero().getNumero();
//        int numero2 = creaNumero().getNumero();
//        int numero3 = creaNumero().getNumero();
//        
//        int numeroMayor = muestraElMayor(numero1, numero2, numero3);
//        System.out.println("El número mayor es: " + numeroMayor);
        
        // EJERCICIO 10
//        int numero1 = creaNumero().getNumero();
//        int numero2 = creaNumero().getNumero();
//        int numero3 = creaNumero().getNumero();
//        int numero4 = creaNumero().getNumero();
//        
//        ordenCreciente(numero1, numero2, numero3, numero4);

        // EJERCICIO 11
//        int numero1 = creaNumero().getNumero();
//        int numero2 = creaNumero().getNumero();
//        
//        int resultado;
//        String operacion;
//        if(numero1 > 10) {
//            resultado = numero1 * numero2;
//            operacion = "multiplicación";
//        } else {
//            resultado = numero1 + numero2;
//            operacion = "suma";
//        }
//        System.out.println("La operación es " + operacion + " y el resultado es " + resultado);

        // EJERCICIO 12
//        Triangulo triangulo = creaTriangulo();
//        double hipotenusa = calculaHipotenusa(triangulo);
//        muestraResultado(triangulo, hipotenusa);

        // EJERCICIO 13
        //saluda(5);

        // EJERCICIO 14
//        Numero numero = asignaNumero(pideNumero());
//        imprimeTablaMultiplicar(numero.getNumero());

        // EJERCICIO 15
//        Direccion direccion1 = new Direccion("Av. París", 2, "3A", "Plasencia");
//        Direccion direccion2 = new Direccion("Av. España", 3, "1B", "Plasencia");
//        Direccion direccion3 = new Direccion("Av. Austria", 4, "5C", "Plasencia");
//    
//        Empleado empleado1 = new Empleado("Celia", 2439.68, direccion1);
//        Empleado empleado2 = new Empleado("Mario", 2139.23, direccion2);
//        Empleado empleado3 = new Empleado("María", 2942.61, direccion3);
//        
//        System.out.println("\nEMPLEADO 1\n" + empleado1.toString());
//        System.out.println("\nEMPLEADO 2\n" + empleado2.toString());
//        System.out.println("\nEMPLEADO 3\n" + empleado3.toString());

        // EJERCICIO 16
        //imprimeNota(pideNombreyNota().getNota());
        
        // EJERCICIO 17
//        Enunciado enunciado1 = new Enunciado("¿Cuál es el tipo de dato que puede tomar los valores true o false?", "boolean");
//        Enunciado enunciado2 = new Enunciado("¿Qué símbolos usamos para escribir cadenas de caracteres?", "Comillas dobles");
//        Enunciado enunciado3 = new Enunciado("¿Qué símbolos usamos para escribir un caracter?", "Comillas simples");
//        Enunciado enunciado4 = new Enunciado("¿Cómo se llama el paradigma que trabaja con objetos?", "Programación orientada a objetos");
//
//        double nota = 0;
//        if(preguntar(enunciado1))
//            nota += 2.5;
//        
//        if(preguntar(enunciado2))
//            nota += 2.5;
//        
//        if(preguntar(enunciado3))
//            nota += 2.5;
//        
//        if(preguntar(enunciado4))
//            nota += 2.5;
//  
//        System.out.println("Calificación final: " + nota);

        // EJERCICIO 18
//        int numero = pedirNumero();
//        Numero n1 = new Numero(numero);
//        
//        numero = pedirNumero();
//        Numero n2 = new Numero(numero);
//        
//        realizarOperacion(n1, n2);            
//     
        
        
        
        // *** Recursividad ***
        
        // EJERCICIO 31
        //escribeHola(5);
        
        // EJERCICIO 32
        //System.out.println(suma(4, 3));
        
        // EJERCICIO 33
        //System.out.println(sumaSucesiva(5));
        
        // EJERCICIO 34
        //System.out.println(invertir(125));
        
    }
    
// *** Final del main ***
    
    
    
    
    
    
    
    
    
    
    
      // EJERCICIO 5
//    public static Asignatura pideNota(String nombre) {
//        Scanner entrada = new Scanner(System.in);
//        Asignatura asignatura = new Asignatura(nombre);
//        System.out.println("Por favor, introduzca la nota de " + asignatura.getNombre());
//        asignatura.setNota(entrada.nextDouble());
//        return asignatura;
//    }
      
    
//    
//    // EJERCICIO 6
//    public static void muestraNombreyTiempo(String nombre, double tamaño, double tiempo) {
//        double tiempoDescarga = (tamaño * 8) / tiempo;
//        System.out.println("Nombre del archivo: " + nombre);
//        System.out.println("Tiempo estimado de descarga: " + Math.floor(tiempoDescarga) + " segundos");
//    }
        
        // EJERCICIO 7
//        public static String muestraNombreyTiempo(Descarga descarga) { 
//            System.out.println("");
//            System.out.println("*****************************");
//            System.out.println("Calculando tiempo de descarga....");
//            double tiempo = (descarga.getTamañoDescarga() * 8 ) / descarga.getVelocidadDescarga();
//            
//            return "Nombre de la descarga: " + descarga.getNombreDescarga() +
//                    "\nTiempo estimado: " + Math.floor(tiempo) + " segundos.";
//        }
    
    // EJERCICIO 8
//    public static String esPar(int valor) {
//        if(valor % 2 == 0) {
//            return valor + " es par";
//        } else {
//            return valor + " es impar";
//        }
//    }
    
    
    // EJERCICIO 9 (Y 10 Y 11)
//    public static Numero creaNumero() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Escribe número: ");       
//        Numero numero = new Numero(entrada.nextInt()); 
//        return numero;
//    }
    
//    public static int muestraElMayor(int numero1, int numero2, int numero3) {
//        if(numero1 > numero2 && numero1 > numero3) {
//            return numero1;
//        } else if(numero2 > numero1 && numero2 > numero3) {
//            return numero2;
//        } else {
//            return numero3;
//        }
//    }
    
    // EJERCICIO 10
//    public static void ordenCreciente(int numero1, int numero2, int numero3, int numero4) {
//        // Aplicamos el método de la burbuja
//        for(int i = 0; i < 3; i++) {
//            int aux;
//            if(numero1 > numero2) {
//                aux = numero2;
//                numero2 = numero1;
//                numero1 = aux;
//            }
//            
//            if(numero2 > numero3) {
//                aux = numero3;
//                numero3 = numero2;
//                numero2 = aux;
//            }
//            
//            if(numero3 > numero4) {
//                aux = numero4;
//                numero4 = numero3;
//                numero3 = aux;
//            }
//        }
//        
//        System.out.println("Tus números ordenados de menor a mayor son: " + 
//                numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4);
//    }
    
    // EJERCICIO 11
//    public static int sumar(int numero1, int numero2) {
//        return numero1 + numero2;
//    }    
//    
//    public static int multiplicar(int numero1, int numero2) {
//        return numero1 * numero2;
//    }
    
    // EJERCICIO 12
//    public static Triangulo creaTriangulo() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Escribe el tamaño del cateto 1: ");
//        double cateto1 = entrada.nextDouble();
//        
//        System.out.print("Escribe el tamaño del cateto 2: ");
//        double cateto2 = entrada.nextDouble(); 
//        
//        Triangulo triangulo = new Triangulo(cateto1, cateto2);       
//        return triangulo;
//    }
//    
//    public static double calculaHipotenusa(Triangulo triangulo) {
//        double hipotenusa = Math.sqrt(
//                Math.pow(triangulo.getCateto1(), 2) + 
//                Math.pow(triangulo.getCateto2(), 2)
//        );
//        return hipotenusa;
//    }
//    
//    public static void muestraResultado(Triangulo triangulo, double hipotenusa) {
//        System.out.println("Resultado:");
//        System.out.println("Cateto 1: " + triangulo.getCateto1());
//        System.out.println("Cateto 2: " + triangulo.getCateto2());
//        System.out.println("Hipotenusa: " + hipotenusa);
//    }
    
    // EJERCICIO 13
//    public static void saluda(int veces) {
//        Saludo saludo = new Saludo("Hola qué tal");
//        for(int i = 0; i < veces; i++) {
//            System.out.println(saludo.getFrase());
//        }
//    }
//    
    // EJERCICIO 14
//    public static int pideNumero() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Escribe un número: ");
//        return entrada.nextInt();
//    }
//    
//    public static Numero asignaNumero(int valor) {
//        Numero numero = new Numero(valor);
//        return numero;
//    }
//    
//    public static void imprimeTablaMultiplicar(int numero) {
//        for(int i = 0; i <= 10; i++) {
//            System.out.println(numero + " x " + i + " = " + numero * i);
//        }
//    }
    
    
    // EJERCICIO 16
//    public static Alumno pideNombreyNota() {
//        Alumno alumno = new Alumno();
//        double nota = 0;
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.print("Escribe el nombre del alumno: ");
//        alumno.setNombre(entrada.nextLine());
//        
//        do {
//            System.out.print("¿Cuál es su nota? ");
//            nota = entrada.nextDouble();
//            if(nota < 0 || nota > 10) {
//                System.out.println("Error. Por favor, introduzca un valor entre 0 y 10.");  
//            } else {
//                alumno.setNota(nota);                
//            }
//        } while(nota < 0 || nota > 10);
//
//        
//        return alumno;
//    }
//    
//    public static void imprimeNota(double nota) {
//        if(nota < 5) {
//            System.out.println("Suspenso");
//        } else if(nota > 4 && nota < 7) {
//            System.out.println("Bien");
//        } else if(nota > 6 && nota < 9) {
//            System.out.println("Notable");
//        } else {
//            System.out.println("Sobresaliente");
//        }
//    }
    
    // EJERCICIO 17
//    public static boolean preguntar(Enunciado enunciado) {
//        String respuesta;
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.println(enunciado.getPregunta());
//        respuesta = entrada.nextLine();
//        
//        return respuesta.equalsIgnoreCase(enunciado.getRespuesta());
//    }
    
    // EJERCICIO 18
//    public static int pedirNumero() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Escribe un número: ");
//        return entrada.nextInt();
//    }
//    
//    public static void realizarOperacion(Numero n1, Numero n2) {
//        Scanner entrada = new Scanner(System.in);
//        int opcion = 0;
//        do {
//            System.out.println("1.- Sumar los números.");
//            System.out.println("2.- Restar los números.");
//            System.out.println("3.- Multiplicar los números.");
//            System.out.println("4.- Dividir los números.");
//            System.out.println("5.- Salir del programa.");
//            opcion = entrada.nextInt();
//            
//            try {
//                switch (opcion) {
//                    case 1:
//                        System.out.println("Suma: " + (n1.getNumero() + n2.getNumero()));
//                        break;
//                    case 2:
//                        System.out.println("Resta: " + (n1.getNumero() - n2.getNumero()));
//                        break;
//                    case 3:
//                        System.out.println("Multiplicación: " + (n1.getNumero() * n2.getNumero()));
//                        break;
//                    case 4:
//                        System.out.println("División: " + (n1.getNumero() / n2.getNumero()));
//                        break;
//                    case 5:
//                        break;
//                }
//            } catch(ArithmeticException e) {
//                System.out.println("Operación inválida");
//                e.printStackTrace();
//                opcion = 5;
//              
//            }            
//        } while(opcion != 5);
//        
//        
//    }
    


    
    // EJERCICIO 31
//    public static void escribeHola(int veces) {
//        if(veces == 0) {
//            return;
//        }
//        System.out.println("Hola");
//        escribeHola(veces - 1);
//    }
    
    // EJERCICIO 32
//    public static int suma(int a, int b) {
//        if(b == 0) {
//            return a;
//        }
//        return 1 + suma(a, b - 1);
//    }
    
    // EJERCICIO 33
//    public static int sumaSucesiva(int n) {
//        if(n == 0) {
//            return n;
//        } else {
//          return n + sumaSucesiva(n - 1);
//            }
//    }
    
    // EJERCICIO 34
//    public static String invertir(int numero) {
//        if(numero < 10) {
//            return "" + numero;
//        } else {        
//            // Divido entre 10 y me quedo con el reto (unidad) para imprimirlo primero
//            // y luego divido entre 10 para quedarme con el resto de cifras (como es un entero,
//            // obviamos la parte decimal.
//            int unidad = numero % 10;
//            return (unidad) + invertir(numero / 10);
//            
//        }
//    }
    
}
