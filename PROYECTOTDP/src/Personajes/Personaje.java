package Personajes;


import Principal.Celda;
import Visitor.*;

import java.awt.Point;

import javax.swing.JLabel;

import Graficos.PersonajeGrafico;
import Objetos.Obstaculo;

public abstract class Personaje extends Obstaculo{
	
	protected float vida = 100;
	public float fuerza;
	protected int cantCeldas;
	protected int distanciaAtaque;
	protected Visitor v;

	
	public Personaje ( Celda pos){
		this.pos = pos;
		grafico = null;
		
	}
	
	public  void setVida ( float v){
		vida = v;
	}
	
	public float getVida () {
		return vida;
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
	
	
	
}
