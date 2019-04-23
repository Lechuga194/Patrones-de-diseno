package decorator;

import java.util.ArrayList;

/**
 * Clase que se encarga de definir el comportamiento de las habitaciones
 */
public interface Habitacion {

    /**
     * Metodo que nos regresa todos los servicios de una habitacion
     * @return lista de servicios
     */
    public ArrayList<String> getServicios();

    /**
     * Metodo que regresa el precio de una habitacion
     * @return precio de la habitacion
     */
    public double getPrecio();

    /**
     * Metodo que regresa el precio de una habitacion en temporada
     * @return
     */
    public double getPrecioTemporada();

    /**
     * Metodo que regresa la descripcion de la habitacion
     * @return descripcion de la habitacion
     */
    public String getDescripcion();

    /**
     * Metodo que modifica los servicios de una habitacion
     * @param servicios
     */
    public void setServicios(ArrayList<String> servicios);

    /**
     * Modifica el precio de una habitacion
     * @param precio
     */
    public void setPrecio(double precio);

    /**
     * Metodo que modifica la descripcion de una habitacion
     * @param descripcion
     */
    public void setDescripcion(String descripcion);

}
