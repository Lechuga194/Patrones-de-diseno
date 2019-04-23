/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Clase que define el comportamineto del cuchillo
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public class Cuchillo extends Arma{
    public Cuchillo(){
        setTipoAtaque(new AtaqueConCuchillo());
    }
}
