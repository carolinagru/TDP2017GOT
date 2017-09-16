import Objetos.Obstaculo;

public class Celda {
	
	protected Obstaculo elemento;
	protected int x;
	protected int y;
	
	public Celda(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	public Obstaculo getElemento() {
		return elemento;
	}
	
	public void setElemento(Obstaculo elem) {
		elemento= elem;
	}
	
}
