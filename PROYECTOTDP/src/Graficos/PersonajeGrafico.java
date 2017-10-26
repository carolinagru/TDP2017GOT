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
	protected int width=80;
	protected int height=80;
	protected Point pos;

	public PersonajeGrafico( int fila, int columna ) {
		pos = new Point(fila * this.width, columna * this.height);
	}
	
	public Point getPoint (){
		return pos;
	}
	
	public void setPoint ( int x, int y ) {
		pos = new Point ( x,y);
	}
		
<<<<<<< HEAD
=======
	public void setPoint(int x, int y) {
		pos.setLocation(x*width, y*height);
	}
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	
	public JLabel getGrafico() {
		label= new JLabel(image);
		label.setBounds(pos.y, pos.x, width, height); 
		ImageIcon aux = (ImageIcon)image;
		Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
		return label;
		
	}
	
<<<<<<< HEAD
	public void actualizarGrafico(JPanel p){	
		 
			System.out.println("Entre a actualizar grafico");
		   ImageIcon aux=(ImageIcon) image;
		   
		   Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getWidth(), Image.SCALE_DEFAULT));
		   label.setIcon(icono);
		
		 
		   label.setBounds(pos.x-55, pos.y, width, height);
		   setPoint(pos.x-55,pos.y);
		   p.add(label);
		   p.repaint();
		 //  setPoint(pos.x-55, pos.y+55);
		    
 
		}
		
=======
	public void actualizarGrafico(){		
	
	  ImageIcon aux=(ImageIcon) image;
	  Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getWidth(), Image.SCALE_DEFAULT));
	  label.setIcon(icono);
	  label.setBounds(pos.y, pos.x, width, height);
		
	}
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
}
	

 
