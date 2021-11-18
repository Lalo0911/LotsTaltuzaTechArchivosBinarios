package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class PartidaDAO {
	
	private ArrayList<PartidaDTO> partida;
	private BinariosFile bF;
	
	public PartidaDAO() {
		partida = new ArrayList<PartidaDTO>();
		bF= new BinariosFile();
	}
	
	public void agregarPartida(PartidaDTO partida1)
	{
		if(bF.leerArchivoPartida()!=null)
		{
			partida = bF.leerArchivoPartida();
			partida.add(partida1);
			bF.escribirArchivoPartida(partida);
		}
		else {
			partida.add(partida1);
			bF.escribirArchivoPartida(partida);
			}
	}
		public String leerPartida(){
		      String respuesta= "";
					for(int i=0;i<bF.leerArchivoPartida().size();i++){
			respuesta =
			" Tipo de Partida: "+bF.leerArchivoPartida().get(i).getTipoPartida()+
			" Jugador 1: " +bF.leerArchivoPartida().get(i).getJugador1()+
			" Jugador 2: " +bF.leerArchivoPartida().get(i).getJugador2()+
			" Puntaje 1: " +bF.leerArchivoPartida().get(i).getPuntaje1()+	
			" Puntaje 2: " +bF.leerArchivoPartida().get(i).getPuntaje2()+"\n"+respuesta;	 
		    }
	        return respuesta;
	}

		public ArrayList<PartidaDTO> getPartida() {
			return partida;
		}

		public void setPartida(ArrayList<PartidaDTO> partida) {
			this.partida = partida;
		}

		public BinariosFile getbF() {
			return bF;
		}

		public void setbF(BinariosFile bF) {
			this.bF = bF;
		}
		
}
