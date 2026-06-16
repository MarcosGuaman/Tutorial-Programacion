package Codigo.Archivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class EjemploArchivo {
    public static void main(String[] args) {
        
        
        //Matriz 10x5
        int[][] encuesta = new int[10][5];

        //Cargar datos desde CSV
        CargarCSV(encuesta, "Codigo/Ejercicio1Matrices.csv");

        //Mostrar matriz
        System.out.println("------ ENCUESTA ------");
        ImprimirMatriz(encuesta);

        //Promedio por criterio
        PromedioPorCriterio(encuesta);

        //Promedio general
        PromedioGeneral(encuesta);

        //Mejor y peor criterio
        MejorPeorCriterio(encuesta);

        //Cantidad de respuestas 5
        CantidadCinco(encuesta);

        //Cantidad menores o iguales a 2
        CantidadMenorIgualDos(encuesta);
    }

    //Metodo para cargar CSV
 static void CargarCSV(int[][] matriz, String archivo) {

    try {

        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;

        int f = 0;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(";");

            for (int c = 0; c < datos.length; c++) {

                matriz[f][c] = Integer.parseInt(datos[c]);
            }

            f++;
        }

        br.close();
        fr.close();

        System.out.println("Archivo cargado correctamente");

    } catch (Exception e) {

        System.out.println("Error al cargar el archivo");
        System.out.println(e.getMessage());
    }
}

    //Imprimir matriz
    static void ImprimirMatriz(int[][] matriz) {

        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[0].length; c++) {

                System.out.print(matriz[f][c] + "\t");
            }

            System.out.println();
        }
    }

    //Promedio por criterio
    static void PromedioPorCriterio(int[][] matriz) {

        System.out.println("\nPromedio por criterio:");

        for (int c = 0; c < matriz[0].length; c++) {

            double suma = 0;

            for (int f = 0; f < matriz.length; f++) {

                suma += matriz[f][c];
            }

            double promedio = suma / matriz.length;

            System.out.println("Criterio " + (c + 1) + ": " + promedio);
        }
    }

    //Promedio general
    static void PromedioGeneral(int[][] matriz) {

        double suma = 0;
        int total = 0;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {

                suma += matriz[f][c];
                total++;
            }
        }

        double promedio = suma / total;

        System.out.println("\nPromedio general: " + promedio);
    }

    //Mejor y peor criterio
    static void MejorPeorCriterio(int[][] matriz) {

        double mayor = 0;

        double menor = 0;

        for (int f = 0; f < matriz.length; f++) {

            menor += matriz[f][0];
        }

        int mejor = 0;
        int peor = 1;

        for (int c = 0; c < matriz[0].length; c++) {

            double suma = 0;

            for (int f = 0; f < matriz.length; f++) {

                suma += matriz[f][c];
            }

            if (suma > mayor) {

                mayor = suma;
                mejor = c + 1;
            }

            if (suma < menor) {

                menor = suma;
                peor = c + 1;
            }
        }

        System.out.println("\nMejor criterio: " + mejor);
        System.out.println("Peor criterio: " + peor);
    }

    //Cantidad de respuestas 5
    static void CantidadCinco(int[][] matriz) {

        int contador = 0;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {

                if (matriz[f][c] == 5) {

                    contador++;
                }
            }
        }

        System.out.println("\nCantidad de respuestas con 5: " + contador);
    }

    //Cantidad <= 2
    static void CantidadMenorIgualDos(int[][] matriz) {

        int contador = 0;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {

                if (matriz[f][c] <= 2) {

                    contador++;
                }
            }
        }

        System.out.println("Cantidad de respuestas <= 2: " + contador);
        
    }


}
