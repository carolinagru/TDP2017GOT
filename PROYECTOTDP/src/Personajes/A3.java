package Personajes;

import javax.swing.ImageIcon;

public class A3 extends Alien{
	
	protected static int moneda=25;
	protected static int punto=15;

	public A3() {
		
		
		imagen = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/Alien-Caminando-2.gif"));
	}
	
	public void setPosicion(int x, int y) {
		fila=x;
		columna=y;
	}
}
