package Codigo.ArrayList;

public class Transaccion {
      //id,nombre,apellido,ciudad,genero,ingresos,egresos

        private int id;
        private String nombre;
        private String apellido;
        private String ciudad;
        private String genero;

        private double ingresos;
        private double egresos;

        //Constructos

        public Transaccion(int id, String nombre, String apellido, String ciudad, String genero, double ingresos,
            double egresos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.genero = genero;
        this.ingresos = ingresos;
        this.egresos = egresos;
        }

        //Getters

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getCiudad() {
            return ciudad;
        }

        public String getGenero() {
            return genero;
        }

        public double getIngresos() {
            return ingresos;
        }

        public double getEgresos() {
            return egresos;
        }

        //Setters
        public void setId(int id) {
            this.id = id;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setIngresos(double ingresos) {
            this.ingresos = ingresos;
        }

        public void setEgresos(double egresos) {
            this.egresos = egresos;
        }

        @Override
        public String toString(){
            return "ID: " + id + "|" + " Nombre: " + nombre + "|" +" Apellido: " + apellido + "|" + 
            " Ciudad: " + ciudad + "|" + " Genero: " + genero + "|"+ " Ingresos: " + ingresos +
            "|" + " Egresos: " + egresos;
        }


}
