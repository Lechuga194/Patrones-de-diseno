/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package patrontemplate;

import menu.Menu;
import java.util.Scanner;

/**
 * Clase main encargada de generar las ordenes
 * @since 1/9/18
 * @author Dulce - Eduardo
 */
public class PatronTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int seleccion;
        String nombre;
        System.out.println("!Bienvenido a la constructora Lechuga¡");         
        System.out.println("Por favor, escriba su nombre");
        nombre = scan.nextLine();
        do{
            System.out.println("Hola! " + nombre + ", selecciona el material de tu nuevo hogar");
            Menu nuevaCompra = new Menu();
            nuevaCompra.DespliegaMenu();
            System.out.println("Si desea hacer otra compra pulse 1, si desea salir pulse 2");
            seleccion = scan.nextInt();
            if(seleccion >=2)
                System.out.println("Vuelva pronto!");
        }while(seleccion == 1);
    }
}
