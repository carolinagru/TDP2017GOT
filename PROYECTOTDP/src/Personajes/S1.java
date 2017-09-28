
package Personajes;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Graficos.Soldado1Grafico;
import Principal.Celda;

public class S1 extends Soldado {
	
	protected static int precio = 25;

	
	public S1(Celda pos) {
		super(pos);
		grafico = new Soldado1Grafico(pos.getX(), pos.getY());
	}
	


}
