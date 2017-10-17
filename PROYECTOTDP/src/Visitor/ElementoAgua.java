package Visitor;

public class ElementoAgua implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		// TODO Auto-generated method stub
		return v.puedePasar(this);
	}
	

}
