package views;

// password = 1234         			////////////+*********

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class StaffLogin implements ActionListener{
	//declaring variables
	JFrame frame;
	JLabel lblPassword;
	JTextField txtPassword;
	JButton btnLogin;
	
	public StaffLogin() {
		//initializing variables
		frame  = new JFrame();
		lblPassword = new JLabel();
		txtPassword = new JTextField();
		btnLogin= new JButton();
		
		//properties of frame
		frame.setSize(300,180);
		frame.setTitle("WELCOME");
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		
		lblPassword.setText("Enter Password");
		lblPassword.setBounds(20,30,100,20);
		lblPassword.setForeground(Color.red);
		
		txtPassword.setBounds(30,60,240,30);
		
		btnLogin.setBounds(110,100,80,35);
		btnLogin.setText("LOGIN");
		btnLogin.setBackground(Color.black);
		btnLogin.setForeground(Color.white);
		btnLogin.addActionListener(this);
		
		//adding components in frame 
		frame.add(btnLogin);
		frame.add(txtPassword);
		frame.add(lblPassword);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		//launching staff login class
		new StaffLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//getting password from password field
		int password = Integer.parseInt(txtPassword.getText());
		//checking password
		if(password == 1234) {
			//launching receptionist booking view page and disposing current frame if pawword is correct
			new ReceptionistBookingView();
			frame.dispose();
		}
		else {
			//error message if password message is wrong
			JOptionPane.showMessageDialog(frame, "Password incorrect");
		}
	}

}
