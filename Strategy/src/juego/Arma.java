/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Define los objetos Arma
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public class Arma {
    
    private TipoAtaque tipoAtaque;
    
    /**
     * Constructor Vacio
     */
    public Arma(){
        
    }
    
    /**
     * Asigna el tipoDeAtaque a el arma
     * @param ta 
     */
    public void setTipoAtaque(TipoAtaque ta){
        tipoAtaque = ta;
    }
    
    /**
     * Ejecuta el ataque especifico del arma
     */
    public void performAtaque(){
        tipoAtaque.ataca();
    }
    
    /**
     * Imprime el nombre del arma accediendo al nombre de la clase que se define
     * @return 
     */
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * Nos dice si un arma es igual a otra
     * @param arma
     * @return 
     */
    
    public boolean equals(Arma arma){
        return this.toString().equals(arma.toString());
        
    }
    
}
