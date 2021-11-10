package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.BinariosFile;

public class Fachada2 {
	
	private Juego juego;
	private Jugador jugador;
	private Partida partida;
	private BinariosFile bf;
	private Jugador[] jugador2;
	
	public Fachada2() {
		
		juego = new Juego("","");
		jugador = new Jugador("",0,"",0);
		partida = new Partida("","","",0,0);
		jugador2 = new Jugador[2];
		jugador2[0] = new Jugador(null, 0, null, 0);
		jugador2[1] = new Jugador(null, 0, null, 0);
		bf = new BinariosFile();
		
	}
	
	public BinariosFile getBf() {
		return bf;
	}

	public Juego getJuego() {
		return juego;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}

	public Jugador[] getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador[] jugador2) {
		this.jugador2 = jugador2;
	}
	
	
}