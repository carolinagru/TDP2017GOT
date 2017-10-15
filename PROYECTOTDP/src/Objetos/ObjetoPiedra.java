package Objetos;

import Graficos.ObjetoPiedraGrafico;
import Principal.Celda;

public class ObjetoPiedra extends Objeto{

	public ObjetoPiedra(Celda c) {
		super(c);
		grafico = new ObjetoPiedraGrafico(c.getFila(), c.getColumna());
		
	}

}
