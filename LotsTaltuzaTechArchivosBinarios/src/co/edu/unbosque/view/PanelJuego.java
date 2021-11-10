package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelJuego extends JPanel{
//
	private JTextArea txtNombre;
	private JTextArea txtNombreJuego;
	private JTextArea txtTorneo;
	private JTextArea txtJuego;
	private JLabel labArchivo;
	private JButton butAgregar;
	private JButton butLeer;
	public static final String AGREGAR = "Agregar";
	public static final String LEER = "Leer";
	private static final long serialVersionUID = 1L;
	
	public PanelJuego() {
		setLayout( new GridLayout(3,3) );
		TitledBorder border = BorderFactory.createTitledBorder("Juego");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		txtNombre = new JTextArea("NOMBRE JUEGO:");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
	
		txtTorneo = new JTextArea("");
		txtTorneo.setForeground(Color.BLACK);
		txtTorneo.setBackground(Color.WHITE);
		
		txtNombreJuego = new JTextArea("TIPO DE JUEGO:");
		txtNombreJuego.setForeground(Color.BLACK);
		txtNombreJuego.setBackground(Color.WHITE);
		
		txtJuego = new JTextArea("");
		txtJuego.setForeground(Color.BLACK);
		txtJuego.setBackground(Color.WHITE);
		
		butAgregar = new JButton("Escribir");
		butAgregar.setActionCommand(AGREGAR);
		butLeer = new JButton("Leer");
		butLeer.setActionCommand(LEER);
		
		
		add(txtNombre);
		add(txtTorneo);
		add(txtNombreJuego);
		add(txtJuego);
		add(butAgregar);
		add(butLeer);
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtNombreJuego() {
		return txtNombreJuego;
	}

	public void setTxtNombreJuego(JTextArea txtNombreJuego) {
		this.txtNombreJuego = txtNombreJuego;
	}

	public JTextArea getTxtTorneo() {
		return txtTorneo;
	}

	public void setTxtTorneo(JTextArea txtTorneo) {
		this.txtTorneo = txtTorneo;
	}

	public JTextArea getTxtJuego() {
		return txtJuego;
	}

	public void setTxtJuego(JTextArea txtJuego) {
		this.txtJuego = txtJuego;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}

	public JButton getButAgregar() {
		return butAgregar;
	}

	public void setButAgregar(JButton butAgregar) {
		this.butAgregar = butAgregar;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}

	public static String getAgregar() {
		return AGREGAR;
	}

	public static String getLeer() {
		return LEER;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
}
