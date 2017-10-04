package Factory;

import Personajes.Personaje;
import Personajes.S1;
import Personajes.S2;
import Personajes.S3;
import Personajes.S4;
import Personajes.S5;
import Principal.Celda;

<<<<<<< HEAD
/**NOOOOOOOOOOOOOOOOOOOOO
public class PersonajeFactory implements PersonajeFactoryMethod{
	public Personaje createPersonaje (String s){
		if ( s.equals("Soldado1"))
			return new S1 ()
	}
	
	public Personaje createPersonaje (String s){
		if ( s.equals("Soldado2"))
			return new S2 ()
	}
	
	public Personaje createPersonaje (String s){
		if ( s.equals("Soldado3"))
			return new S3 ()
	}
	
	public Personaje createPersonaje (String s){
		if ( s.equals("Soldado4"))
			return new S4 ()
	}
	
	public Personaje createPersonaje (String s){
		if ( s.equals("Soldado5"))
			return new S5 ()
	}
	
	public Personaje createPersonae (String s){
		if ( s.equals("Alien1"))
			return new A1;
	}
	
	public Personaje createPersonae (String s){
		if ( s.equals("Alien2"))
			return new A2;
	}
	
	public Personaje createPersonae (String s){
		if ( s.equals("Alien3"))
			return new A3;
	}
	
	public Personaje createPersonae (String s){
		if ( s.equals("Alien4"))
			return new A4;
	}
	
	public Personaje createPersonae (String s){
		if ( s.equals("Alien1"))
			return new A4;
	}
	
	public Personaje createPersonae (String s){
		if ( s.equals("Alien1"))
			return new A1;
=======

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
>>>>>>> ba9c7c326c85d6f0f80905de6867814b183b9d0d
	}
}

