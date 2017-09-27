package Personajes;

import Premios.Premio;
import Principal.Celda;

public abstract class Alien extends Personaje {
	
    
	protected int moneda;
     protected int punto;
     protected Premio powerUps;
     
     public Alien(Celda pos) {
 		super(pos);
 		 
 	}
     
     

}
