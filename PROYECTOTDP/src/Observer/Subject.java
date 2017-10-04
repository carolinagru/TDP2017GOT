package Observer;

import Principal.Celda;

public interface Subject {
	public void attach (Observer observador);
	public void dettach(Observer observador);
	public void notifyObservers(Celda c, String s);

}
