package lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LibrarianPG {
	private JFrame librarianpage;
	private JTextField LibUsernamefield;
	private JPasswordField LibPasswordfield;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianPG window = new LibrarianPG();
					window.librarianpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LibrarianPG() {
		initialize();
	}

	private void initialize() {
		librarianpage = new JFrame();
		librarianpage.setTitle("LIBRARIAN LOGIN");
		librarianpage.setBounds(100, 100, 450, 300);
		librarianpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianpage.getContentPane().setLayout(null);
		librarianpage.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 51, 98, 20);
		librarianpage.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPassword.setBounds(48, 131, 98, 14);
		librarianpage.getContentPane().add(lblPassword);
		
		LibUsernamefield = new JTextField();
		LibUsernamefield.setBounds(48, 78, 236, 31);
		librarianpage.getContentPane().add(LibUsernamefield);
		LibUsernamefield.setColumns(10);
		
		LibPasswordfield = new JPasswordField();
		LibPasswordfield.setBounds(48, 156, 236, 31);
		librarianpage.getContentPane().add(LibPasswordfield);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String libuser = LibUsernamefield.getText();
				String libpass = LibPasswordfield.getText();
				   
				String [] userlib = {"Librarian_01", "Librarian_02", "Librarian_03"};
				String [] passlib = {"LibOne", "LibTwo", "LibThree"};
				
				  if(libuser.contains(userlib[0]) && libpass.contains(passlib[0])) {
					  LibUsernamefield.setText(null);
					  LibPasswordfield.setText(null);
					  
					  WelcomePage.main(null); }
					  
					  else if (libuser.contains(userlib[1]) && libpass.contains(passlib[1])) {
						  LibUsernamefield.setText(null);
						  LibPasswordfield.setText(null);
						  
						  WelcomePage.main(null);	}
					 
					  else if (libuser.contains(userlib[2]) && libpass.contains(passlib[2])) {
						  LibUsernamefield.setText(null);
						  LibPasswordfield.setText(null);
						  
						  WelcomePage.main(null);	  
			}
		}});
		btnNewButton.setFont(UIManager.getFont("FileChooser.listFont"));
		btnNewButton.setBounds(48, 208, 89, 23);
		librarianpage.getContentPane().add(btnNewButton);
		
		
	}
}