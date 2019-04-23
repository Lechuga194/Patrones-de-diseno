package iteratorpattern;

/**
 * clase que se encargara de manejar ambos menus
 * @author josel
 */
public class MenuItem {
    
    String nombre, descripcion;
    int precio;
    boolean esVegano;
    
    /**
     * Constructor que recibe los atributos necesarios para crear un platillo
     * @param nombre
     * @param descripcion
     * @param precio
     * @param esVegano 
     */
    MenuItem(String nombre, String descripcion, int precio, boolean esVegano){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.esVegano = esVegano;
    }
    
    //Setters
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    //Getters
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean esVegano() {
        return esVegano;
    } 
    
    /**
     * Metodo que regresa el toString de esVegano (true o false)
     * @return 
     */
    public String esVeganoToString(){
        if(esVegano)
            return "Es vegano";
        return "No es vegano";
    }
    
    /**
     * Metodo que regresa el item de manera agradable
     * @return 
     */
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Descripcion: " + this.descripcion + " Precio: $" + this.precio + " " + this.esVeganoToString();
    }
    
}
