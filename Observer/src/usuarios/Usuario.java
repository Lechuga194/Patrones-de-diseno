/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */

package usuarios;

import chat.Chat;
import java.util.Scanner;


/**
 * Clase para el chat de México
 * @author josel
 */
public class Usuario implements IUsuario{

    private String nombre;
    private String pais;
    private String mensaje;
    private final Scanner SC = new Scanner(System.in);
    
    /**
     * Constructor de Usuario que pide el nombre y el pais
     * @param nombre
     * @param pais 
     */
    public Usuario(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    /**
     * Metodo que se encarga de seleccionar el mensaje de binvenida al usuario segun su pais
     * @param chat 
     */
    @Override
    public void actualizaNuevoUsuario(Chat chat){
        if(pais == "Mexico")
            System.out.println("K tranza krnal, tenemos un nuevo kmpa");
        else
            if(pais == "España")
                System.out.println("Eh tio, que tenemos un nuevo compi");
            else if(pais == "Inglaterra")
                System.out.println("We have a new buddy, pal");
    }
    
    /**
     * Metodo que imprime un mensaje de despedida al usuario eliminado acorde a los usuarios registrados actuales
     * @param chat 
     */
    @Override
    public void actualizaEliminacion(Chat chat) {
        System.out.println("F, siempre te recordare tu amigo " + this.getNombre() + " desde " + this.getPais());            
    }
    
    /**
     * Metodo que escribe un mensaje antes de enviarlo al chat
     */
    @Override
    public void escribirNuevoMensaje(){
        System.out.println("Escribe tu mensaje y pulsa enter");
        mensaje = SC.nextLine();
        setMensaje(mensaje);
    }

    /**
     * Metodo que hace el set de mensaje
     * @param mensaje 
     */
    @Override
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    
    /**
     * Metodo que regresa el mensaje del usuario
     * @return 
     */
    @Override
    public String getMensaje(){
        return mensaje;
    }
    
    /**
     * Metodo que regresa el nombre del usuario
     * @return 
     */
    @Override
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que regresa el pais del usuario
     * @return 
     */
    @Override
    public String getPais(){
        return pais;
    }

    /**
     * Metodo que hace le set del pais del usuario
     * @param pais 
     */
    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }
    
}