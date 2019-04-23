/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;
import facade.AseguradoraFacade;

/**
 *
 * @author dulf2
 */
public class TestAseguradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AseguradoraFacade aseguradora = new AseguradoraFacade(sc);
        
        System.out.println("Bienvenido a la aseguradora ABC :)");

        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Cotizar un seguro." + "\n" +
                            "2. Contratar un seguro." + "\n" +
    						"3. Cancelar mi seguro." + "\n" +
						    "0. Para salir");

        int seleccion = sc.nextInt();
        switch(seleccion){
            case 0:
                System.out.println("¡Adios!");
                break;
            case 1:
                aseguradora.cotizarSeguro();
    			break;

    		case 2:
    			aseguradora.contratarSeguro();
    			break;

    		case 3:
    			aseguradora.cancelarSeguro();
    			break;

    		default:
    			System.out.println("Selecciona una opción válida");
    			break;
    	}

    }

}
