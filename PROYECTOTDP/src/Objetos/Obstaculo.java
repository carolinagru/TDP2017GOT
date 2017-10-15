package Objetos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Graficos.PersonajeGrafico;
import Principal.Celda;

public abstract class Obstaculo {

	protected PersonajeGrafico grafico;
	protected Celda pos;

	

	public JLabel getGrafico() {	
		return grafico.getGrafico();
	}
	
	public Celda getCelda() {
		return pos;
	}
	
	public void setCelda(int x, int y) {
		pos.set(x, y);
	}
	
}