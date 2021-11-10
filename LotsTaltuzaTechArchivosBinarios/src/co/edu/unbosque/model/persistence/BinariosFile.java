package co.edu.unbosque.model.persistence;

import java.io.*;
import co.edu.unbosque.model.*;

// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class BinariosFile {

	private String ruta="";
	private File f; 
	private FileOutputStream fos;     
	private ObjectOutputStream dos;
	private Juego[] juego;
	private Jugador[] jugador;
	private Partida[] partida;

	public BinariosFile() {
	jugador = new Jugador[2];
	juego = new Juego[1];
	partida = new Partida[1];
	}
	
	public String escribirClase(Object[] objeto) {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File(ruta);
		try{     
			fos=new FileOutputStream(f);     
			dos=new ObjectOutputStream(fos);     
			dos.writeObject(objeto);		   
			dos.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public void leerClase() {
		 ObjectInputStream in;
		try {
	 		in = new ObjectInputStream(new FileInputStream(ruta));
  			if(ruta.equals("./Data/jugadores.dat")){
  				jugador = (Jugador[]) in.readObject();
			}else if(ruta.equals("./Data/juegos.dat")){
				juego = (Juego[]) in.readObject();
			}else{
				partida = (Partida[]) in.readObject();
			}
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void setRuta(int seleccionRuta) {
		switch(seleccionRuta){
			case 1: ruta = "./Data/jugadores.dat";
				break;
			case 2: ruta = "./Data/juegos.dat";
				break;
			case 3: ruta = "./Data/partidas.dat";
				break;
		}
	}

	public Juego[] getJuego() {
		return juego;
	}

	public void setJuego(Juego[] juego) {
		this.juego = juego;
	}

	public Jugador[] getJugador() {
		return jugador;
	}

	public void setJugador(Jugador[] jugador) {
		this.jugador = jugador;
	}

	public Partida[] getPartida() {
		return partida;
	}

	public void setPartida(Partida[] partida) {
		this.partida = partida;
	}
	
	
	
}
