package Clases;


public class Cliente {
	
	//Variables de instancia
	
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	
	
	//Constructores
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param edad
	 */
	public Cliente(String nombre, String apellido, String rut, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.edad = edad;
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

	
	//metodos
	
	public boolean validarRut(String rut) {
		if(rut.equals(this.getRut())) {
			return true;
		}
			
		return false;
	}
	
	public boolean agregarCliente(Cliente nuevo) {
		if(this.validarRut(nuevo.getRut()))
		{
			return false;
		}
		else {
			this.setRut(nuevo.getRut());
			this.setNombre(nuevo.getNombre());
			this.setApellido(nuevo.getApellido());
			this.setEdad(nuevo.getEdad());
			return true;
		}
	}
	
	public boolean eliminarCliente(String rut) {
		if(this.validarRut(rut)) {
			this.setRut(null);
			this.setNombre(null);
			this.setApellido(null);
			this.setEdad(0);
			return true;
			}
		return false;
		}
		
	public void modificarCliente(Cliente modCliente) {
		if(!modCliente.getRut().equals(null)) {
			this.setRut(modCliente.getRut());
		}
		if(!modCliente.getNombre().equals(null)) {
			this.setNombre(modCliente.getNombre());
		}
		if(!modCliente.getApellido().equals(null)) {
			this.setApellido(modCliente.getApellido());
		}
		if(modCliente.getEdad() > -1) {
			this.setEdad(modCliente.getEdad());
		}
	}

}
