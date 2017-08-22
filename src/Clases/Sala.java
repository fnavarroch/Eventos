package Clases;

import java.io.*;
import java.util.*;

public class Sala {

	//Variables de instancia
	
	private String id;
	private int totalAsientos;
	private Asiento asiento ;
	private ArrayList<Sala> listaSala = new ArrayList<Sala>();// lista que almacena a las salas

	//Constructor

	public Sala(String id, int totalAsientos, Asiento asiento, ArrayList<Sala> listaSala) {
		super();
		this.id = id;
		this.totalAsientos = totalAsientos;
		this.asiento = asiento;
		this.listaSala = listaSala;
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

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

	public ArrayList<Sala> getListaSala() {
		return listaSala;
	}

	public void setListaSala(ArrayList<Sala> listaSala) {
		this.listaSala = listaSala;
	}

	
	
	public void agregarSala(String id) throws IOException{
		Sala objSala = new Sala();
		int i=1 ;
		String sala ; 
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		do{
			
			System.out.println(" Desea agregar sala ");
			sala = lector.readLine();
			objSala.setId(sala);
			listaSala.add(objSala);
			// Agregar llamada a metodo de agregar asientos 
			
			do{
			System.out.println("¿Desea Agregar otra Sala?, si ingrese 1 sino ingrese 0");
			i= Integer.parseInt(lector.readLine());
			}while(i>-1 && i<2);
		
		}while(i==1);
	}


	public void mostrarTodasSalas(){
		//se muestran todas las salas del arraylist
		System.out.println("Las Salas existentes Son:");
		for(int i=0;i<listaSala.size();i++)
		{
			if(listaSala.isEmpty())
			{
				System.out.println("no existen Salas creadas");
			}
			else
			{
				System.out.println(listaSala.get(i));
			}
	
	
	
		}
	}
}