/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Clase que define los personajes del juego
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public class Personaje {
    
    private String nombre;
    private Clase clase;
    private Arma arma;
    
    
    /**
     * Constructor que define a los personajes dandoles un nombre, clase y arma
     * @param nombre
     * @param clase
     * @param arma 
     */
    public Personaje(String nombre, Clase clase, Arma arma){
        this.nombre = nombre;
        this.clase = clase;
        this.arma = arma;
    }
    
    /**
     * metodo ObtenerInfo que imprime la informacion del personaje
     */
    public void ObtenerInfo(){
        System.out.println("Nombre:" + nombre + " Clase:" + clase.toString() + " Arma:" + arma);
    }
    
    /**
     * metodo moverse que imprime si un personaje de movio
     */
    public void Moverse(){
        System.out.println(nombre + " Se movio!");
    }
    
    /**
     * metodo morir imprime cuando el jugador sale del juego
     */
    public void Morir(){
        System.out.println(nombre + " Cometio un violento Harakiri!");
    }
    
    /**
     * metodo atacar que ejecuta el ataque especifico del arma
     */
    public void Atacar(){
        System.out.print(nombre + " ");
        arma.performAtaque();
    }
    
    /**
     * metodo cambiar arma que modifica el arma actual del personaje
     * @param armaNueva 
     */
    public void CambiarArma(Arma armaNueva){
        System.out.println(nombre + " Cambio su " + arma + " por " + armaNueva);
        arma = armaNueva;
    }
    
}
