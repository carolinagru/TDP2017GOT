package Principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Objetos.Objeto;
import Objetos.ObjetoAgua;
import Objetos.ObjetoFuego;
import Objetos.ObjetoFuente;
import Objetos.ObjetoPiedra;
import Objetos.Obstaculo;
import Personajes.A1;
import Personajes.Alien;

public class Mapa {
	private Celda mapa[][];
	private int columna, fila;
	protected LinkedList<Obstaculo> objetosMapa;
	protected Obstaculo obs;
	protected JPanel panel;

<<<<<<< HEAD
	public Mapa(int f, int c, JPanel p){
=======
	public Mapa(int c, int f){
>>>>>>> f913a012459ba4cd03804ea9763844a6dae4bb95
		this.columna = c;
		this.fila = f;
		panel = p;
		System.out.println("filas y columnas de mapa "+fila+columna);
		this.mapa = new Celda[fila][columna];
		
		for(int i = 0; i < fila; i++){
			for(int j = 0; j < columna; j++){
				this.mapa[i][j] = new Celda( i, j);
			}
		}
		objetosMapa= new LinkedList();

	}
	
	public Celda getCelda(int x, int y){
		if((x < this.fila) && (x >= 0) && (y < this.columna) && (y >= 0))
			return this.mapa[x][y];
		return null;
	}
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public int getColumna() {
		return columna;
	}

	public int getFila() {
		return fila;
	}
	
	public void insertarObjetos() {
	 try {	
		FileReader f = new FileReader(getClass().getResource("/Archivos/mapa1.txt").getFile());
        BufferedReader b = new BufferedReader(f);
        String cadena = "";
        char d;
        int y = 0;
        
        	while ((cadena = b.readLine()) != null) {
        		int x = 0;
	        	for (int i = 0; i < cadena.length(); i++){
	      		   d = cadena.charAt(i);
	      		   Celda c = getCelda(y,x);
	                if (d == 'f')
	                  obs= new ObjetoFuego(c);
	                	else if (d == 'a')
	                	   obs=new ObjetoAgua(c);
	                	      else if(d == 'u')
	                		       obs= new ObjetoFuente(c);
	                		       else if(d == 'p')
	                				     obs= new ObjetoPiedra(c);
	                			        
	                   
	             if (obs != null){
	            	 objetosMapa.addLast(obs); 
	            	 insertar(obs.getGrafico());
	             }
	             obs=null;
	             x++; 
	          }
	          y++;
	        }
	        
	 b.close();
 }
   catch (IOException e) {
	 System.out.println("Error en objeto - leerArchivo. ");
   }	 
    
        
	}
	
	public void insertar(JLabel l) {
		panel.add(l);
		panel.repaint();
	}
	
	public Alien insertarEnemigo() {
		Random r = new Random();
		int x = (int ) (Math.random() * 10);
		System.out.println("fila : "+ x);
		Celda c = getCelda(x,22);
		Alien a = new A1(c);
		insertar(a.getGrafico());
	  return a;
	}
}

