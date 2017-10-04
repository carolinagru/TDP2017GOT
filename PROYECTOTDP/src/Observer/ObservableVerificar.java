package Observer;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

import Principal.Celda;

public class ObservableVerificar extends Observable{
	private static LinkedList<Observer> observados = new LinkedList<Observer>();
		public void attach(Observer observador) {
			observados.add(observador);
	 }

		 
		public void dettach(Observer observador) {
			observados.add(observador);
		}


		public void notifyObservers(Celda c) {
			for (Observer o : observados)
				o.update(this, c);
		}
		
}
			 
 		