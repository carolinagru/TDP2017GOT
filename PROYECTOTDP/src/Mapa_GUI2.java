import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class Mapa_GUI2 extends JFrame {
	
	private Logica logica;
	private JPanel contentPane;
	private JTextField txtComprar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa_GUI2 frame = new Mapa_GUI2();
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 674, 92);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Ametralladora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 30, 108, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("Ametralladora");
		button.setBounds(137, 30, 108, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Ametralladora");
		button_1.setBounds(266, 30, 108, 23);
		panel.add(button_1);
		
		txtComprar = new JTextField();
		txtComprar.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtComprar.setEnabled(false);
		txtComprar.setEditable(false);
		txtComprar.setText("Compras ");
		txtComprar.setBounds(0, 0, 86, 20);
		panel.add(txtComprar);
		txtComprar.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 103, 91, 557);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(111, 582, 573, 67);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(111, 106, 573, 446);
		contentPane.add(panel_3);
		
		logica= new Logica(panel_3);
		
		JButton btnS = new JButton("S1");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logica.crearPolicia1(3,3);
				
			}
		});
		btnS.setBounds(10, 22, 59, 23);
		panel_2.add(btnS);
		
		JButton btnS_1 = new JButton("S2");
		btnS_1.setBounds(79, 22, 59, 23);
		panel_2.add(btnS_1);
		
		JButton btnS_2 = new JButton("S3");
		btnS_2.setBounds(144, 22, 59, 23);
		panel_2.add(btnS_2);
		
		JButton btnS_3 = new JButton("S4");
		btnS_3.setBounds(223, 22, 59, 23);
		panel_2.add(btnS_3);
		
		JButton btnS_4 = new JButton("S5");
		btnS_4.setBounds(286, 22, 59, 23);
		panel_2.add(btnS_4);
		
		
		
		
		//Interaccion con logica
		
		//panel_3.setLayout(new GridLayout(0, 1, 5, 0));
	}
}
