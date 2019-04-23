/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Enumeracion que define las clases
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public enum Clase {
    REY,REINA,CABALLERO,TROLL;
    
    /**
     * redefine el metodo toString para que las clases inicien con mayuscula 
     * @return 
     */
    
    @Override
    public String toString(){
        if(this == REY)
            return "Rey";
        else if(this == REINA)
            return "Reina";
        else if(this == CABALLERO)
            return "Caballero";
        else return "Troll";
    }
}

