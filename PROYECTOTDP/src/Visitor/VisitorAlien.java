package Visitor;

import Personajes.Alien;
import Personajes.Personaje;
import Personajes.Soldado;

public class VisitorAlien implements Visitor {

	@Override
<<<<<<< HEAD
	public boolean puedePasar(ElementoAlien a) {
		
=======
	public boolean puedoPasar(ElementoAlien a) {
		// TODO Auto-generated method stub
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
		return false;
	}

	@Override
<<<<<<< HEAD
	public boolean puedePasar(ElementoSoldado a) {
		
=======
	public boolean puedoPasar(ElementoSoldado a) {
		// TODO Auto-generated method stub
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
		return false;
	}

	@Override
<<<<<<< HEAD
	public boolean puedePasar(ElementoAgua a) {
		
=======
	public boolean puedoPasar(ElementoAgua a) {
		// TODO Auto-generated method stub
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
		return false;
	}

	@Override
<<<<<<< HEAD
	public boolean puedePasar(ElementoFuego a) {
		
=======
	public boolean puedoPasar(ElementoFuego a) {
		// TODO Auto-generated method stub
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
		return false;
	}

	@Override
<<<<<<< HEAD
	public boolean puedePasar(ElementoFuente a) {
		
=======
	public boolean puedoPasar(ElementoFuente a) {
		// TODO Auto-generated method stub
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
		return false;
	}

	@Override
<<<<<<< HEAD
	public boolean puedePasar(ElementoPiedra a) {
		
=======
	public boolean puedoPasar(ElementoPiedra a) {
		// TODO Auto-generated method stub
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
		return false;
	}

	@Override
	public boolean puedoAtacar(ElementoSoldado a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoAtacar(ElementoAlien a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int sacameVida(ElementoSoldado a) {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int sacameVida(ElementoAlien a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean puedoAtacar(ElementoFuente a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoAtacar(ElementoPiedra a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int sacameVida(ElementoFuente a) {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int sacameVida(ElementoPiedra a) {
		// TODO Auto-generated method stub
		return 20;
	}

	
	
	

}
