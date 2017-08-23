package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente {
	
	//Variables de instancia
	
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	
	
	
	//Constructores
	
	public Cliente(String nombre, String apellido, String rut, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.edad=edad;
		
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	//Métodos
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Cliente agregarCliente() throws IOException{
	
		Cliente objCli = new Cliente(); 
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese nombre del cliente: ");
		objCli.nombre = lector.readLine();
		System.out.println("Ingrese apellido del cliente: ");
		objCli.apellido = lector.readLine();
		System.out.println("Ingrese rut del cliente: ");
		objCli.rut = lector.readLine();
		System.out.println("Ingrese edad del cliente: ");
		objCli.edad = Integer.parseInt(lector.readLine());
		
		return objCli;
	}

}
