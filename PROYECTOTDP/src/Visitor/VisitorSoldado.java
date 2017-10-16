package Visitor;

import Personajes.Alien;
import Personajes.Personaje;
import Personajes.Soldado;

public class VisitorSoldado extends Visitor {
	protected Personaje miPersonaje;
	public VisitorSoldado (Personaje s){
		 super();
		 miPersonaje =  s;
	}
	public void visitAlien(Alien p) {
		float vida = p.getVida();
		System.out.println("Fuerza soldado "+miPersonaje.getFuerza());
		p.setVida(miPersonaje.fuerza*vida);
	 
		//miPersonaje.Atacar(p);
		
	}

	 
	public void visitSoldado(Soldado s) {
	 	
	}
	

}
