
package Clases;

import java.util.ArrayList;

/**
 * 
 * @author Felipe Navarro Chamaca
 *
 */
public class ListaEventos {
	
	private Evento evento;
	private ArrayList<Evento> listaEvento = new ArrayList<Evento>();
	
	//CONSTRUCTORES
	
	/**
	 * @param evento
	 * @param listaEvento
	 */
	public ListaEventos(Evento evento, ArrayList<Evento> listaEvento) {
		this.evento = evento;
		this.listaEvento = listaEvento;
	}

	public ListaEventos() {
	}

	//GETTERS & SETTERS
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public ArrayList<Evento> getListaEvento() {
		return listaEvento;
	}

	public void setListaEvento(ArrayList<Evento> listaEvento) {
		this.listaEvento = listaEvento;
	}
	
	//METODOS
	
	/*
	 *agrega un evento si la lista esta vacia
	 *sino verifica que la sede este ocupada en una fecha especifica 
	 *y se agrega el evento a la lista 
	 */
	public boolean agregarEvento(Evento nuevo) {
		if(this.listaEvento.isEmpty()) {
			this.setEvento(nuevo);
			this.getEvento().agregarEvento(nuevo);
			this.getListaEvento().add(nuevo);
			return true;
		}
		else {
			for(int i=0; i<this.getListaEvento().size();i++) {
				Evento evento = this.getListaEvento().get(i);
				if(this.validarEvento(evento.getLocales().getLocales().getUbicacion(), evento.getFecha())) {
					return false;
				}
			}
			this.setEvento(nuevo);
			this.getEvento().agregarEvento(nuevo);
			this.getListaEvento().add(nuevo);
			return true;
		}
	}
	
	public boolean modificarEvento(Evento modEvento) {
		if(this.listaEvento.isEmpty()) {
			return false;
		}
		else {
			if(this.evento.ModificarEvento(modEvento)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean eliminarEventos() {
		if(this.listaEvento.isEmpty()) {
			return false;
		}
		else {
			this.listaEvento.clear();
			return true;
		}
	}
	
	public boolean eliminarEventos(int idEvento) {
		if(this.listaEvento.isEmpty()) {
			return false;
		}
		else {
			if(this.evento.validarIDEvento(idEvento)) {
				for(int i=0; i<this.listaEvento.size();i++) {
					Evento evento = this.listaEvento.get(i);
					if(evento.getIdEvento() == idEvento) {
						evento.eliminarEvento(idEvento);
						this.listaEvento.remove(evento);
						return true;
					}
				}
			}
			return false;
		}
	}
	
	public boolean validarEvento(String sede, String fecha) {
		for(int i =0; i<this.listaEvento.size();i++) {
			Evento evento = this.listaEvento.get(i);
			if(evento.getFecha().equals(sede) && evento.getFecha().equals(fecha)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Evento> filtrarCharlas(){
		ArrayList<Evento> charlas = new ArrayList<Evento>();
		for(int i=0; i<this.listaEvento.size();i++) {
			Evento evento = this.listaEvento.get(i);
			if(evento.getTipoEvento().equalsIgnoreCase("C")) {
				charlas.add(evento);
			}
		}
		return charlas;
	}
	
	public ArrayList<Evento> filtrarSeminarios(){
		ArrayList<Evento> seminarios = new ArrayList<Evento>();
		for(int i=0; i<this.listaEvento.size();i++) {
			Evento evento = this.listaEvento.get(i);
			if(evento.getTipoEvento().equalsIgnoreCase("S")) {
				seminarios.add(evento);
			}
		}
		return seminarios;
	}

}
