# Strings

Los strings son cadenas de caracteres.

Se representan entre comillas dobles ("").

Forman objetos y, por ello, son inmutables. 

```
String saludo = "hola";
saludo.concat(saludo + " , ¿qué tal?");
System.out.println(saludo); // hola
```
Esto significa que si queremos mantener el resultado, debemos guardarlo en una variable, ya sea
la misma o una nueva.

```
String saludo = "hola";
saludo = saludo.concat(saludo + " , ¿qué tal?");
System.out.println(saludo); // hola, ¿qué tal?
```

Si queremos crear un string, debemos instanciar un objeto de la clase String.

```
String str = "abc"
```

Podemos imprimir pantalla los mensajes que queramos formando string concatenados:
```
String nombre = "Franky";
System.out.printl("Hola, " + nombre + ", ¿qué tal?");
```

Si creamos un objeto nulo, recibiremos la excepción NullPointerException:
```
String nulo = null;
String cadenaNula = new String(nulo);
System.out.println(cadenaNula);
```

Al ser una cadena de caracteres, podemos representar su valor en código ASCII
````
for(int i = 0; i < saludo.length(); i++) {
    char[] aSaludo = saludo.toCharArray();
    int caracterActual = (int)aSaludo[i];
    System.out.println(caracterActual);
}
````

Cada caracter tiene una posición, al igual que en los arreglos. 
La primera letra está en la posición 0.
La segunda, en la posición 1, y así sucesivamente.

La última letra está en la posición cadena.length() - 1.
La razón es que la longitud se empeiza a contar desde 1,
mientras que las posiciones se cuentan desde 0.

"hola" tiene una longitud de 4, pero su última letra está en la posición 3.

## Instanciación de strings

La forma habitual de crear una cadena de caracteres
es:

````
// Forma 1
String cadena = "Esto es una cadena";
````

Aunque también la podemos crear de otras formas:
````
// Froma 2
String cadena1 = new String("Esto es una cadena");

// Forma 3
char[] cadena2 = {'S', 't', 'r', 'i', 'n', 'g'};
String cadena3 = new String(cadena2);
````

## Métodos de la clase String

### Comprar si dos cadenas son iguales
#### equals() y equalsIgnoreCase() 
Comparan si los dos objetos son iguales.
Devuelve true si son iguales y false si no lo son.

equals() no distingue entre mayúsculas y minúsculas.
equalsIgnoreCase() sí lo hace.
```
String cadena1 = "Mañana";
String cadena2 = "Tarde";
System.out.println(cadena1.equalsIgnoreCase(cadena2)); // false
```

#### compareTo() 
Hace una comparación lexicográfica.
Delvuelve un valor numérico que resulta de restar 
el argumento (cadena2, que pasamos por parámetro) 
al objeto (cadena1).

* Si cadena1 es mayor, el resultado es positivo
* Si cadena1 es menor, el resultado es negativo
* Si cadena1 es igual a cadena2, el resultado es 0

```
String cadena1 = "abc";
String cadena2 = "def";
System.out.println(cadena1.compareTo(cadena2)); // -3

// Lo que el método está haciendo es:
System.out.println(cadena1.charAt(0) - cadena2.charAt(0));

// Es ASCII lo podemos ver más claro
System.out.print((int)cadena1.charAt(0));
System.out.print(" - ");
System.out.print((int)cadena2.charAt(0));
System.out.print(" = ");

```

### Convertir a string algo que no lo es
valueOf([tipo_de_dato]);

```
float pi = 3.14159f;
System.out.println("Antes de usar valueOf, valorPi es de tipo " + 
        ((Object)pi).getClass().getSimpleName()); // Antes de usar valueOf, valorPi es de tipo Float
        
String valorPi = String.valueOf(pi);
System.out.println("Después de usar valueOf, valorPi es de tipo " + 
        valorPi.getClass().getSimpleName() + 
        " y tiene el valor " + valorPi); // Después de usar valueOf, valorPi es de tipo String y tiene el valor 3.14159
```

### Obtener la longitud de una cadena

Es un método muy utilizado, por ejemplo, 
para acceder al último elemento del string
y, sobre todo, para recorrerlo.
```
for (int i = 0; i < saludo.length(); i++) {
    System.out.print(saludo.toCharArray()[i]);
}
```

### Concatenar cadenas
```
cadena1 = cadena1.concat(cadena2); 
System.out.println(cadena1); // MañanaTarde

// También podemos utilizar varios concat
System.out.println(saludo.concat(" ").concat(saludo));

```

### Obtener el caracter que se encuentra en una posición específica

charAt(indice) nos da el caracter en el indice.
```
System.out.println("La letra en la posición 1 de la cadena1 es " + cadena1.charAt(1));

```

### Obtener la posición en la que se encuentra un caracter

indexOf(caracter) nos da la primera posición que encuentra del caracter indicado por parámetro.

Para encontrar el primer caracter a partir de un índice, usamos indexOf(caracter, posicionDesdeLaQueBuscar).

Para encontrar la posición del último caracter, usamos lastIndexOf(caracter).

También permite buscar a partir de un índice, de la misma forma: lastIndexOf(caracter, indice).

[·] Ambos métodos aplican la sobrecarga de métodos

Si la cadena no contiene el caracter indicado, el método devuelve un -1.
```
System.out.println("La primera a está en la posición " + manana.indexOf('a'));
System.out.println("La primera a desde la posición 2 está en " + manana.indexOf('a', 2));
System.out.println("La última a está en la posición " + manana.lastIndexOf('a'));
System.out.println(manana.indexOf('l'));
```

### Obtener una subcadena a partir de una cadena

El método substring nos permite indicad un índice de inicio y otro de fin
para formar una cadena que va desde el primer índice (incluido) hasta el último (sin incluir).

También podemos indicar solamente el índice desde el que extraer. Por defecto
extrae hasta el final de la cadena.

[·] Aplica la sobrecarga de métodos

```
System.out.println(saludo.substring(1)); // ola
System.out.println(saludo.substring(1, 3)); // ol
```

### Saber si una cadena empieza o termina por el substring indicado.
Devuelve true si empieza o termina por el substring indicado y false si no lo hace.

```
System.out.println(cadena1.startsWith("a")); // true
System.out.println(cadena1.endsWith("a")); // false
```

### Reemplazar un caracter por otro

replace nos permite reemplazar el caracter indicado en el primer parámetro,
 en todas sus apariciones, por otro caracter que indiquemos como segundo parámetro.

Devuelve el nuevo string con las letras reemplazadas.

```
String saludo = "Hola qué tal";
System.out.println(saludo.replace(" ","-")); // Hola-qué-tal
```

Si queremos reemplazar strings, debemos usar replaceAll, que, además, permite utilizar expresiones regulares.
```
System.out.println(cadena1.replace("ab", cadena2)); // defc
```

### Convertir a mayúsculas o a minúsculas

Usamos los métodos toUpperCase (convierte a mayúsculas) y toLowerCase (convierte a minúsculas)
para convertir el texto pasado por parámetro.
```
System.out.println(cadena1.toUpperCase()); // ABC
```

Podemos usarlo también con los caracteres:
```
char caracter = 'A';
caracter = Character.toLowerCase(caracter); // a
```

### Dividir un string por el caracter indicado

El método split(patrón) divide una cadena en partes según el patrón indicado por parámetro.

Devuelve un array de strings.

```
String listaCompra = "Leche, harina, azúcar";
String[] arrayCompra = listaCompra.split(", ");
for(int i = 0; i < arrayCompra.length; i++) {
    System.out.println(arrayCompra[i]);
}
// Leche
// harina
// azúcar
```