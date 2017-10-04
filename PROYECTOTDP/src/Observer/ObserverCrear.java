package Observer;

import javax.swing.JPanel;

import Factory.PersonajeFactory;
import Factory.PersonajesFactoryMethod;
import Personajes.Personaje;
import Principal.Celda;
import Principal.Logica;

public class ObserverCrear extends Logica implements Observer{
	
	public ObserverCrear(JPanel panel) {
		super(panel);
	}

	public void update(Celda c, String s) {
		PersonajesFactoryMethod factory = new PersonajeFactory();
		Personaje  p = factory.createPersonaje(c, s);
		panelMapa.add(p.getGrafico());	
	}
 
}
