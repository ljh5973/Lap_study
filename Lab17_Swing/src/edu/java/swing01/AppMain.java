package edu.java.swing01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollBar;

public class AppMain {

	private JFrame frmAsdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain window = new AppMain();
					window.frmAsdf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAsdf = new JFrame();
		frmAsdf.setTitle("asdf");
		frmAsdf.setBounds(100, 100, 606, 404);
		frmAsdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblHello = new JLabel("Hello, Swing!");
		lblHello.setFont(new Font("궁서체", Font.BOLD, 39));
		frmAsdf.getContentPane().add(lblHello, BorderLayout.CENTER);
	}

}
