package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller implements ActionListener{

	private Fachada fachada;
	private View gui;
	
//	private View gui;
	
	public Controller() {
		
		
		fachada = new Fachada();
		gui = new View(this);
		gui.setVisible(true);
		asignarOyentes();
		
		
		for(int i=0;i<2;i++){
			
		//fachada.getJugador2()[i].setGenero("Genero");
		//fachada.getJugador2()[i].setNombre("Nombre");
		//fachada.getJugador2()[i].setEdad(3101);
		//fachada.getJugador2()[i].setPuntaje(1010+i);
		}
		//fachada.getB_file().setRuta(1);
		//fachada.getB_file().escribirClase(fachada.getJugador2());
		//fachada.getB_file().leerClase();
		JOptionPane.showMessageDialog(null, fachada.getB_file().getJugador()[0]);
		
		
		
		
		
		JOptionPane.showMessageDialog(null, fachada.getB_file().getJuego()[0]);
		
		
		//fachada.getPartida()[0].setJugador1("he");
		//fachada.getPartida()[0].setJugador2("hola");
		//fachada.getPartida()[0].setPuntaje1(0);
		//fachada.getPartida()[0].setPuntaje2(0);
		//fachada.getPartida()[0].setTipoPartida("se cago");
		//fachada.getB_file().setRuta(3);
		//fachada.getB_file().escribirClase(fachada.getPartida());
		fachada.getB_file().leerClase();
	}
	
	public void asignarOyentes() 
	{
		
	 gui.getPanelJuego().getButLeer().addActionListener(this);
	 gui.getPanelJuego().getButAgregar().addActionListener(this);
	 
	 gui.getPanelJugador().getButLeer().addActionListener(this);
	 gui.getPanelJugador().getButAgregar().addActionListener(this);
	 
	 gui.getPanelPartida().getButLeer().addActionListener(this);
	 gui.getPanelPartida().getButAgregar().addActionListener(this);
	 
	}
	
	public void actionPerformed(ActionEvent evento) 
	{
		
		//Juego
		if (evento.getActionCommand().equals("LEER")) 
		{
			fachada.getB_file().setRuta(2);
			fachada.getB_file().leerClase();
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getJuego()[0]+"");
		}
		if (evento.getActionCommand().equals("AGREGAR")) 
		{	
			fachada.getJuego()[0].setNombre(gui.getPanelJuego().getTxtNombreJuego().getText());
			fachada.getJuego()[0].setTipo(gui.getPanelJuego().getTxtTipoJuego().getText());
			fachada.getB_file().setRuta(2);
			fachada.getB_file().escribirClase(fachada.getJuego());
		}
		
		//Jugador
		if (evento.getActionCommand().equals("LEER")) 
		{
			fachada.getB_file().setRuta(1);
			fachada.getB_file().leerClase();
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getJugador()[0]+"");
			
			//fachada.getB_file().getJugador()[0]
		}
		if (evento.getActionCommand().equals("AGREGAR")) 
		{
			fachada.getJugador2()[0].setGenero(gui.getPanelJugador().getTxtGenero().getText());
			fachada.getJugador2()[0].setNombre(gui.getPanelJugador().getTxtNombre().getText());
			fachada.getJugador2()[0].setEdad(Integer.parseInt(gui.getPanelJugador().getTxtEdad().getText()));
			fachada.getJugador2()[0].setPuntaje(Double.parseDouble(gui.getPanelJugador().getTxtPuntaje().getText()));
			
			
			//cambiar objeto del gui
			fachada.getJugador2()[1].setGenero(gui.getPanelJugador().getTxtGenero().getText());
			fachada.getJugador2()[1].setNombre(gui.getPanelJugador().getTxtNombre().getText());
			fachada.getJugador2()[1].setEdad(Integer.parseInt(gui.getPanelJugador().getTxtEdad().getText()));
			fachada.getJugador2()[1].setPuntaje(Double.parseDouble(gui.getPanelJugador().getTxtPuntaje().getText()));
			fachada.getB_file().setRuta(1);
			fachada.getB_file().escribirClase(fachada.getJugador2());
		}
			
			
		//Partida
		if (evento.getActionCommand().equals("LEER")) 
		{
			fachada.getB_file().setRuta(3);
			fachada.getB_file().leerClase();
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getPartida()[0]+"");
			
			//gui.getPanelResultados().getTxtObjeto2().setText(null);
		}
		if (evento.getActionCommand().equals("AGREGAR")) 
		{
			fachada.getPartida()[0].setJugador1(gui.getPanelPartida().getTxtJugador1().getText());
			fachada.getPartida()[0].setJugador2(gui.getPanelPartida().getTxtJugador2().getText());
			fachada.getPartida()[0].setPuntaje1(Double.parseDouble(gui.getPanelPartida().getTxtPuntaje1().getText()));
			fachada.getPartida()[0].setPuntaje2(Double.parseDouble(gui.getPanelPartida().getTxtPuntaje2().getText()));
			fachada.getPartida()[0].setTipoPartida(gui.getPanelPartida().getTxtTipoPartida().getText());
			fachada.getB_file().setRuta(3);
			fachada.getB_file().escribirClase(fachada.getPartida());
		}
			
	}
}
