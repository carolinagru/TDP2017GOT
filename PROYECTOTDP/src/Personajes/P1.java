package Personajes;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class P1 extends Policia {
	
	protected static int precio = 25;
	protected Icon imagen;
	protected JLabel label;
	protected int fila;
	protected int columna;
	protected int width=32;
	protected int height=32;
	
	public P1(int x, int y) {
	  
		fila=x;
		columna=y;
		imagen = new ImageIcon("C:\\Users\\Carol\\Documents\\GitHub\\TDP2017GOT\\PROYECTOTDP\\src\\Sprites\\Sprite Alien\\Alien Caminando\\10.png");
		
	}
	
public JLabel getGrafico() {
		
	label = new JLabel(imagen);
	this.label.setBounds(this.fila, this.columna, width, height);
	return label;
	
}

}
