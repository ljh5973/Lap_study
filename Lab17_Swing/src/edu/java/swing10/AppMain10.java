package edu.java.swing10;

import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain10 {

	private JFrame frame;
	private JList<String> list;
	private JButton btnDelete;
	private JButton btnNewButton;
	private DefaultListModel<String> model;
	private JScrollPane scrollPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain10 window = new AppMain10();
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
	public AppMain10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addElementToList();
			}
		});
		btnNewButton.setBounds(251, 8, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteElementFromList();
			}
		});
		btnDelete.setBounds(251, 41, 97, 23);
		frame.getContentPane().add(btnDelete);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 99, 217, 129);
		frame.getContentPane().add(scrollPane);
		
		list = new JList<String>();	//String 을 원소로 갖는 JLIst 객체를 생성
		model = new DefaultListModel<String>();	// JList의 아이템을 관리하는 DefaultLIstModel 객체를 생성.
		list.setModel(model); 	// JList에 model을 설정.
		scrollPane.setViewportView(list);
		
		textField = new JTextField();
		textField.setBounds(24, 9, 215, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	}

	protected void deleteElementFromList() {
		// TODO : JList에서 선택된 아이템의 인덱스를 찾음
		int index=list.getSelectedIndex();
		// 만약, 선택된 아이템이 없다면, 사용자에게 삭제할 아이템을 선택하라고 메시지를 보여줌.
//		if(list.getSelectedValue()==null) {
//			JOptionPane.showMessageDialog(frame, "삭제할 아이템을 선택해주세요.");
//		}else {
//			result=JOptionPane.showConfirmDialog(frame, "정말로 삭제할것입니까?", "삭제", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
//		}
		
		
		if(index==-1) {
			JOptionPane.showMessageDialog(frame, "리스트에서 삭제할 아이템을 선택하세요");
			return;
		}
		// 선택된 아이템이 있다면, 정말로 삭제할 것인지 확인한 후
		int confirm=JOptionPane.showConfirmDialog(frame, "정말 삭제할까요?", "삭제", JOptionPane.YES_NO_OPTION);
		// 사용자가 삭제하겠다고 확인하면 model에서 삭제
		if(confirm==JOptionPane.YES_NO_OPTION) {
			model.remove(index);
		}
	}

	private void addElementToList() {
		
		
		// JTextField의 내용을 읽고 JList의 모델에 아이템을 추가
		String text= textField.getText();
		
		if(text==null||text.length()==0) {
			JOptionPane.showMessageDialog(frame, "추가할 내용을 입력하세요.");
			
			return;
		}
			model.addElement(text);
			textField.setText("");
			
		
	}
}
