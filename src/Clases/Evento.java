package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Evento {

	private int id;
	private String nombre;
	private String ciudad;
	private Local sede;
	private String fecha ; 
	
	
	private ArrayList<Evento> listaEvento = new ArrayList<Evento>();
	private ArrayList<Local> listaLocal = new ArrayList<Local>();
	
	public Evento(int id, String nombre, String ciudad, Local sede,String fecha, ArrayList<Evento> listaEvento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.sede = sede;
		this.fecha = fecha;

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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public ArrayList<Evento> getListaEvento() {
		return listaEvento;
	}
	public void setListaEvento(ArrayList<Evento> listaEvento) {
		this.listaEvento = listaEvento;
	}
	
	
	
	public void agregarEvento(int id, String nombre, String ubicacion) throws IOException{
		Local objLocal = new Local();//  se crea objeto local
		
		int i=1 ;
		 
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		do{
			objLocal.setNombre(nombre);
			objLocal.setUbicacion(ubicacion);
			listaLocal.add(objLocal);
			
			// Agregar llamada a metodo de agregar asientos 
			
			do{
			System.out.println("¿Desea Agregar otro local?, si ingrese 1 sino ingrese 0");
			i= Integer.parseInt(lector.readLine());
			}while(i>-1 && i<2);
		
		}while(i==1);
	}


	public void mostrarTodasSalas(){
		//se muestran todos los locales del arraylist
		System.out.println("Las locales existentes Son:");
		for(int i=0;i<listaLocal.size();i++)
		{
			if(listaLocal.isEmpty())
			{
				System.out.println("no existen locales creados");
			}
			else
			{
				System.out.println(listaLocal.get(i));
			}
	
	
	
		}
	}
	
}
