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
	/**
	 * Se verifica que no exista el cliente en la lista 
	 * si exite se retorna un false
	 * si no existe se agrega a la lista y se retorna un true;
	 */
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
	
	/**
	 * Verifica que la lista no este vacia para realizar la modificacion
	 * busca el cliente que coincida con el rut del cliente a modificar
	 * se vuelve a ingresar el nuevo cliente en la lista en su posicion 
	 */
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
	
	/**
	 * Elimina la lista completa de Clientes
	 */
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
	
	
	/**
	 * Elimina a un cliente en especifico 
	 * se valida que hayan clientes en la lista y luego se busca al cliente a eliminar
	 */
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
	
	/**
	 * Se busca un Cliente mediante su rut y se retorna al cliente especifico
	 */
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
	
	/**
	 * Busca en la lista si existe un objeto Cliente igual en la lista
	 * si existe lo retorna
	 */
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
	
	/**
	 * retorna el rut de un Cliente especifico
	 */
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
