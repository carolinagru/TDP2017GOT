package Observer;

import javax.swing.JPanel;

import Factory.PersonajeFactory;
import Factory.PersonajesFactoryMethod;
import Personajes.Personaje;
import Principal.Celda;
import Principal.Logica;

public class ObserverCrear extends Logica implements Observer{
	protected PersonajesFactoryMethod factory;

	public ObserverCrear(JPanel p){
		super(p);
		factory = new PersonajeFactory();
	}

	public void update(Celda c, String s) {
		Personaje  p = factory.createPersonaje(c, s);
		System.out.println(mapaCombate.getCelda(2, 3)==null);
	}
 
}
