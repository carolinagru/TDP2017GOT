package Objetos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Obstaculo {

	protected JLabel label; 
	protected Icon imagen;
	protected int fila;
	protected int columna;
	protected int width=32;
	protected int height=32;
	protected Point pos;
	
	public JLabel getGrafico() {
		
		label= new JLabel(imagen);
		this.label.setBounds(this.fila, this.columna, width, height);
		 
		return label;
		
	}
}
