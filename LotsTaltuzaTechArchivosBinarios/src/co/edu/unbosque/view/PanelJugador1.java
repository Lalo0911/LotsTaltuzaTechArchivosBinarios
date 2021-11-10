package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelJugador1 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public static final String AGREGARJUGADOR = "AgregarJugador";
	public static final String LEERJUGADOR = "LeerJugador";
	private JLabel labNombre;
	private JTextField txtNombre;
	private JLabel labEdad;
	private JTextField txtEdad;
	private JLabel labGenero;
	private JTextField txtGenero;
	private JTextField txtPuntaje;
	private JButton butLeer;
	private JLabel labPuntaje;
	private JLabel labVacio1;
	private JLabel labVacio2;
	private JTextField txtNombre2;
	private Component labEdad2;
	private JTextField txtEdad2;
	private JButton butAgregar2;
	private Component txtPuntaje2;
	private Component labPuntaje2;
	private Component txtGenero2;
	private Component labGenero2;


	
	public PanelJugador1() {
		setLayout( new GridLayout(11,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Jugador");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labNombre = new JLabel("Nombre 1:");
		add(labNombre);
		
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		add(txtNombre);
		
		labEdad = new JLabel("Edad 1:");
		add(labEdad);
		
		txtEdad = new JTextField("");
		txtEdad.setForeground(Color.BLACK);
		txtEdad.setBackground(Color.WHITE);
		add(txtEdad);
		
		labGenero = new JLabel("Genero 1:");
		add(labGenero);
		
		txtGenero = new JTextField("");
		txtGenero.setForeground(Color.BLACK);
		txtGenero.setBackground(Color.WHITE);
		add(txtGenero);
		
		labPuntaje = new JLabel("Puntaje 1:");
		add(labPuntaje);
		
		txtPuntaje = new JTextField("");
		txtPuntaje.setForeground(Color.BLACK);
		txtPuntaje.setBackground(Color.WHITE);
		add(txtPuntaje);
		
		labVacio1 = new JLabel("");
		add(labVacio1);
		
		labVacio2 = new JLabel("");
		add(labVacio2);
		
		labNombre = new JLabel("Nombre 2:");
		add(labNombre);
		
		txtNombre2 = new JTextField("");
		txtNombre2.setForeground(Color.BLACK);
		txtNombre2.setBackground(Color.WHITE);
		add(txtNombre2);
		
		labEdad2 = new JLabel("Edad 2:");
		add(labEdad2);
		
		txtEdad2 = new JTextField("");
		txtEdad2.setForeground(Color.BLACK);
		txtEdad2.setBackground(Color.WHITE);
		add(txtEdad2);
		
		labGenero2 = new JLabel("Genero 2:");
		add(labGenero2);
		
		txtGenero2 = new JTextField("");
		txtGenero2.setForeground(Color.BLACK);
		txtGenero2.setBackground(Color.WHITE);
		add(txtGenero2);
		
		labPuntaje2 = new JLabel("Puntaje 2:");
		add(labPuntaje2);
		
		txtPuntaje2 = new JTextField("");
		txtPuntaje2.setForeground(Color.BLACK);
		txtPuntaje2.setBackground(Color.WHITE);
		add(txtPuntaje2);
		
		butAgregar2 = new JButton("Escribir");
		butAgregar2.setActionCommand(AGREGARJUGADOR);
		add(butAgregar2);
		
		butLeer = new JButton("Leer");
		butLeer.setActionCommand(LEERJUGADOR);
		add(butLeer);
	}
	


	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JLabel getLabEdad() {
		return labEdad;
	}

	public void setLabEdad(JLabel labEdad) {
		this.labEdad = labEdad;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JLabel getLabGenero() {
		return labGenero;
	}

	public void setLabGenero(JLabel labGenero) {
		this.labGenero = labGenero;
	}

	public JTextField getTxtGenero() {
		return txtGenero;
	}

	public void setTxtGenero(JTextField txtGenero) {
		this.txtGenero = txtGenero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getAgregar() {
		return AGREGARJUGADOR;
	}



	public JButton getButLeer() {
		return butLeer;
	}



	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}



	public static String getLeer() {
		return LEERJUGADOR;
	}



	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}



	public void setTxtPuntaje(JTextField txtPuntaje) {
		this.txtPuntaje = txtPuntaje;
	}



	public static String getAgregarjugador() {
		return AGREGARJUGADOR;
	}



	public static String getLeerjugador() {
		return LEERJUGADOR;
	}



	public JLabel getLabPuntaje() {
		return labPuntaje;
	}



	public void setLabPuntaje(JLabel labPuntaje) {
		this.labPuntaje = labPuntaje;
	}



	public JTextField getTxtNombre2() {
		return txtNombre2;
	}



	public void setTxtNombre2(JTextField txtNombre2) {
		this.txtNombre2 = txtNombre2;
	}



	public Component getLabEdad2() {
		return labEdad2;
	}



	public void setLabEdad2(Component labEdad2) {
		this.labEdad2 = labEdad2;
	}



	public JTextField getTxtEdad2() {
		return txtEdad2;
	}



	public void setTxtEdad2(JTextField txtEdad2) {
		this.txtEdad2 = txtEdad2;
	}



	public JButton getButAgregar2() {
		return butAgregar2;
	}



	public void setButAgregar2(JButton butAgregar2) {
		this.butAgregar2 = butAgregar2;
	}



	public Component getLabPuntaje2() {
		return labPuntaje2;
	}



	public void setLabPuntaje2(Component labPuntaje2) {
		this.labPuntaje2 = labPuntaje2;
	}


	public Component getLabGenero2() {
		return labGenero2;
	}



	public void setLabGenero2(Component labGenero2) {
		this.labGenero2 = labGenero2;
	}



	public JTextField getTxtPuntaje2() {
		return (JTextField) txtPuntaje2;
	}



	public void setTxtPuntaje2(JTextField txtPuntaje2) {
		this.txtPuntaje2 = txtPuntaje2;
	}



	public JTextField getTxtGenero2() {
		return (JTextField) txtGenero2;
	}



	public void setTxtGenero2(JTextField txtGenero2) {
		this.txtGenero2 = txtGenero2;
	}
	

}
