package Clases;

public class ReservaAsientos {
	
	private ListaEvento evento;
	private ListaCliente cliente;
	private ListaAsiento asiento;
	private String rutCliente;
	private int idEvento;
	private int cantidadAsientoNiños;
	private int cantidadAsientoAbuelo;
	private int cantidadAsientoGeneral;
	private int totalreserva;
	
	
	//CONSTRUCTORES
	
	
	
	/**
	 * @param evento
	 * @param cliente
	 * @param asiento
	 * @param rutCliente
	 * @param idEvento
	 * @param cantidadAsientoNiños
	 * @param cantidadAsientoAbuelo
	 * @param cantidadAsientoGeneral
	 * @param totalreserva
	 */
	public ReservaAsientos(ListaEvento evento, ListaCliente cliente, ListaAsiento asiento, String rutCliente,
			int idEvento, int cantidadAsientoNiños, int cantidadAsientoAbuelo, int cantidadAsientoGeneral,
			int totalreserva) {
		this.evento = evento;
		this.cliente = cliente;
		this.asiento = asiento;
		this.rutCliente = rutCliente;
		this.idEvento = idEvento;
		this.cantidadAsientoNiños = cantidadAsientoNiños;
		this.cantidadAsientoAbuelo = cantidadAsientoAbuelo;
		this.cantidadAsientoGeneral = cantidadAsientoGeneral;
		this.totalreserva = totalreserva;
	}

	
	public ReservaAsientos() {
	}
	
	
	
	//GETTERS & SETTERS

	
	
	public ListaEvento getEvento() {
		return evento;
	}


	public void setEvento(ListaEvento evento) {
		this.evento = evento;
	}


	public ListaCliente getCliente() {
		return cliente;
	}


	public void setCliente(ListaCliente cliente) {
		this.cliente = cliente;
	}


	public ListaAsiento getAsiento() {
		return asiento;
	}


	public void setAsiento(ListaAsiento asiento) {
		this.asiento = asiento;
	}


	public String getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}


	public int getIdEvento() {
		return idEvento;
	}


	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}


	public int getCantidadAsientoNiños() {
		return cantidadAsientoNiños;
	}


	public void setCantidadAsientoNiños(int cantidadAsientoNiños) {
		this.cantidadAsientoNiños = cantidadAsientoNiños;
	}


	public int getCantidadAsientoAbuelo() {
		return cantidadAsientoAbuelo;
	}


	public void setCantidadAsientoAbuelo(int cantidadAsientoAbuelo) {
		this.cantidadAsientoAbuelo = cantidadAsientoAbuelo;
	}


	public int getCantidadAsientoGeneral() {
		return cantidadAsientoGeneral;
	}


	public void setCantidadAsientoGeneral(int cantidadAsientoGeneral) {
		this.cantidadAsientoGeneral = cantidadAsientoGeneral;
	}


	public int getTotalreserva() {
		return totalreserva;
	}


	public void setTotalreserva(int totalreserva) {
		this.totalreserva = totalreserva;
	}
	
	
	
	//METODOS
	
	
	
	public boolean agregarReserva(ReservaAsientos nuevo) {
		if(this.getCliente().getCliente().validarRut(nuevo.getRutCliente())) {
			this.setIdEvento(nuevo.getIdEvento());
			this.setRutCliente(nuevo.getRutCliente());
			this.setTotalreserva(nuevo.getTotalreserva());
			this.setCantidadAsientoAbuelo(nuevo.getCantidadAsientoAbuelo());
			this.setCantidadAsientoGeneral(nuevo.getCantidadAsientoGeneral());
			this.setCantidadAsientoNiños(nuevo.getCantidadAsientoNiños());
			return true;
		}
		return false;
	}
	
	public boolean modificarReserva(ReservaAsientos modReserva) {
		if(this.getCliente().getCliente().validarRut(modReserva.getRutCliente())){
			if(modReserva.getAsiento().getAsiento().getTipo().equals("Abuelo")) {
				this.setCantidadAsientoAbuelo(modReserva.getCantidadAsientoAbuelo());
			}
			if(modReserva.getAsiento().getAsiento().getTipo().equals("Niño")) {
				this.setCantidadAsientoNiños(modReserva.getCantidadAsientoNiños());
			}
			if(modReserva.getAsiento().getAsiento().getTipo().equals("General")) {
				this.setCantidadAsientoGeneral(modReserva.getCantidadAsientoGeneral());
			}
			return true;
		}
		return false;
	}
	
	public void eliminarReserva(ReservaAsientos eliminarReserva) {
		if(this.getCliente().buscarCliente(eliminarReserva.getRutCliente())!=null) {
			this.setRutCliente(null);
			this.setIdEvento(-1);
			this.setTotalreserva(-1);
			this.setAsiento(null);
			this.setCantidadAsientoAbuelo(-1);
			this.setCantidadAsientoGeneral(-1);
			this.setCantidadAsientoNiños(-1);
			this.setCliente(null);
			this.setEvento(null);
		}
	}
	
	public int subtotalNiños(int cantidad, int precio) {
		int subtotal =0;
		subtotal= cantidad*precio;
		return subtotal;
	}
	
	public int subtotalAbuelo(int cantidad, int precio) {
		int subtotal =0;
		subtotal= cantidad*precio;
		return subtotal;
	}
	
	public int subtotalGeneral(int cantidad, int precio) {
		int subtotal =0;
		subtotal= cantidad*precio;
		return subtotal;
	}
}
