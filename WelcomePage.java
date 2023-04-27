package lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage {
	private JFrame welcomeframe;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.welcomeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomePage() {
		initialize();
	}

	private void initialize() {
		welcomeframe = new JFrame();
		welcomeframe.setTitle("SUCCESSFULLY LOGIN!");
		welcomeframe.setBounds(100, 100, 450, 300);
		welcomeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeframe.getContentPane().setLayout(null);
		welcomeframe.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("\" Welcome to NU Library System \"");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(71, 97, 299, 48);
		welcomeframe.getContentPane().add(lblNewLabel);
	}

}