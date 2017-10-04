package Observer;

import java.awt.List;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

<<<<<<< HEAD:PROYECTOTDP/src/Observer/ObservableCrear.java
public class ObservableCrear extends Observable{
=======
import Principal.Celda;

public class ObservableCrear implements Subject{
>>>>>>> c29e7443aeeabb5b2c4a0f623f5035f0802a84ea:PROYECTOTDP/src/Observer/ObservableCrear.java
	private static LinkedList<Observer> observados = new LinkedList<Observer>();   

	 
	public void attach(Observer observador) {
		observados.add(observador);
 }

	 
	public void dettach(Observer observador) {
		observados.add(observador);
		 
		
	}

<<<<<<< HEAD:PROYECTOTDP/src/Observer/ObservableCrear.java
	public void notifyObservers(String g) {
		for (Observer o : observados){
			o.update(this, g);
		}
		 
		
	} 

=======

	public void notifyObservers(Celda c,String s) {
		for (Observer o : observados)
			o.update(c,s);
	}
>>>>>>> c29e7443aeeabb5b2c4a0f623f5035f0802a84ea:PROYECTOTDP/src/Observer/ObservableCrear.java
}
