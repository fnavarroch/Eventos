import java.util.*;

public class Local {
	
	private String ubicacion ;
	private int fecha ;
	private ArrayList<Sala> salas;
	private ArrayList<Local> local ;
	
	public Local(ArrayList<Sala> salas, String ubicacion, int fecha) {
		super();
		this.salas = salas;
		this.ubicacion = ubicacion;
		this.fecha = fecha;
	}


	public ArrayList<Sala> getSalas() {
		return salas;
	}


	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
