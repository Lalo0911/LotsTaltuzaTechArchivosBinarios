package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.BinariosFile;

public class Fachada {
	
	private BinariosFile b_file;
	private JuegoDTO juegoDTO;
	private JugadorDTO jugadorDTO;
	private PartidaDTO partidaDTO;
	private JuegoDAO juegoDAO;
	private JugadorDAO jugadorDAO;
	private PartidaDAO partidaDAO;
	
	private Jugador[] jugador2;
	private Juego[] juego;
	private Partida[] partida;
	
	public Fachada() {
		
	juegoDAO = new JuegoDAO();
	jugadorDAO = new JugadorDAO();
	partidaDAO = new PartidaDAO();
	juegoDTO = new JuegoDTO(null,null);
	jugadorDTO = new JugadorDTO(null, 0, null, 0);
	partidaDTO = new PartidaDTO("","","",0,0);
	b_file = new BinariosFile();	
	
		juego = new Juego[1];
		juego[0] = new Juego(null,null);
		partida = new Partida[1];
		partida[0] = new Partida("","","",0,0);
		jugador2 = new Jugador[2];
		jugador2[0] = new Jugador(null, 0, null, 0);
		jugador2[1] = new Jugador(null, 0, null, 0);
		
		
	}
	
	public BinariosFile getB_file() {
		return b_file;
	}

	public void setB_file(BinariosFile b_file) {
		this.b_file = b_file;
	}

	public Juego[] getJuego() {
		return juego;
	}

	public void setJuego(Juego[] juego) {
		this.juego = juego;
	}

	public Partida[] getPartida() {
		return partida;
	}

	public void setPartida(Partida[] partida) {
		this.partida = partida;
	}

	public Jugador[] getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador[] jugador2) {
		this.jugador2 = jugador2;
	}
	
	
}