package Principal;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
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
		
		// P A N E L E S --------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Compras", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(10, 11, 1324, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
	        setOpaque(false);
	        super.paint(g);
	    }
		};
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(334, 85, 1000, 500);
		contentPane.add(panel_3);
		
		logica = new Logica(panel_3);

		panel_3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x=e.getX() ;
				int y=e.getY() ;
				int filas = (y - 40) / 40;
				int columnas = (x - 80 ) / 40;
				
					logica.presionoPanel(filas,columnas);
			}
		}); 
		
		// B O T O N E S     O B J E T O S--------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton botonObjeto1 = new JButton("Ametralladora");
		botonObjeto1.setBounds(67, 20, 292, 42);
		panel.add(botonObjeto1);
		botonObjeto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("o1");
			}
		});

		
		JButton botonObjeto2 = new JButton("Ametralladora");
		botonObjeto2.setBounds(507, 20, 292, 42);
		panel.add(botonObjeto2);
		botonObjeto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("o2");
			}
		});
		
		JButton botonObjeto3 = new JButton("Ametralladora");
		botonObjeto3.setBounds(950, 20, 292, 42);
		panel.add(botonObjeto3);
		botonObjeto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("o3");				
			}
		});
		
		// B O T O N E S    S O L D A D O S--------------------------------------------------------------------------------------------------------------------------------------------------------------

		JButton botonSoldado1 = new JButton("S1");
		botonSoldado1.setBounds(118, 22, 123, 31);
		panel_2.add(botonSoldado1);
		botonSoldado1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				logica.presionoBoton("Soldado1");	
				botonSoldado1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						logica.presionoBotonBorrar();	
							
					}
				
				});
				
			}
		
		});
		
		
		JButton botonSoldado2 = new JButton("S2");
		botonSoldado2.setBounds(351, 22, 123, 31);
		panel_2.add(botonSoldado2);
		botonSoldado2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("Soldado2");		
			}
		});
		
		JButton botonSoldado3 = new JButton("S3");
		botonSoldado3.setBounds(598, 22, 123, 31);
		panel_2.add(botonSoldado3);
		botonSoldado3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("Soldado3");
			}
		});
		
		JButton botonSoldado4 = new JButton("S4");
		botonSoldado4.setBounds(834, 22, 123, 31);
		panel_2.add(botonSoldado4);
		botonSoldado4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("Soldado4");
			}
		});
		
		JButton botonSoldado5 = new JButton("S5");
		botonSoldado5.setBounds(1063, 22, 123, 31);
		panel_2.add(botonSoldado5);
		botonSoldado5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logica.presionoBoton("Soldado5");
			}
		});
		

		 
		
		
	}
	
}