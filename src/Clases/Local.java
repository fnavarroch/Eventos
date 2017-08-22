package Clases;

import java.util.ArrayList;

public class Local {
	
	private String ubicacion ;
	private int fecha ;
	private ArrayList<Sala> salas;
	private ArrayList<Local> listaLocal = new ArrayList <Local>(); // almacena lista de los locales
	
	public Local(String ubicacion, int fecha, ArrayList<Sala> salas, ArrayList<Local> listaLocal) {
		super();
		this.ubicacion = ubicacion;
		this.fecha = fecha;
		this.salas = salas;
		this.listaLocal = listaLocal;
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

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public ArrayList<Local> getListaLocal() {
		return listaLocal;
	}

	public void setListaLocal(ArrayList<Local> listaLocal) {
		this.listaLocal = listaLocal;
	}
	
	
}
