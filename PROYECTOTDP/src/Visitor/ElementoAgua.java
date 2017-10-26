package Visitor;

public class ElementoAgua implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
<<<<<<< HEAD
		return v.puedePasar(this);
=======
		// TODO Auto-generated method stub
		return v.puedoPasar(this);
	}

	@Override
	public boolean dejoAtacar(Visitor v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int sacarVida(Visitor v) {
		// TODO Auto-generated method stub
		return 0;
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	}
	

}
