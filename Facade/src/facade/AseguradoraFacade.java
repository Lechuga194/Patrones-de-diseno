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
public class AseguradoraFacade {

	private Scanner sc;

	Registrar registrar;
	CotizarSeguro cotizar;
	ContratarSeguro contratar;
	CancelarSeguro cancelar;

	/**
	 * Constructor de AseguradoraFacade
	 * @param sc
	 */
	public AseguradoraFacade(Scanner sc){

		this.sc = sc;
		
		registrar = new Registrar(sc);
		cotizar = new CotizarSeguro(sc);
		contratar = new ContratarSeguro(sc);
		cancelar = new CancelarSeguro(sc);

	}


	/**
	 * Método para registrar a un usuario.
	 */
	public void registrarUsuario(){

		registrar.iniciarRegistro();

	}


	/**
	 * Método para cotizar un seguro.
	 */
	public void cotizarSeguro(){
		
		registrarUsuario();
		cotizar.llenarFormulario();
		

	}

	/**
	 * Método para contratar un seguro.
	 */
	public void contratarSeguro(){

		registrarUsuario();
		contratar.llenarFormulario();

	}

	/**
	 * Método para cancelar un seguro.
	 */
	public void cancelarSeguro(){

		registrarUsuario();
		cancelar.llenarFormulario();

	}


    
}
