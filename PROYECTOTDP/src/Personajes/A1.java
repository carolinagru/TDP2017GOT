package Personajes;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.text.Position;

public class A1 extends Alien{
	
	protected static int moneda=10;
	protected static int punto=5;


	public A1() {
		
		
		imagen = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/Alien-Caminando-2.gif"));
	}
	
	public void setPosicion(int x, int y) {
		fila=x;
		columna=y;
	}
	
	public Point getPosicion() {
		pos= new Point(fila * width, columna * height);
		
		return pos;
	}
	
	
}
