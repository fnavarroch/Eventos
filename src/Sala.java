
import java.io.*;
import java.util.*;

public class Sala {

	//Variables de instancia
	
	private String id;
	private ArrayList<Sala> sala ;
	private ArrayList<Asiento> asientos;

	//Constructor

	public Sala(String id, ArrayList<Asiento> asientos) {
		
		this.id = id;
		this.asientos = asientos;
	}

	public Sala() {
		// TODO Auto-generated constructor stub
	}

	//Métodos
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	
	ArrayList<Sala> salas = new ArrayList<Sala>();
	Sala objSala = new Sala();
	
	public void agregarSala(String id) throws IOException{
		
		int i=1 ;
		String sala ; 
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		do{
			
			sala = lector.readLine();
			objSala.setId(sala);
			salas.add(objSala);
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
		for(int i=0;i<salas.size();i++)
		{
			if(salas.isEmpty())
			{
				System.out.println("no existen Salas creadas");
			}
			else
			{
				System.out.println(salas.get(i));
			}
		
		}
	}
}