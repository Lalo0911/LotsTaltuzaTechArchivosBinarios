package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;

import co.edu.unbosque.model.*;

// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class BinariosFile {

	
	private File f; 
	private FileOutputStream fos;     
	private ObjectOutputStream dos;
	private ArrayList<JuegoDTO> juegoDAO;
	private ArrayList<JugadorDTO> jugadorDAO;
	private ArrayList<PartidaDTO> PartidaDAO;
	//private String ruta="";

	public BinariosFile() {

	}
	
	
	public String escribirArchivoJugador(ArrayList<JugadorDTO> jugador) {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File("./Data/jugadores.dat");
		try{     
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(jugador);
			salida.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public String escribirArchivoJuego(ArrayList<JuegoDTO> juego) {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File("./Data/juegos.dat");
		try{     
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(juego);
			salida.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public String escribirArchivoPartida(ArrayList<PartidaDTO> partida) {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File("./Data/partidas.dat");
		try{     
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(partida);
			salida.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public ArrayList<JugadorDTO> leerArchivoJugador() {
		 ArrayList<JugadorDTO> jugador=null;
		try {
	 		ObjectInputStream in = new ObjectInputStream (new FileInputStream("./Data/jugadores.dat")); 
	 		jugador =(ArrayList<JugadorDTO>)in.readObject();
	 		in.close();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return jugador;
	}
	
	public ArrayList<JuegoDTO> leerArchivoJuego() {
		 ArrayList<JuegoDTO> juego= null;
		try {
	 		ObjectInputStream in = new ObjectInputStream (new FileInputStream("./Data/juegos.dat")); 
	 		juego =(ArrayList<JuegoDTO>)in.readObject();
	 		in.close();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return juego;
	}
	public ArrayList<PartidaDTO> leerArchivoPartida() {
		 ArrayList<PartidaDTO> partida=null;
		try {
	 		ObjectInputStream in = new ObjectInputStream (new FileInputStream("./Data/partidas.dat")); 
	 		partida =(ArrayList<PartidaDTO>)in.readObject();
	 		in.close();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return partida;
	}
	
	
	
	/*public void setRuta(int seleccionRuta) {
		switch(seleccionRuta){
			case 1: ruta = "./Data/jugadores.dat";
				break;
			case 2: ruta = "./Data/juegos.dat";
				break;
			case 3: ruta = "./Data/partidas.dat";
				break;
		}
	}*/

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public FileOutputStream getFos() {
		return fos;
	}

	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}

	public ObjectOutputStream getDos() {
		return dos;
	}

	public void setDos(ObjectOutputStream dos) {
		this.dos = dos;
	}

	public ArrayList<JuegoDTO> getJuegoDAO() {
		return juegoDAO;
	}

	public void setJuegoDAO(ArrayList<JuegoDTO> juegoDAO) {
		this.juegoDAO = juegoDAO;
	}

	public ArrayList<JugadorDTO> getJugadorDAO() {
		return jugadorDAO;
	}

	public void setJugadorDAO(ArrayList<JugadorDTO> jugadorDAO) {
		this.jugadorDAO = jugadorDAO;
	}

	public ArrayList<PartidaDTO> getPartidaDAO() {
		return PartidaDAO;
	}

	public void setPartidaDAO(ArrayList<PartidaDTO> partidaDAO) {
		PartidaDAO = partidaDAO;
	}


	
	
}
