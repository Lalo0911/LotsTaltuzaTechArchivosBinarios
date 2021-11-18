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
	if(bF.leerArchivoPartida()!=null)
	{
	partida = bF.leerArchivoPartida();
	partida.add(match);
	bF.escribirArchivoPartida(partida);	
	}else{
		partida.add(match);
		bF.escribirArchivoPartida(partida);	
		}		
	}
	
	public String leerPartida()
	{
		String respuesta = "";
		System.out.println(bF.leerArchivoPartida().size());
		for(int i = 0; i<bF.leerArchivoPartida().size(); i++)
		{
		respuesta =
		" Jugador 1: " + bF.leerArchivoPartida().get(i).getJugador1() + 
		" Jugador 2: " + bF.leerArchivoPartida().get(i).getJugador2() +
		" Puntaje 1: " + bF.leerArchivoPartida().get(i).getPuntaje1() +
		" Puntaje 2: " + bF.leerArchivoPartida().get(i).getPuntaje2() +	
		" Tipo partida:" + bF.leerArchivoPartida().get(i).getTipoPartida()+"\n"+respuesta;
		}
		return respuesta;
	}

	public ArrayList<PartidaDTO> getPartida() {
		return partida;
	}

	public void setPartida(ArrayList<PartidaDTO> partida) {
		this.partida = partida;
	}


}
