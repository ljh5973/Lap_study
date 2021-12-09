package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AppMain03 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField result;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnX;
	private JButton btnDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 221, 62);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 0, 283, 62);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 72, 221, 53);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(233, 72, 283, 53);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		btnPlus = new JButton("+");
		
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())+Double.parseDouble(textField_2.getText())));
						
					} catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			btnPlus.setBounds(12, 225, 97, 23);
			frame.getContentPane().add(btnPlus);
			
			btnMinus = new JButton("-");
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						System.out.println(e.getActionCommand());
						System.out.println(e.getSource());
					
					try {
						
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())-Double.parseDouble(textField_2.getText())));
					} catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			btnMinus.setBounds(139, 225, 109, 23);
			frame.getContentPane().add(btnMinus);
			
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 파라미터 ActionEvent e: 이벤트가 발생시킨 객체에 대한 정보를 가지고 있는 클래스.
					// actionPerformed 메서드에 전달된 argument e 를 메서드에 전달
					performCaculation(e);
					try {
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())*Double.parseDouble(textField_2.getText())));
						
					}  catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}

	
			});
			btnX.setBounds(278, 225, 97, 23);
			frame.getContentPane().add(btnX);
			
			btnDivision = new JButton("/");
			btnDivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						result.setText(Double.toString(Double.parseDouble(textField_1.getText())/Double.parseDouble(textField_2.getText())));
						
					}  catch (NumberFormatException e2) {
						result.setText("숫자를 입력해주세요");
						textField_1.setText("");
						textField_2.setText("");
					}
				}
			});
			
			btnDivision.setBounds(407, 225, 97, 23);
			frame.getContentPane().add(btnDivision);
		result = new JTextField();
		result.setBounds(12, 268, 492, 79);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
	}
	// 바깥 클래스 (outer class, enclosing class)에서 정의한 메서드는 inner class에서 사용 가능!
	private void performCaculation(ActionEvent e) {
		
		try {
			// JTextField에 있는 문자열을 읽어서 숫자로 변환
			double x = Double.parseDouble(textField_1.getText());
			double y = Double.parseDouble(textField_2.getText());
			// 이벤트가 발생한 버튼에 따라서 서로 다른 계산을 수행하고 결과를 문자열로 작성
			Object source=e.getSource();
			String resultMsg="";
			if(source== btnX) {
				resultMsg= x + "x" +y +"y" + "="+ (x*y);
			}else if(source == btnDivision) {
				resultMsg= x + "/" +y +"y" + "="+ (x/y);
			}
		} catch (Exception e2) {
			result.setText("숫자를 입력해주세요 . " );
		}
		
		
		// 결과 메시지를 JTextField에 출력
		
		
		
		
	}

}
