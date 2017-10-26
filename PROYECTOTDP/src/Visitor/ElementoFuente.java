package Visitor;

public class ElementoFuente implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
<<<<<<< HEAD
		
		return v.puedePasar(this);
=======
		// TODO Auto-generated method stub
		return v.puedoPasar(this);
	}
	
	public boolean dejoAtacar(Visitor v) {
		return v.puedoAtacar(this);
	}

	@Override
	public int sacarVida(Visitor v) {
		// TODO Auto-generated method stub
		return v.sacameVida(this);
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	}

	
}
