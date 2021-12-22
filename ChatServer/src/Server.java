import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Server extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField port_tf;
	private JTextArea textArea;
	private JButton start_btn;
	private JButton stop_btn;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server window = new Server();
					window.frame.setVisible(true);
					// true = 화면에 보이게  false = 화면에 안보이게
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Server() {
		initialize();
		start();	//
	}
	
	
	public void start() {
		start_btn.addActionListener(this);
		stop_btn.addActionListener(this);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("포트번호");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(165, 130, 104, 33);
		frame.getContentPane().add(lblNewLabel);
		
		port_tf = new JTextField();
		port_tf.setBounds(144, 174, 146, 21);
		frame.getContentPane().add(port_tf);
		port_tf.setColumns(10);
		
		stop_btn = new JButton("서버실행");
		stop_btn.setBounds(12, 205, 146, 23);
		frame.getContentPane().add(stop_btn);
		
		start_btn = new JButton("서버중지");
		start_btn.setBounds(276, 205, 146, 23);
		frame.getContentPane().add(start_btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 410, 110);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==start_btn) {
			System.out.println("스타트 버튼 클릭");
		}else if(e.getSource()==stop_btn) {
			System.out.println("서버 스탑 버튼 클릭");
		}
		
	}
	
}
