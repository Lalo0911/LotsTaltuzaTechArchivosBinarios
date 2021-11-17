package co.edu.unbosque.model;

import java.util.ArrayList;

public class JuegoDAO{

	private ArrayList<JuegoDTO> juego;


	public JuegoDAO(){
		juego = new ArrayList<JuegoDTO>();
	}
	
	public void agregarJuego( JuegoDTO juego1){
		// leerArchivoJuego();
		
		juego.add(juego1);	
	
		//EscribirArchivoJugador
	}

	public ArrayList<JuegoDTO> getJuego() {
		return juego;
	}

	public void setJuego(ArrayList<JuegoDTO> juego) {
		this.juego = juego;
	}

}
