import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Mapa extends JFrame {

	private JPanel contentPane;
	private int anchoPantalla;
	private int altoPantalla;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Mapa frame = new Mapa();
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
	public Mapa() {
		
		
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
		panel.setBounds(0, 0, 984, 49);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(0, 692, 984, 49);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 48, 67, 646);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(65, 48, 919, 646);
		contentPane.add(panel_3);
	}
}
