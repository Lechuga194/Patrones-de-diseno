/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

import java.util.Scanner;

/**
 * Clase que incorpora todos los elementos para que se ejecute el juego
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public class IniciaJuego {
    
    private final Scanner SC = new Scanner(System.in);
    private String nombre;
    private Arma arma;
    private int PickArma;
    private Clase clase;
    private int PickClase;
    private int pickAccion;
    private int cambiaArma;
    private Hacha hacha = new Hacha();
    private Espada espada = new Espada();
    private Cuchillo cuchillo = new Cuchillo();
    private Martillo martillo = new Martillo();
    private int salida = 0;
    private String menu = "1 Moverse!" + "\n" + "2 Atacar!" + "\n" + "3 Cambiar de arma!" + "\n" + "4 para salir :c";
     
    
    /**
     * clase que inicia el juego, se encarga de crear el personaje y asignarle los atributos. 
     * tambien de imprimir todo en consola
     */
    public void iniciaJuego(){
        System.out.println("Bienvenido a RPGenerico");
        System.out.println("Dime tu nombre!");
        nombre = SC.nextLine();
        
        System.out.println("Hola " + nombre);
        System.out.println("Selecciona una clase!");
        System.out.println("1 Rey" + "\n" + "2 Reina" + "\n" + "3 Caballero" + "\n" + "4 Troll");  
        PickClase = SC.nextInt();
        
        switch (PickClase) {
            case 1:
                clase = Clase.REY;
                break;
            case 2:
                clase = Clase.REINA;
                break;
            case 3:
                clase = Clase.CABALLERO;
                break;
            default:
                clase = Clase.TROLL;
                break;
        }
        
        System.out.println("Selecciona un arma!");
        System.out.println("1 Hacha" + "\n" + "2 Espada" + "\n" + "3 Cuchillo\n" + "4 Martillo");
        PickArma = SC.nextInt();
        
        switch (PickArma) {
            case 1:
                arma = new Hacha();
                break;
            case 2:
                arma = new Espada();
                break;
            case 3: 
                arma = new Cuchillo();
            case 4:
                arma = new Martillo();
                break;
        }
        
        Personaje p = new Personaje(nombre,clase,arma);
        System.out.println("Tu personaje esta listo!\n");
        p.ObtenerInfo();
        muestraMenu();
        do{
            pickAccion = SC.nextInt();
        
            switch (pickAccion){
                case 1:
                    p.Moverse();
                    break;
                case 2: 
                    p.Atacar();
                    break;
                case 3:
                    System.out.println("¿Cambiar a...?");
                    System.out.println("1 Hacha" + " 2 Espada " + " 3 Cuchillo " + " 4 Martillo" + " 5 Cancelar");
                    cambiaArma = SC.nextInt();
                    switch (cambiaArma) {
                        case 1:
                            if(arma.equals(hacha))
                                System.out.println("Ya tienes equipada un hacha!");
                            else
                                p.CambiarArma(hacha);
                                muestraMenu();
                            break;
                        case 2:
                            if(arma.equals(espada))
                                System.out.println("Ya tienes equipada una Espada!");
                            else
                                p.CambiarArma(espada);
                                muestraMenu();
                            break;
                        case 3:
                            if(arma.equals(cuchillo))
                                System.out.println("Ya tienes equipado un cuchillo!");
                            else
                                p.CambiarArma(cuchillo);
                                muestraMenu();
                            break;
                            
                        case 4:
                            if(arma.equals(martillo))
                                System.out.println("Ya tienes equipado un Martillo!");
                            else
                                p.CambiarArma(martillo);
                                muestraMenu();    
                            
                        case 5:
                            System.out.println("Cambio cancelado!");
                            muestraMenu();
                            break;
                    }
                    break;
                        case 4:
                            p.Morir();
                            salida++;
                            
            }
        }while(salida == 0);
        
    }
    
    /**
     * Muestra el menu para seleccionar la accion
     */
    public void muestraMenu(){
        System.out.println("Pulsa alguna accion");
        System.out.println(menu);
    }
       
}
