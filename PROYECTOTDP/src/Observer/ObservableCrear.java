package Observer;

import java.awt.List;
import java.util.LinkedList;
import java.util.Observable;

import Principal.Celda;

 
 
public class ObservableCrear implements Subject{
<<<<<<< HEAD

=======
 
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
	private static LinkedList<Observer> observados = new LinkedList<Observer>();   

	 
	public void attach(Observer observador) {
		observados.add(observador);
 }

	 
	public void dettach(Observer observador) {
		observados.add(observador);
		 
		
	}

<<<<<<< HEAD
=======
 
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
	public void notifyObservers(Celda c,String s) {
		for (Observer o : observados)
			o.update(c,s);
	}
<<<<<<< HEAD
=======


	 
 
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
}
