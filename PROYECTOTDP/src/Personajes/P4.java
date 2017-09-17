package Personajes;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class P4 extends Policia{
	
	protected static int precio = 60;
	protected Icon imagen;
	protected JLabel label;
	
	public P4() {
	  
		imagen = new ImageIcon(getClass().getResource("/Sprites/Alien Caminando/0.png"));
		
	}
	
public JLabel getGrafico() {
		
		label= new JLabel();
		ImageIcon aux=(ImageIcon) imagen;
		Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
 	    label.setIcon(icono);
		
		return label;
	}


}
