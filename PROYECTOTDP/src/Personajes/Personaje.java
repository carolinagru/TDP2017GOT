package Personajes;


import Principal.Celda;
import javax.swing.JLabel;

import Graficos.PersonajeGrafico;
import Objetos.Obstaculo;

public class Personaje extends Obstaculo{
	
	protected int vida;
	protected int fuerza;
	protected int cantCeldas;
	protected int distanciaAtaque;
	
	
	public Personaje ( Celda pos){
		this.pos = pos;
		grafico = null;
		
	}
	
	
	

}
