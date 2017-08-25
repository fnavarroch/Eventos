package Clases;

import java.util.ArrayList;

public class Cliente {
	
	//Variables de instancia
	
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	
	//Constructores
	
	public Cliente(String nombre, String apellido, String rut, int edad,ArrayList<Cliente> clientes){
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.edad=edad;
		this.listaClientes = clientes;
		
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	//geters y seters
	
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
	
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	//metodos
	public boolean agregarCliente(String nombre, String apellido, String rut, int edad){
		
		if(buscarCliente(rut))//Se valida la existencia del Cliente
			return false;
		else//Si el cliente no existe se crea el objeto Cliente y se agrega a lista de clientes.
		{
			Cliente nuevo = new Cliente();
			nuevo.setNombre(nombre);
			nuevo.setApellido(apellido);
			nuevo.setRut(rut);
			nuevo.setEdad(edad);
			listaClientes.add(nuevo);
			return true;
		}
	}

	public boolean buscarCliente(String rut)//Se busca en la lista Si existe Algun Cliente con el rut asociado
	{
		Cliente aux = new Cliente();
		for(int i=0; i<listaClientes.size();i++)
		{
			aux= (Cliente) listaClientes.get(i);
			if(rut.equals(aux.getRut()))
			{
				return true;
			}
		}
		return false;
	}
	public Cliente buscarCliente(Cliente nuevo)
	{
		if(listaClientes.isEmpty())
			return null;
		else {
			Cliente aux = new Cliente();
			for(int i=0; i<listaClientes.size();i++)
			{
				aux = (Cliente) listaClientes.get(i);
				if(aux==nuevo)
					return aux;
			}
			
		}
		return null;
		
	}
	public boolean EliminarCliente(String rut) {//elimina un cliente especifico de la lista de clientes
		if(listaClientes.isEmpty())
			return false;
		else{
			Cliente aux = new Cliente();
			for(int i=0; i<listaClientes.size();i++) {
				aux= (Cliente) listaClientes.get(i);
				if(rut.equals(aux.getRut())) {
					listaClientes.remove(i);
					return true;
				}
			}		
		}
		return false;
	}
	
	public boolean EliminarCliente() {//elimina toda la lista de clientes al eliminar el evento donde esta asociado
		if(listaClientes.isEmpty())
			return true;
		else {
			listaClientes.removeAll(getListaClientes());
			return true;
		}
	}
	public boolean modificarCliente(String rut,Cliente clienteModificado) {
		if(listaClientes.isEmpty())
			return false;
		else {
			Cliente aux = new Cliente();
			for(int i =0; i<listaClientes.size(); i++) {
				aux= (Cliente)listaClientes.get(i);
				if(buscarCliente(rut)){
					if(clienteModificado.getRut()!=null)
					{
						aux.setRut(clienteModificado.getRut());
					}
					if(clienteModificado.getNombre()!=null)
					{
						aux.setNombre(clienteModificado.getNombre());	
					}
					if(clienteModificado.getApellido()!=null)
					{
						aux.setApellido(clienteModificado.getApellido());	
					}
					if(clienteModificado.getEdad()>=0)
					{
						aux.setEdad(clienteModificado.getEdad());
					}
						
				}
			}
		}
		return false;
	}

}
