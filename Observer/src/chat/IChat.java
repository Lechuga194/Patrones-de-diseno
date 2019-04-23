/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package chat;

import usuarios.*;

/**
 * Clase que segun el patron observer funciona como el observado
 * @since 28/02/19
 * @author josel
 */
public interface IChat {
    
    /**
     * Metodo para añadir usuarios al chat
     * @param usuario 
     */
    public void addUsuario(IUsuario usuario);
    
    /**
     * Metodo para eliminar un usuario 
     */
    public void eliminarUsuario();
    
    /**
     * Metodo para notificar que un nuevo usuario se unio a los observadores
     */
    public void notificaEliminacion();
    
    /**
     * Metodo para notificar que un nuevo usuario se unio al chat
     */
    public void notificaNuevoUsuario();
    
    /**
     * Metodo que imprime un mensaje de un usuario
     * @param usuario 
     */
    public void imprimeMensaje();
    
    /**
     * Metodo que imprime en consola todos los usuarios agregados
     */
    public void muestraUsuarios();
    
}
