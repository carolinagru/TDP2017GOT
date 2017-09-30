package Personajes;
 
import javax.swing.ImageIcon;

import Graficos.Alien1Grafico;
import Graficos.Alien3Grafico;
import Principal.Celda;

public class A1 extends Alien{
	
	protected static int moneda=25;
	protected static int punto=15;

	public A1(Celda pos ) {		
		super(pos);
		this.grafico = new Alien1Grafico(pos.getFila(), pos.getColumna());
		
	}
	
}
