package Factory;

import Personajes.Personaje;
import Personajes.S1;
import Personajes.S2;
import Personajes.S3;
import Personajes.S4;
import Personajes.S5;
import Principal.Celda;


public class PersonajeFactory implements PersonajesFactoryMethod{
	public Personaje createPersonaje (String s, Celda c){
	 Personaje nuevo = null;
		switch (s){
			case "S1":  nuevo = new S1(c); break;
			case "S2":  nuevo = new S2(c); break;
			case "S3":  nuevo = new S3(c); break;
			case "S4":  nuevo = new S4(c); break;
			case "S5":  nuevo = new S5(c); break;	
		}
	  return nuevo;
	}
}

