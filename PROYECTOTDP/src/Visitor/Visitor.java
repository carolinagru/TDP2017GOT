package Visitor;

import Personajes.*;

public abstract class Visitor {
	public abstract void visitAlien (Alien a );
	
	public abstract void visitSoldado ( Soldado s);

}
