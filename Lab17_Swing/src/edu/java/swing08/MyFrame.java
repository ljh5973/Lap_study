package edu.java.swing08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	public MyFrame() {
		
		JLabel lblNewLabel = new JLabel("New label");
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void showMyFrame() {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	
	
	public void initialize() {
		// 기본 닫기 동작 설정 -JFrame인 경우
		// 1) EXIT_ON_CLOSE: 닫기 버튼(x)을 클릭했을 때
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
