package Clases;
/**
 * 
 * @author Felipe Navarro Chamaca
 *
 */
public class Local {
	
	private int id;					//Identificador de la Sede
	private String nombre ;         //Nombre de la sede    
	private String ubicacion;		//Ciudad de la sede
	private ListaAsiento asientos;	//Lista con los Precios y Cantidad de Asientos posee la sede
	
	//CONTRUCTORES
	
	/**
	 * @param id
	 * @param nombre
	 * @param ubicacion
	 */
	public Local(int id, String nombre, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Local() {
	}

	
	// GETTERS & SETTERS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ListaAsiento getAsientos() {
		return asientos;
	}

	public void setAsientos(ListaAsiento asientos) {
		this.asientos = asientos;
	}
	
	// METODOS

	public boolean ValidarLocal(int id) {
		if(id == this.getId()) {
			return true;
		}
		return false;
	}
	
	public boolean agregarLocal(Local nuevoLocal, Asiento nuevoAsiento) {
		if(this.ValidarLocal(nuevoLocal.getId())) {
			return false;
		}
		else {
			this.setId(nuevoLocal.getId());
			this.setNombre(nuevoLocal.getNombre());
			this.setUbicacion(nuevoLocal.getUbicacion());
			this.asientos.agregarAsientoaLista(nuevoAsiento);
			this.setAsientos(this.asientos);
			return true;
		}
		
	}

	public boolean modificarLocal(Local modLocal, Asiento modAsiento) {
		if(modLocal.ValidarLocal(modLocal.getId())) {
			this.setId(modLocal.getId());
			this.setNombre(modLocal.getNombre());
			this.setUbicacion(modLocal.getUbicacion());
			this.getAsientos().modificarAsientos(modAsiento);
			return true;
		}
		return false;
	}
	
	public void eliminarLocal(int Id) {
		if(this.ValidarLocal(id)) {
			this.setId(-1);
			this.setNombre(null);
			this.setUbicacion(null);
			this.getAsientos().eliminarTodosLosAsientos();
			this.setAsientos(null);
		}
	}
	
	

}	