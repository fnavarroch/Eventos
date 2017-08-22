import java.util.ArrayList;

public class Cliente {
	
	//Variables de instancia
	
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private ArrayList<Cliente> listaCliente = new ArrayList();
	
	
	//Constructores
	
	public Cliente(String nombre, String apellido, String rut, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.edad=edad;
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
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
	public boolean agregarCliente(Cliente c) {
		if(listaCliente.contains(c))
			return false;
		else
		{
			listaCliente.add(c);
			return true;
		}
	}
	public Cliente buscarClientePorRut(String r){
		Cliente datosCliente = new Cliente();
		for(int i=0; i<listaCliente.size();i++) {
			datosCliente= listaCliente.get(i);
			if(datosCliente.getRut().equals(r)) {
				return datosCliente;
			}
		}
		return null;
	}
	public int totalEntradaCompradas(int cantidadEntradas,int precioEntradas)
	{
		int total=0;
		total= cantidadEntradas*precioEntradas;
		return total;
	
	}
	

}
