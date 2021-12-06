package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AppMain03 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 221, 62);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 0, 283, 62);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 72, 221, 53);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(233, 72, 283, 53);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		double num1=Double.parseDouble(textField_1.getText());
		double num2=Double.parseDouble(textField_2.getText());
		
		
		JButton btnNewButton = new JButton("+");
		
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())+Double.parseDouble(textField_2.getText())));
						
					} catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			btnNewButton.setBounds(12, 225, 97, 23);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("-");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						
					
					try {
						
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())-Double.parseDouble(textField_2.getText())));
					} catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			btnNewButton_1.setBounds(139, 225, 109, 23);
			frame.getContentPane().add(btnNewButton_1);
			
			JButton btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())*Double.parseDouble(textField_2.getText())));
						
					}  catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			btnX.setBounds(278, 225, 97, 23);
			frame.getContentPane().add(btnX);
			
			JButton btnNewButton_3 = new JButton("/");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())/Double.parseDouble(textField_2.getText())));
						
					}  catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			
			btnNewButton_3.setBounds(407, 225, 97, 23);
			frame.getContentPane().add(btnNewButton_3);
		result = new JTextField();
		result.setBounds(12, 268, 492, 79);
		frame.getContentPane().add(result);
		result.setColumns(10);
	}

}
