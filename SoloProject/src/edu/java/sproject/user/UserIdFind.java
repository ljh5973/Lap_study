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


public class UserIdFind extends JFrame {

	private JPanel contentPane;
	private JTextField textFindName;
	private JTextField textFindPhone1;
	private JTextField textFindPhone2;
	private JTextField textFindPhone3;
	private JButton btnFind;

	/**
	 * Launch the application.
	 */
	public static void showFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserIdFind frame = new UserIdFind();
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
	public UserIdFind() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDFIND");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(125, 10, 174, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 108, 97, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PHONE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 149, 97, 21);
		contentPane.add(lblNewLabel_1_1);
		
		textFindName = new JTextField();
		textFindName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFindPhone1.requestFocus();
			}
		});
		textFindName.setBounds(125, 108, 225, 21);
		contentPane.add(textFindName);
		textFindName.setColumns(10);
		
		textFindPhone1 = new JTextField();
		textFindPhone1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textFindPhone2.requestFocus();
				
			}
		});
		textFindPhone1.setColumns(10);
		textFindPhone1.setBounds(125, 149, 67, 21);
		contentPane.add(textFindPhone1);
		
		textFindPhone2 = new JTextField();
		textFindPhone2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textFindPhone3.requestFocus();
				
			}
		});
		textFindPhone2.setColumns(10);
		textFindPhone2.setBounds(204, 149, 67, 21);
		contentPane.add(textFindPhone2);
		
		textFindPhone3 = new JTextField();
		textFindPhone3.setColumns(10);
		textFindPhone3.setBounds(283, 149, 67, 21);
		contentPane.add(textFindPhone3);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(130, 198, 104, 33);
		contentPane.add(btnCancel);
		
		btnFind = new JButton("FIND");
		btnFind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					try {
						findUserId();
					} catch (Exception e2) {
						nullFind();
					}
						
					
			}
		});
		btnFind.setBounds(246, 198, 104, 33);
		contentPane.add(btnFind);
	}

	private void findUserId() {
		
		String findName=textFindName.getText();
		String phone=textFindPhone1.getText()+textFindPhone2.getText()+textFindPhone3.getText();
		int findPhone=Integer.parseInt(phone);
		
		
		UserDto dto=new UserDto();
		dto.setUserName(findName);
		dto.setPhone(findPhone);
		UserDaoImpl dao=UserDaoImpl.getInstance();
		String result=dao.idFind(dto);
		System.out.println(result+"aaaaa");
		if(result.equals("")) {
			JOptionPane.showMessageDialog(this, "이름 또는 전화번호가 틀립니다.");
			clearText();
			
		}else {
			JOptionPane.showMessageDialog(this, "아이디는 "+result+" 입니다.");
			super.dispose();
		}
		
		
	}
	
	private void clearText() {
		textFindName.setText("");
		textFindPhone1.setText("");
		textFindPhone2.setText("");
		textFindPhone3.setText("");
	}
	private void nullFind() {
		
			if(textFindName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력해주세요.");
				textFindName.requestFocus();
			}else if(textFindPhone1.getText().equals("")||textFindPhone2.getText().equals("")||textFindPhone3.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "핸드폰 번호를 입력해주세요.");
				textFindPhone1.requestFocus();
			}
			
	}

}
