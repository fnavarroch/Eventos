package Clases;

import java.io.*;
import java.util.*;

public class Sala {

	//Variables de instancia
	
	private String id;
	private int totalAsientos;
	private ArrayList<Asiento> listaAsiento = new ArrayList<Asiento>();
	

	//Constructor

	public Sala(String id, int totalAsientos, ArrayList<Asiento> listaAsiento) {
		super();
		this.id = id;
		this.totalAsientos = totalAsientos;
		this.listaAsiento = listaAsiento;
		
	}
	public Sala() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getTotalAsientos() {
		return totalAsientos;
	}
	
	public void setTotalAsientos(int totalAsientos) {
		this.totalAsientos = totalAsientos;
	}

	public ArrayList<Asiento> getListaAsiento() {
		return listaAsiento;
	}
	public void setListaAsiento(ArrayList<Asiento> listaAsiento) {
		this.listaAsiento = listaAsiento;
	}

	public Sala agregarSala(String id, int totalAsientos, ArrayList<Asiento> listaAsiento) throws IOException{
		Sala objSala = new Sala();
		Asiento objAsiento = new Asiento();
		Cliente cli = null;

		
		objSala.setId(id);
		objSala.setTotalAsientos(totalAsientos);
		objSala.setListaAsiento(listaAsiento);
		
		for(int i=0; i <totalAsientos; i++){
			listaAsiento.add(objAsiento.AgregarAsiento((i+1), cli));
		}
		
		return objSala;
	}


	public void mostrarTodasSalas(){
		//se muestran todas las salas
	}
}