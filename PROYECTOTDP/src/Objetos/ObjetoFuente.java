package Objetos;

import Graficos.ObjetoFuenteGrafico;
import Principal.Celda;
import Visitor.ElementoFuente;

public class ObjetoFuente extends ObjetoVida{

	
	
	public ObjetoFuente(Celda c) {
		super(c);
		grafico = new ObjetoFuenteGrafico(c.getFila(), c.getColumna());
		e = new ElementoFuente();
	}
	
	
	
	

}
