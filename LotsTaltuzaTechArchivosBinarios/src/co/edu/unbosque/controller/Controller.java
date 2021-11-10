package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller {

	private Fachada fachada;
//	private View gui;
	
	public Controller() {

		
		fachada = new Fachada();
		
		for(int i=0;i<2;i++){
		fachada.getJugador2()[i].setGenero("Genero");
		fachada.getJugador2()[i].setNombre("Nombre");
		fachada.getJugador2()[i].setEdad(3101);
		fachada.getJugador2()[i].setPuntaje(1010+i);
		}
		
		fachada.getB_file().setRuta(1);
		fachada.getB_file().escribirClase(fachada.getJugador2());
		fachada.getB_file().leerClase();
		JOptionPane.showMessageDialog(null, fachada.getB_file().getJugador()[0]);
		
		fachada.getJuego()[0].setNombre("Prueba2");
		fachada.getJuego()[0].setTipo("Prueba4");
		fachada.getB_file().setRuta(2);
		fachada.getB_file().escribirClase(fachada.getJuego());
		fachada.getB_file().leerClase();
		JOptionPane.showMessageDialog(null, fachada.getB_file().getJuego()[0]);
	}
	
}
