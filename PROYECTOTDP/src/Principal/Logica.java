package Principal;


import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Personajes.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

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
import Visitor.Visitor;
import Visitor.VisitorAlien;
import Visitor.VisitorSoldado;
import Personajes.*;


public class Logica {
	
	protected int monedas;
	protected int puntos;
	protected Timer t1;
	protected LinkedList<Personaje> aliensMapa;
	protected LinkedList<Personaje> soldadosMapa;
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
	    int columnas = ((height - 80 ) / tamanioCelda)+2;
	    int filas = ((width - 40) / tamanioCelda)+1;
	    
	     mapaCombate = new Mapa(filas,columnas,p);
	     System.out.println("columnas de constructor de logica "+columnas+" filas de constructor de logica "+filas);

	     insertarObjetos();
	}
	
	public void insertarObjetos() {
		mapaCombate.insertarObjetos();
		activarMenu();
	}
	
	public void activarMenu() {
		
	    insertarEnemigos();
	}
	
	public void insertarEnemigos() {
		
	 t1 = new Timer (5000, new ActionListener (){
	          public void actionPerformed(ActionEvent e){
	         	if(aliensMapa.size() < 2)
	         		aliensMapa.addLast(mapaCombate.insertarEnemigo(factory));
	          }
	      });
	   t1.start();

	}
	
	
	public void crearS1(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S1factory(panelMapa);
		soldadosMapa.addLast(factory.createPersonaje(c));

	}
	
	public void crearS2(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);	
		factory = new S2factory(panelMapa);
		soldadosMapa.addLast(factory.createPersonaje(c));		
	}
	
	public void crearS3(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S3factory(panelMapa);
		soldadosMapa.addLast(factory.createPersonaje(c));
		
	}
	
	public void crearS4(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S4factory(panelMapa);
		soldadosMapa.addLast(factory.createPersonaje(c));

	}
	
	public void crearS5(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new S5factory(panelMapa);
		soldadosMapa.addLast(factory.createPersonaje(c));

	}
	
	
	public void verificarPosicion(int x, int y) {
		Celda c= mapaCombate.getCelda(x, y);
		
		for (Personaje p: soldadosMapa) {
			if (p.getCelda().equals(c)) {
				mapaCombate.eliminar(p);
				soldadosMapa.remove(p);
			}
		}
	  
	}
	
	
	
	
	
}
