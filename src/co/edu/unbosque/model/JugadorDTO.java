package co.edu.unbosque.model;
import java.io.Serializable;

public class JugadorDTO implements Serializable{

	private static final long serialVersionUID = 1L;	

	private long documento;
	private String nombre;
	private int edad;
	private String genero;
	private double puntaje;
	

	public JugadorDTO(long documento,String nombre,int edad, String genero, double puntaje){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.puntaje = puntaje;
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}


	

}
