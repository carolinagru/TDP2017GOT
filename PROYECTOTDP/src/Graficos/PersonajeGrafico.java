package Graficos;
import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 
public class PersonajeGrafico {



	protected JLabel label; 
	protected Icon image;
	protected int width=40;
	protected int height=40;
	protected Point pos;

	public PersonajeGrafico( int fila, int columna ) {
		pos = new Point(fila * this.width, columna * this.height);
	}
		
		
	public JLabel getGrafico() {
		label= new JLabel(image);
		this.label.setBounds(this.pos.x, this.pos.y, width, height); 
		ImageIcon aux = (ImageIcon)image;
		Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
		return label;
	}
}

 
