package Personajes;

import Premios.Premio;
import Principal.Celda;
import Visitor.*;

public  class Alien extends Personaje {
	
    protected VisitorAlien miVisitor;
	protected int moneda;
    protected int punto;
    protected Premio powerUps;
     
     public Alien(Celda pos) {
 		super(pos);
 		 
 	}

	 
	public void Atacar(Personaje p) {
		
		 float vida = p.getVida ();
		 p.setVida(this.fuerza*vida);
		
	}


	public void Acept(Visitor v) {
		v.visitAlien(this);
	}
     
     

}
