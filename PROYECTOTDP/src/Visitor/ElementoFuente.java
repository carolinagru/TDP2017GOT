package Visitor;

public class ElementoFuente implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		
		return v.puedePasar(this);
	}

	
}
