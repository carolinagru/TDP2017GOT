package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.A1;
import Personajes.A6;
import Personajes.Personaje;
import Personajes.S1;
import Principal.Celda;
import Principal.Logica;

public class A6factory  implements PersonajesFactoryMethod {
	
	public Personaje createPersonaje (Celda c) {
		Personaje p = new A6(c);
		
		
	 return p;	
	}
}
