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
public class CancelarSeguro {

	Scanner sc;


	/**
	 * Constructor de CancelarSeguro
	 * @param sc
	 */
	public CancelarSeguro(Scanner sc){

		this.sc = sc;

	}

	/**
	 * Método que llena el formulario para cancelar un seguro.
	 */
	public void llenarFormulario(){

		System.out.println("Ingrese su nombre completo: ");
		String nombre = sc.nextLine();
		nombre += sc.nextLine();

		System.out.println("¿Por qué desea cancelar su servicio?");
		String descripcion = sc.nextLine();

		System.out.println(nombre + ", su seguro ha sido cancelado con el motivo: " + descripcion + "\n" + "Folio de cancelacion: 123456");

	}
    
}
