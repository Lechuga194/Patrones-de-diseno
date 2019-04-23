/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package robot;

/**
 * Clase EstadoRobotCamina que define la funcionalidad cuando el robot esta caminando
 * implementa la interfaz EstadoRobot
 * @since 2/9/18
 * @author Dulce - Eduardo
 */
public class EstadoRobotCamina implements EstadoRobot{
    
    Robot robot;
    EstadoRobot apagado = new EstadoRobotApagado();
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo caminar cuando el robot esta en estado caminar
     */
    @Override
    public void Caminar() {
        System.out.println("Caminando...");
    }

    /**
     * Implementacion especifica de la interfaz
     * define el metodo cocinar cuando el robot esta en estado caminar
     */
    @Override
    public void Cocinar() {
        System.out.println("Caminando y cocinando!");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo apagado cuando el robot esta en estado caminar
     * @param apagado EstadoRobotApagado
     */
    @Override
    public void Apagado(EstadoRobotApagado apagado) {
        System.out.println("Apagando");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo toString cuando el robot esta en estado caminar
     * @return String 
     */
    @Override
    public String toString(){
        return "Caminando";
    }
    
}
