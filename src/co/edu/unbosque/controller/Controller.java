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

	public Controller() 

	{

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

		gui.getPanelJugador().getButLeer().addActionListener(this);
		gui.getPanelJugador().getButAgregar2().addActionListener(this);
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
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getJuegoDAO().leerJuego());
		}
		if (evento.getActionCommand().equals(gui.getPanelJuego().AGREGARJUEGO)) 
		{    
			fachada.getJuegoDTO().setNombre(gui.getPanelJuego().getTxtNombreJuego().getText());
			fachada.getJuegoDTO().setTipo(gui.getPanelJuego().getTxtTipoJuego().getText());
			fachada.getJuegoDAO().agregarJuego(fachada.getJuegoDTO());
			fachada.getB_file().escribirArchivoJuego(fachada.getJuegoDAO().getJuego());

		}

		//Jugador

		if (evento.getActionCommand().equals(gui.getPanelJugador().LEERJUGADOR)) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getJugadorDAO().leerJugador());

		}
		if (evento.getActionCommand().equals(gui.getPanelJugador().AGREGARJUGADOR)) 
		{		
			fachada.getJugadorDTO().setGenero(gui.getPanelJugador().getTxtGenero().getText());
			fachada.getJugadorDTO().setDocumento(Integer.parseInt(gui.getPanelJugador().getTxtDocumento().getText()));
			fachada.getJugadorDTO().setNombre(gui.getPanelJugador().getTxtNombre().getText());
			fachada.getJugadorDTO().setEdad(Integer.parseInt(gui.getPanelJugador().getTxtEdad().getText()));
			fachada.getJugadorDTO().setPuntaje(Double.parseDouble(gui.getPanelJugador().getTxtPuntaje().getText()));
			fachada.getJugadorDAO().agregarJugador(fachada.getJugadorDTO());
			fachada.getB_file().escribirArchivoJugador(fachada.getJugadorDAO().getJugador());
		}

		//


		//Partidaa
		if ((evento.getActionCommand().equals(gui.getPanelPartida().LEER))) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getPartidaDAO().leerPartida());

		}
		if (evento.getActionCommand().equals(gui.getPanelPartida().AGREGAR));
		{
			fachada.getPartidaDTO().setJugador1(gui.getPanelPartida().getTxtJugador1().getText());
			fachada.getPartidaDTO().setJugador2(gui.getPanelPartida().getTxtJugador2().getText());
			fachada.getPartidaDTO().setPuntaje1(gui.getPanelPartida().getTxtPuntaje1().getText());
			fachada.getPartidaDTO().setPuntaje2(gui.getPanelPartida().getTxtPuntaje2().getText());
			fachada.getPartidaDTO().setTipoPartida(gui.getPanelPartida().getTxtTipoPartida().getText());
			fachada.getPartidaDAO().agregarPartida(fachada.getPartidaDTO());
			fachada.getB_file().escribirArchivoPartida(fachada.getPartidaDAO().getPartida());
		}

		if (evento.getActionCommand().equals(gui.getPanelBotones2().INICIO)) 
		{
			gui.getPanelResultados().setVisible(false);
			gui.getPanelPartida().setVisible(false);
			gui.getPanelJugador().setVisible(false);
			gui.getPanelJuego().setVisible(false);
			gui.getPanelBotones().setVisible(true);
			gui.getContentPane().add(gui.getPanelBotones(),BorderLayout.CENTER);
			gui.getPanelBotones2().setVisible(false);
			gui.getPanelResultados().getTxtObjeto1().setText("");
			gui.limpiar_texto(gui.getPanelJugador());
			gui.limpiar_texto(gui.getPanelPartida());
			gui.limpiar_texto(gui.getPanelJuego());
		}
	}

}