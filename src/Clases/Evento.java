package Clases;

/**
 * 
 * @author Felipe Navarro Chamaca
 *
 */
public class Evento {
	
	private int idEvento;						//Codigo identificador del Evento
	private String tipoEvento;					//Tipo de Evento ("S" si es Seminario, "C" si es charla)
	private String NombreEvento;				//Nombre del Evento
	private String fecha;						//Fecha del Evento formato dd/mm/aaaa
	private ListaCliente clientes;				//Lista de los Clientes
	private ListaLocal locales;					//Lista de los Locales
	private ListaReservaASiento reservaAsiento;	//Lista de las reservas realizadas
	
	//CONSTRUCTORES

	public Evento() {
		
	}
	
	/**
	 * @param idEvento
	 * @param tipoEvento
	 * @param nombreEvento
	 * @param fecha
	 * @param clientes
	 * @param locales
	 * @param reservaAsiento
	 */
	public Evento(int idEvento, String tipoEvento, String nombreEvento, String fecha, ListaCliente clientes,
			ListaLocal locales, ListaReservaASiento reservaAsiento) {
		this.idEvento = idEvento;
		this.tipoEvento = tipoEvento;
		NombreEvento = nombreEvento;
		this.fecha = fecha;
		this.clientes = clientes;
		this.locales = locales;
		this.reservaAsiento = reservaAsiento;
	}

	//GETTERS & SETTERS
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public String getNombreEvento() {
		return NombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		NombreEvento = nombreEvento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public ListaCliente getClientes() {
		return clientes;
	}
	public void setClientes(ListaCliente clientes) {
		this.clientes = clientes;
	}
	public ListaReservaASiento getReservaAsiento() {
		return reservaAsiento;
	}

	public void setReservaAsiento(ListaReservaASiento reservaAsiento) {
		this.reservaAsiento = reservaAsiento;
	}

	public ListaLocal getLocales() {
		return locales;
	}
	public void setLocales(ListaLocal locales) {
		this.locales = locales;
	}
	
	//METODOS
	
	
	
	public boolean agregarEvento(Evento nuevo) {
		if(this.validarIDEvento(nuevo.getIdEvento())) {
			return false;
		}
		else{
			this.setIdEvento(nuevo.getIdEvento());
			this.setNombreEvento(nuevo.getNombreEvento());
			this.setFecha(nuevo.getFecha());
			this.setTipoEvento(nuevo.getTipoEvento());
			this.setClientes(nuevo.getClientes());
			this.getClientes().agregarCliente(nuevo.getClientes().getCliente());
			this.setLocales(nuevo.getLocales());
			Local nuevoLocal = nuevo.getLocales().getLocales();
			Asiento nuevoAsiento = nuevo.getLocales().getLocales().getAsientos().getAsiento();
			this.getLocales().agregarLocalaLista(nuevoLocal, nuevoAsiento);
			return true;
		}
	}
	
	public boolean ModificarEvento(Evento modEvento) {
		if(this.validarIDEvento(modEvento.getIdEvento())) {
			if(modEvento.getIdEvento()>-1) {
				this.setIdEvento(modEvento.getIdEvento());
			}
			if(!modEvento.getFecha().equals(null)) {
				this.setFecha(modEvento.fecha);
			}
			if(!modEvento.getNombreEvento().equals(null)) {
				this.setNombreEvento(modEvento.getNombreEvento());
			}
			if(!modEvento.getTipoEvento().equals(null)) {
				this.setTipoEvento(modEvento.getTipoEvento());
			}
			if(!modEvento.getClientes().equals(null)) {
				Cliente modCliente = modEvento.getClientes().getCliente();
				this.getClientes().modificarCliente(modCliente);
				this.setClientes(modEvento.getClientes());
			}
			if(!modEvento.getLocales().equals(null)) {
				ListaLocal modLocal = modEvento.getLocales();
				this.getLocales().modificarListaLocal(modLocal,modLocal.getLocales().getId());
				this.setLocales(modLocal);
			}
			return true;
		}
		return false;
	}
	
	public boolean eliminarEvento(int idEvento) {
		if(this.validarIDEvento(idEvento)) {
			this.setTipoEvento(null);
			this.setIdEvento(-1);
			this.setNombreEvento(null);
			this.setFecha(null);
			this.getClientes().eliminarCliente();
			this.getLocales().eliminarSedes();
			this.setClientes(null);
			this.setLocales(null);
			this.getReservaAsiento().eliminarReservas();
			this.setReservaAsiento(null);
			return true;
		}
		return false;
	}
	
	public boolean validarFechaEvento(String fecha) {
		if(fecha.equals(this.fecha))
		{
			return true;
		}
		return false;
	}
	
	public boolean validarSedeEvento(String sede) {
		if(sede.equals(this.getLocales().buscarSede(sede))) {
			return true;
		}
		return false;
	}
	
	public boolean validarIDEvento(int id) {
		if(id==this.idEvento) {
			return true;
		}
		return false;
	}
}
