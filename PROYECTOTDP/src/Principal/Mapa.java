package Principal;

import Objetos.Obstaculo;

public class Mapa {
	private Celda mapa[][];
	private int columna, fila;

	public Mapa(int c, int f){
		this.columna = c;
		this.fila = f;
		
		this.mapa = new Celda[fila][columna];
		
		for(int i = 0; i < fila; i++){
			for(int j = 0; j < columna; j++){
				this.mapa[i][j] = new Celda( i, j);
			}
		}
	}
	
	public Celda getCelda(int x, int y){
		if((x < this.fila) && (x >= 0) && (y < this.columna) && (y >= 0))
			return this.mapa[x][y];
		return null;
	}
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public int getColumna() {
		return columna;
	}

	public int getFila() {
		return fila;
	}
	
	public void agregarObstaculo ( Celda pos, Obstaculo o){
		mapa[pos.getFila()][pos.getColumna()].setElemento(o);
	}
}
