/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */

package usuarios;

import chat.*;


/**
 * Segun el patron observer, esta clase abstracta controlara a los observadores
 * @since 28/02/19
 * @author josel
 */
public interface IUsuario {
    
    /**
     * Metodo que avisa de un nuevo usuario
     * @param chat 
     */
    public void actualizaNuevoUsuario(Chat chat);
    
    /**
     * Metodo que actualiza
     * @param chat 
     */
    public void actualizaEliminacion(Chat chat);

    /**
     * Metodo que envia un mensaje al chat
     * @param mensaje
     */
    public void escribirNuevoMensaje();
    
    /**
     * Metodo para hacer el set de un mensaje
     * @param mensaje 
     */
    public void setMensaje(String mensaje);
    
    /**
     * Metodo para ver el mensaje de un usuario
     * @return 
     */
    public String getMensaje();
    
    /**
     * Metodo que regresa el nombre del usuario
     * @return nombre
     */
    public String getNombre();
    
    /**
     * Metodo que regresa el pais del usuario
     * @return 
     */
    public String getPais();
    
    /**
     * Metodo que hace el set de pais
     */
    public void setPais(String pais);

    
}
