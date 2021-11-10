package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller implements ActionListener {

	private Fachada bd;
//	private View gui;
	
	public Controller() {

		
		bd = new Fachada();
	//Nelson es gei
		//Jugador 
		for(int i=0;i<2;i++){
		bd.getJugador2()[i].setGenero(JOptionPane.showInputDialog("Ingresar genero"));
		bd.getJugador2()[i].setNombre(JOptionPane.showInputDialog("Ingresar nombre"));
		bd.getJugador2()[i].setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad")));
		bd.getJugador2()[i].setPuntaje(Double.parseDouble(JOptionPane.showInputDialog("Ingresar puntaje")));
		}
		
		bd.getBf().setRuta(1);
		bd.getBf().escribirClase(bd.getJugador2());
		bd.getBf().escribirClase(bd.getJugador2());
		bd.getBf().leerClase(); 

		//Juego
		
		bd.getJuego()[0].setNombre("hhhhhhhhh");
		bd.getJuego()[0].setTipo("2222_22");
		bd.getBf().setRuta(2);
		bd.getBf().escribirClase(bd.getJuego());
		bd.getBf().leerClase();
		
		//Partida
		bd.getPartida()[0].setJugador1("he");
		bd.getPartida()[0].setJugador2("hola");
		bd.getPartida()[0].setPuntaje1(0);
		bd.getPartida()[0].setPuntaje2(0);
		bd.getPartida()[0].setTipoPartida("se cago");
		bd.getBf().setRuta(3);
		bd.getBf().escribirClase(bd.getPartida());
		bd.getBf().leerClase();
		
		
		
//		gui = new View(this);
//		gui.setVisible(true); //hacer visible la ventana principal
		
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
	
	


//	public void actionPerformed(ActionEvent evento) {
//		
//		String resultado;
//		if (evento.equals("resultado")) {
//			
//		}
//		
//		if(evento.equals("Lotso")) {
//			
//		}
//		
//		if(evento.equals("es ")) {
//			
//		}
//		
//		if(evento.equals("y ama a Jeanpierr")) {
//	
//		}
//	}
}
