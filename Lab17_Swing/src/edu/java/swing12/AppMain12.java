package edu.java.swing12;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class AppMain12 {
	// 테이블의 컬럼 이름을 상수
	private static final String[] COLUMN_NAMES = { "국어", "영어", "수학", "총점", "평균" };

	private JFrame frame;
	private JTextField textKor;
	private JTextField textEng;
	private JTextField textMath;
	private JTable table;
	private JButton btnInput;
	private JButton btnDelete;
	private JScrollPane scrollPane;

	private DefaultTableModel tableModel; // 테이블의 데이터 (행(row), 열(column, 셀(cell))을 관리(추가, 삭제)

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain12 window = new AppMain12();
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
	public AppMain12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 612, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("국어");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 111, 36);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("영어");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 56, 111, 36);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("수학");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 102, 111, 36);
		frame.getContentPane().add(lblNewLabel_2);

		textKor = new JTextField();
		textKor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEng.requestFocus();
			}
		});

		textKor.setBounds(135, 10, 238, 36);
		frame.getContentPane().add(textKor);
		textKor.setColumns(10);

		textEng = new JTextField();
		textEng.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textMath.requestFocus();

			}
		});
		textEng.setColumns(10);
		textEng.setBounds(135, 56, 238, 36);
		frame.getContentPane().add(textEng);

		textMath = new JTextField();
		textMath.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputScore();
				textKor.requestFocus();
			}
		});
		textMath.setColumns(10);
		textMath.setBounds(135, 102, 238, 36);
		frame.getContentPane().add(textMath);

		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputScore();
			}
		});
		btnInput.setBounds(135, 160, 111, 39);
		frame.getContentPane().add(btnInput);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deleteScore();

			}
		});
		btnDelete.setBounds(262, 160, 111, 39);
		frame.getContentPane().add(btnDelete);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 209, 369, 167);
		frame.getContentPane().add(scrollPane);

		table = new JTable();

		// 테이블에 테이블 모델을 설정
		tableModel = new DefaultTableModel(null, COLUMN_NAMES);

		// 테이블 모델에서 변화가 생겼을 때 (예 : cell의 내용이 변경) 이벤트를 처리하기 위한 이벤트 핸들러
		tableModel.addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
//				System.out.println("type" + e.getType()); 				// 테이블 모델 변화의 이벤트 타입(추가, 삭제, 수정)
//				System.out.println("first row" + e.getFirstRow()); 		// 이벤트가 발생한 행 인덱스
//				System.out.println("column" + e.getColumn()); 			// 이벤트가 발생한 열 인덱스

				handleTableChange(e);
			}
		});

		table.setModel(tableModel);
		scrollPane.setViewportView(table);
	}

	private void handleTableChange(TableModelEvent e) {
		
		// 테이블 모델 변화에 이벤트의 타입을 먼저 찾음
		int eventType=e.getType();
		
		if(eventType != TableModelEvent.UPDATE)return;
		

		int row=e.getFirstRow();	// 이벤트가 발생한 행 인덱스
		int col=e.getColumn();		// 이벤트가 발생한 열 인덱스
		
		if(col>=0&&col<=2) {		// 국,영,수 점수 변경이 일어났을 때
			// 총점과 평균을 다시 계산하기 위해서 국,영,수 점수를 테이블에서 불러와야함
		int kor=Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 0)));
		int eng=Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 1)));
		int math=Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 2)));
		
		Score score= new Score(kor,eng,math);
		
		// 변경된 점수로 계산된 총점과 평균을 테이블 모델에 반영
		
		tableModel.setValueAt(score.total(), row, 3);
		tableModel.setValueAt(score.average(), row, 4);
		String msg=row+"번 인덱스의 행의 정보가 수정됐습니다.";
		JOptionPane.showMessageDialog(frame, msg);
		}
		
	}

	private void deleteScore() {
		int index = table.getSelectedRow();

		if (index == -1) {
			JOptionPane.showMessageDialog(frame, "리스트에서 삭제할 아이템을 선택하세요");
			return;
		}

		int confirm = JOptionPane.showConfirmDialog(frame, "정말로 삭제할까요?", "삭제", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		System.out.println(confirm);
		if (confirm == JOptionPane.YES_NO_OPTION) {
			tableModel.removeRow(index);
			textKor.requestFocus();
			clearAllTextField();
		}
	}

	private void inputScore() {

		// 국어, 영어, 수학,점수를 읽음(문자열 -> 정수 변환);
		int kor = 0;
		int eng = 0;
		int math = 0;

		try {
			kor = Integer.parseInt(textKor.getText());
			eng = Integer.parseInt(textEng.getText());
			math = Integer.parseInt(textMath.getText());

		} catch (Exception e) {
			String message = e.getMessage() + "\n 입력한 내용은 숫자가 아닙니다.";
			JOptionPane.showMessageDialog(frame, message, "입력 오류", JOptionPane.ERROR_MESSAGE);
			return; // 메서드 종료

		} finally {
			clearAllTextField();
		}

		// Score 객체 생성 -> 총점, 평균 기능 사용 가능
		Score score = new Score(kor, eng, math);

//		score.setKor(kor);
//		score.setEng(eng);
//		score.setMath(math);

		// 테이블의 행에 추가할 데이터를 1차원 배열로 생성
		Object[] data = { score.getKor(), score.getEng(), score.getMath(), score.total(), score.average() };

		// 테이블 모델에 행(row)를 추가
		tableModel.addRow(data);

		// 모든 텍스트 필드의 값들을 지움

	}

	private void clearAllTextField() {

		textKor.setText("");
		textEng.setText("");
		textMath.setText("");
		textKor.requestFocus();
	}
}
