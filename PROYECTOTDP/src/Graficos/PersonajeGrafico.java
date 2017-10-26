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
	
	public Point getPoint (){
		return pos;
	}
	
	public void setPoint ( int x, int y ) {
		pos = new Point ( x,y);
	}
		
	
	public JLabel getGrafico() {
		label= new JLabel(image);
		this.label.setBounds(this.pos.x, this.pos.y, 55, 55); 
		ImageIcon aux = (ImageIcon)image;
		Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
		return label;
	}
	
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
		
}
	

 
