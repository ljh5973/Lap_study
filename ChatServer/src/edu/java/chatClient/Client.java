package edu.java.chatClient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

public class Client extends JFrame {

	private JFrame frame;
	private JTextField ip_tf;
	private JTextField port_tf;
	private JTextField id_tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		setMinimumSize(new Dimension(300, 400));

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Server IP");
		lblNewLabel.setBounds(24, 172, 83, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblServerPort = new JLabel("Server Port");
		lblServerPort.setBounds(24, 220, 83, 15);
		getContentPane().add(lblServerPort);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(24, 269, 83, 15);
		getContentPane().add(lblId);

		ip_tf = new JTextField();
		ip_tf.setBounds(128, 169, 116, 21);
		getContentPane().add(ip_tf);
		ip_tf.setColumns(10);

		port_tf = new JTextField();
		port_tf.setColumns(10);
		port_tf.setBounds(128, 217, 116, 21);
		getContentPane().add(port_tf);

		id_tf = new JTextField();
		id_tf.setColumns(10);
		id_tf.setBounds(128, 266, 116, 21);
		getContentPane().add(id_tf);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(24, 314, 220, 23);
		getContentPane().add(btnNewButton);
		
		this.setVisible(true);
	}

}
