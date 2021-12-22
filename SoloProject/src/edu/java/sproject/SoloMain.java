package edu.java.sproject;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import edu.java.sproject.controller.UserDaoImpl;
import edu.java.sproject.dto.UserDto;
import edu.java.sproject.game.StanbyScreen;
import edu.java.sproject.user.UserIdFind;
import edu.java.sproject.user.UserPwFind;
import edu.java.sproject.user.UserSignUp;

public class SoloMain {

	private JFrame frame;
	private JTextField textId;
	private JPasswordField textPw;

	/**
	 * Launch the application.
	 */
	public static void main(String []args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoloMain window = new SoloMain();
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
	public SoloMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 594, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(214, 165, 130, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 228, 146, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(12, 284, 146, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textId = new JTextField();
		textId.setBounds(170, 230, 286, 33);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLogin();
			}
		});
		btnNewButton.setBounds(468, 287, 97, 30);
		frame.getContentPane().add(btnNewButton);
		
		textPw = new JPasswordField();
		textPw.setBounds(170, 284, 286, 33);
		frame.getContentPane().add(textPw);
		
		JButton btnIdFind = new JButton("ID Find");
		btnIdFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				UserIdFind.showFrame();
				UserIdFind.showFrame();
			}
		});
		btnIdFind.setBounds(61, 358, 130, 47);
		frame.getContentPane().add(btnIdFind);
		
		JButton btnPwFind = new JButton("PW Find");
		btnPwFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPwFind.showFrame();
			}
		});
		
		btnPwFind.setBounds(214, 358, 130, 47);
		frame.getContentPane().add(btnPwFind);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSignUp.showFrame();
			}
		});
		btnSignUp.setBounds(368, 358, 130, 47);
		frame.getContentPane().add(btnSignUp);
		
		JLabel titleImage = new JLabel(new ImageIcon("img/title.png"));
		titleImage.setBounds(61, 10, 437, 145);
		frame.getContentPane().add(titleImage);
	}
	
	private void mainLogin() {
		UserDaoImpl dao= UserDaoImpl.getInstance();
		UserDto dto=new UserDto();
		
		dto.setUserId(textId.getText());
		char[] arr=textPw.getPassword();
		
		String pw="";
		for(char i: arr) {
			pw+=i;
		}
		dto.setUserPw(pw);
	
		dto=dao.mainLogin(dto);
		if(dto.getUserId().equals("")) {
			
		}else {
			StanbyScreen.showFrame(dto);
		}
	}
	
}
