package edu.java.contact.ver05;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.model.Contact;
import edu.java.contact.ver04.ContactDao;
import edu.java.contact.ver04.ContactDaoImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactMain05 {
	
	// 메인화면에서 보여줄 테이블의 컬럼 이름
	private static final String[] COLUMN_NAMES_SHORT= {"이름", "전화번호"};
	private static final String[] COLUMN_NAMES_LONG= {"이름", "전화번호","이메일"};
	
	// Controller 역할을 하는 변수
	private ContactDao dao;
	
	private JFrame frame;
	private JPanel buttonPanel;
	private JButton btnInsert;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
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
	public ContactMain05() {
		dao=ContactDaoImpl.getInstance(); 	// controller singleton
		initialize();						// UI 컴포넌트 초기화
		loadContactData();					// 파일에 저장된 연락처 데이터를 로딩해서 테이블로 보여주기
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("연락처 프로그램 Ver0.5");
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buttonPanel = new JPanel();
		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		
		btnInsert = new JButton("추가");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContactInsertFrame.showFrame(frame,ContactMain05.this);
			}
		});
		btnInsert.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btnInsert);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btnSearch);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO: UpdateFrame.show(frame, Main.this);
				
				showUpdateFrame();
				
			}
		});
		btnUpdate.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteContact();
			}
		});
		btnDelete.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btnDelete);
		
		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		
		// 테이블의 데이터들을 관리하는 DefaultTableModel 객체를 생성하고, 테이블에 세팅(설정)
		model= new DefaultTableModel(null, COLUMN_NAMES_SHORT);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
	}

	


	private void showUpdateFrame() {

		// 테이블에서 수정하기 위해 선택된 행이 있는 지 검사
		int row=table.getSelectedRow();
		if(row==-1) {
			JOptionPane.showMessageDialog(frame, "수정할 연락처를 눌러주세요.","수정",JOptionPane.WARNING_MESSAGE);
			return;
		};
			
		// 연락처 수정 화면을 보여줌.
			ContactUpdateFrame.showFrame(frame, row, this);
		
		
	}
	public void contactUpdateNotify(int row, Contact c) {
		// row와 Contact 객체를 받아와서 하나씩 setValueAt을 해준다. 
		// 업데이트 된 행과 연락처 정보를 테이블 모델에 반영
		model.setValueAt(c.getName(), row, 0);
		model.setValueAt(c.getPhone(), row, 1);
	}
	
	public void contactUpdateNotify() {
		// 테이블 모델을 초기화 - 전체 데이터를 새로 로딩
		model=new DefaultTableModel(null, COLUMN_NAMES_SHORT);	// 데이터 초기화
		table.setModel(model);	// 테이블에 초기화된 테이블 모델을 setting.
		loadContactData();
		
		
	}

	private void loadContactData() {
		// data/contacts.dat 파일에서 데이터를 읽어서 JTable에 데이터를 추가(JTable의 model을 변경)
		List<Contact> contacts=dao.select();
		for(Contact c: contacts) {
			addContactToTableModel(c);
		}
		
	}
	
	private void addContactToTableModel(Contact c) {
		String[] rowData= {c.getName(), c.getPhone()};
		model.addRow(rowData);
	}
	
	public void insertContact(Contact c) {
		// 파일에 쓰기 0> 성공했으면 팝업창 띄우기
		// JTable 업데이트
		int result=dao.insert(c);
		if(result==1) {
			JOptionPane.showMessageDialog(frame, "추가에 성공했습니다.");
			
			//JTable 업데이트
		addContactToTableModel(c);
		}
	}
	
	private void deleteContact() {
		// table에서 선택된 행(row)가 있는 지 검사
		int row=table.getSelectedRow();
		System.out.println(row);
		if(row==-1) {
			JOptionPane.showMessageDialog(frame, "삭제할 연락처를 선택해주세요.");
			return;
		}
		int result=dao.delete(row);		// ArrayList에서 연락처 정보 삭제 -> 파일에 변경된 내욜 반영
		if(result==1) {
			// JTable에서 행 삭제
			model.removeRow(row);
			JOptionPane.showMessageDialog(frame, "삭제되었습니다.");
			
		}
		
		
	}
}
