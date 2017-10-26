package Objetos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Graficos.PersonajeGrafico;
import Principal.Celda;
import Visitor.Elemento;
import Visitor.Visitor;

public abstract class Obstaculo {

	protected PersonajeGrafico grafico;
	protected Celda pos;
<<<<<<< HEAD
	protected Elemento e;
	protected Point p;

	public PersonajeGrafico getPersonajeGrafico () {
		return grafico;
	}

=======
	protected Elemento e;	
	protected static int vida=100;
	
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	public JLabel getGrafico() {	
		return grafico.getGrafico();
	}
	
	public Celda getCelda() {
		return pos;
	}
	
	public void actualizarGrafico(JPanel p) {
	  grafico.actualizarGrafico(p);
	}
	
	
	public void setCelda(int x, int y) {
		pos.set(x, y);
		grafico.setPoint(x,y);
	}
	public Elemento getElement() {
		return e;
	}
	
<<<<<<< HEAD
	public void actualizarPosicion (int x, int y ) {
		grafico.getGrafico().setBounds(x, y, 55, 55);
		
	}
	

=======
	public void setVida(int i) {
		vida-=i;
	}
	public int getVida() {
		return vida;
	}
	
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
}