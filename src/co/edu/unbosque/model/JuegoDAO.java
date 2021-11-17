package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.BinariosFile;
import java.util.ArrayList;

public class JuegoDAO{

    private BinariosFile bF;
	private ArrayList<JuegoDTO> juego;
	

	public JuegoDAO(){
        bF = new BinariosFile();
		juego = new ArrayList<JuegoDTO>();
	}
	
	public void agregarJuego(JuegoDTO juego1){
		juego = bF.leerArchivoJuego();
		juego.add(juego1);
	    bF.escribirArchivoJuego(juego);
	}
	public String leerJuego(){
      String respuesta= "";
			for(int x=0;x<bF.leerArchivoJuego().size();x++){
				respuesta = bF.leerArchivoJuego().get(x)+"\n";	
			}
       return respuesta;
    }

	public ArrayList<JuegoDTO> getJuego() {
		return juego;
	}

	public void setJuego(ArrayList<JuegoDTO> juego) {
		this.juego = juego;
	}

}
