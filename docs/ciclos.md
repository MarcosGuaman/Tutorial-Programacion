# Ciclos en Java

[Inicio](index.md)

---

## ¿Que es un ciclo?

Los ciclos o bucles son estructuras de control que permiten ejecutar repetidamente un bloque de instrucciones mientras se cumpla una condicion determinada.

Los ciclos son muy utiles cuando se necesita realizar una misma tarea varias veces sin escribir el mismo codigo repetidamente.

Java dispone de varios tipos de ciclos, entre ellos:

- for
- while
- do-while

En este tutorial se estudiaran los ciclos mas utilizados con su respectiva estructura basica.

# Ciclo For

Los ciclos for (o ciclos para) son una estructuras de control cíclica, nos permiten ejecutar una o varias líneas de código de forma iterativa (o repetitiva), pero teniendo cierto control y conocimiento sobre las iteraciones. En el ciclo for, es necesario tener un valor inicial y un valor final, y opcionalmente podemos hacer uso del tamaño del "paso" entre cada "giro" o iteración del ciclo.

En resumen, un ciclo for es una estructura iterativa para ejecutar un mismo segmento de código una cantidad de veces deseada; conociendo previamente un valor de inicio, un tamaño de paso y un valor final para el ciclo.

## Sintaxis:

```java
for(int i=1; i<=5; i++){
    System.out.println(i);
}
```
## Ejemplo

Calcular la suma de los numeros del 1 al 5:

```java
    public static void main(String[] args) {

        int suma = 0;

        for(int i = 1; i <= 5; i++) {
            suma = suma + i;
        }

        System.out.println("La suma es: " + suma);
    }
```
## Explicacion

- Declara una variable llamada suma.
```java
int suma = 0;
```
- Se inicializa en 0 porque aun no se ha realizado ninguna suma.
- Esta variable almacenara el resultado acumulado.
- Inicializa i en 1.
```java
for(int i = 1; i <= 5; i++) {
}
```
- Se ejecuta mientras i sea menor o igual a 5.
- Incrementa i en una unidad al final de cada iteracion.
- Inicializa i en 1.
- Se ejecuta mientras i sea menor o igual a 5.
- Incrementa i en una unidad al final de cada iteracion.
- Suma el valor actual de i al contenido de suma.
- El resultado se guarda nuevamente en suma.
- En cada iteracion, la variable va acumulando los valores.
- Muestra en pantalla el valor final almacenado en suma.
```java
System.out.println("La suma es: " + suma);
```

## Codigo Completo

Repositorio → [Codigo/Ciclos/EjemploFor.java](https://github.com/MarcosGuaman/Tutorial-Programacion/blob/master/Codigo/Ciclos/EjemploFor.java)

---

# Ciclo While

Los ciclos while son también una estructura cíclica, que nos permite ejecutar una o varias líneas de código de manera repetitiva sin necesidad de tener un valor inicial e incluso a veces sin siquiera conocer cuando se va a dar el valor final que esperamos, los ciclos while, no dependen directamente de valores numéricos, sino de valores booleanos, es decir su ejecución depende del valor de verdad de una condición dada, verdadera o falso, nada más. De este modo los ciclos while, son mucho más efectivos para condiciones indeterminadas, que no conocemos cuando se van a dar a diferencia de los ciclos for, con los cuales se debe tener claro un principio, un final y un tamaño de paso.

## Sintaxis:
```java
int i=1;

while(i<=5){
    System.out.println(i);
    i++;
}
```
## Ejemplo

Sumar 5 numeros ingresados por el usuario

```java
  public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int numero;
        int suma = 0;

        while(contador <= 5) {
            System.out.println("Ingrese un numero:");
            numero = teclado.nextInt();

            suma = suma + numero;

            contador++;
        }

        System.out.println("La suma total es: " + suma);
    }
```
## Explicacion

- Lleva la cuenta de cuantas veces se repite el ciclo.
```java
int contador = 1;;
```
- Almacena la suma acumulada de los numeros ingresados.
```java
int suma = 0;
```
- El ciclo se ejecuta 5 veces.
- En cada vuelta se solicita un numero.
```java
while(contador <= 5) {
}
```
- Agrega el numero a la suma acumulada.
- Aumenta el contador en 1.
- Cuando llegue a 6, el ciclo termina.
- Muestra el resultado final.

## Codigo 

Repositorio → [Codigo/Ciclos/EjemploWhile.java](https://github.com/MarcosGuaman/Tutorial-Programacion/blob/master/Codigo/Ciclos/EjemploWhile.java)


---

# Ciclo Do While

Los ciclos do-while son una estructura de control cíclica, que nos permiten ejecutar una o varias líneas de código de forma repetitiva sin necesidad de tener un valor inicial e incluso a veces sin siquiera conocer cuándo se va a dar el valor final. Hasta ahí son similares a los ciclos while, sin embargo, el ciclo do-while nos permite añadir cierta ventaja adicional puesto que nos permite ejecutar primero el bloque de instrucciones antes de evaluar la condición necesaria. De este modo, los ciclos do-while, son más efectivos para algunas situaciones específicas. En resumen, un ciclo do-while, es una estructura de control cíclica que permite ejecutar de manera repetitiva un bloque de instrucciones sin evaluar de forma inmediata una condición especifica, sino evaluándola justo después de ejecutar por primera vez el bloque de instrucciones en su interior. Por lo tanto, un ciclo do-while ejecutará las instrucciones que contiene al menos una vez, mientras que el while podría no hacerlo ni una vez.

## Sintaxis:
```java
do {
    // Código que se ejecuta al menos una vez
} while (condicion);
```
### Ejemplo

Pedir una contraseña hasta que sea correcta

```java
 import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String clave;

        do {
            System.out.println("Ingrese la contraseña:");
            clave = teclado.nextLine();

            if (!clave.equals("java123")) {
                System.out.println("Contraseña incorrecta");
            }

        } while (!clave.equals("java123"));

        System.out.println("Acceso permitido");
    }
}
```
## Explicacion

- Permite leer datos ingresados por el usuario.
```java
Scanner teclado = new Scanner(System.in);
```
- Variable donde se almacenara la contraseña ingresada.
```java
String clave;
```
- Marca el inicio del bloque que se ejecutara al menos una vez.
```java
do{

};
```
- Solicita y guarda la contraseña ingresada por el usuario.
```java
System.out.println("Ingrese la contraseña:");
clave = teclado.nextLine();
```
- Verifica si la contraseña es diferente de "java123".
- Si es incorrecta, muestra un mensaje de error.
```java
if (!clave.equals("java123")) {
    System.out.println("Contraseña incorrecta");
}
```
- El ciclo continua mientras la contraseña sea incorrecta.
- Cuando el usuario escriba "java123", el ciclo termina.
```java
while (!clave.equals("java123"));
```
- Se ejecuta cuando la contraseña es correcta.
```java
System.out.println("Acceso permitido");
```

## Codigo 

Repositorio → [Codigo/Ciclos/EjemploDoWhile.java](https://github.com/MarcosGuaman/Tutorial-Programacion/blob/master/Codigo/Ciclos/EjemploDoWhile.java)




[Anterior](index.md) | [Siguiente](metodos.md)