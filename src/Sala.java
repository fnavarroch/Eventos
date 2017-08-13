import java.util.*;

public class Sala {

	//Variables de instancia
	
	private String id;
	private ArrayList<Asiento> asientos;

	//Constructor

	public Sala(String id, ArrayList<Asiento> asientos) {
		
		this.id = id;
		this.asientos = asientos;
	}

	//Métodos
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	
	
	
	
	
	
	
}
