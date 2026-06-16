# Metodos en Java

[Inicio](index.md)

---

## ¿Que es un metodo?

Los métodos en Java, las funciones y los procedimientos, especialmente en Java, son una herramienta indispensable para programar. Java nos permite crear o hacer nuestros propios métodos y usarlos sencillamente como también nos facilita hacer uso de los métodos de otras librerías (funciones matemáticas, aritméticas, de archivos, de fechas, etc). Cualquiera que sea el caso, las funciones permiten automatizar tareas que requerimos con frecuencia y que además se pueden generalizar por medio de parámetros o argumentos. Aprender a crear métodos en Java y usarlos correctamente es de gran importancia, separar nuestro código en módulos y según las tareas que requerimos. En java una función debe contener la implementación de una utilidad de nuestra aplicación, esto nos pide que por cada utilidad básica (abrir, cerrar, cargar, mover, etc.) sería adecuado tener al menos una función asociada a ésta, pues sería muy complejo usar o crear un método que haga todo de una sola vez, por esto es muy buena idea separar cada tarea en una función o método (según corresponda).

Para estar claros en todo, en Java es mucho más común hablar de métodos que de funciones y procedimientos y esto se debe a que en realidad un método, una función y un procedimiento no son lo mismo, veamos la diferencia:

## Sintaxis
1. Metodo sin parametros y sin retorno
```java
static void saludar(){
    System.out.println("Hola");
}
```
Llamada:
```java
saludar();
```
2. Metodo con parametros y sin retorno
```java
static void saludar(String nombre){
    System.out.println("Hola " + nombre);
}
```
Llamada:
```java
saludar("Alex");
```
3. Metodo sin parametros y con retorno
```java
static int obtenerNumero(){
    return 10;
}
```
Llamada:
```java
int n = obtenerNumero();
```
4. Metodo con parametros y con retorno
```java
static int sumar(int a, int b){
    return a + b;
}
```
Llamada:
```java
int resultado = sumar(5, 3);
```
5. Metodo static

Se puede llamar directamente desde main.
```java
public class Ejemplo {

    public static void main(String[] args) {
        despedirse();
    }

    static void despedirse(){
        System.out.println("Adios");
    }
}
```
6. Metodo no static

Se necesita crear un objeto.
```java
public class Ejemplo {

    void mostrar(){
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        Ejemplo obj = new Ejemplo();
        obj.mostrar();
    }
}
```
7. Metodo public

Puede ser utilizado desde otras clases.
```java
public static void mostrar(){
    System.out.println("Hola");
}
```
8. Metodo private

Solo puede usarse dentro de la misma clase.
```java
private static void mostrar(){
    System.out.println("Hola");
}
```
## Ejemplo
Convertir grados Centigrados a Kelvin y Fahrenheit
```java
import java.util.Scanner;

public class Temperatura {

    static Scanner teclado = new Scanner(System.in);
    static double centigrados;

    public static void main(String[] args) {

        ingresarTemperatura();
        convertirFahrenheit();
        convertirKelvin();

    }

    static void ingresarTemperatura() {
        System.out.println("Ingrese los grados centigrados:");
        centigrados = teclado.nextDouble();
    }

    static void convertirFahrenheit() {
        double fahrenheit;

        fahrenheit = (centigrados * 9 / 5) + 32;

        System.out.println("Grados Fahrenheit: " + fahrenheit);
    }

    static void convertirKelvin() {
        double kelvin;

        kelvin = centigrados + 273.15;

        System.out.println("Grados Kelvin: " + kelvin);
    }
}

```
## Explicación
- Variable global de la clase.
- Todos los metodos pueden utilizarla.
```java
static double centigrados;
```
- Solicita al usuario la temperatura en grados centigrados.
```java
ingresarTemperatura();
```
- Convierte los grados centigrados a Fahrenheit usando la formula:
```java
convertirFahrenheit();
double fahrenheit = (centigrados * 9 / 5) + 32;
```
- Convierte los grados centigrados a Kelvin usando la formula:
```java
convertirKelvin();
double kelvin = centigrados + 273.15;
```

## Codigo completo

Repositorio → codigo/Metodos/EjemploMetodos.java

---



[Anterior](ciclos.md) | [Siguiente](vectores_matrices.md)