package Clases;
public class Asiento {

	//Variables de instancia
	
	private int numero;
	private Cliente c;
	
	//Constructor
	
	public Asiento(int numero) {
		this.numero = numero;
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
	
	
}
