package Personajes;

import javax.swing.ImageIcon;

public class A5 extends Alien{
	
	protected static int moneda=35;
	protected static int punto=25;


	public A5() {
		
		
		imagen = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/Alien-Caminando-2.gif"));
	}
	
	public void setPosicion(int x, int y) {
		fila=x;
		columna=y;
	}
	
}
