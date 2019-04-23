/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package observer;

import usuarios.*;
import chat.*;
import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Observer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Chat chat = new Chat();
        Scanner SC = new Scanner(System.in);
        String nombre;
        int seleccion;
        int menu;
        
        do{
            despliegaMenu();
            menu = SC.nextInt();
        
            switch(menu){
            
                case 1:
                    System.out.println("Seleccion la nacionalidad\n"
                            + "1: Mexicano\n"
                            + "2: Español\n"
                            + "3: Britanico");
                    seleccion = SC.nextInt();
                    if(seleccion == 1){
                        System.out.println("Escogiste Mexicano, escribe el nick del usuario");
                        nombre = SC.next();
                        IUsuario u1 = new Usuario(nombre, "Mexico");
                        chat.addUsuario(u1);
                    }else{
                        if(seleccion == 2){
                            System.out.println("Escogiste Español, escribe el nick del usuario");
                            nombre = SC.next();
                            IUsuario u2 = new Usuario(nombre, "España");
                            chat.addUsuario(u2);
                        }else if(seleccion == 3){
                            System.out.println("Escogiste Britanico, escribe el nick del usuario");
                            nombre = SC.next();
                            IUsuario u3 = new Usuario(nombre, "Inglaterra");
                            chat.addUsuario(u3);
                        }
                    }
                    break;
                
                case 2:
                   chat.eliminarUsuario();
                   break;
                
                case 3:
                    chat.imprimeMensaje();
                    break;
                   
                case 4:
                    chat.muestraUsuarios();
                }
        }while(menu != 5);
    }

    
    public static void despliegaMenu(){
        System.out.println("Selecciona la opcion que deseas\n"
                + "1: Agregar un nuevo usuario\n"
                + "2: Eliminar un usuario existente\n"
                + "3: Simular chat con un usuario\n"
                + "4: Ver lista de Usuario agregados\n"
                + "5: Salir");
    }
    
}
