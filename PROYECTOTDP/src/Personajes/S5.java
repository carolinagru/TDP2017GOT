
package Personajes;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Graficos.Soldado1Grafico;
import Principal.Celda;
import Visitor.Visitor;

public class S5 extends Soldado {
	
	protected static int precio = 25;

	
	public S5(Celda pos) {
		super(pos);
		grafico = new Soldado1Grafico(pos.getFila(), pos.getColumna());
	}


	 
	public void Acept(Visitor v) {
		v.visitSoldado(this);
		
	}
	
	public void Atacar(Personaje p) {
		 
	}
	


}
