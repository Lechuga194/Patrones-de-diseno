/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Clase que define el comportamineto de la espada.
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public class Espada extends Arma{
    
    public Espada(){
        setTipoAtaque(new AtaqueConEspada());
    }
    
}
