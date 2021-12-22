package edu.java.sproject.user;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import edu.java.sproject.controller.UserDaoImpl;
import edu.java.sproject.dto.UserDto;

public class UserSignUp extends Frame{

	private JFrame frame;
	private JTextField textId;
	private JPasswordField textPw;
	private JPasswordField textPwCheck;
	private JTextField textEmail;
	private JTextField textAddress;
	private JTextField textPhone1;
	private JTextField textBirth;
	private JTextField textName;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void showFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSignUp window = new UserSignUp();
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
	public UserSignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 546);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(122, 10, 130, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbId = new JLabel("ID");
		lbId.setHorizontalAlignment(SwingConstants.CENTER);
		lbId.setBounds(12, 86, 70, 30);
		frame.getContentPane().add(lbId);
		
		JLabel lbPw = new JLabel("PW");
		lbPw.setHorizontalAlignment(SwingConstants.CENTER);
		lbPw.setBounds(12, 126, 70, 30);
		frame.getContentPane().add(lbPw);
		
		JLabel lbPwcheck = new JLabel("PWCHECK");
		lbPwcheck.setHorizontalAlignment(SwingConstants.CENTER);
		lbPwcheck.setBounds(12, 166, 70, 30);
		frame.getContentPane().add(lbPwcheck);
		
		JLabel lbEmail = new JLabel("EMAIL");
		lbEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lbEmail.setBounds(12, 246, 70, 30);
		frame.getContentPane().add(lbEmail);
		
		JLabel lbAddress = new JLabel("ADDRESS");
		lbAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lbAddress.setBounds(12, 286, 70, 30);
		frame.getContentPane().add(lbAddress);
		
		JLabel lbPhone = new JLabel("PHONE");
		lbPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lbPhone.setBounds(12, 326, 70, 30);
		frame.getContentPane().add(lbPhone);
		
		JLabel lbBirth = new JLabel("BIRTH");
		lbBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lbBirth.setBounds(12, 366, 70, 30);
		frame.getContentPane().add(lbBirth);
		
		textId = new JTextField();
		textId.setBounds(94, 91, 116, 21);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uCCB4\uD06C");
		btnNewButton.setBounds(231, 90, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		textPw = new JPasswordField();
		textPw.setBounds(94, 131, 234, 21);
		frame.getContentPane().add(textPw);
		
		textPwCheck = new JPasswordField();
		textPwCheck.setBounds(94, 171, 234, 21);
		frame.getContentPane().add(textPwCheck);
		
		textEmail = new JTextField();
		textEmail.setBounds(94, 251, 234, 21);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(94, 291, 234, 21);
		frame.getContentPane().add(textAddress);
		
		textPhone1 = new JTextField();
		textPhone1.setColumns(10);
		textPhone1.setBounds(94, 331, 234, 21);
		frame.getContentPane().add(textPhone1);
		
		textBirth = new JTextField();
		textBirth.setBounds(94, 371, 234, 21);
		frame.getContentPane().add(textBirth);
		textBirth.setColumns(10);
		
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(12, 436, 130, 44);
		frame.getContentPane().add(btnCancel);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertUserInfo();
				
			}
		});
		btnConfirm.setBounds(198, 436, 130, 44);
		frame.getContentPane().add(btnConfirm);
		
		JLabel lbName = new JLabel("NAME");
		lbName.setHorizontalAlignment(SwingConstants.CENTER);
		lbName.setBounds(12, 206, 70, 30);
		frame.getContentPane().add(lbName);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(94, 211, 234, 21);
		frame.getContentPane().add(textName);
	}

	private void insertUserInfo() {
		UserDaoImpl dao=UserDaoImpl.getInstance();
		UserDto dto =new UserDto();
		dto.setUserId(textId.getText());
		char[] arr=textPw.getPassword();
		String pw="";
		for(char i: arr) {
			pw+=i;
		}
		dto.setUserName(textName.getText());
		dto.setUserPw(pw);
		dto.setPhone(Integer.parseInt(textPhone1.getText()));
		dto.setAddress(textAddress.getText());
		dto.setEmail(textEmail.getText());
		dao.insert(dto);
		
	}
}
