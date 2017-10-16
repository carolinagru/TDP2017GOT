package Visitor;

import Personajes.Alien;
import Personajes.Personaje;
import Personajes.Soldado;

public class VisitorAlien extends Visitor {
	protected Personaje miPersonaje;
	
	public VisitorAlien (Personaje a){
		miPersonaje = a;
	}
	public void visitAlien(Alien a) {
		
		 
	}

	
	public void visitSoldado(Soldado s) {
		float vida = s.getVida();
		s.setVida(miPersonaje.fuerza*vida);
		 miPersonaje.Atacar(s);
		
	}
	

}
