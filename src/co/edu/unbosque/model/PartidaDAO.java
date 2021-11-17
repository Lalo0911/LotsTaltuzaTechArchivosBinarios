package co.edu.unbosque.model;

import java.util.ArrayList;

public class PartidaDAO {
	
	private ArrayList<PartidaDTO> partida;

	public PartidaDAO()
	{
		partida = new ArrayList<PartidaDTO>();
	}

	public void agregarPartida(PartidaDTO match)
	{
	//leerArchivoPartida();
	
	partida.add(match);
	
	//escribirArchivoNomina();
		
	}

	public ArrayList<PartidaDTO> getPartida() {
		return partida;
	}

	public void setPartida(ArrayList<PartidaDTO> partida) {
		this.partida = partida;
	}


}
