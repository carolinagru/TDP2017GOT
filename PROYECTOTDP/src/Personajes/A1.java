package Personajes;
 
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Graficos.Alien1Grafico;
import Graficos.Alien3Grafico;
import Principal.Celda;
import Visitor.Visitor;
import Visitor.VisitorAlien;

public class A1 extends Alien{
	
	protected static int moneda=25;
	protected static int punto=15;

	public A1(Celda pos ) {	
		super(pos);
		this.fuerza = (float) 0.7;
<<<<<<< HEAD
		grafico = new Alien1Grafico(pos.getFila(), pos.getColumna());
		
	}
	
=======
		System.out.println("Entre A1 Fila :"+ pos.getFila()+ " Columna :"+pos.getColumna());
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778

		this.grafico = new Alien1Grafico(pos.getFila(), pos.getColumna());		
	}
	
}