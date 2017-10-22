package Visitor;

public interface Elemento {

	public boolean dejoPasar(Visitor v);
	
	public boolean dejoAtacar(Visitor v);
	
	public int sacarVida(Visitor v);
}
