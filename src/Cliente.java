import java.util.ArrayList;

public class Cliente {
	
	//Variables de instancia
	
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private ArrayList<Cliente> cliente ;
	
	
	//Constructores
	
	public Cliente(String nombre, String apellido, String rut, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.edad=edad;
	}
	
	//Métodos
	
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

	ArrayList<Cliente> cliente1 = new ArrayList<Cliente>();
	Cliente objCliente = new Cliente();
}
