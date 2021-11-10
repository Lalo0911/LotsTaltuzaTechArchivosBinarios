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
	private PanelBotones panelBotones;
	private PanelBotones2 panelBotones2;
	
	public View(Controller control) {
		
		setSize(400,300); 
		setResizable(false); 
		setTitle("Lots Taltuza Tech"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout( new BorderLayout() );
		panelJugador = new PanelJugador1();
		panelBotones = new PanelBotones();
		add(panelBotones,BorderLayout.CENTER);
		panelJuego = new PanelJuego();
		panelBotones2 = new PanelBotones2();
		add(panelBotones2,BorderLayout.NORTH);
		panelPartida = new PanelPartida();
		panelResultados = new PanelResultados();
		panelBotones2.setVisible(false);
		panelResultados.setVisible(false);


//		add(panelBotones);
		
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

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelBotones2 getPanelBotones2() {
		return panelBotones2;
	}

	public void setPanelBotones2(PanelBotones2 panelBotones2) {
		this.panelBotones2 = panelBotones2;
	}	
	
}
