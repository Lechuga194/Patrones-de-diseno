/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package menu;

import constructora.CasaConcreto;
import constructora.CasaMadera;
import constructora.CasaVidrio;
import java.util.Scanner;

/**
 * Clase que despliega el menu en la terminal
 * @since 1/9/18
 * @author Dulce - Eduardo
 */
public class Menu {

    private final Scanner SC = new Scanner(System.in);
    private int seleccion;
    private final CasaMadera madera = new CasaMadera();
    private final CasaConcreto concreto = new CasaConcreto();
    private final CasaVidrio vidrio = new CasaVidrio();
    
    /**
     * Metodo que despliega el menu de seleccion
     */
    public void DespliegaMenu(){
        System.out.println("1 Madera, 2 Concreto, 3 Vidrio, 4 salir");
        seleccion = SC.nextInt();
        switch(seleccion){
            case 1:
                madera.Construir();
                madera.Ticket();
                break;
            case 2:
                concreto.Construir();
                concreto.Ticket();
                break;
            case 3:
                vidrio.Construir();
                vidrio.Ticket();
                break;       
            case 4:
                System.out.println("Compra cancelada!");
        }
    }
}
