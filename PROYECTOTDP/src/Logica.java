
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
	protected Celda[][] matrizMapa;
	protected JPanel mapaPanel;
	
	
	public Logica(JPanel panel){
		
		puntos=0;
		aliensMapa=new LinkedList();
		policiasMapa= new LinkedList();
		objetosMapa= new LinkedList();
		matrizMapa= new Celda[6][10];
		mapaPanel = panel;
		
		crearMapa();
		
	}
	
	public void crearMapa() {
	 //creamos el mapa con una matriz de celdas	
		for (int i=0; i < matrizMapa.length; i++) {
			for (int j=0; j < matrizMapa[i].length; j++) {
				matrizMapa[i][j]= new Celda(i,j);
			}
		}
	 
		insertarObjetos();
		crearPolicia1(2,2);
		crearPolicia2(1,1);
		crearPolicia3(0,0);
		crearPolicia4(3,0);
		crearPolicia5(4,0);
		
		
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
	// Ver como posicionar los Policias en el Panel mapaPanel.
	public void moverAlien(Alien a) {

	
		for (int i=10; i > 0; i++ ) {
			
		}
		
	}

	

	public void crearPolicia1(int fila, int columna) {
		
		Policia p1= new P1(fila,columna);
		matrizMapa[fila][columna].setElemento(p1);
		mapaPanel.add(matrizMapa[fila][columna].getElemento().getGrafico());
		
		
	}
    public void crearPolicia2(int fila, int columna) {
    	Policia p2= new P2(fila, columna);
    	matrizMapa[fila][columna].setElemento(p2);
    	mapaPanel.add(matrizMapa[fila][columna].getElemento().getGrafico());
    	
	}
    public void crearPolicia3(int fila, int columna) {
    	
    	Policia p3= new P3(fila,columna);
    	matrizMapa[fila][columna].setElemento(p3);
    	mapaPanel.add(matrizMapa[fila][columna].getElemento().getGrafico());
    }
    public void crearPolicia4(int fila, int columna) {
    	
    	Policia p4= new P4(fila,columna);
    	matrizMapa[fila][columna].setElemento(p4);
    	mapaPanel.add(matrizMapa[fila][columna].getElemento().getGrafico());
    	
    }
    public void crearPolicia5(int fila, int columna) {
    	
    	Policia p5= new P5(fila,columna);
    	matrizMapa[fila][columna].setElemento(p5);
    	mapaPanel.add(matrizMapa[fila][columna].getElemento().getGrafico());
    	
    }
	
	
}

