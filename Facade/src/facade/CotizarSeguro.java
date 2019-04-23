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
public class CotizarSeguro {

	private Scanner sc;
	private String marca;
	private String modelo;
	private String año;

	/**
	 * Constructor de CotizarSeguro
	 * @param sc
	 */	
	public CotizarSeguro(Scanner sc){

		this.sc = sc;

	}

	/**
	 * Método que llena el formulario para cotizar un seguro.
	 */
	public void llenarFormulario(){
		System.out.println("Selecciona el tipo de seguro deseado:" + "\n" +
							"1. Cobertura amplia" + "\n" +
							"2. Daños a terceros" + "\n" +
							"3. Cobertura limitada" + "\n" +
							"4. Cobertura extendida");
		int seleccion = sc.nextInt();

		System.out.println("Ingresa la marca de tu auto: ");
		marca = sc.nextLine();
		marca = sc.nextLine();
		System.out.println("Ingresa el modelo: ");
		modelo = sc.nextLine();
		System.out.println("Ingresa el año: ");
		año = sc.nextLine();

		cotizacion(seleccion);

	}

	/**
	 * Método que imprime la cotización de un seguro
	 * @param seleccion
	 */
	public void cotizacion(int seleccion){

		String temp = "El costo total del seguro para tu automóvil..." + "\n" +
						"Marca: " + this.marca + "\n" +
						"Modelo: " + this.modelo + "\n" +
						"Año: " + this.año + "\n" +
						"Es de: $";
		switch(seleccion){
			case 1:
				System.out.println(temp + costoCoberturaAmplia());
				break;

			case 2:
				System.out.println(temp + costoDañosATerceros());
				break;

			case 3:
				System.out.println(temp + costoCoberturaLimitada());
				break;

			case 4:
				System.out.println(temp + costoCoberturaExtendida());
				break;

			default:
				System.out.println("Ocurrio un error");
		}

	}

	/**
	 * Método que devuelve el costo del seguro de Cobertura Amplia
	 * @return costo
	 */
	public double costoCoberturaAmplia(){

		return 2000.00;

	}

	/**
	 * Método que devuelve el costo del seguro de Daños a Terceros
	 * @return costo
	 */
	public double costoDañosATerceros(){

		return 4500.00;
	}

	/**
	 * Método que devuelve el costo del seguro de Cobertura Limitada
	 * @return costo
	 */
	public double costoCoberturaLimitada(){

		return 1700.00;
	}

	/**
	 * Método que devuelve el costo del seguro de Cobertura Extendida
	 * @return costo
	 */
	public double costoCoberturaExtendida(){

		return 7800.00;
	} 
    
}
