# Vectores y Matrices

[Inicio](index.md)

---
# Vector
## ¿Que es un vector?
Un vector en Java es una estructura de datos que permite almacenar varios elementos del mismo tipo en una sola variable. Su estructura basica suele tener:

- Cada elemento ocupa una posicion llamada indice, que comienza desde 0.
- Los vectores tienen un tamaño fijo que se define al momento de crearlos.
- Se utilizan para organizar y manejar conjuntos de datos relacionados.
- Los elementos pueden ser numeros, caracteres, cadenas de texto u otros tipos de datos.
- El acceso a cada elemento se realiza mediante su indice entre corchetes [].
- Los vectores facilitan el procesamiento de multiples datos mediante ciclos como for.

## Sintaxis

Los vectores almacenan varios datos del mismo tipo.

- Declaracion e inicializacion con tamaño
```java
int[] numeros = new int[5];
```
- Declaracion e inicializacion con valores
```java
int[] numeros={10,20,30,40,50};
```
- Declaracion usando new
```java
int[] numeros = new int[]{10, 20, 30, 40, 50};
```
- Vector de cadenas
```java
String[] nombres = {"Ana", "Luis", "Pedro"};
```
Recorrido:

```java
for(int i=0;i<numeros.length;i++){
    System.out.println(numeros[i]);
}
```
## Ejemplo
El promedio de 5 notas
```java
import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double notas[] = new double[5];
        double suma = 0;
        double promedio;

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            notas[i] = teclado.nextDouble();

            suma = suma + notas[i];
        }

        promedio = suma / notas.length;

        System.out.println("Promedio: " + promedio);

        if(promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}
```
## Explicación
- Crea un objeto Scanner.
- Permite leer datos ingresados por el usuario desde el teclado.
```java
Scanner teclado = new Scanner(System.in);
```
- Crea un vector llamado notas.
- El vector puede almacenar 5 valores de tipo double.
- Las posiciones del vector van desde el indice 0 hasta el indice 4.
```java
double notas[] = new double[5];
```
- Declara una variable llamada suma.
- Se inicializa en 0.
- Se utilizara para acumular las notas ingresadas.
```java
double suma = 0;
```
- Declara una variable llamada promedio.
- Almacenara el promedio final de las notas.
```java
double promedio;
```
- Inicializa i en 0.
- Se ejecuta mientras i sea menor que la longitud del vector.
- Incrementa i en una unidad en cada iteracion.
- Permite recorrer todas las posiciones del vector.
```java
for(int i = 0; i < notas.length; i++) {}
``` 
- Muestra un mensaje solicitando una nota al usuario.
- Se utiliza (i + 1) para mostrar los numeros del 1 al 5.
```java
System.out.println("Ingrese la nota " + (i + 1) + ":");
```
- Lee la nota ingresada por el usuario.
- La almacena en la posicion correspondiente del vector.
```java
notas[i] = teclado.nextDouble();
```
- Suma la nota actual al acumulador suma.
- En cada iteracion se agrega una nueva nota.
```java
int suma = suma + notas[i];
```
- Calcula el promedio de las notas.
- Divide la suma total para la cantidad de elementos del vector.
```java
promedio = suma / notas.length;
```
- Muestra el promedio obtenido.
```java
System.out.println("Promedio: " + promedio);
```
- Verifica si el promedio es mayor o igual a 7.
- Si la condicion se cumple, el estudiante aprueba.
```java
if(promedio >= 7) {}
```
- Muestra el mensaje de aprobado.
System.out.println("Aprobado");
- Se ejecuta cuando el promedio es menor a 7.
- Muestra el mensaje de reprobado.
```java
else {
    System.out.println("Reprobado");
}
```
## Codigo completo

Repositorio → codigo/Vectores_Matrices/EjemploVectores.java

---

# Matrices
## ¿Que es una matriz?

- Una matriz es una estructura de datos que permite almacenar elementos del mismo tipo en filas y columnas.
- Se puede considerar como un conjunto de vectores organizados en forma de tabla.
- Cada elemento se identifica mediante dos indices: fila y columna.
- Las matrices son utiles para representar informacion tabular como notas, ventas o inventarios.
- En Java se declaran utilizando dos pares de corchetes [][].
- Todos sus elementos deben ser del mismo tipo de dato.
- Las matrices facilitan el manejo y procesamiento de grandes cantidades de informacion relacionada.

## Sintaxis
```java
int[][] matriz={
    {1,2},
    {3,4}
};
```

Recorrido:

```java
for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
        System.out.print(matriz[i][j]+" ");
    }
}
```

## Ejemplo
Ingresar las notas de 3 estudiantes en 2 materias y luego mostrarlas.
```java
import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double notas[][] = new double[3][2];

        for(int fila = 0; fila < 3; fila++) {
            for(int columna = 0; columna < 2; columna++) {

                System.out.println("Ingrese la nota del estudiante "
                        + (fila + 1) + " materia "
                        + (columna + 1) + ":");

                notas[fila][columna] = teclado.nextDouble();
            }
        }

        System.out.println("\nMatriz de notas:");

        for(int fila = 0; fila < 3; fila++) {
            for(int columna = 0; columna < 2; columna++) {

                System.out.print(notas[fila][columna] + "\t");
            }
            System.out.println();
        }

    }
}
```

## Codigo completo

Repositorio → Codigo/Vectores_Matrices/EjemploMatrices.java

---



[Anterior](metodos.md) | [Siguiente](listas.md)