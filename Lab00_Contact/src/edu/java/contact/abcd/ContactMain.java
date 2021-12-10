package edu.java.contact.abcd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContactMain {
	
	private static final String[] COLUMN_NAMSE= {"순서","이름"};

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	
	private DefaultTableModel tableModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain window = new ContactMain();
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
	public ContactMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel topLabel = new JLabel("연락처");
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setFont(new Font("굴림", Font.BOLD, 30));
		topLabel.setBounds(12, 10, 549, 102);
		frame.getContentPane().add(topLabel);
		
		lblNewLabel = new JLabel("전화번호가 저장된 연락처 x개");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(153, 122, 265, 15);
		frame.getContentPane().add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 198, 549, 268);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		tableModel= new DefaultTableModel(null, COLUMN_NAMSE);
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uC21C\uC11C", "\uC774\uB984"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("추가");
		btnNewButton.setBounds(321, 150, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("검색");
		btnNewButton_1.setBounds(430, 150, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
