package Visitor;

import Personajes.Alien;
import Personajes.Personaje;
import Personajes.Soldado;

public class VisitorAlien implements Visitor {

	@Override
	public boolean puedePasar(ElementoAlien a) {
		
		return false;
	}

	@Override
	public boolean puedePasar(ElementoSoldado a) {
		
		return false;
	}

	@Override
	public boolean puedePasar(ElementoAgua a) {
		
		return false;
	}

	@Override
	public boolean puedePasar(ElementoFuego a) {
		
		return false;
	}

	@Override
	public boolean puedePasar(ElementoFuente a) {
		
		return false;
	}

	@Override
	public boolean puedePasar(ElementoPiedra a) {
		
		return false;
	}
	
	

}
