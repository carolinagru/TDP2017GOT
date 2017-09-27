
package Personajes;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Graficos.Soldado1Grafico;
import Principal.Celda;

public class P3 extends Policia {
	
	protected static int precio = 25;

	
	public P3(Celda pos) {
		super(pos);
		grafico = new Soldado1Grafico(pos.getX(), pos.getY());
	}
	


}


