import java.util.ArrayList;

public class Evento {

	private int id;
	private String nombre;
	private String ciudad;
	private Local sede;
	private ArrayList<Local> local;
	private ArrayList<Evento> evento;

	public Evento(int id, String nombre, String ciudad, Local sede) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.sede = sede;
	}
	
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Local getSede() {
		return sede;
	}
	public void setSede(Local sede) {
		this.sede = sede;
	}
	
}

