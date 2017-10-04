package Observer;

import Factory.PersonajeFactory;
import Factory.PersonajesFactoryMethod;
import Personajes.Personaje;
import Principal.Celda;

public class ObserverCrear implements Observer{
	public void update(Celda c, String s) {
		PersonajesFactoryMethod factory = new PersonajeFactory();
		Personaje  p = factory.createPersonaje(c, s);
		
		
		
		
		
	}
 
}
