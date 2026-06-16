import java.util.Scanner;

public class EjemploVectores {
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
