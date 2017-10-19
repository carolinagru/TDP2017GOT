package Graficos;
import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class PersonajeGrafico {



	protected JLabel label; 
	protected Icon image;
	protected int width=40;
	protected int height=40;
	protected Point pos;

	public PersonajeGrafico( int fila, int columna ) {
		pos = new Point(fila * this.width, columna * this.height);
	}
		
	public void setPoint(int x, int y) {
		pos.setLocation(x*width, y*height);
	}
	
	public JLabel getGrafico() {
		label= new JLabel(image);
<<<<<<< HEAD
		label.setBounds(pos.y, pos.x, width, height); 
=======
		this.label.setBounds(this.pos.x, this.pos.y, 55, 55); 
>>>>>>> 3db909e2eef249c7767a2bf9c0274b3dd216bb20
		ImageIcon aux = (ImageIcon)image;
		Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
		return label;
		
	}
	
	public void actualizarGrafico(){		
		try {
		   ImageIcon aux=(ImageIcon) image;
		   Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getWidth(), Image.SCALE_DEFAULT));
		   label.setIcon(icono);
		   
		   this.label.setBounds(pos.y, pos.x, width, height);
		   Thread.sleep(100);
		  
		   
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

 
