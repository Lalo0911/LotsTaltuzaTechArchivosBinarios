package co.edu.unbosque.model;
import java.io.Serializable;

public class Jugador implements Serializable{

	private static final long serialVersionUID = 2L;	

	private String nombre;
	private int edad;
	private String genero;
	private double puntaje;

	public Jugador(String nombre,int edad, String genero, double puntaje){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.puntaje = puntaje;
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

	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", puntaje=" + puntaje + "]";
	}

}
