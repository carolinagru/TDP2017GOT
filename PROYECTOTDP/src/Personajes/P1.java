package Personajes;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class P1 extends Policia {
	
	protected static int precio = 25;

	
	public P1(int x, int y) {
	  
		fila=x;
		columna=y;
		imagen = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/Soldado Disparando.gif"));
	}
	


}
