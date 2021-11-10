package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
//
public class PanelResultados extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JLabel txtObjeto1;
	

	public PanelResultados() {
		
		setLayout( new GridLayout(1,2) );
		
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("Listado de Resultados Juego");
	
		txtObjeto1 = new JLabel("");
		txtObjeto1.setForeground(Color.BLACK);
		txtObjeto1.setBackground(Color.WHITE);
		
		
		add(txtObjeto1);
	}


	public JLabel getLabResultado() {
		return labResultado;
	}


	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}


	public JLabel getTxtObjeto1() {
		return txtObjeto1;
	}


	public void setTxtObjeto1(JLabel txtObjeto1) {
		this.txtObjeto1 = txtObjeto1;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
