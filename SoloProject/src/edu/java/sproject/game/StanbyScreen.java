package edu.java.sproject.game;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import edu.java.sproject.controller.RoomDaoImpl;
import edu.java.sproject.dto.RoomDto;
import edu.java.sproject.dto.UserDto;
import edu.java.sproject.user.UserInformation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StanbyScreen extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnMyInfo;
	private JButton btnCreateRoom;
	private DefaultTableModel model;
	
	/**
	 * Launch the application.
	 */
	public static void showFrame(UserDto dto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StanbyScreen frame = new StanbyScreen(dto);
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
	public StanbyScreen(UserDto dto) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 758, 239);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(e.getClickCount()==2) {
					int row =table.getSelectedRow();
					intoRoom(dto, row);
				}
			}
		});
		
		setTable();
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMaxWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(330);
		table.getColumnModel().getColumn(2).setPreferredWidth(70);
		table.getColumnModel().getColumn(2).setMaxWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(60);
		table.getColumnModel().getColumn(3).setMinWidth(60);
		table.getColumnModel().getColumn(3).setMaxWidth(60);
		scrollPane.setViewportView(table);
		
		
		JLabel lblNewLabel = new JLabel("환영합니다.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(807, 28, 143, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(dto.getUserId()+"님");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(807, 71, 143, 52);
		contentPane.add(lblNewLabel_1);
		
		btnMyInfo = new JButton("MyInfo");
		btnMyInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UserInformation.showFrame(dto);
			}
		});
		btnMyInfo.setBounds(807, 133, 143, 23);
		contentPane.add(btnMyInfo);
		
		JButton btnEntranceRoom = new JButton("Entrance");
		btnEntranceRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntranceRoom.setBounds(804, 193, 146, 23);
		contentPane.add(btnEntranceRoom);
		
		btnCreateRoom = new JButton("Creating");
		btnCreateRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateRoom.showFrame(dto,StanbyScreen.this);
				
			}
		});
		 
		btnCreateRoom.setBounds(804, 226, 146, 23);
		contentPane.add(btnCreateRoom);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 258, 758, 157);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setBounds(12, 425, 665, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("input");
		btnNewButton_3.setBounds(673, 424, 97, 23);
		contentPane.add(btnNewButton_3);
		
	}
	public void setTable(){
		RoomDaoImpl dao=RoomDaoImpl.getInstance();
		List<RoomDto> list=dao.showTable();
		
		Object[][] result = new Object[100][100];
		
		for(int i=0; i<list.size();i++) {	
				result[i][0]=list.get(i).getRoomNum();	
				result[i][1]=list.get(i).getTitle();
				result[i][2]=list.get(i).getUserName();
	
		}
		
		table.setModel(new DefaultTableModel(
				result,
				new String[] {
					"No", "Title", "Name", "Member"
				}
			) {
				public boolean isCellEditable(int row, int col) {
					return false;
				}
			});
		
	}
	private void intoRoom(UserDto dto, int row) {
		GameMain.showFrame(dto, row);
		
	}
}
