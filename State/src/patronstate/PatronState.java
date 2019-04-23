/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package patronstate;
import robot.EstadoRobotApagado;
import robot.EstadoRobotCocina;
import robot.Robot;


/**
 * Clase main que imprime la funcionalidad en terminal
 * @since 2/9/18
 * @author Dulce - Eduardo
 */
public class PatronState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Robot robot = new Robot();
        EstadoRobotApagado apagado = new EstadoRobotApagado();
        EstadoRobotCocina cocinando = new EstadoRobotCocina();
        
        System.out.println("Estado actual: " +  robot.getEstado());
        robot.Caminar();
        robot.Cocinar();
        robot.Apagado(apagado);
        robot.Encender();
        System.out.println("--------------------------------------");
        
        System.out.println("Estado actual: " +  robot.getEstado());
        robot.Caminar();
        robot.Cocinar();
        robot.Apagado(apagado);
        robot.Encender();
        System.out.println("--------------------------------------");
        
        robot.setEstado(cocinando);
        System.out.println("Estado actual: " +  robot.getEstado());
        robot.Caminar();
        robot.Cocinar();
        robot.Apagado(apagado);
        robot.Encender();
    }
}
        
