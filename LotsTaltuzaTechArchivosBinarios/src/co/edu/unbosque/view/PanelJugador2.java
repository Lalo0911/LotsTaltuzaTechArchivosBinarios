package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelJugador2 extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public static final String AGREGAR = "Agregar";
	public static final String JUGAR = "Jugar";
	private JLabel labNombre;
	private JTextField txtNombre;
	private JLabel labEdad;
	private JTextField txtEdad;
	private JLabel labGenero;
	private JTextField txtGenero;
	private JButton butAgregar;
	private JButton butJugar;
	
	public PanelJugador2() {
		setLayout( new GridLayout(4,4) );//se define el grid de 4x4
		TitledBorder border = BorderFactory.createTitledBorder("Jugador 1");
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
		butAgregar = new JButton("Agregar Jugadores");
		butAgregar.setActionCommand(AGREGAR);
		butJugar = new JButton("Jugar");
		butJugar.setActionCommand(JUGAR);
	}


	public static String getAgregar() {
		return AGREGAR;
	}


	public static String getJugar() {
		return JUGAR;
	}

	public JButton getButAgregar() {
		return butAgregar;
	}


	public void setButAgregar(JButton butAgregar) {
		this.butAgregar = butAgregar;
	}


	public JButton getButJugar() {
		return butJugar;
	}


	public void setButJugar(JButton butJugar) {
		this.butJugar = butJugar;
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


	
}
