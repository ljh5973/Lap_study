package edu.java.contact.ver05;

import java.awt.Component;
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

import edu.java.contact.model.Contact;
import edu.java.contact.ver04.ContactDao;
import edu.java.contact.ver04.ContactDaoImpl;

public class ContactUpdateFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	
	
	private Component parentComponent;	// 업데이트 프레임을 보여주기 위한 부모 컴포넌트
	private int index;					// 수정할 연락처의 인덱스
	private ContactDao dao;
	private ContactMain05 mainApp;
	
	
	/**
	 * Launch the application.
	 * @param row 
	 * @param frame 
	 */
	public static void showFrame(Component parentComponent, int row, ContactMain05 mainApp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parentComponent, row, mainApp);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param parentComponent 
	 */
	
	public ContactUpdateFrame(Component parentComponent, int row, ContactMain05 mainApp) {
		this.parentComponent=parentComponent;
		this.index=row;
		this.dao= ContactDaoImpl.getInstance();
		this.mainApp=mainApp;
		initialize();
		loadContactData();
	}


	public void initialize() {
		
		int x= parentComponent.getX();
		int y= parentComponent.getY();
		setTitle("연락처 수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(x, y, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	// absolute layout
		
		
		JLabel labelName = new JLabel("이름");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("굴림", Font.PLAIN, 20));
		labelName.setBounds(12, 10, 99, 38);
		contentPane.add(labelName);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setHorizontalAlignment(SwingConstants.CENTER);
		labelPhone.setFont(new Font("굴림", Font.PLAIN, 20));
		labelPhone.setBounds(12, 58, 99, 38);
		contentPane.add(labelPhone);
		
		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("굴림", Font.PLAIN, 20));
		labelEmail.setBounds(12, 106, 99, 38);
		contentPane.add(labelEmail);
		
		textName = new JTextField();
		
		textName.setFont(new Font("굴림", Font.PLAIN, 20));
		textName.setColumns(10);
		textName.setBounds(161, 16, 261, 32);
		contentPane.add(textName);
		
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
		
		JButton btnUpdate = new JButton("수정완료");
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});
		btnUpdate.setBounds(12, 178, 105, 62);
		contentPane.add(btnUpdate);
		
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
	
	private void updateContact() {
		
		// 업데이트 할 내용을 읽음.
		String name=textName.getText();
		String phone= textPhone.getText();
		String email=textEmail.getText();
		
		Contact c=new Contact(name,phone,email);
		
		// dao를 사용해서 연락처 정보를 수정.
		int result=dao.update(index, c);
		if(result==1) {
			dispose();
			// 성공 팝업
//			mainApp.contactUpdateNotify(index, c);
			mainApp.contactUpdateNotify();
			
			JOptionPane.showMessageDialog(parentComponent, "수정이 완료되었습니다.");
		}
		
		
	}

	public void loadContactData() {
		// dao를 사용해서 인덱스 검색을 하고, 검색된 내용을 textField에 채워줌.
		Contact c=dao.select(index);
		textName.setText(c.getName());
		textPhone.setText(c.getPhone());
		textEmail.setText(c.getEmail());
		
	}

}
