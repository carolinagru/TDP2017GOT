package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.A1;
import Personajes.Personaje;
import Personajes.S1;
import Principal.Celda;
import Principal.Logica;

public class S1factory  implements PersonajesFactoryMethod {

	
	
	public Personaje createPersonaje (Celda c) {
		Personaje p = new S1(c);
	
		
	 return p;	
	}

	
}