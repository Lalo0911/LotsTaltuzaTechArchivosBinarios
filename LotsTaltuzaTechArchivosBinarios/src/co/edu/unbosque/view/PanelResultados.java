package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtObjeto2;
	private JTextArea txtObjeto1;
	

	public PanelResultados() {
		
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("Listado de Resultados Juego");
		txtObjeto2 = new JTextArea("");
		txtObjeto2.setForeground(Color.BLACK);
		txtObjeto2.setBackground(Color.WHITE);
	
		txtObjeto1 = new JTextArea("");
		txtObjeto1.setForeground(Color.BLACK);
		txtObjeto1.setBackground(Color.WHITE);
		
		
		add(txtObjeto1);
		add(txtObjeto2);
	}


	public JLabel getLabResultado() {
		return labResultado;
	}


	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}


	public JTextArea getTxtObjeto2() {
		return txtObjeto2;
	}


	public void setTxtObjeto2(JTextArea txtObjeto2) {
		this.txtObjeto2 = txtObjeto2;
	}


	public JTextArea getTxtObjeto1() {
		return txtObjeto1;
	}


	public void setTxtObjeto1(JTextArea txtObjeto1) {
		this.txtObjeto1 = txtObjeto1;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
