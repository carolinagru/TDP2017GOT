package Personajes;


import Principal.Celda;
import Visitor.*;

import javax.swing.JLabel;

import Graficos.PersonajeGrafico;
import Objetos.Obstaculo;

public abstract class Personaje extends Obstaculo{
	
	protected float vida = 100;
	public float fuerza;
	protected int cantCeldas;
	protected int distanciaAtaque;
	
	
	public Personaje ( Celda pos){
		this.pos = pos;
		grafico = null;
		
	}
	public  abstract void Atacar ( Personaje p); 
		 
	 
	
	public abstract void Acept ( Visitor v);
	
	public  void setVida ( float v){
		vida = v;
	}
	
	public float getVida () {
		return vida;
	}
	
	public float getFuerza (){
		return fuerza;
	}
}
