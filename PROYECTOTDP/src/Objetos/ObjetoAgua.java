package Objetos;

import Graficos.ObjetoAguaGrafico;
import Principal.Celda;
import Visitor.ElementoAgua;

public class ObjetoAgua extends Objeto{

	public ObjetoAgua(Celda c) {
		super(c);
		grafico = new ObjetoAguaGrafico(c.getFila(), c.getColumna());
		e = new ElementoAgua();
		
	}

	
}
