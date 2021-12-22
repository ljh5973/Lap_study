package edu.java.sproject.game;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.java.sproject.controller.RoomDaoImpl;
import edu.java.sproject.dto.RoomDto;
import edu.java.sproject.dto.UserDto;

public class CreateRoom extends JFrame {

	private JPanel contentPane;
	private JTextField textTitle;
	private JLabel lbMasterName;
	private UserDto uDto;
	private StanbyScreen main;
	/**
	 * Launch the application.
	 */
	public static void showFrame(UserDto dto, StanbyScreen stanbyScreen) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateRoom frame = new CreateRoom(dto ,stanbyScreen);
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
	public CreateRoom(UserDto dto,StanbyScreen s) {
		uDto=dto;
		this.main=s;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CreateRoom");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 10, 200, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 99, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MasterName");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(12, 129, 100, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		textTitle = new JTextField();
		textTitle.setBounds(127, 99, 295, 21);
		contentPane.add(textTitle);
		textTitle.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(127, 173, 100, 51);
		contentPane.add(btnCancel);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
				
			}
		});
		btnCreate.setBounds(322, 173, 100, 51);
		contentPane.add(btnCreate);
		
		lbMasterName = new JLabel(dto.getUserId());
		lbMasterName.setHorizontalAlignment(SwingConstants.CENTER);
		lbMasterName.setBounds(124, 132, 298, 17);
		contentPane.add(lbMasterName);
		
		
	}

	private void createRoom() {
		RoomDaoImpl dao=RoomDaoImpl.getInstance();
		RoomDto dto=new RoomDto();
		dto.setTitle(textTitle.getText());
		dto.setUserName(lbMasterName.getText());
		dao.createRoom(dto);
		main.setTable();
		dispose();
		int row=dao.roomNum();
		GameMain.showFrame(uDto, row);
	}
}
