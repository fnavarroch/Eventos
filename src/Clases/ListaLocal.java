package Clases;

import java.util.ArrayList;
/**
 * 
 * @author Felipe Navarro Chamaca
 *
 */
public class ListaLocal {
	
	private Local locales;
	private ArrayList<Local> listaLocal = new ArrayList<Local>();
	
	//CONTRUCTORES
	
	/**
	 * @param locales
	 * @param listaLocal
	 */
	public ListaLocal(Local locales, ArrayList<Local> listaLocal) {
		this.locales = locales;
		this.listaLocal = listaLocal;
	}

	public ListaLocal() {
	}

	//GETTERS & SETTERS
	
	public ArrayList<Local> getListaLocal() {
		return listaLocal;
	}

	public void setListaLocal(ArrayList<Local> listaLocal) {
		this.listaLocal = listaLocal;
	}
	
	public Local getLocales() {
		return locales;
	}

	public void setLocales(Local locales) {
		this.locales = locales;
	}
	

	//METODOS
	

	public boolean agregarLocalaLista(Local newLocal, Asiento newAsiento) {
		
			ListaLocal nuevoLocal = new ListaLocal();
			nuevoLocal.locales.agregarLocal(newLocal, newAsiento);
			this.setListaLocal(nuevoLocal.getListaLocal());
		
			return true;
	
	}
	
	public boolean modificarListaLocal(ListaLocal modLocal, int idLocal) {
		
		if(listaLocal.isEmpty()) {
			return false;	
		}
		else {
			for(int i=0; i<this.listaLocal.size();i++) {
				Local locales = this.listaLocal.get(i);
				if(locales.ValidarLocal(idLocal)) {
					locales.modificarLocal(modLocal.locales, modLocal.locales.getAsientos().getAsiento());
					this.listaLocal.set(i, locales);
					return false;
				}
			}
			return false;
		}		
	}
	
	public boolean eliminarSedes() {
		if(listaLocal.isEmpty()) {
			return false;
		}
		else {
			listaLocal.clear();
			return true;
		}
	}
	
	public boolean eliminarSedes(int idSede) {
		if(listaLocal.isEmpty()) {
			return false;
		}
		else {
			for(int i=0; i<listaLocal.size();i++) {
				Local loc = listaLocal.get(i);
				if(loc.getId() == idSede)
				{
					listaLocal.remove(loc);
					return true;
				}
			}
			return false;
		}
	}
	public String buscarSede(String sede) {
		if(this.listaLocal.isEmpty()) {
			return null;
		}
		else {
			for(int i =0; i<this.listaLocal.size();i++) {
				Local local = this.listaLocal.get(i);
				if(sede.equals(local.getNombre())) {
					return sede;
				}
			}
		}
		return null;
	}

}
