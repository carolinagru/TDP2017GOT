package Observer;

import java.awt.List;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class ObservableCrear extends Observable{
	private static LinkedList<Observer> observados = new LinkedList<Observer>();   

	 
	public void attach(Observer observador) {
		observados.add(observador);
 }

	 
	public void dettach(Observer observador) {
		observados.add(observador);
		 
		
	}

	public void notifyObservers(String g) {
		for (Observer o : observados){
			o.update(this, g);
		}
		 
		
	} 

}
