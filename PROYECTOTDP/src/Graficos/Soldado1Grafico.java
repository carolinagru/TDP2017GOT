package Graficos;


import javax.swing.ImageIcon;

public class Soldado1Grafico extends PersonajeGrafico{

	public  Soldado1Grafico(int x, int y) {
			super(x, y);
			System.out.println("LLega a grafico");
			image = new ImageIcon(this.getClass().getResource("/Sprites/Sprite Soldado/GIF's/Soldado Disparando.gif"));
		 
	}
	

}
