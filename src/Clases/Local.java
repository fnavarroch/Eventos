package Clases;

import java.io.IOException;
import java.util.ArrayList;

public class Local {
	
	private String nombre ;             //clave
	private String ubicacion ;
	private ArrayList<Sala> listaSalas = new ArrayList<Sala>();
	
	public Local(String nombre ,String ubicacion, ArrayList<Sala>listaSalas) {
		super();
		this.nombre=nombre;
		this.ubicacion = ubicacion;
		this.listaSalas = listaSalas;
	}

	public Local() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Sala> getListaSalas() {
		return listaSalas;
	}
	public void setListaSalas(ArrayList<Sala> listaSalas) {
		this.listaSalas = listaSalas;
	}
	
	
	public void agregarLocal(String nombre, String ubicacion) throws IOException{
		Local objLocal = new Local();
		Sala objSala = new Sala();
		String idLocal=null;
		int totalAsientos = 0;
		ArrayList<Asiento> listaAsiento = null;
		
		objLocal.setNombre(nombre);
		objLocal.setUbicacion(ubicacion);
		objLocal.setListaSalas(listaSalas);
		
		listaSalas.add(objSala.agregarSala(idLocal, totalAsientos, listaAsiento));
		
	}


	public void mostrarTodasSalas(){
		//se muestran todos los locales
	}
}
