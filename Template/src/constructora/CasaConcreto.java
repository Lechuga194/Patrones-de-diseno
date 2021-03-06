/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package constructora;

/**
 * Clase que define el patron template como clase concreta de la implementacion
 * @since 1/9/18
 * @author Dulce - Eduardo
 */
public class CasaConcreto extends CrearCasaAbstracta{
    
    /**
     * Metodo que regresa el material de la casa
     * @return String material
     */
    @Override
    public String getMaterial() {
        return "Concreto";
    }
    
    /**
     * Metodo que regresa el precio de la casa
     * @return String precio 
     */
    @Override
    public String getPrecio() {
        return "MX/N 10,000,000";
    }
 
}