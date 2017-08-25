package Clases;

import java.util.ArrayList;

public class Asiento {
	//Variables de instancia
	
		private int total;
		private String tipo;
		private ArrayList<Sala> listaSala = new ArrayList<Sala>();
		private ArrayList<Asiento> listaTipoAsiento = new ArrayList<Asiento>();
	
		//Constructor
		public Asiento(int total, String tipo, ArrayList<Sala> listaSala, ArrayList<Asiento> listaTipoAsiento) {
			super();
			this.total = total;
			this.tipo = tipo;
			this.listaSala = listaSala;
			this.listaTipoAsiento = listaTipoAsiento;
		}
		
		public Asiento() {
			// TODO Auto-generated constructor stub
		}

		//Geters y Seters

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public String getTipo() {
			return tipo;	
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public ArrayList<Asiento> getListaTipoAsiento() {
			return listaTipoAsiento;
		}

		public void setListaTipoAsiento(ArrayList<Asiento> listaTipoAsiento) {
			this.listaTipoAsiento = listaTipoAsiento;
		}
		//Metodos
		
		public boolean AgregarAsiento(int cantidad, String tipo) {
			if(tipo!=null && cantidad>=0)
				return false;
			else {
				Asiento aux = new Asiento();
				for(int i =0; i<listaTipoAsiento.size();i++)
				{
					aux = (Asiento) listaTipoAsiento.get(i);
					if(!tipo.equals(aux.getTipo()))
						aux.setTipo(tipo);
						aux.setTotal(cantidad);
						listaTipoAsiento.add(aux);
						return true;
					
				}
				return false;
			}
		}
		
		
		
		

}
	
	 
	