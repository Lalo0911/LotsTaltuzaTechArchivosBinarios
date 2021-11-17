package co.edu.unbosque.model;
import java.io.Serializable;

public class JuegoDTO implements Serializable{

	private static final long serialVersionUID = 3L;

	private String nombre;
	private String tipo;

	public JuegoDTO(String nombre, String tipo){

		this.nombre = nombre;
		this.tipo = tipo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
}
