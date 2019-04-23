/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Interfaz que define el ataque de cada arma, en el patron Strategy este funciona para hacer la 
 * reutilizacion de algoritmos.
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public interface TipoAtaque {
    
    /**
     * metodo ataca que lo implementa cada arma en especifico
     */
    public void ataca();
    
}
