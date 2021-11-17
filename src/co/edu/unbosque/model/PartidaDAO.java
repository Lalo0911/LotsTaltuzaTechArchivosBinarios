package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.BinariosFile;
import java.util.ArrayList;

public class PartidaDAO {
	
	private BinariosFile bF;
	private ArrayList<PartidaDTO> partida;

	public PartidaDAO()
	{
		bF = new BinariosFile();
		partida = new ArrayList<PartidaDTO>();
	}

	public void agregarPartida(PartidaDTO match)
	{
	partida = bF.leerArchivoPartida();
	partida.add(match);
	bF.escribirArchivoPartida(partida);
	}

	public ArrayList<PartidaDTO> getPartida() {
		return partida;
	}

	public void setPartida(ArrayList<PartidaDTO> partida) {
		this.partida = partida;
	}


}
