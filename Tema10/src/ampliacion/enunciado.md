# Encuesta de hábitos en viviendas
Desarrollaremos un software que recopile información sobre las actividades lúdicas de varias viviendas.

## Versión 1.0
Para una sola vivienda:
* Clase Actividad:
  * nombre de la actividad: String
  * tipo de actividad: String
  * ¿es para toda la familia?: boolean
* Clase Vivienda:
  * dirección: String
  * actividades: estructura de datos (lista)
* Menú:
  1. Añadir actividad (Se añadirán de una en una).
  2. Mostrar actividades.
  3. Mostrar actividades para toda la familia.
  4. Mostrar actividades por tipo. (Pediremos al usuario qué tipo de actividad desea mostrar).
  5. Mostrar número de actividades.
  6. Salir del programa.

## Versión 2.0
Para 3 viviendas.
* Menú:
  1. Rellenar viviendas (Añadiremos las direcciones de las viviendas, pero NO añadiremos
     actividades).
  2. Añadir actividad (Preguntaremos al usuario la posición de la vivienda donde insertar la
     actividad)
  3. Mostrar viviendas (Mostraremos la información de la vivienda junto con sus actividades)..
  4. Mostrar actividades para toda la familia (las de todas las viviendas).
  5. Mostrar actividades por tipo. (Pediremos al usuario qué tipo de actividad desea mostrar).
  6. Mostrar número de actividades (de entre todas las viviendas).
  7. Salir del programa.