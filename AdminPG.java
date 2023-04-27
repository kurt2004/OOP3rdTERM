package lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPG {

	private JFrame adminpage;
	private JTextField AdUsernamefield;
	private JPasswordField AdPasswordfield;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPG window = new AdminPG();
					window.adminpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminPG() {
		initialize();
	}
	
	private void initialize() {
		
		adminpage = new JFrame();
		adminpage.setTitle("ADMIN LOGIN");
		adminpage.setBounds(100, 100, 450, 300);
		adminpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminpage.getContentPane().setLayout(null);
		adminpage.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 51, 98, 20);
		adminpage.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPassword.setBounds(48, 131, 98, 14);
		adminpage.getContentPane().add(lblPassword);
		
		AdUsernamefield = new JTextField();
		AdUsernamefield.setBounds(48, 78, 236, 31);
		adminpage.getContentPane().add(AdUsernamefield);
		AdUsernamefield.setColumns(10);
		
		AdPasswordfield = new JPasswordField();
		AdPasswordfield.setBounds(48, 156, 236, 31);
		adminpage.getContentPane().add(AdPasswordfield);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String adminuser = AdUsernamefield.getText();
				String adminpass = AdPasswordfield.getText();
				   
				String [] useradmin = {"Admin_01", "Admin_02", "Admin_03"};
				String [] passadmin = {"AdminOne", "AdminTwo", "AdminThree"};
				
				  if(adminuser.contains(useradmin[0]) && adminpass.contains(passadmin[0])) {
					  AdUsernamefield.setText(null);
					  AdPasswordfield.setText(null);
					  
					  WelcomePage.main(null); }
					  
					  else if (adminuser.contains(useradmin[1]) && adminpass.contains(passadmin[1])) {
						  AdUsernamefield.setText(null);
						  AdPasswordfield.setText(null);
						  
						  WelcomePage.main(null);	}
					 
					  else if (adminuser.contains(useradmin[2]) && adminpass.contains(passadmin[2])) {
						  AdUsernamefield.setText(null);
						  AdPasswordfield.setText(null);
						  
						  WelcomePage.main(null);	  
					
						
				  }
			}
		});
		btnNewButton.setFont(UIManager.getFont("FileChooser.listFont"));
		btnNewButton.setBounds(48, 208, 89, 23);
		adminpage.getContentPane().add(btnNewButton);
	}
}