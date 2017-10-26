package Personajes;


import Principal.Celda;
import Visitor.*;

import java.awt.Point;

import javax.swing.JLabel;

import Graficos.PersonajeGrafico;
import Objetos.Obstaculo;

public abstract class Personaje extends Obstaculo{
	
	public float fuerza;
	protected int cantCeldas;
	protected int distanciaAtaque;
	protected Visitor v;

	
	public Personaje ( Celda pos){
		this.pos = pos;
		grafico = null;
		
	}
	
	public float getFuerza (){
		return fuerza;
	}
	public Visitor getVisitor() {
		return v;
	}
	public Elemento getElemento() {
		return e;
	}
	
	
<<<<<<< HEAD
	
=======
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
}
