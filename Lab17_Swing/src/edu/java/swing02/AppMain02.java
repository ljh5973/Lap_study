package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain02 {

	private JFrame frame;
	private JTextField textInput;
	private JLabel lblOutput;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain02 window = new AppMain02();
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
	public AppMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 655, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	// Absolute layout - UI 콤포넌트들을 원하는 위치에 배치할 수 있는 레이어
		
		lblOutput = new JLabel("Hello, Swing");
		lblOutput.setFont(new Font("굴림", Font.PLAIN, 32));
		lblOutput.setBounds(0, 0, 639, 120);
		frame.getContentPane().add(lblOutput);
		
		textInput = new JTextField();
		textInput.setText("한글도 되네?");
		textInput.setBounds(0, 125, 639, 111);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 할 일을 작성
				// JTextField textInput에서 입력된 문자열을 읽고, JLabel lblOuput에 그 문자열을 씀.
				lblOutput.setText(textInput.getText());
			}
		});
		btnNewButton.setBounds(0, 246, 639, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
