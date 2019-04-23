package decorator;

import java.util.ArrayList;

public abstract class HabitacionDecorator implements Habitacion{

    Habitacion habitacionTemporal;

    /**
     * Constructor que recibe una habitacion
     * @param habitacion
     */
    public HabitacionDecorator(Habitacion habitacion){
        this.habitacionTemporal = habitacion;
    }

    @Override
    public ArrayList<String> getServicios() {
        return habitacionTemporal.getServicios();
    }

    @Override
    public double getPrecio() {
        return habitacionTemporal.getPrecio();
    }

    @Override
    public abstract double getPrecioTemporada();

    @Override
    public String getDescripcion() {
        return habitacionTemporal.getDescripcion();
    }

    @Override
    public void setServicios(ArrayList<String> servicios) {
        habitacionTemporal.setServicios(servicios);
    }

    @Override
    public void setPrecio(double precio) {
        habitacionTemporal.setPrecio(precio);
    }

    @Override
    public void setDescripcion(String descripcion) {
        habitacionTemporal.setDescripcion(descripcion);
    }
}
