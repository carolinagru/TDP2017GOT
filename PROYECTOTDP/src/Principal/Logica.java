package Principal;


import java.awt.Point;
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
		
	
	
		
	    mapaCombate = new Mapa((panel.getWidth() - 40) / tamanioCelda, (panel.getHeight() - 80 ) / tamanioCelda);
		
	    Celda c = mapaCombate.getCelda(1, 1);
	    
	    Soldado sol = new S1(c);
	     
	    panel.add(sol.getGrafico());
		
		 
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
	/*...
	  LinkedList listaA1= new LinkedList<Alien>();
	  LinkedList listaA2= new LinkedList<Alien>();
	  int fila;
	  Random num= new Random();
	  fila=1+num.nextInt(6);
	  
	  	for(int i=0; i < 10; i++) {
	  		listaA1.addLast(new A1());
	  		listaA2.addLast(new A2());
	  	}
	  	  	
	  	
	  	if (matrizMapa[fila][9].getElemento() != null) {
	  		
	  	
	  	matrizMapa[fila][9].setElemento(listaA1.getFirst());
		mapaPanel.add(matrizMapa[fila][9].getElemento().getGrafico());
		aliensMapa.addLast(listaA1.getFirst());
		listaA1.removeFirst();
	  	}
	  	
	  	moverAlien(aliensMapa.getFirst());
	  	
	  	
		
	  
	  	
	  	
	  	
	  
	  
		...*/
		
	}//--------------------- Ver ----------------------------
	// Ver como posicionar los Soldados en el Panel mapaPanel. kyfuykvbiunonmmnjhbgv
	public void moverAlien(Alien a) {

	
		for (int i=10; i > 0; i++ ) {
			
		}
		
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
