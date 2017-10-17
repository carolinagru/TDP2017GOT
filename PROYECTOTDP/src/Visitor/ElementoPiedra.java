package Visitor;

public class ElementoPiedra implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		// TODO Auto-generated method stub
		return v.puedePasar(this);
	}
	

}
