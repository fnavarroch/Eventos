package Clases;
import java.util.ArrayList;
import javax.swing.*;

public class Cliente {
	
	//Variables de instancia
	
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();//lista que almacena a los clientes
	
	
	//Constructores
	
	public Cliente(String nombre, String apellido, String rut, int edad, ArrayList<Cliente> listaCliente){
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.edad=edad;
		this.listaCliente=listaCliente;
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
	
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	//Se agrega un nuevo cliente a la lista si es que existe 
	public boolean agregarCliente(Cliente c) {
		if(listaCliente.contains(c))
			return false;
		else
		{
			listaCliente.add(c);
			return true;
		}
	}
	public JList<String> mostrarTodosLosClientes(){
		DefaultListModel<String> lista = new DefaultListModel<String>();
		for(int i=0; i<this.getListaCliente().size();i++) {
			lista.addElement(this.getListaCliente().get(i).getRut());
		}
		JList<String> mostrarCliente = extracted(lista);
		return mostrarCliente;
		
		
	}

	private JList<String> extracted(DefaultListModel<String> lista) {
		return new JList<String>(lista);
	}
	public Cliente buscarClientePorRut(String r){
		Cliente datosCliente = new Cliente();
		for(int i=0; i<listaCliente.size();i++) {
			datosCliente= listaCliente.get(i);
			if(datosCliente.getRut().equals(r)) {
				return datosCliente;
			}
		}
		return null;
	}
	public int totalEntradaCompradas(int cantidadEntradas,int precioEntradas)
	{
		int total=0;
		total= cantidadEntradas*precioEntradas;
		return total;
	
	}
	
	

}
