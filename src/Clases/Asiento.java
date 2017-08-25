package Clases;

import java.io.IOException;


public class Asiento {

	//Variables de instancia
	
	private int numero;
	private Cliente cliente ;  
	 
	
	//Constructor
	
	public Asiento(int numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		
	}


	public Asiento() {
		// TODO Auto-generated constructor stub
	}


	//Métodos

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}


	public Asiento AgregarAsiento(int numero, Cliente cli) throws IOException{
	
		Asiento asiento = new Asiento();
		
		asiento.setNumero(numero);
		asiento.setCliente(cli.agregarCliente());
	
		return asiento;
	}

}
