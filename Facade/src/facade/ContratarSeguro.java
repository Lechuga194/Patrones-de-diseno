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
public class ContratarSeguro {

	private Scanner sc;


	/**
	 * Constructor de ContratarSeguros
	 * @param sc
	 */
	public ContratarSeguro(Scanner sc){

		this.sc = sc;

	}

	/**
	 * Método que llena el formulario para contratar un seguro.
	 */
	public void llenarFormulario(){
		
		System.out.println("Ingresa tu nombre completo: ");
		String nombre = sc.nextLine();
		nombre += sc.nextLine();

		System.out.println("Selecciona el tipo de seguro que deseas contratar:" + "\n" +
							"1. Cobertura amplia" + "\n" +
							"2. Daños a terceros" + "\n" +
							"3. Cobertura limitada" + "\n" +
							"4. Cobertura extendida");
		int seguro = sc.nextInt();

		System.out.println("Ingresa la marca de tu auto: ");
		String marca = sc.next();
		marca = sc.nextLine();
		System.out.println("Ingresa el modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Ingresa el año: ");
		String año = sc.nextLine();

		System.out.println("Selecciona una forma de pago: " + "\n" +
							"1. Tarjeta de crédito." + "\n" +
							"2. Tarjeta de débito." + "\n" +
							"3. Transferencia bancaria.");
		int formaDePago = sc.nextInt();

		System.out.println("¡Felicidades, " + nombre +"! Tu automovil ahora se encuentra asegurado.");

	}
    
}
