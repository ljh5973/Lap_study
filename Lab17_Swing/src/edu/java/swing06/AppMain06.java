package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class AppMain06 {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextArea resultText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setBounds(25, 32, 57, 15);
		frame.getContentPane().add(labelName);
		labelName.setOpaque(true); 
		labelName.setBackground(SystemColor.activeCaption);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setBackground(SystemColor.activeCaption);
		labelPhone.setOpaque(true);
		labelPhone.setBounds(25, 67, 57, 15);
		frame.getContentPane().add(labelPhone);
		
		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setBackground(SystemColor.activeCaption);
		labelEmail.setOpaque(true);
		labelEmail.setBounds(25, 105, 57, 15);
		frame.getContentPane().add(labelEmail);
		
		textName = new JTextField();
		textName.setBounds(212, 29, 116, 21);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(212, 64, 116, 21);
		frame.getContentPane().add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(212, 95, 116, 21);
		frame.getContentPane().add(textEmail);
		
		JButton btn = new JButton("입력");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showInfo();
				clearAllTextField();

			}
		});
		btn.setBounds(25, 152, 97, 23);
		frame.getContentPane().add(btn);
		
		resultText = new JTextArea();
		resultText.setBounds(25, 177, 397, 74);
		frame.getContentPane().add(resultText);
	}
	
	private void showInfo() {
		// 3개의 JTextField에 이름, 전화번호, 이메일을 읽음.
		
		String name= textName.getText();
		String phone =textPhone.getText();
		String email= textEmail.getText();
		
		StringBuffer result = new StringBuffer();	//StringBuffer 객체 생성
		
		result.append("이름 : ").append(name).append("\n전화번호 : ").append(phone).append("\n이메일 : ").append(email);
		
		resultText.setText(result.toString());
//		String result="";
//		
//		result+="이름 : "+textName.getText()+"\n";
//		result+="전화번호 : "+ textPhone.getText()+"\n";
//		result+="이메일 : " + textEmail.getText();
//		resultText.setText(result);
		

		
		
	}
	
	private void clearAllTextField() {
		textName.setText("");
		textPhone.setText("");
		textEmail.setText("");
		
	}
}
