package Personajes;

import javax.swing.ImageIcon;

public class A2 extends Alien{
	
	protected static int moneda=20;
	protected static int punto=10;

	public A2() {
		
		
		imagen = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/Alien-Caminando-2.gif"));
	}
	
	public void setPosicion(int x, int y) {
		fila=x;
		columna=y;
	}
}
