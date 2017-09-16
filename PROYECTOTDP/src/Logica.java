import java.util.LinkedList;

import Objetos.Objeto;
import Personajes.Alien;
import Personajes.Policia;

public class Logica {
	
	private int monedas;
	private int puntos;
	private LinkedList<Alien> aliensMapa;
	private LinkedList<Policia> policiasMapa;
	private LinkedList<Objeto> objetosMapa;
	private Celda[][] matrizMapa;
	
	public Logica(){
		puntos=0;
		aliensMapa=new LinkedList();
		policiasMapa= new LinkedList();
		objetosMapa= new LinkedList();
		matrizMapa= new Celda[10][6];
		
		crearMapa();
		
		
	}
	
	public void crearMapa() {
	 //creamos el mapa con una matriz de celdas	
		for (int i=0; i < matrizMapa.length; i++) {
			for (int j=0; i < matrizMapa[i].length; j++) {
				matrizMapa[i][j]= new Celda();
			}
		}
		
		insertarObjetos();
		
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
	  	
		
		
	}
	
	
}
