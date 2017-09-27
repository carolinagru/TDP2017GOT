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
import Personajes.P1;
import Personajes.P2;
import Personajes.P3;
import Personajes.P4;
import Personajes.P5;
import Personajes.Policia;

public class Logica {
	
	protected int monedas;
	protected int puntos;
	protected LinkedList<Alien> aliensMapa;
	protected LinkedList<Policia> policiasMapa;
	protected LinkedList<Objeto> objetosMapa;
	protected JPanel panelMapa;
	protected Mapa mapaCombate;
	private int tamanioCelda = 32;
	
	
	public Logica(JPanel panel){
		
		puntos=0;
		aliensMapa=new LinkedList();
		policiasMapa= new LinkedList();
		objetosMapa= new LinkedList();
		
	
	
		
	    mapaCombate = new Mapa((panel.getWidth() - 32) / tamanioCelda, (panel.getHeight() - 64 ) / tamanioCelda);
		
		
		 
	}
	
	 
	 
	public void insertarObjetos() {
		//insertamos los objetos del mapa
		activarMenu();
	}
	
	public void activarMenu() {
		//activamos el menu para comprar policias y objetos
		
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
	// Ver como posicionar los Policias en el Panel mapaPanel. kyfuykvbiunonmmnjhbgv
	public void moverAlien(Alien a) {

	
		for (int i=10; i > 0; i++ ) {
			
		}
		
	}

	

public void crearPolicia1(Celda pos) {
    	
    	Policia p1= new P1(pos);
    	mapaCombate.agregarObstaculo(pos, p1);
    	panelMapa.add(p1.getGrafico());
    }
    
	
public void crearPolicia2(Celda pos) {
    	
    	Policia p2= new P2(pos);
    	mapaCombate.agregarObstaculo(pos, p2);
    	panelMapa.add(p2.getGrafico());
    }
    
public void crearPolicia3(Celda pos) {
    	
    	Policia p3= new P3(pos);
    	mapaCombate.agregarObstaculo(pos, p3);
    	panelMapa.add(p3.getGrafico());
    }
    
    
public void crearPolicia4(Celda pos) {
    	
    	Policia p4= new P4(pos);
    	mapaCombate.agregarObstaculo(pos, p4);
    	panelMapa.add(p4.getGrafico());
    }
    
public void crearPolicia5(Celda pos) {
	
	Policia p5= new P5(pos);
	mapaCombate.agregarObstaculo(pos, p5);
	panelMapa.add(p5.getGrafico());
}

	
}
