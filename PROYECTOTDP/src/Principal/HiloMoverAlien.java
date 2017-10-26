package Principal;

import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Graficos.PersonajeGrafico;
import Objetos.Obstaculo;
import Personajes.Alien;
import Personajes.Personaje;

public class HiloMoverAlien extends Thread  {
	protected int columna;
	protected int fila;
	protected Celda c;
	protected Obstaculo p;
	protected Mapa map;
	protected JPanel pan;
	 
	public HiloMoverAlien(Celda c, Mapa m, JPanel panel) {
		super();
		this.c = c;
		p = c.elemento;
		columna = c.getColumna();
		fila = c.getFila();
		map = m; 
		pan = panel;
	}
	
	
	public void run (){
	
		 JLabel j = c.getElemento().getGrafico();
		 Obstaculo o = c.getElemento();
		for (int i = columna; i > 0; i-- ) {
			System.out.println("Entre a mover -> Columna:" +i + " Fila -> "+fila);
			if (map.siguienteCelda(c).getElemento() == null) {	
				Point po = c.getElemento().getPersonajeGrafico().getPoint();
				System.out.println("                                  Posicion de la siguiente celda X -> :"+ po.x + " Fila -> "+po.y);
				c = map.siguienteCelda(c);
				c.setElemento(o);
				c.getElemento().actualizarGrafico(pan);
				pan.repaint();
				try {
					this.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}