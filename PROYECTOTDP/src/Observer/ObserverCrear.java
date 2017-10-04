package Observer;

import javax.swing.JPanel;

import Factory.PersonajeFactory;
import Factory.PersonajesFactoryMethod;
import Personajes.Personaje;
import Principal.Celda;
import Principal.Logica;

public class ObserverCrear extends Logica implements Observer{
<<<<<<< HEAD
	
	public ObserverCrear(JPanel panel) {
		super(panel);
=======
	protected PersonajesFactoryMethod factory;

	public ObserverCrear(JPanel p){
		super(p);
		factory = new PersonajeFactory();
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
	}

	public void update(Celda c, String s) {
		Personaje  p = factory.createPersonaje(c, s);
<<<<<<< HEAD
		panelMapa.add(p.getGrafico());	
=======
		System.out.println(mapaCombate.getCelda(2, 3)==null);
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
	}
 
}
