/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package robot;

/**
 * Clase EstadoRobotcocina que define la funcionalidad cuando el robot esta cocinando
 * implementa la interfaz EstadoRobot
 * @since 2/9/18
 * @author Dulce - Eduardo
 */
public class EstadoRobotCocina implements EstadoRobot{
    
    Robot robot;
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo caminar cuando el robot esta en estado cocinar
     */
    @Override
    public void Caminar() {
        System.out.println("Cocinando mientras camino!");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo cocinar cuando el robot esta en estado cocinar
     */
    @Override
    public void Cocinar() {
        System.out.println("Cocinando...");
    }

    /**
     * Implementacion especifica de la interfaz
     * define el metodo apagado cuando el robot esta en estado cocinar
     * @param apagado EstadoRobotApagado
     */
    @Override
    public void Apagado(EstadoRobotApagado apagado) {
        System.out.println("Apagando");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo toString cuando el robot esta en estado cocinar
     * @return String 
     */
    @Override
    public String toString(){
        return "Cocinando";
    }
    
    
    
}
