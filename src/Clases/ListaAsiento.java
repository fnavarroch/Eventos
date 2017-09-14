package Clases;

import java.util.ArrayList;
/**
 * 
 * @author Felipe Navarro Chamaca
 *
 */
public class ListaAsiento {
	private ArrayList<Asiento> listaAsiento = new ArrayList<Asiento>();	//Lista que Almacena los Asientos
	private Asiento asiento;											//Acceso a los Datos de los Asientos
	
	//Construtor
	


	public ListaAsiento() {
	}
	
	/**
	 * @param listaAsiento
	 * @param asiento
	 */
	public ListaAsiento(ArrayList<Asiento> listaAsiento, Asiento asiento) {
		this.listaAsiento = listaAsiento;
		this.asiento = asiento;
	}

	//Getters & Setters
	
	public ArrayList<Asiento> getListaAsiento() {
		return listaAsiento;
	}

	public void setListaAsiento(ArrayList<Asiento> listaAsiento) {
		this.listaAsiento = listaAsiento;
	}
	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
	//Metodos
	

	/*
	 * Agrega un nuevo tipo de asiento a la lista
	 */
	public boolean agregarAsientoaLista(Asiento nuevoAsiento) {
		Asiento nuevo = new Asiento();
		if(nuevo.agregarAsiento(nuevoAsiento))
		{
			listaAsiento.add(nuevo);
			return true;
		}
		return false;
	}
	
	/*
	 * Segun el tipo de asiento especifico modifica los atributos del asiento 
	 */
	public boolean modificarAsientos(Asiento modAsientos) {
		for(int i=0; i<this.listaAsiento.size();i++) {
			if(this.listaAsiento.get(i).getTipo().equals(modAsientos.getTipo())) {
				this.listaAsiento.get(i).modificarAsiento(modAsientos);
				this.listaAsiento.set(i, modAsientos);
				return true;
			}
		}
		return false;
	}
		/*
		 * Elimina todos los asientos de la lista
		 */
	public boolean eliminarTodosLosAsientos() {
		if(listaAsiento.isEmpty())
			return false;
		else {
			listaAsiento.clear();
			return true;
		}
	}
	
	/*
	 * busca un tipo de asiento en especifico y lo retorna con sus valores
	 */
	public Asiento buscarAsiento(String tipo) {
		if(this.listaAsiento.isEmpty()) {
			return null;
		}
		else {
			for(int i =0; i<this.listaAsiento.size();i++) {
				Asiento asiento = this.listaAsiento.get(i);
				if(tipo.equals(asiento.getTipo())) {
					return asiento;
				}
			}
			return null;
		}
		
	}
}
