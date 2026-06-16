import java.util.Scanner;

public class EjemploWhile {
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

}
