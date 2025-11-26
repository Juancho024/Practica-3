# Práctica de Recursividad e Iteración
## Algoritmos Clásicos y Estructuras de Datos

Repositorio: Transformación entre Recursión e Iteración

## Descripción General

Profesor, en este proyecto implementamos tres ejercicios fundamentales que demuestran la equivalencia entre algoritmos recursivos e iterativos. Trabajamos con operaciones básicas sobre arreglos y cadenas, convirtiendo soluciones iterativas a recursivas y viceversa. 

El programa está desarrollado completamente en Java usando únicamente librerías estándar, sin colecciones como ArrayList o Stack, tal como usted solicitó en las especificaciones.

## Ejercicios Implementados

### Ejercicio 1: Suma de Elementos de un Arreglo

Convertimos el algoritmo iterativo proporcionado a su versión recursiva. 

Caso base: Cuando el tamaño es 0, retornamos 0 porque no hay elementos que sumar.

Caso recursivo: Sumamos el último elemento del arreglo con la suma recursiva de los elementos restantes.

Progresión hacia el caso base: En cada llamada reducimos el tamaño en 1, hasta llegar a 0.

Recurrencia: T(n) = T(n-1) + O(1), lo que resulta en T(n) = O(n)

Análisis de complejidad:

Versión iterativa: Temporal O(n), Espacial O(1) ya que solo usa una variable acumuladora.

Versión recursiva: Temporal O(n), Espacial O(n) porque cada llamada recursiva apila un nuevo marco en la pila de ejecución.

### Ejercicio 2: Máximo de un Arreglo

Transformamos el algoritmo recursivo de divide y vencerás a su versión iterativa.

El enfoque divide y vencerás es más natural recursivamente porque conceptualmente partimos el problema en mitades, resolvemos cada mitad independientemente y luego combinamos. Esta estructura de árbol binario se expresa naturalmente con recursión.

Al pasar a iterativo, eliminamos el uso de la pila de recursión (que en divide y vencerás es O(log n) por la profundidad del árbol) y usamos un simple recorrido lineal con complejidad espacial O(1).

Análisis de complejidad:

Versión recursiva: Temporal O(n), Espacial O(log n) por la profundidad de la pila.

Versión iterativa: Temporal O(n), Espacial O(1) usando solo una variable auxiliar.

### Ejercicio 3: Invertir una Cadena

Convertimos el algoritmo iterativo a recursivo usando operaciones básicas de String.

Caso base: Cuando llegamos al índice 0, retornamos ese único carácter.

Caso recursivo: Tomamos el carácter en la posición actual y lo concatenamos con la inversión recursiva del resto.

Reducción del problema: En cada llamada decrementamos el índice, procesando la cadena de derecha a izquierda.

Análisis de complejidad:

Versión iterativa: Temporal O(n), Espacial O(n) por el StringBuilder que almacena el resultado.

Versión recursiva: Temporal O(n²) en el peor caso debido a las concatenaciones de String, o O(n) si el compilador optimiza. Espacial O(n) por la pila de recursión y las cadenas intermedias.

## Cómo Usar el Programa

Profesor, cuando ejecute el programa, este le pedirá información de forma secuencial para los tres ejercicios.

Primero, le solicitará el tamaño del arreglo para la suma, y luego deberá ingresar los números separados por espacio. El programa calculará y mostrará la suma usando ambos métodos.

Segundo, le pedirá el tamaño del arreglo para buscar el máximo. Nosotros generamos los números aleatorios automáticamente, así que solo necesita ingresar el tamaño. El programa mostrará el arreglo generado y el máximo encontrado por ambos métodos.

Tercero, le solicitará una cadena de texto que desee invertir. Simplemente escríbala y presione enter. El programa mostrará la cadena original y sus dos versiones invertidas.

## Ejemplos de Entrada y Salida

### Ejemplo 1: Suma de Arreglo

Entrada:
Ingrese el tamaño del Arreglo: 5
Ingrese los números separados por espacio: 10 20 30 40 50

Salida:
Arreglo: [10, 20, 30, 40, 50]

--- Pruebas de Suma ---
Suma Recursiva: 150
Suma Iterativa: 150

### Ejemplo 2: Mayor Elemento

Entrada:
Ingrese el tamaño del Arreglo: 8

Salida:
--- Arreglo de Prueba Generado ---
[234, 567, 123, 689, 456, 234, 678, 345]

--- Pruebas de Mayor ---
Mayor Iterativo: 689
Mayor Recursivo (Divide y Vencerás): 689

### Ejemplo 3: Inversión de Cadena

Entrada:
Ingresa la cadena: Recursividad

Salida:
--- Pruebas de Inversión de Cadena ---
Original: Recursividad
Invertida Iterativa: dadivisuceR
Invertida Recursiva: dadivisuceR

## Análisis de Complejidad

Suma de Arreglo: Ambas versiones son O(n) temporalmente, pero la recursiva consume más memoria.

Mayor de Arreglo: La versión iterativa es más eficiente en espacio O(1) vs O(log n), aunque ambas son O(n) en tiempo.

Invertir Cadena: La versión iterativa es más eficiente tanto en tiempo como en espacio debido a StringBuilder vs concatenaciones recursivas de String.