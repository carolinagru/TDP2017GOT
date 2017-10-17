package Visitor;

public class ElementoFuente implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		// TODO Auto-generated method stub
		return v.puedePasar(this);
	}

	
}
