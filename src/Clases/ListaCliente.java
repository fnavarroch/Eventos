/**
 * 
 */
package Clases;

import java.util.ArrayList;

/**
 * @author Felipe Navarro Chamaca
 *
 */
public class ListaCliente {
	
	private Cliente cliente;
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

	//CONSTRUCTORES
	
	/**
	 * @param cliente
	 * @param ListaCliente
	 */
	public ListaCliente(Cliente cliente, ArrayList<Cliente> listaCliente) {
		this.cliente = cliente;
		this.listaCliente = listaCliente;
	}
	public ListaCliente() {
	}
	
	//GETTERS & SETTERS
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	//METODOS
	
	public boolean agregarCliente(Cliente nuevo) {
		if(this.cliente.validarRut(nuevo.getRut())) {
			return false;
		}
		else {
			if(this.cliente.agregarCliente(nuevo))
			{
				this.listaCliente.add(nuevo);
				return true;
			}
			return false;
		}
	}
	
	public boolean modificarCliente(Cliente modCliente) {
		
		if(this.listaCliente.isEmpty()) {
			return false;
		}
		else {
			for(int i =0; i<this.listaCliente.size();i++) {
				Cliente modificar = this.listaCliente.get(i);
				if(modificar.validarRut(modCliente.getRut())) {
					modificar.modificarCliente(modCliente);
					this.listaCliente.set(i, modificar);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean eliminarCliente() {
		if(this.listaCliente.isEmpty())
		{
			return false;
		}
		else {
			this.listaCliente.clear();
			return true;
		}
	}
	
	public boolean eliminarCliente(String rut) {
		if(this.listaCliente.isEmpty()) {
			return false;
		}
		else {
			for(int i = 0; i<this.listaCliente.size();i++) {
				Cliente cliente = this.listaCliente.get(i);
				if(cliente.validarRut(rut)) {
					this.listaCliente.remove(cliente);
					return true;
				}
			}
			return false;
		}
	}
	
	public Cliente buscarCliente(String rut) {
		if(this.listaCliente.isEmpty()) {
			return null;
		}
		else {
			for(int i = 0; i<this.listaCliente.size();i++) {
				Cliente cliente = this.listaCliente.get(i);
				if(cliente.validarRut(rut)) {
					return cliente;
				}
			}
			return null;
		}
	}
	
	public Cliente buscarCliente(Cliente cliente) {
		if(this.listaCliente.isEmpty()) {
			return null;
		}
		else {
			if(this.listaCliente.contains(cliente)) {
				return cliente;
			}
			return null;
		}
	}
	public String obtenerRut(Cliente buscar) {
		if(this.listaCliente.isEmpty()) {
			return null;
		}
		else {
			if(this.buscarCliente(buscar)!=null) {
				return buscar.getRut();
			}
		}
		return null;
	}
}
