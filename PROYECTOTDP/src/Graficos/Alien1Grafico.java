package Graficos;

import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Alien1Grafico extends PersonajeGrafico{

	public Alien1Grafico(int fila, int columna) {
			super(fila, columna);
			
			//image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Alien/Alien Caminando/0.png"));
			image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Soldado/GIF's/Soldado Disparando.gif"));
	}
	

}
