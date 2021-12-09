package edu.java.swing08;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AppMain08 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain08 window = new AppMain08();
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
	public AppMain08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnMsgDlg = new JButton("New button");
		btnMsgDlg.setFont(new Font("굴림", Font.BOLD, 20));
		btnMsgDlg.setBounds(12, 10, 390, 54);
		btnMsgDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						frame,	// 다이얼로그가 실행될 부모 컴포넌트
						"안녕하세요...^^",	// 다이얼로그에 표시될 메시지
						"Hello",	// 다이얼로그 title
						JOptionPane.INFORMATION_MESSAGE,	//message type
						null
						);	// 아이콘
			}
		});
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(btnMsgDlg);
		
		JButton btnConfirmDialog = new JButton("Confirm  Dialog");
		btnConfirmDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int confirm=JOptionPane.showConfirmDialog(frame,	// 다이얼로그가 실행될 부모 컴퍼넌트
						"삭제 하시겠습니까?",				// 확인 다이얼로그의 메시지
						"confirm",						// 제목 표시줄
						JOptionPane.YES_NO_OPTION,		// 확인 옵션(yes, no, cancel, ....)
						JOptionPane.QUESTION_MESSAGE,	// 메시지 종류
						null);
				System.out.println(confirm);
			}
			
		});
		btnConfirmDialog.setFont(new Font("굴림", Font.BOLD, 20));
		btnConfirmDialog.setBounds(12, 74, 390, 54);
		frame.getContentPane().add(btnConfirmDialog);
		
		JButton btnOptionDialog = new JButton("Option Dialog");
		btnOptionDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String [] options = {"안해", "이것도아냐", "싫어", "ㅁㅁㅁ"};
				int option=JOptionPane.showOptionDialog(
						frame,								// 다이얼로그가 실행될 부모 컴퍼넌트
						"어떤 옵션을 선택하시겠습니까?",				// 다이얼로그의 메시지
						"option dialog",					// 다이얼로그 제목 표시줄의 타이틀
						JOptionPane.YES_NO_CANCEL_OPTION,	// 선택할 옵션의 종류
						JOptionPane.QUESTION_MESSAGE,		// 메시지 종류
						null,								// icon 없으면 null
						options,								// option 버튼에서 사용할 문자열
						options[1]								// 다이얼로그가 실행됐을 때 포커스를 받고 있는 버튼
						);
				System.out.println(option);
			}
		});
		btnOptionDialog.setFont(new Font("굴림", Font.BOLD, 20));
		btnOptionDialog.setBounds(12, 138, 390, 54);
		frame.getContentPane().add(btnOptionDialog);
		
		JButton btnInputDialog = new JButton("Input Dialog");
		btnInputDialog.addActionListener(new ActionListener() {
			
			String [] options= {"aa","bb","cc"};
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String input =(String) JOptionPane.showInputDialog(
						frame,							// 다이얼로그가 실행될 부모 컴퍼넌트
						"입력할 문자가 있나요?",				// 다이얼로그의 메시지
						"title",						// title
						JOptionPane.QUESTION_MESSAGE,		// message 종류
						null,							// icon
						null,							// Object[]selectionValues 선택할 옵션 null을 입력하면 내가 input 할 수 있음
						"뭐라할까"							// Object initialSelectionValue 처음에 적혀있을 값.
						);
				System.out.println("input ="+ input);
			}
		});
		btnInputDialog.setFont(new Font("굴림", Font.BOLD, 20));
		btnInputDialog.setBounds(12, 202, 390, 54);
		frame.getContentPane().add(btnInputDialog);
		
		JButton btnCustomDialog = new JButton("Custom Dialog");
		btnCustomDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.showMyDialog();
			}
		});
		btnCustomDialog.setFont(new Font("굴림", Font.BOLD, 20));
		btnCustomDialog.setBounds(12, 266, 390, 54);
		frame.getContentPane().add(btnCustomDialog);
		
		JButton btnCustomFrame = new JButton("Custom Frame");
		btnCustomFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyFrame.showMyFrame();
				
			}
		});
		btnCustomFrame.setFont(new Font("굴림", Font.BOLD, 20));
		btnCustomFrame.setBounds(12, 330, 390, 54);
		frame.getContentPane().add(btnCustomFrame);
	}
}
