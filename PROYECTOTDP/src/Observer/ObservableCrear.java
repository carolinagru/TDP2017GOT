package Observer;

import java.awt.List;
import java.util.LinkedList;
import java.util.Observable;

import Principal.Celda;

 
 
public class ObservableCrear implements Subject{

	private static LinkedList<Observer> observados = new LinkedList<Observer>();   

	 
	public void attach(Observer observador) {
		observados.add(observador);
 }

	 
	public void dettach(Observer observador) {
		observados.add(observador);
		 
		
	}

	public void notifyObservers(Celda c,String s) {
		for (Observer o : observados)
			o.update(c,s);
	}

}
