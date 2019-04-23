/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */

package chat;

import usuarios.IUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author josel
 */
public class Chat implements IChat{
    
    private List<IUsuario> listaUsuarios = new ArrayList<IUsuario>();
    private final Scanner SC = new Scanner(System.in);
    private int seleccion;

    /**
     * Constructor que da un mensaje de bienvenida
     */
    public Chat(){
        System.out.println("Bienvenido al chat");
    }

    /**
     * Añade a un nuevo usuario al chat
     * @param nuevoUsuario 
     */
    @Override
    public void addUsuario(IUsuario nuevoUsuario) {
       listaUsuarios.add(nuevoUsuario);
       notificaNuevoUsuario();
       System.out.println(nuevoUsuario.getNombre() + " se unio al chat desde " + nuevoUsuario.getPais() + "\n");
    }
    
    /**
     * Metodo que elmina a un usuario del chat
     */
    @Override
    public void eliminarUsuario(){
        if(listaUsuarios.isEmpty())
            System.out.println("No hay usuarios agregados!");
        else{
            for(int i=0; i<listaUsuarios.size(); i++){
                System.out.println("Nombre: " + listaUsuarios.get(i).getNombre()+ " Pais: " + listaUsuarios.get(i).getPais() + ""
                        + " Este es el usuario que deseas eliminar?\n"
                        + "1: Si\n"
                        + "2: no\n");
                seleccion = SC.nextInt();
                if(seleccion == 1){
                    System.out.println(listaUsuarios.get(i).getNombre() + " salio del chat");
                    listaUsuarios.remove(i); 
                    notificaEliminacion();
                }
                else
                    System.out.println("No eliminaste a nadie!");
            }
        }           
    }

    /**
     * Metodo que notifica a los observadores que un usuario dejo el chat
     * @param usuario
     */
    @Override
    public void notificaEliminacion() {
       for(IUsuario usuario: listaUsuarios){
           usuario.actualizaEliminacion(this);
       }
    }
    
    /**
     * Metodo que notifica a los observadores que un usuario se unio al chat
     */
    public void notificaNuevoUsuario(){
        for(IUsuario usuario: listaUsuarios){
           usuario.actualizaNuevoUsuario(this);
        }
    }

    /**
     * Metodo que imprime le mensaje de un usuario
     * @param usuario 
     */
    @Override
    public void imprimeMensaje() {
        if(listaUsuarios.isEmpty())
            System.out.println("No hay usuarios agregados!, agrega alguno para enviar un mensaje");
        else{
            for(int i=0; i<listaUsuarios.size(); i++){
                System.out.println("Nombre: " + listaUsuarios.get(i).getNombre()+ " Pais: " + listaUsuarios.get(i).getPais() + ""
                        + " Este es el usuario desde el cual quieres enviar un mensaje?\n"
                        + "1: Si\n"
                        + "2: no\n");
                seleccion = SC.nextInt();
                if(seleccion == 1){
                   listaUsuarios.get(i).escribirNuevoMensaje();
                   System.out.println("El usuario " + listaUsuarios.get(i).getNombre() + " escribio:" + listaUsuarios.get(i).getMensaje());   
                }
            }
        }
    }
    
    @Override
    public void muestraUsuarios(){
        if(listaUsuarios.isEmpty())
            System.out.println("No hay usuarios agregados!");
        else{
            for(int i=0; i<listaUsuarios.size(); i++){
                System.out.println("Nombre: " + listaUsuarios.get(i).getNombre()+ " Pais: " + listaUsuarios.get(i).getPais());
            }
        }
    }   
}
