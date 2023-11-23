package views;
//importing
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;
import javax.swing.border.Border;

import controls.ManageLogin;
import errorhandling.EmptyField;
import models.UserLogin;


public class LoginPage implements ActionListener {
	// declaring all the variable that is used
	JFrame frame;
	JLabel lblHotel_name;
	JLabel lblPhoneNumber;
	JLabel lblEmail;
	JLabel lblUser_name;
	JLabel lblPassword;
	JLabel lblSlogan;
	JLabel lblContact;
	JButton btnSignIn;
	JButton btnRegister;
	JButton btnClose;
	JPanel panelBackground;
	JPanel panelBackground2;
	JPanel panelBackground3;
	JPanel panelContainer;
	Border border;
	Border border2;
	JTextField txtUser_name;
	JPasswordField txtPassword;
	JLabel lblStaffLogin;

	public LoginPage() {
		
		// initializing all the variables that are declared
		frame = new JFrame();
		lblHotel_name = new JLabel();
		lblUser_name = new JLabel();
		btnSignIn = new JButton();
		btnRegister = new JButton();
		panelBackground = new JPanel();
		panelBackground2 = new JPanel();
		panelContainer = new JPanel();
		lblContact = new JLabel();
		lblPassword = new JLabel();
		btnClose = new JButton();
		lblSlogan = new JLabel();
		lblEmail = new JLabel();
		lblPhoneNumber = new JLabel();
		txtUser_name = new JTextField();
		txtPassword = new JPasswordField();
		lblStaffLogin = new JLabel();
		
		border = BorderFactory.createLineBorder(Color.RED, 2);
		border2 = BorderFactory.createLineBorder(Color.BLACK, 2);

		//setting properties of this frame
		frame.setTitle("Login Page");
		frame.setLayout(null);
		frame.setSize(614, 638);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		//setting properties of background panels
		panelBackground.setBackground(new Color(220, 200, 255));
		panelBackground.setBounds(0, 0, 300, 300);
		//setting a border which is red in color
		panelBackground.setBorder(border);
		//setting layout of background to null
		panelBackground.setLayout(null);

		//setting background color of panel
		panelBackground2.setBackground(new Color(179, 255, 179));
		panelBackground2.setBounds(300, 300, 300, 300);
		panelBackground2.setBorder(border);
		panelBackground2.setLayout(null);

		panelContainer.setBackground(new Color(218, 238, 255));
		panelContainer.setBounds(75, 75, 450, 450);
		panelContainer.setBorder(border2);
		panelContainer.setLayout(null);

		//setting text to label
		lblUser_name.setText("User Name :");
		//setting bounds of label
		lblUser_name.setBounds(40, 20, 80, 30);
		//setting font and font size
		lblUser_name.setFont(new Font("Serif", Font.PLAIN, 16));

		lblHotel_name.setText("Luton Hotel");
		lblHotel_name.setBounds(20, 20, 150, 30);
		lblHotel_name.setFont(new Font("Monotype Corsiva", Font.PLAIN, 32));

		lblSlogan.setText("Where every stay is a memorable experience.");
		lblSlogan.setBounds(20, 40, 250, 30);
		lblSlogan.setFont(new Font("Serif", Font.PLAIN, 12));

		lblPassword.setText("Password :");
		lblPassword.setBounds(40, 120, 80, 30);
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 16));

		lblContact.setText("Contact us :");
		lblContact.setBounds(40, 340, 200, 30);
		lblContact.setFont(new Font("Serif", Font.BOLD, 20));

		lblPhoneNumber.setText("5578484 , +9779821458799");
		lblPhoneNumber.setBounds(40, 370, 200, 30);
		lblPhoneNumber.setFont(new Font("Serif", Font.PLAIN, 16));

		lblEmail.setText("lutonhotelcustomerservice@gmail.com");
		lblEmail.setBounds(40, 390, 250, 30);
		lblEmail.setFont(new Font("Serif", Font.PLAIN, 16));

		//setting bounds in text field
		txtUser_name.setBounds(50, 60, 350, 50);
		txtPassword.setBounds(50, 160, 350, 50);

		//setting text in button
		btnSignIn.setText("SIGN IN");
		btnSignIn.setBounds(90, 240, 130, 40);
		//adding action listener to sign in button
		btnSignIn.addActionListener(this);
		//changing color of button
		btnSignIn.setBackground(new Color(255, 223, 180));

		btnRegister.setText("REGISTER");
		btnRegister.setBounds(230, 240, 130, 40);
		//adding action listener to register button
		btnRegister.addActionListener(this);
		btnRegister.setBackground(new Color(255, 223, 180));

		btnClose.setText("CLOSE");
		btnClose.setBounds(160, 290, 130, 40);
		btnClose.addActionListener(this);
		btnClose.setBackground(new Color(255, 223, 180));
		
		//setting label of staff login which when clicked opens another frame
		lblStaffLogin.setText("Login As Staff");
		lblStaffLogin.setBounds(170, 210, 100, 20);
		lblStaffLogin.setForeground(Color.red);
		lblStaffLogin.setFont(new Font("Serif", Font.BOLD, 16));
		//adding mouse listener to label
		lblStaffLogin.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	//launching StaffLogin page when label is clicked and disposing the current frame
		    	new StaffLogin();
		    	frame.dispose();
		    	
		    }
		});

		//adding components in panel container
		panelContainer.add(lblStaffLogin);
		panelContainer.add(lblEmail);
		panelContainer.add(btnRegister);
		panelContainer.add(lblPhoneNumber);
		panelContainer.add(btnSignIn);
		panelContainer.add(lblContact);
		panelContainer.add(txtPassword);
		panelContainer.add(txtUser_name);
		panelContainer.add(lblUser_name);
		panelContainer.add(lblPassword);
		panelBackground.add(lblHotel_name);
		panelBackground.add(lblSlogan);
		panelContainer.add(btnClose);
		
		//adding panels to frame
		frame.add(panelContainer);
		frame.add(panelBackground);
		frame.add(panelBackground2);

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			//disposing the frame if close button is clicked
			frame.dispose();
		}
		else if (e.getSource()==btnSignIn) {
			//signing in user after checking their username and password
			try {
				//displays error if username and password are missing
				if (txtUser_name.getText().isEmpty() && txtPassword.getText().isEmpty()) {
					throw new EmptyField("Username and Password should not be empty");
			
				}
				//displaying error if either of username or password field is empty
				else if (txtUser_name.getText().isEmpty()) {
					throw new EmptyField("Username is empty");
				}
				else if (txtPassword.getText().isEmpty()) {
					throw new EmptyField("Password is empty");
				
					
				}
				//creating a object of UserLogin class to login user
				UserLogin user = new UserLogin();
				//creating object of ManageLogin class
				ManageLogin userManager = new ManageLogin();
				user.setUserName(txtUser_name.getText());
				user.setUserPass(txtPassword.getText());
				userManager.setUser(user);
				//calling method of ManageLogin class
				userManager.login();
				user = userManager.getUser();
				if(user.getUser_id()>=1) {
					//making value of username and userid global so that it can be accessed after logging in
					LoginTest.username =user.getUserName();
					LoginTest.userid = user.getUser_id();
					//welcome message
					JOptionPane.showMessageDialog(frame, "Welcome !");
					//display mainwindow
					new MainDashboard();
					//disposing current frame
					frame.dispose();
					
				}
				else {
					//displaying error message if we enter wrong username or password
					JOptionPane.showMessageDialog(frame, "Error: user/password");
				}
				

			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(frame, ex.getMessage());
			}
		}
		else if (e.getSource() == btnRegister) {
			//creating instance of register page and disposing current frame if register button is clicked
			frame.dispose();
			new Register();
			
	
		}
	}

	public static void main(String[] args) {
		// Creating an instance of the LoginPage class and launching the login page
		new LoginPage();

	}

}
