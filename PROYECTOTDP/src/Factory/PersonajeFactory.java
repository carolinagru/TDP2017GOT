package Factory;

import Personajes.Personaje;
import Personajes.S1;
import Personajes.S2;
import Personajes.S3;
import Personajes.S4;
import Personajes.S5;
import Principal.Celda;

<<<<<<< HEAD

 
public class PersonajeFactory implements PersonajesFactoryMethod{
	public Personaje createPersonaje ( Celda c,String s){
=======
 
public class PersonajeFactory implements PersonajesFactoryMethod{
	public Personaje createPersonaje ( Celda c,String s){
 
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
	 Personaje nuevo = null;
	 System.out.println("ENTRE");
		switch (s){
<<<<<<< HEAD
=======
			
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
			case "Soldado1":  nuevo = new S1(c); break;
			case "Soldado2":  nuevo = new S2(c); break;
			case "Soldado3":  nuevo = new S3(c); break;
			case "Soldado4":  nuevo = new S4(c); break;
			case "Soldado5":  nuevo = new S5(c); break;	
<<<<<<< HEAD
=======
			
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
		}
	 System.out.println( nuevo == null);
	  return nuevo;
<<<<<<< HEAD

=======
 
 
  
>>>>>>> 3ff2d6a21a4ad9b2f09b2074b91828b64fd570f6
	}
}

