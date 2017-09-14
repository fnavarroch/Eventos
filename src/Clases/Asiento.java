package Clases;
/**
 * 
 * @author Felipe Navarro Chamaca
 *
 */
public class Asiento {
	//Variables de instancia
	
		private int totalAsientos;	//Cantidad de Asientos
		private int precio;			//Precio del Asiento
		private String tipo;		//Tipo especifico de Asiento
		
		//Constructor
		
		public Asiento(int total, int precio, String tipo) {
			this.totalAsientos = total;
			this.precio = precio;
			this.tipo = tipo;
		}
		
		public Asiento() {
			// TODO Auto-generated constructor stub
		}

		
	   // Getters & Setters

		
		public int getTotalAsientos() {
			return totalAsientos;
		}

		public void setTotalAsientos(int total) {
			this.totalAsientos = total;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}
		
		
		//Metodos
		
		public boolean agregarAsiento(Asiento nuevo) {
			if(nuevo.getTotalAsientos()>0)
			{
				this.setTotalAsientos(nuevo.getTotalAsientos());
				this.setPrecio(nuevo.getPrecio());
				this.setTipo(nuevo.getTipo());
				return true;
			}
			return false;
		}
		
		public void eliminarAsiento(String tipo) {
			if(!tipo.equalsIgnoreCase(null))
			{
				this.setTipo(null);
				this.setTotalAsientos(-1);
				this.setPrecio(-1);
			}		
		}
		
		/**
		 * Verifica que el tipo obtenido sea el mismo que el del que existe si es asi se cambian
		 * la cantidad de asientos y el precio de estos mismos
		 */
		public boolean modificarAsiento(Asiento modAsiento) {
			if(modAsiento.getTipo().equals(this.getTipo())) {
				this.setTotalAsientos(modAsiento.getTotalAsientos());
				this.setPrecio(modAsiento.getPrecio());
				return true;
			}
			return false;
		}
		
		/**
		 * Al total de Asientos disponibles se le resta la cantida solicitada por el cliente al momento de realizar la reserva
		 * si la cantidad pedida es mayor a la disponible se retorna un -1 para volver a recibir la cantidad
		 * sino se resta la cantidad al total disponible
		 */
		public int restaReservaAsiento(String tipo, int cantAsiento) {
			if(tipo.equals(this.getTipo())) {
				if(this.getTotalAsientos()<cantAsiento) {
					return -1;
				}
				else {
					this.setTotalAsientos(this.getTotalAsientos()-cantAsiento);
					return this.getTotalAsientos();
				}
			}
			return -1;
		}
		
		/***
		 * Si la reserva es Eliminada se retorna la cantidad de asientos pedidos por el Cliente
		 */
		public void SumarAsientos(String tipo, int total) {
			int suma =0;
			if(tipo.equals(this.getTipo())) {
				suma = this.getTotalAsientos()+total;
				this.setTotalAsientos(suma);
			}
				
			
		}

		
}
	
	 
	