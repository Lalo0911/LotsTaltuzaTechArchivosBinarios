package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.PanelJugador1;
import co.edu.unbosque.view.View;


public class Controller implements ActionListener{

	private Fachada fachada;
	private View gui;

	//    private View gui;

	public Controller() 
	
	{
//
		fachada = new Fachada();
		gui = new View(this);
		gui.setVisible(true);
		asignarOyentes();
	}

	public void asignarOyentes() 
	{
		gui.getPanelBotones().getButJugador().addActionListener(this);
		gui.getPanelBotones().getButJuego().addActionListener(this);
		gui.getPanelBotones().getButPartida().addActionListener(this);
		gui.getPanelJuego().getButAgregar().addActionListener(this);
		gui.getPanelJuego().getButLeer().addActionListener(this);
		gui.getPanelPartida().getButAgregar().addActionListener(this);
		gui.getPanelPartida().getButLeer().addActionListener(this);
		gui.getPanelBotones2().getButRegresar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) 
	{
		if (evento.getActionCommand().equals(gui.getPanelBotones().JUGADOR)) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getContentPane().add(gui.getPanelJugador(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelJugador().setVisible(true);
			

		}
		if (evento.getActionCommand().equals(gui.getPanelBotones().JUEGO)) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getContentPane().add(gui.getPanelJuego(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelJuego().setVisible(true);
			
		}
		if (evento.getActionCommand().equals(gui.getPanelBotones().PARTIDA)) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getContentPane().add(gui.getPanelPartida(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelPartida().setVisible(true);
		}
		//Juego
		if (evento.getActionCommand().equals(gui.getPanelJuego().LEERJUEGO)) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getJuego()[0]+"");
			//fachada.getB_file().getJuego()[0]
		}
		if (evento.getActionCommand().equals(gui.getPanelJuego().AGREGARJUEGO)) 
		{    
			fachada.getJuego()[0].setNombre(gui.getPanelJuego().getTxtNombreJuego().getText());
			fachada.getJuego()[0].setTipo(gui.getPanelJuego().getTxtTipoJuego().getText());
			fachada.getB_file().setRuta(2);
			fachada.getB_file().escribirClase(fachada.getJuego());
			fachada.getB_file().leerClase();
		}
		//Jugador
		if (evento.getActionCommand().equals(gui.getPanelJugador().LEERJUGADOR)) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getJugador()[0]+"");
			//fachada.getB_file().getJugador()[0]
		}
		if (evento.getActionCommand().equals(gui.getPanelJugador().AGREGARJUGADOR)) 
		{
			for(int i=0;i<2;i++){
				fachada.getJugador2()[i].setGenero(gui.getPanelJugador().getTxtGenero().getText());
				fachada.getJugador2()[i].setNombre(gui.getPanelJugador().getTxtNombre().getText());
				fachada.getJugador2()[i].setEdad(Integer.parseInt(gui.getPanelJugador().getTxtEdad().getText()));
				fachada.getJugador2()[i].setPuntaje(1010+i);
			}
			fachada.getB_file().setRuta(1);
			fachada.getB_file().escribirClase(fachada.getJugador2());
			fachada.getB_file().leerClase();
		}
		//Partidaa
		if ((evento.getActionCommand().equals(gui.getPanelPartida().LEER))) 
		{

			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getB_file().getPartida()[0]+"");

			//gui.getPanelResultados().getTxtObjeto2().setText(null);
		}
		if (evento.getActionCommand().equals(gui.getPanelPartida().AGREGAR)) 
		{
			fachada.getPartida()[0].setJugador1(gui.getPanelPartida().getTxtJugador1().getText());
			fachada.getPartida()[0].setJugador2(gui.getPanelPartida().getTxtJugador2().getText());
			fachada.getPartida()[0].setPuntaje1(Integer.parseInt(gui.getPanelPartida().getTxtPuntaje1().getText()));
			fachada.getPartida()[0].setPuntaje2(Integer.parseInt(gui.getPanelPartida().getTxtPuntaje2().getText()));
			fachada.getPartida()[0].setTipoPartida("");
			fachada.getB_file().setRuta(3);
			fachada.getB_file().escribirClase(fachada.getPartida());
			fachada.getB_file().leerClase();
			
		}
		if (evento.getActionCommand().equals(gui.getPanelBotones2().INICIO)) {
			gui.getPanelResultados().setVisible(false);
			gui.getPanelPartida().setVisible(false);
			gui.getPanelJugador().setVisible(false);
			gui.getPanelJuego().setVisible(false);
			gui.getPanelBotones().setVisible(true);
			gui.getContentPane().add(gui.getPanelBotones(),BorderLayout.CENTER);
			gui.getPanelBotones2().setVisible(false);
			
		}
	}
	
}