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

import Objetos.Obstaculo;
import Visitor.Visitor;
import Visitor.VisitorAlien;
import Visitor.VisitorSoldado;
import Personajes.*;


public class Logica {
	
	protected int monedas;
	protected int puntos;
	protected Timer t1,t2,t3;
	protected LinkedList<Personaje> aliensMapa;
	protected LinkedList<Personaje> soldadosMapa;
	protected JPanel panelMapa;
	protected Mapa mapaCombate;
	private static int tamanioCelda = 80;
	protected PersonajesFactoryMethod factory;
	protected static int height = 500;
	protected static int width= 1000;
	protected JLabel l;
    protected int columnas;

	public Logica(JPanel p){
		
		panelMapa=p;
		puntos=0;
		aliensMapa=new LinkedList();
		soldadosMapa= new LinkedList();
<<<<<<< HEAD
	    int columnas = ((height - 80 ) / tamanioCelda)+2; 
	    int filas =  ((width - 40) / tamanioCelda)+1;
	    
 
	     mapaCombate = new Mapa(filas,columnas,p);
	     System.out.println("CONSTRUCTOR  de logica "+columnas+" filas de constructor de logica "+filas);

	     insertarObjetos();
	     Celda c = mapaCombate.getCelda(10, 10);
	     crearA1(10, 1);
	     //Pruebo mover alien
	     
	     
        Personaje per = aliensMapa.getLast();
	     //System.out.println("Vida del alien"+per.getFuerza());
	     mapaCombate.moverAlien(per);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
=======
	    columnas = ((width - 80 ) / tamanioCelda)+2;
	    int filas = ((height - 40) / tamanioCelda)+1;
	    
	    System.out.println("columnas de constructor de logica "+columnas+" filas de constructor de logica "+filas);

	     mapaCombate = new Mapa(filas,columnas,p);
	    activarMenu();
	   //  insertarObjetos();
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	     
	}
	
	public void insertarObjetos() {
		mapaCombate.insertarObjetos();
		activarMenu();
	}
	
	public void activarMenu() {
	
	    insertarEnemigos();
	    moverAlien();
	}
	
	public void insertarEnemigos() {
<<<<<<< HEAD
 /**
	 t1 = new Timer (5000, new ActionListener (){
	          public void actionPerformed(ActionEvent e){
	         	if(aliensMapa.size() < 2)
	         		aliensMapa.addLast(mapaCombate.insertarEnemigo(factory));
	          }
	      });
	   t1.start();
 **/
 }
=======
	 t1 = new Timer (5000, new ActionListener (){
	     public void actionPerformed(ActionEvent e){
	       	if(aliensMapa.size() < 4)
	       		aliensMapa.addLast(mapaCombate.insertarEnemigo(factory));
	     }
	 });
	 t1.start();
	}

	public void moverAlien() {
		t2 = new Timer (300, new ActionListener (){
			public void actionPerformed(ActionEvent e){
				for (Personaje p :aliensMapa){
						if(p != null)
							moverAlien(p);
				}       				
			}
		});
	 t2.start();
    }
	
	public void moverAlien(Personaje p) {
		
		Celda c = p.getCelda();	
		Celda siguiente = mapaCombate.siguienteCelda(c);
		if (siguiente != null) {
			Obstaculo o = siguiente.getElemento();
			if (o == null ) {
				c = siguiente;
				p.setCelda(c.getFila(), c.getColumna());
				c.setElemento(p);
				p.actualizarGrafico();
			}else {	
					if (o.getElement().dejoPasar(p.getVisitor())) {
						c = siguiente;
						p.setCelda(c.getFila(), c.getColumna());
						c.setElemento(p);
						p.actualizarGrafico();
					}
					else if (o.getElement().dejoAtacar(p.getVisitor()))
							atacarEnemigo(p,o);	
			}		
		}
	}
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	
	public void atacarEnemigo(Personaje p, Obstaculo o) {
		t3 = new Timer (200, new ActionListener (){
			public void actionPerformed(ActionEvent e){
				int cant = o.getElement().sacarVida(p.getVisitor());
		        o.setVida(cant);
				if (o.getVida() <= 0) {
					mapaCombate.eliminar(o);
				}
		    }
		});
	  t3.start();	
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
	
<<<<<<< HEAD
	public void crearA1(int x, int y) {
		Celda c = mapaCombate.getCelda(x, y);
		factory = new A1factory(panelMapa);
		aliensMapa.addLast(factory.createPersonaje(c));

	}
	
	
=======
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
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
