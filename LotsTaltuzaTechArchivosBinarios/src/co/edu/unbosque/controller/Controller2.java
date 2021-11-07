package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller2 {

	private Fachada bd;
//	private View gui;
	
	public Controller2() {

		
		bd = new Fachada();
		for(int i=0;i<2;i++){
		bd.getJugador2()[i].setGenero(JOptionPane.showInputDialog("Ingresar genero"));
		bd.getJugador2()[i].setNombre(JOptionPane.showInputDialog("Ingresar nombre"));
		bd.getJugador2()[i].setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad")));
		bd.getJugador2()[i].setPuntaje(Double.parseDouble(JOptionPane.showInputDialog("Ingresar puntaje")));
		}
		bd.getBf().setRuta(1);
		bd.getBf().escribirClase(bd.getJugador2());
		bd.getBf().leerClase();
		JOptionPane.showMessageDialog(null, bd.getBf().getJugador()[0]);
		JOptionPane.showMessageDialog(null, bd.getBf().getJugador()[1]);
		
//		gui = new View(this);
//		gui.setVisible(true); //hacer visible la ventana principal
		
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
