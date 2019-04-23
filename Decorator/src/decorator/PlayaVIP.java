package decorator;

import java.util.ArrayList;

public class PlayaVIP extends HabitacionDecorator{

    /**
     * Constructor que recibe una habitacion de playa basica y agrega los servicios extra
     * @param habitacion
     */
    public PlayaVIP(PlayaBasica habitacion){
        super(habitacion);
        habitacion.getServicios().add("Frigobar");
        habitacion.getServicios().add("Barra Libre");
        habitacion.getServicios().add("Comida Buffet");
    }

    @Override
    public ArrayList<String> getServicios() {
        return habitacionTemporal.getServicios();
    }

    @Override
    public double getPrecio() {
        return habitacionTemporal.getPrecio() + 1200.00;
    }

    @Override
    public double getPrecioTemporada() {
        return this.getPrecio()*.75;
    }

    @Override
    public String getDescripcion() {
        return "La mejor habitacion en la playa VIP con " + habitacionTemporal.getServicios().toString() + " a $" + this.getPrecio() + " la noche";
    }
}