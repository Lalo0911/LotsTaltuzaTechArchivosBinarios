package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
//

public class View extends JFrame{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	private PanelJugador1 panelJugador; //Se declara un objeto de tipo PanelEntrada
	private PanelResultados panelResultados; //Se declara un objeto de tipo PanelResultados
	private PanelJuego panelJuego;
	private PanelPartida panelPartida;
	
	public View(Controller control) 
	{
		// Definición de los parámetros básicos de la ventana principal
		
		setSize(900,400); //tamaño en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tamaño de la ventana?
		setTitle("Lots Taltuza Tech"); //tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );
		//Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelJugador = new PanelJugador1();
		add(panelJugador,BorderLayout.NORTH);
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelResultados = new PanelResultados();
		add(panelJuego,BorderLayout.CENTER);
		panelJuego = new PanelJuego();
		add(panelPartida,BorderLayout.SOUTH);
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.EAST);
		
		//se agrega al boton ActionListener del objeto de Controlador - cambio
//		panelJugador.getButAgregar().addActionListener(control);
//		panelJugador.getButLeer().addActionListener(control);
//		panelJuego.getButAgregar().addActionListener(control);
//		panelJuego.getButLeer().addActionListener(control);
//		panelPartida.getButAgregar().addActionListener(control);
//		panelPartida.getButLeer().addActionListener(control);
		
	}

	public PanelJugador1 getPanelEntrada() {
		return panelJugador;
	}

	public void setPanelEntrada(PanelJugador1 panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelJuego getPanelRegistro() {
		return panelJuego;
	}

	public void setPanelRegistro(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Sistema", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public PanelJugador1 getPanelJugador() {
		return panelJugador;
	}

	public void setPanelJugador(PanelJugador1 panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelJuego getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelPartida getPanelPartida() {
		return panelPartida;
	}

	public void setPanelPartida(PanelPartida panelPartida) {
		this.panelPartida = panelPartida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void mostrarCifras(int numReg, double numeros[], int valores[]) {
		for (int i= 0 ; i<numReg ; i++) {
			getPanelResultados().getTxtObjeto1().append(String.valueOf(numeros[i])+"\n");
			getPanelResultados().getTxtObjeto2().append(String.valueOf(valores[i])+"\n");
		}	
	}	
}
