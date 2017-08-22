package Clases;

import java.util.ArrayList;

public class Asiento {

	//Variables de instancia
	
	private int numero;
	private Cliente c;
	private ArrayList<Sala> sala = new ArrayList<Sala>();
	//Constructor
	
	public Asiento(int numero, Cliente c, ArrayList<Sala> sala) {
		super();
		this.numero = numero;
		this.c = c;
		this.sala = sala;
	}


	//Métodos
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}


	public ArrayList<Sala> getSala() {
		return sala;
	}


	public void setSala(ArrayList<Sala> sala) {
		this.sala = sala;
	}
	
	public boolean AgregarAsiento(int totalAsiento, ArrayList<Sala> sala) {
	
		return false;
	}
}
