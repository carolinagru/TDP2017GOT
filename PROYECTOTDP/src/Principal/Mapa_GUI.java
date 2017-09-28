package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mapa_GUI extends JFrame {

	private JPanel contentPane;
	private int anchoPantalla;
	private int altoPantalla; 
	private Logica logica;
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Mapa_GUI() {
		
		
		anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		altoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds((anchoPantalla / 3) - (getWidth() / 2), (altoPantalla / 6) - (getHeight() / 2), 1000, 681);
		
	//	setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 984, 49);
		contentPane.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBounds(0, 48, 67, 594);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		//panel_3.setBounds(65, 48, 172, 646);
		panel_3.setBounds(66, 48, 918, 594);
		
		contentPane.add(panel_3);
		
		logica= new Logica(panel_3);
		//panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
	}
}