package Visitor;

import Personajes.Alien;
import Personajes.Personaje;
import Personajes.Soldado;

public class VisitorSoldado implements Visitor {

	@Override
	public boolean puedePasar(ElementoAlien a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(ElementoSoldado a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(ElementoAgua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(ElementoFuego a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(ElementoFuente a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(ElementoPiedra a) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
