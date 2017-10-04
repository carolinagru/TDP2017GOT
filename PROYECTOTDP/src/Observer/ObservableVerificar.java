package Observer;

import java.util.LinkedList;

public class ObservableVerificar implements Subject{
	private static LinkedList<Observer> observados = new LinkedList<Observer>();
		public void attach(Observer observador) {
			observados.add(observador);
	 }

		 
		public void dettach(Observer observador) {
			observados.add(observador);
		}


		public void notifyObservers() {
			for (Observer o : observados)
				o.update();
		}
		
}
			 
 		