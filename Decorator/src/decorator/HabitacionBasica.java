package decorator;

import java.util.ArrayList;

public class HabitacionBasica implements Habitacion {

    ArrayList<String> servicios;
    double precio;
    double precioTemporada;
    String descripcion;

    /**
     * Constructor de habitacion basica que no recibe nada y asigna los servicios para esta
     */
    public HabitacionBasica(){
        servicios = new ArrayList<String>();
        servicios.add("TV");
        servicios.add("WIFI");
        servicios.add("AC");
        precio = 700.00;
        descripcion = "Excelente habitacion Basica con " + servicios.toString() + " a $" + getPrecio() + " la noche";
    }

    @Override
    public ArrayList<String> getServicios() {
        return servicios;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioTemporada() {
        return precioTemporada = precio*.9;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
