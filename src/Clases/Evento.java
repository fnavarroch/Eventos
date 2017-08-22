package Clases;

import java.util.ArrayList;

public class Evento {

	private int id;
	private String nombre;
	private String ciudad;
	private Local sede;
	private ArrayList<Local> local;
	private ArrayList<Evento> evento;
	private ArrayList<Evento> listaEvento = new ArrayList<Evento>();
	
	public Evento(int id, String nombre, String ciudad, Local sede, ArrayList<Local> local, ArrayList<Evento> evento,
			ArrayList<Evento> listaEvento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.sede = sede;
		this.local = local;
		this.evento = evento;
		this.listaEvento = listaEvento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Local getSede() {
		return sede;
	}
	public void setSede(Local sede) {
		this.sede = sede;
	}
	public ArrayList<Local> getLocal() {
		return local;
	}
	public void setLocal(ArrayList<Local> local) {
		this.local = local;
	}
	public ArrayList<Evento> getEvento() {
		return evento;
	}
	public void setEvento(ArrayList<Evento> evento) {
		this.evento = evento;
	}
	public ArrayList<Evento> getListaEvento() {
		return listaEvento;
	}
	public void setListaEvento(ArrayList<Evento> listaEvento) {
		this.listaEvento = listaEvento;
	}
	
	
}
