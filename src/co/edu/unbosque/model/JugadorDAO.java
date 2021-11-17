package co.edu.unbosque.model;

import java.util.ArrayList;

public class JugadorDAO {

	private ArrayList<JugadorDTO> jugador;
	
	public JugadorDAO() {
		jugador = new ArrayList<JugadorDTO>();
	}
	
	public void agregarJugador (JugadorDTO player) {
//		leerArchivoJugador();
		jugador.add(player);
//		escribirArchivoNomina();
		
	}

	public ArrayList<JugadorDTO> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<JugadorDTO> jugador) {
		this.jugador = jugador;
	}
	
	
	
}
