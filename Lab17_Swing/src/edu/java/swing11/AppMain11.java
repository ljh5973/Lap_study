package edu.java.swing11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AppMain11 {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain11 window = new AppMain11();
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
	public AppMain11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
		// JTable의 컬럼 이름
		table = new JTable();
		String[] colNames= {"상품 번호", "상품 이름", "상품 가격", "카테고리", "상품 재고"};
		
		// JTable의 데이터
		Object[][] data={
				{1, "핸드폰", 100_000, "전자제품", 10},
				{2, "볼펜", 1_000, "잡화", 1000},
				{3, "초콜릿", 2_000, "식료품",50}
		};
		
		// 데이터와 컬럼 이름을 가지고 DefaultTableModel의 객체를 생성
		model= new DefaultTableModel(data, colNames);
		
		// DefaultTableModel 객체를 JTable에 설정.
		table.setModel(model);
		
		// 완성된 테이블을 JSCrollPane의 Viewport에 설정.
		scrollPane.setViewportView(table);
	}

}
