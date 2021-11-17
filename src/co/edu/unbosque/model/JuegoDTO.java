package co.edu.unbosque.model;
import java.io.Serializable;

import co.edu.unbosque.model.persistence.BinariosFile;

public class JuegoDTO implements Serializable{

	private static final long serialVersionUID = 3L;

	private String nombre;
	private String tipo;
	private BinariosFile bf;

	public JuegoDTO(String nombre, String tipo){

		this.nombre = nombre;
		this.tipo = tipo;
		
	}
	public JuegoDTO buscarNominaMes(String nombre) {

		JuegoDTO encontrar = null;


		for (int i = 0; i < bf.leerArchivoJuego().size(); i++) {
			if(bf.leerArchivoJuego().get(i).getNombre()==(nombre)) {
				encontrar = bf.leerArchivoJuego().get(i);
			}
		}
		return encontrar;
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
