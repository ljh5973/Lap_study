package edu.java.sproject.user;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.java.sproject.dto.UserDto;

public class UserInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JPasswordField textPw;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textBirthday;

	/**
	 * Launch the application.
	 */
	public static void showFrame(UserDto dto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInformation frame = new UserInformation(dto);
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
	public UserInformation(UserDto dto) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 422, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Info");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(128, 10, 150, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Id");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 81, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 116, 100, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("User Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(12, 151, 100, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(12, 186, 100, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(12, 221, 100, 25);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("PhoneNum");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(12, 256, 100, 25);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Birthday");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setBounds(12, 291, 100, 25);
		contentPane.add(lblNewLabel_1_5_1);
		
		textId = new JTextField();
		textId.setText(dto.getUserId());
		textId.setBounds(124, 83, 200, 21);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textPw = new JPasswordField();
		textPw.setBounds(124, 118, 200, 21);
		contentPane.add(textPw);
		
		textName = new JTextField();
		textName.setText(dto.getUserName());
		textName.setColumns(10);
		textName.setBounds(124, 153, 200, 21);
		contentPane.add(textName);
		
		textEmail = new JTextField();
		textEmail.setText(dto.getEmail());
		textEmail.setColumns(10);
		textEmail.setBounds(124, 188, 200, 21);
		contentPane.add(textEmail);
		
		textAddress = new JTextField();
		textAddress.setText(dto.getAddress());
		textAddress.setColumns(10);
		textAddress.setBounds(124, 223, 200, 21);
		contentPane.add(textAddress);
		
		textPhone = new JTextField();
		textPhone.setText(Integer.toString(dto.getPhone()));
		textPhone.setColumns(10);
		textPhone.setBounds(124, 258, 200, 21);
		contentPane.add(textPhone);
		
		textBirthday = new JTextField();
		textBirthday.setColumns(10);
		textBirthday.setBounds(124, 293, 200, 21);
		contentPane.add(textBirthday);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(111, 324, 100, 50);
		contentPane.add(btnCancel);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(236, 324, 100, 50);
		contentPane.add(btnModify);
	}
}
