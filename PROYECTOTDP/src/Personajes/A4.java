package Personajes;

import javax.swing.ImageIcon;

public class A4 extends Alien{
	
	protected static int moneda=30;
	protected static int punto=20;


	public A4() {
		
		
		imagen = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/Alien-Caminando-2.gif"));
	}
	
	public void setPosicion(int x, int y) {
		fila=x;
		columna=y;
	}
}
