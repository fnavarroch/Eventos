import java.util.ArrayList;

public class Asiento {

	//Variables de instancia
	
	private int numero;
	private Cliente c;
	private ArrayList<Asiento> asiento ;
	private ArrayList<Cliente> cliente ;
	
	
	//Constructor
	
	public Asiento(int numero) {
		this.numero = numero;
	}

	//M�todos
	
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
