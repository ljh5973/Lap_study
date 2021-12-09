package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class AppMain07 {

	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(12, 10, 103, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(12, 57, 103, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		idField = new JTextField();
		idField.setBounds(128, 17, 211, 21);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 64, 212, 21);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInfo();
				
			}
		});
		btnNewButton.setBounds(18, 113, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 166, 327, 65);
		frame.getContentPane().add(textArea);
	}
	
	private void showInfo() {
		String id=idField.getText();
		char[] pw=passwordField.getPassword();
		
		StringBuffer result= new StringBuffer();
		
		result.append("아이디 : ").append(id).append("\n비밀번호 : ").append(pw);
		
		textArea.setText(result.toString());
		
	}
}
