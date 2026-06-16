import java.util.Scanner;

public class EjemploMetodos {
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
