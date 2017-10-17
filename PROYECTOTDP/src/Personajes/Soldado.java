package Personajes;

import Principal.Celda;
import Visitor.Visitor;
import Visitor.VisitorSoldado;

public  class Soldado extends Personaje {
	protected VisitorSoldado miVisitor;
	protected int precio;
	
	
	public Soldado(Celda pos) {
 		super(pos);
 		 
	
 }

	public void Atacar(Personaje p) {
		System.out.println("Entre a atacar SOLDADO");
		 float vida = p.getVida();
		 p.setVida(this.fuerza*vida);
		
	}

	 
	public void Acept(Visitor v) {
		v.visitSoldado(this);
		 
		
	}
}
