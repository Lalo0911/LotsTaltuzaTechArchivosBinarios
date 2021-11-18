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
	
	public Fachada() {
		
	juegoDAO = new JuegoDAO();
	jugadorDAO = new JugadorDAO();
	partidaDAO = new PartidaDAO();
	juegoDTO = new JuegoDTO(null,null);
	jugadorDTO = new JugadorDTO(0, null, 0, null, 0);
	partidaDTO = new PartidaDTO("","","","","");
	b_file = new BinariosFile();	
	
	
		
	}
	
	public BinariosFile getB_file() {
		return b_file;
	}

	public void setB_file(BinariosFile b_file) {
		this.b_file = b_file;
	}

	public JuegoDTO getJuegoDTO() {
		return juegoDTO;
	}

	public void setJuegoDTO(JuegoDTO juegoDTO) {
		this.juegoDTO = juegoDTO;
	}

	public JugadorDTO getJugadorDTO() {
		return jugadorDTO;
	}

	public void setJugadorDTO(JugadorDTO jugadorDTO) {
		this.jugadorDTO = jugadorDTO;
	}

	public PartidaDTO getPartidaDTO() {
		return partidaDTO;
	}

	public void setPartidaDTO(PartidaDTO partidaDTO) {
		this.partidaDTO = partidaDTO;
	}

	public JuegoDAO getJuegoDAO() {
		return juegoDAO;
	}

	public void setJuegoDAO(JuegoDAO juegoDAO) {
		this.juegoDAO = juegoDAO;
	}

	public JugadorDAO getJugadorDAO() {
		return jugadorDAO;
	}

	public void setJugadorDAO(JugadorDAO jugadorDAO) {
		this.jugadorDAO = jugadorDAO;
	}

	public PartidaDAO getPartidaDAO() {
		return partidaDAO;
	}

	public void setPartidaDAO(PartidaDAO partidaDAO) {
		this.partidaDAO = partidaDAO;
	}


	
	
}