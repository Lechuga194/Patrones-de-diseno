/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package robot;

/**
 * Clase Robot que define los metodos del objeto Robot
 * @since 2/9/18
 * @author Dulce - Eduardo
 */
public class Robot implements EstadoRobot{
    
    EstadoRobot estado;
    EstadoRobotCamina encendido = new EstadoRobotCamina();
    EstadoRobotApagado apagado = new EstadoRobotApagado();
    
    /**
     * Constructor vacio de la clase Robot
     */
    public Robot(){
        this.estado = apagado;
    }
    
    /**
     * Metodo que cambia el estado interno del robot
     */
    public void setEstado(EstadoRobot estadoNuevo){
        estado = estadoNuevo;
    }
    
    /**
     * Metodo que regresa el estado actual del robot
     * @return estado EstadoRobot
     */
    public EstadoRobot getEstado(){
        return estado;
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo caminar cuando es llamado desde un objeto robot
     */
    @Override
    public void Caminar() {
        estado.Caminar();
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo cocinar cuando es llamado desde un objeto robot
     */
    @Override
    public void Cocinar() {
        estado.Cocinar();
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo apagado cuando es llamado desde un objeto robot
     */
    @Override
    public void Apagado(EstadoRobotApagado apagado) {
        estado.Apagado(apagado);
        this.setEstado(apagado);
        
    }
    
    /**
     * Define el metodo encender, si el estado es apagado enciende el robot
     * de lo contrario dice que ya esta encendido
     */
    public void Encender(){
        if(estado instanceof EstadoRobotApagado ){
            this.setEstado(encendido);
            System.out.println("Encendiendo Robot!");
        }
        else 
            System.out.println("El robot ya esta encendido");
    }
    
    /**
     * Implementacion especifica de la interfaz
     * define el metodo toString cuando es llamado desde un objeto robot
     * @return String 
     */
    @Override
    public String toString(){
        return "Robot #1, estado actual: " + this.getEstado();
    }
}
