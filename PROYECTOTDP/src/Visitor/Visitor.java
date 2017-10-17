package Visitor;

import Personajes.*;

public interface Visitor {
	
	public boolean puedePasar (ElementoAlien a );
	
	public boolean puedePasar (ElementoSoldado a );
	
	public boolean puedePasar (ElementoAgua a );
	
	public boolean puedePasar (ElementoFuego a );
	
	public boolean puedePasar (ElementoFuente a );
	
	public boolean puedePasar (ElementoPiedra a );
	
	

}
