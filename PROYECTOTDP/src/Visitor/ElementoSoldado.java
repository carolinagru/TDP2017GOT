package Visitor;

public class ElementoSoldado implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		// TODO Auto-generated method stub
		return v.puedePasar(this);
	}

}
