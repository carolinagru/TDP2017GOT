package Visitor;

public class ElementoAgua implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	

}
