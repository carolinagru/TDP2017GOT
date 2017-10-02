/** import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;

public class Mapa_GUI extends JFrame {

	private JPanel contentPane;
	private int anchoPantalla;
	private int altoPantalla; 
	private Logica logica;
	
	 * Launch the application.
	 
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Mapa_GUI frame = new Mapa_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	 * Create the frame.
	 
	public Mapa_GUI() {
		
		
		anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		altoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds((anchoPantalla / 3) - (getWidth() / 2), (altoPantalla / 6) - (getHeight() / 2), 1000, 800);
		
	//	setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(0, 0, 984, 100);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(0, 692, 984, 200);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 48, 100, 646);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(65, 48,200, 300);
		contentPane.add(panel_3);
		 
		logica= new Logica(panel_3);
		//panel_3.setLayout(new GridLayout(5, 5, 10, 10));
		
	}
}
**/
package Principal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.border.TitledBorder;

public class Mapa_GUI2 extends JFrame {
	
	private Logica logica;
	private JPanel contentPane;
	private Image image;
	private JPanel panel_3; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa_GUI2 frame = new Mapa_GUI2();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mapa_GUI2() {
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Compras", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(10, 11, 1324, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Ametralladora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(67, 20, 292, 42);
		panel.add(btnNewButton);
		
		JButton button = new JButton("Ametralladora");
		button.setBounds(507, 20, 292, 42);
		panel.add(button);
		
		JButton button_1 = new JButton("Ametralladora");
		button_1.setBounds(950, 20, 292, 42);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 85, 325, 500);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 584, 1324, 76);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		image = new ImageIcon(getClass().getResource("/Sprites/fondo/cesped.jpg")).getImage();

		panel_3 = new JPanel() {
			
		public void paint(Graphics g){
	        g.drawImage(image, 0, 0, panel_3.getWidth(), panel_3.getHeight(), this);
	        super.paint(g);
	    }
		};
		panel_3.setLayout(null);
		panel_3.setOpaque(false);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(334, 85, 1000, 500);
		contentPane.add(panel_3);
		
		JButton btnS = new JButton("S1");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logica.crearPolicia1(3,3);
				
			}
		});
		

		btnS.setBounds(118, 22, 123, 31);
		panel_2.add(btnS);
		
		JButton btnS_1 = new JButton("S2");
		btnS_1.setBounds(351, 22, 123, 31);
		panel_2.add(btnS_1);
		
		JButton btnS_2 = new JButton("S3");
		btnS_2.setBounds(598, 22, 123, 31);
		panel_2.add(btnS_2);
		
		JButton btnS_3 = new JButton("S4");
		btnS_3.setBounds(834, 22, 123, 31);
		panel_2.add(btnS_3);
		
		JButton btnS_4 = new JButton("S5");
		btnS_4.setBounds(1063, 22, 123, 31);
		panel_2.add(btnS_4);

		

		logica = new Logica(panel_3);
		 
		
		
	}
	
}