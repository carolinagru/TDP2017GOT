package Visitor;

public class ElementoAlien implements Elemento{

	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
}
