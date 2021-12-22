package edu.java.sproject.user;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.java.sproject.controller.UserDaoImpl;
import edu.java.sproject.dto.UserDto;

public class UserPwFind extends JFrame {

	private JPanel contentPane;
	private JTextField textFindId;
	private JTextField textFindEmail;
	private JButton btnFind;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void showFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPwFind frame = new UserPwFind();
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
	public UserPwFind() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PWFIND");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(125, 10, 174, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 108, 97, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("EMAIL");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 149, 97, 21);
		contentPane.add(lblNewLabel_1_1);
		
		textFindId = new JTextField();
		textFindId.setBounds(125, 108, 225, 21);
		contentPane.add(textFindId);
		textFindId.setColumns(10);
		
		textFindEmail = new JTextField();
		textFindEmail.setColumns(10);
		textFindEmail.setBounds(125, 149, 225, 21);
		contentPane.add(textFindEmail);
		
		btnNewButton = new JButton("CANCEL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(130, 198, 104, 33);
		contentPane.add(btnNewButton);
		
		btnFind = new JButton("FIND");
		btnFind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				findPw();
				
			}
		});
		btnFind.setBounds(246, 198, 104, 33);
		
		contentPane.add(btnFind);
	}

	private void findPw() {
		UserDaoImpl dao=UserDaoImpl.getInstance();
		UserDto dto=new UserDto();
		dto.setUserId(textFindId.getText());
		dto.setEmail(textFindEmail.getText());
		
		String result=dao.pwFind(dto);
		
		if(result.equals("")) {
			JOptionPane.showMessageDialog(this, "아이디 또는 이메일이 틀렸습니다.");
		}else {
			JOptionPane.showMessageDialog(this, "비밀번호는 "+result+"입니다." );
		}
			
	}
}
