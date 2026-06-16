# Listas en Java

[Inicio](index.md)

---

## ArrayList

Un ArrayList es una estructura de datos de Java que permite guardar varios elementos en una sola lista. A diferencia de un vector, no es necesario definir su tamaño desde el inicio, ya que puede crecer o reducirse automaticamente segun sea necesario. Los elementos se almacenan de forma ordenada y se accede a ellos mediante indices. Tambien permite agregar, eliminar y modificar datos facilmente. Forma parte de la biblioteca java.util y es muy utilizado para manejar colecciones de informacion de manera flexible.

## Sintaxis
```java
ArrayList<String> estudiantes = new ArrayList<String>();
```

Agregar elementos:

```java
estudiantes.add("Juan");
estudiantes.add("Maria");
```

Recorrer:

```java
for(String nombre:estudiantes){
    System.out.println(nombre);
}
```

## Ejemplo
Ingreso e ingresos de una ciudad

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String rutaArchivos = "IngresosEgresos.csv";
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
            System.out.println("\nIngresos Quito: "+sumatoriaIngresosAmbato);
            System.out.println("\nIngresos Quito: "+sumatoriaIngresosGuayaquil);
            System.out.println("\nIngresos Quito: "+sumatoriaIngresosPortoviejo);
              


        } catch (Exception e) {

        }
   
    }

}

```
## Explicacion
1. Importacion de librerias
- Se utilizan librerias para leer archivos CSV.
- Se utiliza ArrayList para almacenar una cantidad dinamica de objetos.
2. Creacion del ArrayList
- Se crea una lista llamada listaTransacciones.
- Esta lista almacenara objetos de tipo Transaccion.
- Cada objeto representa una fila del archivo CSV.
3. Lectura del archivo CSV
- Se abre el archivo de datos.
- Se lee linea por linea hasta llegar al final.
- La primera linea se ignora porque contiene los nombres de las columnas.
4. Separacion de datos
- Cada linea se divide utilizando la coma como separador.
- Los datos obtenidos corresponden a los atributos de una transaccion.
5. Creacion de objetos
- Con los datos leidos se crea un objeto Transaccion.
El objeto almacena informacion como:
- Id
- Nombre
- Apellido
- Ciudad
- Genero
- Ingresos
- Egresos
6. Almacenamiento en el ArrayList
- Cada objeto creado se agrega al ArrayList.
- Al finalizar la lectura, la lista contiene todas las transacciones del archivo.
7. Mostrar informacion
- Se recorre el ArrayList.
- Se imprime la informacion de cada transaccion.
- Se utiliza el metodo toString() para mostrar los datos de forma organizada.
8. Calculo de ingresos y egresos totales
- Se recorren todas las transacciones.
- Se acumulan los ingresos en una variable.
- Se acumulan los egresos en otra variable.
- Al final se muestran los totales generales.
9. Calculo de ingresos por ciudad
- Se vuelve a recorrer el ArrayList.
- Se identifica la ciudad de cada transaccion.
- Dependiendo de la ciudad, el ingreso se suma a un acumulador especifico.
Se obtienen ingresos totales para:
- Quito
- Ambato
- Guayaquil
- Portoviejo
10. Uso de getters
- Los datos se obtienen mediante metodos getter.
- Los getters permiten acceder a los atributos del objeto de forma segura.

## Codigo completo

Repositorio → codigo/Listas/lista.java

---


[Anterior](vectores_matrices.md) | [Siguiente](archivos.md)