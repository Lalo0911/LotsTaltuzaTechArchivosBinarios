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
		
		
		fachada.getPartida()[0].setJugador1("he");
		fachada.getPartida()[0].setJugador2("hola");
		fachada.getPartida()[0].setPuntaje1(0);
		fachada.getPartida()[0].setPuntaje2(0);
		fachada.getPartida()[0].setTipoPartida("se cago");
		fachada.getB_file().setRuta(3);
		fachada.getB_file().escribirClase(fachada.getPartida());
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
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getJuego()[0]+"");
			//fachada.getB_file().getJuego()[0]
		}
		if (evento.getActionCommand().equals("AGREGAR")) 
		{	
			gui.getPanelJuego().getTxtJuego().getText(); 
		}
		
		//Jugador
		if (evento.getActionCommand().equals("LEER")) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getJugador()[0]+"");
			//fachada.getB_file().getJugador()[0]
		}
		if (evento.getActionCommand().equals("AGREGAR")) 
		{
			gui.getPanelJugador().getTxtNombre().getText(); 
			gui.getPanelJugador().getTxtEdad().getText();
			gui.getPanelJugador().getTxtGenero().getText();	
		}
			
			
		//Partidaa
		if (evento.getActionCommand().equals("LEER")) 
		{
			
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getPartida()[0]+"");
			
			//gui.getPanelResultados().getTxtObjeto2().setText(null);
		}
		if (evento.getActionCommand().equals("AGREGAR")) 
		{
			gui.getPanelPartida().getTxtJugador1().getText();
			gui.getPanelPartida().getTxtPuntaje1().getText();
			gui.getPanelPartida().getTxtJugador2().getText();
			gui.getPanelPartida().getTxtPuntaje2().getText();
		}
			
	}
}
