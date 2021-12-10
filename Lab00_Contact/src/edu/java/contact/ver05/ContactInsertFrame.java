package edu.java.contact.ver05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactInsertFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private Component parentComponent;	// 부모 컴포넌트 참조값을 저장하기 위한 변수
	private ContactMain05 mainApp;
	/**
	 * Launch the application.
	 */
	public static void showFrame(Component parentComponent, ContactMain05 mainApp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInsertFrame frame = new ContactInsertFrame(parentComponent, mainApp);
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
	
	public ContactInsertFrame(Component parentComponent, ContactMain05 mainApp) {
		this.parentComponent=parentComponent;
		this.mainApp=mainApp;
		initialize();
		
		
	}
	public void initialize() {
		
		int x =parentComponent.getX();
		int y= parentComponent.getY();
		setTitle("새 연락처 추가");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(x, y, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setFont(new Font("굴림", Font.PLAIN, 20));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(12, 10, 99, 38);
		contentPane.add(labelName);
		
		textName = new JTextField();
		textName.setFont(new Font("굴림", Font.PLAIN, 20));
		textName.setBounds(161, 16, 261, 32);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setHorizontalAlignment(SwingConstants.CENTER);
		labelPhone.setFont(new Font("굴림", Font.PLAIN, 20));
		labelPhone.setBounds(12, 58, 99, 38);
		contentPane.add(labelPhone);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("굴림", Font.PLAIN, 20));
		textPhone.setColumns(10);
		textPhone.setBounds(161, 64, 261, 32);
		contentPane.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("굴림", Font.PLAIN, 20));
		textEmail.setColumns(10);
		textEmail.setBounds(161, 112, 261, 32);
		contentPane.add(textEmail);
		
		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("굴림", Font.PLAIN, 20));
		labelEmail.setBounds(12, 106, 99, 38);
		contentPane.add(labelEmail);
		
		JButton btnInsert = new JButton("추가");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();
			}
		});
		btnInsert.setBounds(12, 178, 105, 62);
		contentPane.add(btnInsert);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(161, 178, 105, 62);
		contentPane.add(btnCancel);
	}

	private void insertContact() {
		// JTextField에서 이름, 전화번호, 이메일을 읽고,
		
		String name=textName.getText();
		String phone = textPhone.getText();
		String email=textEmail.getText();
		// 추가할 연락처 정보를 ContactMain class의 메서드를 호출하면서 argument로 전달하겠다.
		
		Contact c= new Contact(name,phone, email);
		
		// 창닫기
		dispose();
		
		mainApp.insertContact(c);
		
		
	}
}
