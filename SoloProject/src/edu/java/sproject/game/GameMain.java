package edu.java.sproject.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.ConsoleHandler;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.java.sproject.dto.UserDto;
import edu.java.sproject.util.MyCanvas;

public class GameMain extends JFrame {
	
	private int number=0;

	private JPanel contentPane;
	private JPanel panel;
	private Canvas can;
	private JButton btnR;
	private JButton btnO;
	private JButton btnY;
	private JButton btnG;
	private JButton btnB;
	private JButton btnAllClear;
	private JButton btnClear;
	private JButton btnBl;
	private JButton btnClearPlus;
	private JButton btnClearMinus;
	private JTextField textSize;
	private JLabel FontSize;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JLabel nameNo4;
	private JLabel nameNo3;
	private JLabel nameNo2;
	private JLabel nameNo1;
	private JLabel lbRoomNum;

	
	/**
	 * Launch the application.
	 */
	
	
	public static void showFrame(UserDto dto, int row) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMain frame = new GameMain(dto, row);
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
	public GameMain(UserDto dto, int row) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameNo1 = new JLabel(dto.getUserId());
		nameNo1.setHorizontalAlignment(SwingConstants.CENTER);
		nameNo1.setBounds(12, 116, 90, 20);
		contentPane.add(nameNo1);
		
		nameNo3 = new JLabel("NAME");
		nameNo3.setHorizontalAlignment(SwingConstants.CENTER);
		nameNo3.setBounds(882, 116, 90, 20);
		contentPane.add(nameNo3);
		
		nameNo2 = new JLabel("NAME");
		nameNo2.setHorizontalAlignment(SwingConstants.CENTER);
		nameNo2.setBounds(12, 319, 90, 20);
		contentPane.add(nameNo2);
		
		nameNo4 = new JLabel("NAME");
		nameNo4.setHorizontalAlignment(SwingConstants.CENTER);
		nameNo4.setBounds(882, 319, 90, 20);
		contentPane.add(nameNo4);
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(22, 146, 80, 61);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(22, 349, 80, 61);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(892, 146, 80, 61);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("New label");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(892, 349, 80, 61);
		contentPane.add(lblNewLabel_4_3);
		
		panel = new JPanel();
		panel.setBounds(114, 10, 756, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnY = new JButton(new ImageIcon("img/yellow.png"));
		btnY.setBounds(358, 10, 40, 40);
		panel.add(btnY);
		
		btnO = new JButton(new ImageIcon("img/orange.png"));
		btnO.setBounds(306, 10, 40, 40);
		panel.add(btnO);
		
		btnR = new JButton(new ImageIcon("img/red.png"));
		btnR.setBounds(254, 10, 40, 40);
		panel.add(btnR);
		
		btnG = new JButton(new ImageIcon("img/green.png"));
		btnG.setBounds(410, 10, 40, 40);
		panel.add(btnG);
		
		btnB = new JButton(new ImageIcon("img/blue.png"));
		btnB.setBounds(462, 10, 40, 40);
		panel.add(btnB);
		
		can=new MyCanvas();
		can.setLocation(0, 61);
		can.setSize(756,339);
		can.setBackground(Color.white);
		panel.add(can);
		
		btnAllClear = new JButton("All Clear");
		btnAllClear.setBounds(663, 10, 81, 40);
		panel.add(btnAllClear);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(514, 10, 69, 40);
		panel.add(btnClear);
		
		btnBl = new JButton(new ImageIcon("img/black.png"));
		btnBl.setBounds(202, 10, 40, 40);
		panel.add(btnBl);
		
		btnClearPlus = new JButton("+");
		btnClearPlus.setBounds(595, 10, 40, 15);
		panel.add(btnClearPlus);
		
		btnClearMinus = new JButton("-");
		btnClearMinus.setBounds(595, 35, 40, 15);
		panel.add(btnClearMinus);
		
		textSize = new JTextField();
		textSize.setBounds(128, 29, 62, 21);
		panel.add(textSize);
		textSize.setText("5");
		textSize.setColumns(10);
		
		FontSize = new JLabel("Font Size");
		FontSize.setForeground(Color.BLACK);
		FontSize.setHorizontalAlignment(SwingConstants.CENTER);
		FontSize.setBounds(128, 10, 62, 15);
		
		panel.add(FontSize);
		
		JLabel lblNewLabel_5 = new JLabel("정답");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(12, 10, 104, 40);
		panel.add(lblNewLabel_5);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(112, 425, 758, 197);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setBounds(114, 633, 688, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("input");
		btnNewButton.setBounds(801, 632, 69, 23);
		contentPane.add(btnNewButton);
		
		lbRoomNum = new JLabel("방 번호 "+ Integer.toString(row+1));
		lbRoomNum.setHorizontalAlignment(SwingConstants.CENTER);
		lbRoomNum.setBounds(12, 10, 90, 44);
		contentPane.add(lbRoomNum);
		
		
		MyHandler my =new MyHandler();
		can.addMouseMotionListener(my); // 캔버스 개체에 마우스 모션 리스너를 부착
		btnR.addActionListener(my);
		btnO.addActionListener(my);;
		btnY.addActionListener(my);
		btnG.addActionListener(my);
		btnB.addActionListener(my);
		btnBl.addActionListener(my);
		btnClear.addActionListener(my);
		btnAllClear.addActionListener(my);
		btnClearPlus.addActionListener(my);
		btnClearMinus.addActionListener(my);
		textSize.addActionListener(my);
		
		setSize(1000,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	class MyHandler implements MouseMotionListener, ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object o =e.getSource();
			MyCanvas can2= (MyCanvas)can;
			
			if(o==btnR) {
				can2.color=Color.red;
				FontSize.setForeground(Color.red);
				FontSize.setText("Font Size");
			}else if(o==btnO) {
				can2.color=Color.orange;
				FontSize.setForeground(Color.orange);
				FontSize.setText("Font Size");
			}else if(o==btnY) {
				can2.color=Color.yellow;
				FontSize.setForeground(Color.yellow);
				FontSize.setText("Font Size");
			}else if(o==btnG) {
				can2.color=Color.green;
				FontSize.setForeground(Color.green);
				FontSize.setText("Font Size");
			}else if(o==btnB) {
				can2.color=Color.blue;
				FontSize.setForeground(Color.blue);
				FontSize.setText("Font Size");
			}else if(o==btnClear) {
				can2.color=Color.white;
				FontSize.setText("eraser");
				FontSize.setForeground(Color.white);
			}else if(o==btnAllClear) {
				Graphics g=can2.getGraphics();
				g.clearRect(0, 0, can.getWidth(), can.getHeight());
				FontSize.setText("Font Size");
			}else if(o==btnBl) {
				can2.color=Color.black;
				FontSize.setForeground(Color.black);
				FontSize.setText("Font Size");
			}else if(o==btnClearPlus) {
				
				if(can2.width<20) {
					can2.width+=3;
					can2.height+=3;
				}
				textSize.setText(Integer.toString(can2.width));
			}else if(o==btnClearMinus) {
				if(can2.width>=1) {
					can2.width-=3;
					can2.height-=3;
				}
				if(can2.width<=0) {
					can2.width=2;
					can2.height=2;
			}
				textSize.setText(Integer.toString(can2.width));
			}
			else if(o==textSize) {
				can2.width=Integer.parseInt(textSize.getText());
				can2.height=Integer.parseInt(textSize.getText());
			}
		
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			setTitle("Drag");
			int xx=e.getX();
			int yy=e.getY();
			setTitle("xx=" + xx+ ", yy="+ yy);
			
			((MyCanvas)can).x=xx;
			((MyCanvas)can).y=yy;
			
			// paint()는 JVM이 호출해주는 메소드로 변경 x, repaint를 써서 재사용
			can.repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
}
