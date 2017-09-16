import java.util.LinkedList;

import javax.swing.JPanel;

import Objetos.Objeto;
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
		mapa = panel;
		
		crearMapa();
		
	}
	
	public void crearMapa() {
	 //creamos el mapa con una matriz de celdas	
		for (int i=0; i < matrizMapa.length; i++) {
			for (int j=0; i < matrizMapa[i].length; j++) {
				matrizMapa[i][j]= new Celda(i,j);
			}
		}
	 
		insertarObjetos();
		crearPolicia1(2,2);
		
		
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
	  	
		
		
	}//--------------------- Ver ----------------------------
	// Ver como posicionar los Policias en el Panel mapaPanel.
	
	public void crearPolicia1(int fila, int columna) {
		
		Policia p1= new P1();
		matrizMapa[fila][columna].setElemento(p1);
		mapa.add(matrizMapa[fila][columna].getElemento().getGrafico());
		
		
	}
    public void crearPolicia2(int fila, int columna) {
    	Policia p2= new P2();
    	matrizMapa[fila][columna].setElemento(p2);
    	mapa.add(matrizMapa[fila][columna].getElemento().getGrafico());
    	
	}
    public void crearPolicia3(int fila, int columna) {
    	
    	Policia p3= new P3();
    	matrizMapa[fila][columna].setElemento(p3);
    	mapa.add(matrizMapa[fila][columna].getElemento().getGrafico());
    }
    public void crearPolicia4(int fila, int columna) {
    	matrizMapa[fila][columna].setElemento(p4);
    	mapa.add(matrizMapa[fila][columna].getElemento().getGrafico());
    	Policia p4= new P4();
    }
    public void crearPolicia5(int fila, int columna) {
    	Policia p5= new P5();
    	matrizMapa[fila][columna].setElemento(p5);
    	mapa.add(matrizMapa[fila][columna].getElemento().getGrafico());
    	
    }
	
	
}
