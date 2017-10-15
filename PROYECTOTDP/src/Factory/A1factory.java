package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.A1;
import Personajes.Personaje;
import Personajes.S1;
import Principal.Celda;
import Principal.Logica;

public class A1factory implements PersonajesFactoryMethod {
	protected JPanel panel;
	
	public A1factory(JPanel p) {
		panel= p;
	}
	public Personaje createPersonaje (Celda c) {
		Personaje p = new A1(c);
		
		
	 return p;	
	}

}
