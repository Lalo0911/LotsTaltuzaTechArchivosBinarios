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
		
		
		if(bF.leerArchivoJuego()!=null) {
		juego = bF.leerArchivoJuego();
		juego.add(juego1);
	    bF.escribirArchivoJuego(juego);
		}
		else {
			juego.add(juego1);
			bF.escribirArchivoJuego(juego);
		}
	}
	
	public String leerJuego(){
      String respuesta= "";
			for(int i=0;i<bF.leerArchivoJuego().size();i++){
	respuesta = 
	"Nombre: "+bF.leerArchivoJuego().get(i).getNombre()+
	" Tipo: " +bF.leerArchivoJuego().get(i).getTipo()+"\n"+respuesta;	
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
