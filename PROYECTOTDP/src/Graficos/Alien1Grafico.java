package Graficos;

import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Alien1Grafico extends PersonajeGrafico{

	public Alien1Grafico(int fila, int columna) {
			super(fila, columna);
<<<<<<< HEAD
			
			//image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Alien/Alien Caminando/0.png"));
			image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Soldado/GIF's/Soldado Disparando.gif"));
=======
			System.out.println("Entre alien grafico Fila :"+fila + " Columna :"+columna);
			//image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Alien/Alien Caminando/0.png"));
			image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Alien/GIF 's/A2.gif"));
>>>>>>> 70f8a96bba14d2261f7f059e4df897051d21e778
	}

}
