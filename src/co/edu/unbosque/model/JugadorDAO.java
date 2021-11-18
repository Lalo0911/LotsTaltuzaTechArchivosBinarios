package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class JugadorDAO {

	private ArrayList<JugadorDTO> jugador;
	private BinariosFile bF;
	
	public JugadorDAO() {
		jugador = new ArrayList<JugadorDTO>();
		bF = new BinariosFile();
	}
	
	public void agregarJugador(JugadorDTO jugador1){
		if(bF.leerArchivoJugador()!=null) {
		jugador = bF.leerArchivoJugador();
		jugador.add(jugador1);
	    bF.escribirArchivoJugador(jugador);
		}
		else {
			jugador.add(jugador1);
			bF.escribirArchivoJugador(jugador);
		}
	}
	
	public String leerJugador(){
      String respuesta= "";
    
			for(int i=0;i<bF.leerArchivoJugador().size();i++){
	respuesta =
	"Documento: "+bF.leerArchivoJugador().get(i).getDocumento()+
	" Nombre: " +bF.leerArchivoJugador().get(i).getNombre()+
	" Edad: " +bF.leerArchivoJugador().get(i).getEdad()+
	" Genero: " +bF.leerArchivoJugador().get(i).getGenero()+	
	" Puntaje: " +bF.leerArchivoJugador().get(i).getPuntaje()+"\n"+respuesta;	
			}
       return respuesta;
    }
	
	public JugadorDTO buscarJugador(long documento) 
	{
		JugadorDTO encontrar = null;

		for (int i = 0; i < bF.leerArchivoJugador().size(); i++) {
			if(bF.leerArchivoJugador().get(i).getDocumento()==(documento)) {
				encontrar = bF.leerArchivoJugador().get(i);
			}
		}
		return encontrar;
	}

	public ArrayList<JugadorDTO> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<JugadorDTO> jugador) {
		this.jugador = jugador;
	}
	
	
	
}
