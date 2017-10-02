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
	    
	    int filas = (panelMapa.getWidth() - 40) / tamanioCelda;
	    int columnas = (panelMapa.getHeight() - 80 ) / tamanioCelda;
	    System.out.println("Cantidad de filas :"+filas+ "Columnas :"+columnas);
	   
	     mapaCombate = new Mapa((panelMapa.getHeight() - 40 ) / tamanioCelda,(panelMapa.getWidth() - 80) / tamanioCelda);
	    
	    Celda c = mapaCombate.getCelda(0,0);
	    
	    Soldado sol = new S3(c);
	     
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

	


	
}
