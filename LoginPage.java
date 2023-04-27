package lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage {
	
	private JFrame loginpage;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.loginpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginPage() {
		initialize();
	}

	private void initialize() {
		loginpage = new JFrame();
		loginpage.setForeground(new Color(0, 0, 205));
		loginpage.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 12));
		loginpage.setTitle("Welcome to the Library!");
		loginpage.setBounds(100, 100, 450, 300);
		loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginpage.getContentPane().setLayout(null);
		loginpage.setResizable(false);
		
		JLabel Welcome = new JLabel("Library Management");
		Welcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		Welcome.setBounds(141, 11, 200, 31);
		loginpage.getContentPane().add(Welcome);
		
		JButton forAdmin = new JButton("ADMIN LOGIN");
		forAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPG.main(null);
			}
		});
		forAdmin.setForeground(new Color(0, 100, 0));
		forAdmin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		forAdmin.setBounds(141, 74, 156, 40);
		loginpage.getContentPane().add(forAdmin);
		
		JButton forLibrarian = new JButton("LIBRARIAN LOGIN");
		forLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LibrarianPG.main(null);
			}
		});
		forLibrarian.setForeground(new Color(0, 100, 0));
		forLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 12));
		forLibrarian.setBounds(141, 173, 156, 40);
		loginpage.getContentPane().add(forLibrarian);
	}

}