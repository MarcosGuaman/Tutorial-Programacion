package Codigo.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        String rutaArchivos = "Codigo/transaccion.csv";
        ArrayList<Transaccion> listaTransacciones = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivos))){
            String linea ;
            boolean esPrimeraLinea = true;

            while ((linea = br.readLine()) != null) { 
                //Saltar la cabecera
                if (esPrimeraLinea) {
                    esPrimeraLinea = false;
                    continue;
                }
                //Segmentar valores por coma
                String[] datos = linea.split(",");

                //Crear un objeto Transaccion con cada elemento del array
                int id = Integer.parseInt(datos[0].trim());
                String nombre = datos[1].trim();
                String apellido = datos[2].trim();
                String ciudad = datos[3].trim();
                String genero = datos[4].trim();
                double ingresos = Double.parseDouble(datos[5].trim());
                double egresos = Double.parseDouble(datos[6].trim());

                Transaccion transaccion = new Transaccion(id, nombre, apellido, ciudad, genero, ingresos, egresos);
                listaTransacciones.add(transaccion);  
            }  

            //Imprimir los datos del archivo
            for (Transaccion transaccion:  listaTransacciones) {
                System.out.println(transaccion.toString());
                
            }

            //Obtener Ingresos
            double sumatoriaIngresos = 0, sumatoriaEgresos = 0;
               for (Transaccion transaccion:  listaTransacciones) {
                sumatoriaIngresos+=transaccion.getIngresos();
                sumatoriaEgresos+=transaccion.getEgresos();
            }

            System.out.println("\nIngresos Totales: "+ sumatoriaIngresos);
            System.out.println("Egresos Totales: "+ sumatoriaEgresos);

            //Ingresos por ciudad
            double sumatoriaIngresosQuito = 0, sumatoriaIngresosAmbato = 0, sumatoriaIngresosGuayaquil = 0,sumatoriaIngresosPortoviejo = 0;
               for (Transaccion transaccion:  listaTransacciones) {
                switch (transaccion.getCiudad()) {
                    case "Quito":
                        sumatoriaIngresosQuito+=transaccion.getIngresos();
                        
                        break;
                     case "Ambato":
                        sumatoriaIngresosAmbato+=transaccion.getIngresos();
                        
                        break;
                     case "Guayaquil":
                        sumatoriaIngresosGuayaquil+=transaccion.getIngresos();
                        
                        break;
                     case "Portoviejo":
                        sumatoriaIngresosPortoviejo+=transaccion.getIngresos();
                        
                        break;
                    default:
                        System.out.println("Error");
                }
                
            }

            System.out.println("\nIngresos Quito: "+sumatoriaIngresosQuito);
            System.out.println("\nIngresos Ambato: "+sumatoriaIngresosAmbato);
            System.out.println("\nIngresos Guayaquil: "+sumatoriaIngresosGuayaquil);
            System.out.println("\nIngresos Portoviejo: "+sumatoriaIngresosPortoviejo);
              


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
   
    }
    

}
