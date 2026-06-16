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
