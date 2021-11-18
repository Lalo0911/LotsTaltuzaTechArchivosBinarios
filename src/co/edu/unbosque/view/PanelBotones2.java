package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelBotones2 extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private JButton butRegresar;
	private JLabel labVacio1;
	private JLabel labVacio2;
	public static final String INICIO = "Inicio";


	public PanelBotones2() {
		setLayout( new GridLayout(1,3) );
		labVacio1 = new JLabel("");
		butRegresar = new JButton("Regresar");
		butRegresar.setActionCommand(INICIO);
		add(butRegresar);
		add(labVacio1);
		labVacio2 = new JLabel("");
		add(labVacio2);

	}


	
	public JButton getButRegresar() {
		return butRegresar;
	}



	public void setButRegresar(JButton butRegresar) {
		this.butRegresar = butRegresar;
	}



	public JLabel getLabVacio1() {
		return labVacio1;
	}


	public void setLabVacio1(JLabel labVacio1) {
		this.labVacio1 = labVacio1;
	}


	public JLabel getLabVacio2() {
		return labVacio2;
	}


	public void setLabVacio2(JLabel labVacio2) {
		this.labVacio2 = labVacio2;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getInicio() {
		return INICIO;
	}
	
}
