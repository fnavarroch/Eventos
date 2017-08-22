package Clases;

import java.util.ArrayList;

public class Asiento {

	//Variables de instancia
	
	private int numero;

	private ArrayList<Cliente> cliente;
	private ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>(); // lista que almacena los asientos 
	//no lleva array list la clase asiento 
	//Constructor
	

	public Asiento(int numero, ArrayList<Cliente> cliente, ArrayList<Asiento> listaAsientos) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.listaAsientos = listaAsientos;
	}


	//Métodos

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public ArrayList<Cliente> getCliente() {
		return cliente;
	}


	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}


	public ArrayList<Asiento> getListaAsientos() {
		return listaAsientos;
	}


	public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	
	public boolean AgregarAsiento(int totalAsiento, ArrayList<Sala> sala) {
	
		return false;
	}

}
