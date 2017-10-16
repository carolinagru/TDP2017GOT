package Objetos;

import Graficos.ObjetoFuegoGrafico;
import Principal.Celda;

public class ObjetoFuego extends Objeto{

	public ObjetoFuego(Celda c) {
		super(c);
		grafico = new ObjetoFuegoGrafico(c.getFila(), c.getColumna());
	}
}
