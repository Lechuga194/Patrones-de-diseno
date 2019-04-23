/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Scanner;

/**
 *
 * @author dulf2
 */
public class Registrar {
    
    private Scanner sc;
    private String username;
    private String password;


    /**
     * Constructor de Registrar
     * @param sc
     */
    public Registrar(Scanner sc){
    	
    	this.sc = sc;
        
    }


    /**
     * Método para registrar a un usuario.
     */
    public void iniciarRegistro(){

        System.out.println("Crea un nombre de usuario: ");
        this.username = sc.nextLine();
        username += sc.nextLine();
        System.out.println("Crea una contraseña: ");
        this.password = sc.nextLine();
    }

}
