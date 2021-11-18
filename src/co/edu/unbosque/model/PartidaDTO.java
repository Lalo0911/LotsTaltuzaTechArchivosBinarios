package co.edu.unbosque.model;

import java.io.Serializable;

public class PartidaDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private String tipoPartida;
	private String jugador1;
	private String jugador2;
	private String puntaje1;
	private String puntaje2;
	public PartidaDTO(String tipoPartida, String jugador1, String jugador2, String puntaje1, String puntaje2) {
		this.tipoPartida = tipoPartida;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.puntaje1 = puntaje1;
		this.puntaje2 = puntaje2;
	}
	public String getTipoPartida() {
		return tipoPartida;
	}
	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}
	public String getJugador1() {
		return jugador1;
	}
	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}
	public String getJugador2() {
		return jugador2;
	}
	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}
	public String getPuntaje1() {
		return puntaje1;
	}
	public void setPuntaje1(String puntaje1) {
		this.puntaje1 = puntaje1;
	}
	public String getPuntaje2() {
		return puntaje2;
	}
	public void setPuntaje2(String puntaje2) {
		this.puntaje2 = puntaje2;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
