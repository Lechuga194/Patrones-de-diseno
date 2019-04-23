/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package robot;

/**
 * Interfaz que funciona como los estados de el patron State
 * @since 2/9/18
 * @author Dulce - Eduardo
 */
public interface EstadoRobot {
    
    /**
     * Metodo en interfaz para caminar
     */
    public void Caminar();
    
    /**
     * Metodo en interfaz para cocinar 
     */
    public void Cocinar();
    
    /**
     * Metodo en interfaz para apagar el robot
     * @param apagado apagado
     */
    public void Apagado(EstadoRobotApagado apagado);
    
    /**
     * Metodo toString que devuelve el robot de forma amigable al usuario
     * @return string 
     */
    @Override
    public String toString();
    
}
