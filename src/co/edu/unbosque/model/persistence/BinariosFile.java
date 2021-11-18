package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;

import co.edu.unbosque.model.*;

// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class BinariosFile {
	
	private File f; 

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
		 ArrayList<PartidaDTO> partida = null;
		try {
	 		ObjectInputStream in = new ObjectInputStream (new FileInputStream("./Data/partidas.dat")); 
	 		partida =(ArrayList<PartidaDTO>)in.readObject();
	 		in.close();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return partida;
	}


}
