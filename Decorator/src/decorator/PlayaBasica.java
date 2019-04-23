package decorator;

import java.util.ArrayList;

public class PlayaBasica extends HabitacionDecorator{

    /**
     * Constructor que llama al constructor de HabitacionDecorator y luego añade el nuevo servicio
     * @param habitacion
     */
    public PlayaBasica(Habitacion habitacion){
        super(habitacion);
        habitacion.getServicios().add("Room Service");
    }

    @Override
    public ArrayList<String> getServicios() {
        return habitacionTemporal.getServicios();
    }

    @Override
    public double getPrecio() {
        return habitacionTemporal.getPrecio() + 500.00;
    }

    @Override
    public double getPrecioTemporada() {
        return this.getPrecio()*.80;
    }

    @Override
    public String getDescripcion() {
        return "Excelente habitacion en la playa con " + habitacionTemporal.getServicios().toString() + " a $" + this.getPrecio() + " la noche";
    }
}
