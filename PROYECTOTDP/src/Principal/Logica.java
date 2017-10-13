package Principal;


import java.awt.Point;
import Personajes.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Factory.A1factory;
import Factory.PersonajesFactoryMethod;
import Factory.S1factory;
import Factory.S2factory;
import Factory.S3factory;
import Factory.S4factory;
import Factory.S5factory;
import Objetos.Objeto;
import Objetos.Obstaculo;
import Personajes.A1;
import Personajes.A2;
import Personajes.A3;
import Personajes.A4;
import Personajes.A5;
import Personajes.A6;
import Personajes.Alien;

import Personajes.S1;
import Personajes.S2;
import Personajes.S3;
import Personajes.S4;
import Personajes.S5;
import Personajes.Soldado;
import Personajes.*;


public class Logica {
	
	protected int monedas;
	protected int puntos;
	protected LinkedList<Personaje> aliensMapa;
	protected LinkedList<Personaje> soldadosMapa;
	protected LinkedList<Objeto> objetosMapa;
	protected JPanel panelMapa;
	protected Mapa mapaCombate;
	private static int tamanioCelda = 40;
	protected PersonajesFactoryMethod factory;
	protected static int height = 1000;
	protected static int width= 500;
	protected JLabel l;
 

	public Logica(JPanel p){
		
		panelMapa=p;
		puntos=0;
		aliensMapa=new LinkedList();
		soldadosMapa= new LinkedList();
		objetosMapa= new LinkedList();
	    int filas = (width - 40 ) / tamanioCelda;
	    int columnas = (height - 80) / tamanioCelda;
	   
	     mapaCombate = new Mapa(filas,columnas);
	     System.out.println("filas de constructor de logica "+filas+" columnas de constructor de logica "+columnas);
	     
	}
	
	public void setPanel(JPanel p) {
		panelMapa = p;
	}
	public JPanel getPanel() {
		return panelMapa;
	}
	public void insertarObjetos() {
		activarMenu();
	}
	
	public void activarMenu() {
		
    
	}

	public void moverAlien(Alien a) {

	
	}
	public void crearS1(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S1factory();
		Personaje p =factory.createPersonaje(c);
		l = p.getGrafico();
		panelMapa.add(l);
		l.repaint();
		soldadosMapa.addLast(p);

	}
	public void crearS2(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);	
		factory = new S2factory();
		Personaje p =factory.createPersonaje(c);
		l = p.getGrafico();
		panelMapa.add(l);
		l.repaint();
		soldadosMapa.addLast(p);		
	}
	public void crearS3(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S3factory();
		Personaje p =factory.createPersonaje(c);
		l = p.getGrafico();
		panelMapa.add(l);
		l.repaint();
		soldadosMapa.addLast(p);
		
	}
	public void crearS4(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S4factory();
		Personaje p =factory.createPersonaje(c);
		l = p.getGrafico();
		panelMapa.add(l);
		l.repaint();
		soldadosMapa.addLast(p);

	}
	public void crearS5(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S5factory();
		Personaje p =factory.createPersonaje(c);
		l = p.getGrafico();
		panelMapa.add(l);
		l.repaint();
		soldadosMapa.addLast(p);

	}
	
	public void verificarPosicion(int x, int y) {
		Celda c= mapaCombate.getCelda(x, y);
		
		for (Personaje p: soldadosMapa) {
			if (p.getCelda().equals(c)) {
				venderSoldado(p);
				soldadosMapa.remove(p);
			}
		}
	  
	}
	public void venderSoldado(Personaje p) {
		panelMapa.remove(p.getGrafico());
		panelMapa.revalidate();
		panelMapa.repaint();
		
	}
	
	
}
