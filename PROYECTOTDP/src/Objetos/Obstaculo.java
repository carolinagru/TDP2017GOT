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
	protected Elemento e;
	protected Point p;

	public PersonajeGrafico getPersonajeGrafico () {
		return grafico;
	}

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
	}
	public Elemento getElement() {
		return e;
	}
	
	public void actualizarPosicion (int x, int y ) {
		grafico.getGrafico().setBounds(x, y, 55, 55);
		
	}
	

}