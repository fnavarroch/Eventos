package Clases;
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
		
		public boolean modificarAsiento(Asiento modAsiento) {
			if(modAsiento.getTipo().equals(this.getTipo())) {
				this.setTotalAsientos(modAsiento.getTotalAsientos());
				this.setPrecio(modAsiento.getPrecio());
				return true;
			}
			return false;
		}
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
		
		public void SumarAsientos(String tipo, int total) {
			int suma =0;
			if(tipo.equals(this.getTipo())) {
				suma = this.getTotalAsientos()+total;
				this.setTotalAsientos(suma);
			}
				
			
		}

		
}
	
	 
	