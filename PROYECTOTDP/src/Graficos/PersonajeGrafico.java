package Graficos;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 
public class PersonajeGrafico {



	protected JLabel label; 
	protected Icon image;
	protected int width=30;
	protected int height=30;
	protected Point pos;

	public PersonajeGrafico( int x, int y ) {
		pos = new Point(x * this.width, y * this.height);
	}
		
		
	public JLabel getGrafico() {
		label= new JLabel(image);
		this.label.setBounds(pos.x,pos.y, width, height);
		 
		return label;
		
	}
}

 
