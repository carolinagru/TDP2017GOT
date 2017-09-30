package Principal;


import java.awt.Point;
import Personajes.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JPanel;

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
	protected LinkedList<Alien> aliensMapa;
	protected LinkedList<Soldado> soldadosMapa;
	protected LinkedList<Objeto> objetosMapa;
	protected JPanel panelMapa;
	protected Mapa mapaCombate;
	private int tamanioCelda = 40;
	
	
	public Logica(JPanel panel){
		
		puntos=0;
		aliensMapa=new LinkedList();
		soldadosMapa= new LinkedList();
		objetosMapa= new LinkedList();
		
	    panelMapa = panel;
	
		
	    mapaCombate = new Mapa((panelMapa.getWidth() - 40) / tamanioCelda, (panelMapa.getHeight() - 80 ) / tamanioCelda);

	    
	    Celda c = mapaCombate.getCelda(0,0);
	    
	    Soldado sol = new S1(c);
	     
	    panelMapa.add(sol.getGrafico());
		
	//    insertarObjetos();
		 
	}
	
	 
	 
	public void insertarObjetos() {
		//insertamos los objetos del mapa
		activarMenu();
	}
	
	public void activarMenu() {
		//activamos el menu para comprar Soldados y objetos
		
		crearAliens();
	}
	
	public void crearAliens() {
	//creamos aliens de tipo 1 y 2, dos listas para tipo 1 y 2 (primer orda)
	
	  
	  Random num= new Random();
	 
	  
	  int fila = num.nextInt(80);
	  int columna = num.nextInt(80);
	  
	     Celda c= mapaCombate.getCelda(fila, columna);  	
    	 Alien alien1 = new A1(c);
	  	if (c.getElemento() != null) {  		
	  		c.setElemento(alien1);
	  	}		
	  	
	  	panelMapa.add(alien1.getGrafico());
	  	
	  	
		
	  
	  	
	  	
	  	
	  
	  
		
		
	}//--------------------- Ver ----------------------------
	// Ver como posicionar los Soldados en el Panel mapaPanel. kyfuykvbiunonmmnjhbgv
	public void moverAlien(Alien a) {

	
	}

	

public void crearSoldado1(Celda pos) {
    	
		Soldado p1= new S1(pos);
    	mapaCombate.agregarObstaculo(pos, p1);
    	panelMapa.add(p1.getGrafico());
    }
    
	
public void crearsoldado2(Celda pos) {
    	
    	Soldado p2= new S2(pos);
    	mapaCombate.agregarObstaculo(pos, p2);
    	panelMapa.add(p2.getGrafico());
    }
    
public void crearSoldado3(Celda pos) {
    	
    	Soldado p3= new S3(pos);
    	mapaCombate.agregarObstaculo(pos, p3);
    	panelMapa.add(p3.getGrafico());
    }
    
    
public void crearSoldado4(Celda pos) {
    	
    	Soldado p4= new S4(pos);
    	mapaCombate.agregarObstaculo(pos, p4);
    	panelMapa.add(p4.getGrafico());
    }
    
public void crearSoldado5(Celda pos) {
	
	Soldado p5= new S5(pos);
	mapaCombate.agregarObstaculo(pos, p5);
	panelMapa.add(p5.getGrafico());
}

	
}
