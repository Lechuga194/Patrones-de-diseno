/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package robot;

/**
 * Clase EstadoRobotApagado que define la funcionalidad cuando el robot esta apagado
 * implementa la interfaz EstadoRobot
 * @since 2/9/18
 * @author Dulce - Eduardo
 */
public class EstadoRobotApagado implements EstadoRobot{
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo caminar cuando el robot esta en estado apagado
     */
    @Override
    public void Caminar() {
        System.out.println("No puedo caminar si estoy apagado");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo cocinar cuando el robot esta en estado apagado
     */
    @Override
    public void Cocinar() {
        System.out.println("No puedo cocinar si estoy apagado");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo apagado cuando el robot esta en estado apagado
     * @param apagado EstadoRobotApagado
     */
    @Override
    public void Apagado(EstadoRobotApagado apagado) {
        System.out.println("El robot ya esta apagado!");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo toString cuando el robot esta en estado apagado
     * @return String
     */
    @Override
    public String toString(){
        return "apagado";
    }
    
}
