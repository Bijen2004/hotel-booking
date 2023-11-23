package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import controls.JdbcRegistration;
import models.UserRegistration;

public class Register implements ActionListener {

	// declaring all the variables that is going to be used

	JFrame frame;
	JPanel panelBackground;
	JPanel panelContainer;
	Border border;
	JLabel lblLastName;
	JLabel lblFirstName;
	JLabel lblPhoneNumber;
	JLabel lblEmail;
	JLabel lblUser_name;
	JLabel lblPassword;
	JLabel lblAddress;
	JLabel lblName;
	JTextField txtUser_name;
	JTextField txtFirstName;
	JTextField txtLastName;
	JTextField txtPhone_Number;
	JTextField txtEmail;
	JTextField txtCard;
	JTextField txtAddressCountry;
	JPasswordField txtPassword;
	JButton btnBack;
	JButton btnClose;
	JButton btnRegister;
	JLabel lblRegister;
	JLabel lblSlogan;
	JLabel lblCreditCardFormat;
	JLabel lblCreditCard;
	JLabel lblPhoneNumberValidation;
	JLabel lblEmailExample;
	JTextField txtAddressPostalCode;
	JTextField txtCreditCard;
	JLabel lblAddressPostalCode;
	JTextField txtAddressCity;
	JLabel lblAddressCountry;
	JLabel lblAddressCity;
	JRadioButton radioButtonMale;
	JRadioButton radioButtonFemale;
	JLabel lblGender;
	JLabel lblConfirmPassword;
	JLabel lblAge;
	JPasswordField txtConfirmPassword;
	JTextField txtAge;
	JLabel lblCustomerType;
	JComboBox typeBox;

	public Register() {

		// initializing variables that are declared

		frame = new JFrame();
		panelBackground = new JPanel();
		lblFirstName = new JLabel();
		lblLastName = new JLabel();
		panelContainer = new JPanel();
		lblEmail = new JLabel();
		lblPhoneNumber = new JLabel();
		lblUser_name = new JLabel();
		lblPassword = new JLabel();
		lblAddress = new JLabel();
		lblName = new JLabel();
		lblAge = new JLabel();
		txtUser_name = new JTextField();
		txtCreditCard = new JTextField();
		txtFirstName = new JTextField();
		txtLastName = new JTextField();
		txtPhone_Number = new JTextField();
		txtEmail = new JTextField();
		txtAddressCountry = new JTextField();
		txtPassword = new JPasswordField();
		btnBack = new JButton();
		btnRegister = new JButton();
		btnClose = new JButton();
		lblRegister = new JLabel();
		lblSlogan = new JLabel();
		lblCreditCardFormat = new JLabel();
		lblCreditCard = new JLabel();
		lblEmailExample = new JLabel();
		lblPhoneNumberValidation = new JLabel();
		txtAddressPostalCode = new JTextField();
		lblAddressPostalCode = new JLabel();
		txtAddressCity = new JTextField();
		lblAddressCountry = new JLabel();
		lblAddressCity = new JLabel();
		radioButtonMale = new JRadioButton();
		radioButtonFemale = new JRadioButton();
		lblGender = new JLabel();
		lblConfirmPassword = new JLabel();
		txtConfirmPassword = new JPasswordField();
		txtAge = new JTextField();
		lblCustomerType = new JLabel();

		border = BorderFactory.createLineBorder(Color.BLACK, 2);

		// set the properties of Frame
		frame.setTitle("Register Page");
		frame.setLayout(null);
		frame.setSize(714, 720);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		// set properties of panel background
		panelBackground.setBackground(Color.BLACK);
		panelBackground.setBounds(30, 0, 640, 90);
		panelBackground.setLayout(null);

		// set properties of panel container
		panelContainer.setBackground(new Color(218, 238, 255));
		panelContainer.setBounds(30, 40, 640, 640);
		panelContainer.setBorder(border);
		panelContainer.setLayout(null);

		// setting the text for label
		lblRegister.setText("REGISTER NOW !!!");
		lblRegister.setBounds(45, 15, 330, 32);
		// adding font to label
		lblRegister.setFont(new Font("Serif", Font.BOLD, 28));
		// changing the text color of label
		lblRegister.setForeground(Color.red);

		lblSlogan.setText("Book your stay with us and experience exceptional hospitality at its finest!");
		lblSlogan.setBounds(45, 50, 550, 30);
		lblSlogan.setFont(new Font("Serif", Font.PLAIN, 16));
		lblSlogan.setForeground(Color.white);

		lblName.setText("Name");
		lblName.setBounds(30, 60, 130, 20);
		lblName.setFont(new Font("Serif", Font.BOLD, 20));

		lblFirstName.setText("First Name");
		lblFirstName.setBounds(30, 125, 130, 15);
		lblFirstName.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblFirstName.setForeground(Color.GRAY);

		lblLastName.setText("Last Name");
		lblLastName.setBounds(330, 125, 130, 15);
		lblLastName.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblLastName.setForeground(Color.GRAY);

		lblEmail.setText("Email");
		lblEmail.setBounds(30, 150, 130, 20);
		lblEmail.setFont(new Font("Serif", Font.BOLD, 20));

		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(330, 150, 130, 20);
		lblPhoneNumber.setFont(new Font("Serif", Font.BOLD, 20));

		lblEmailExample.setText("example@example.com");
		lblEmailExample.setBounds(30, 215, 130, 15);
		lblEmailExample.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblEmailExample.setForeground(Color.GRAY);

		lblPhoneNumberValidation.setText("Please enter a valid phone number.");
		lblPhoneNumberValidation.setBounds(330, 215, 200, 15);
		lblPhoneNumberValidation.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblPhoneNumberValidation.setForeground(Color.GRAY);

		lblAddress.setText("Address");
		lblAddress.setBounds(30, 240, 130, 20);
		lblAddress.setFont(new Font("Serif", Font.BOLD, 20));

		lblAddressPostalCode.setText("Postal / Zip Code");
		lblAddressPostalCode.setBounds(430, 305, 200, 15);
		lblAddressPostalCode.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblAddressPostalCode.setForeground(Color.GRAY);

		lblAddressCountry.setText("Country");
		lblAddressCountry.setBounds(30, 305, 130, 15);
		lblAddressCountry.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblAddressCountry.setForeground(Color.GRAY);

		lblAddressCity.setText("City / Town");
		lblAddressCity.setBounds(230, 305, 130, 15);
		lblAddressCity.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblAddressCity.setForeground(Color.GRAY);

		lblGender.setText("Gender");
		lblGender.setBounds(30, 335, 130, 20);
		lblGender.setFont(new Font("Serif", Font.BOLD, 20));

		radioButtonMale.setBounds(150, 335, 80, 25);
		radioButtonMale.setText("Male");
		radioButtonMale.setBackground(new Color(218, 238, 255));
		radioButtonMale.setFocusable(false);

		radioButtonFemale.setBounds(240, 335, 80, 25);
		radioButtonFemale.setText("Female");
		radioButtonFemale.setBackground(new Color(218, 238, 255));
		radioButtonFemale.setFocusable(false);

		ButtonGroup bg = new ButtonGroup();
		bg.add(radioButtonMale);
		bg.add(radioButtonFemale);

		lblUser_name.setText("User Name");
		lblUser_name.setBounds(30, 370, 130, 20);
		lblUser_name.setFont(new Font("Serif", Font.BOLD, 20));

		lblPassword.setText("Password");
		lblPassword.setBounds(30, 445, 130, 20);
		lblPassword.setFont(new Font("Serif", Font.BOLD, 20));

		lblConfirmPassword.setText(" Confirm Password");
		lblConfirmPassword.setBounds(330, 445, 230, 20);
		lblConfirmPassword.setFont(new Font("Serif", Font.BOLD, 20));

		lblAge.setText("Age");
		lblAge.setBounds(340, 335, 100, 25);
		lblAge.setFont(new Font("Serif", Font.BOLD, 20));

		lblCustomerType.setText("Customer Type");
		lblCustomerType.setBounds(360, 525, 150, 25);
		lblCustomerType.setFont(new Font("Serif", Font.BOLD, 20));

		// setting bounds for text fields
		txtFirstName.setBounds(30, 90, 280, 35);
		txtLastName.setBounds(330, 90, 280, 35);
		txtEmail.setBounds(30, 180, 280, 35);
		txtPhone_Number.setBounds(330, 180, 280, 35);
		txtAddressCountry.setBounds(30, 270, 180, 35);
		txtAddressCity.setBounds(230, 270, 180, 35);
		txtAddressPostalCode.setBounds(430, 270, 180, 35);
		txtUser_name.setBounds(30, 400, 580, 35);
		txtPassword.setBounds(30, 475, 280, 35);
		txtConfirmPassword.setBounds(330, 475, 280, 35);
		txtAge.setBounds(400, 335, 210, 35);
		txtCreditCard.setBounds(150, 525, 200, 35);

		btnRegister.setText("Register");
		btnRegister.setBounds(240, 580, 150, 40);
		// adding action listener to button
		btnRegister.addActionListener(this);
		// changing button background to black
		btnRegister.setBackground(Color.black);
		// changing text color of button to white
		btnRegister.setForeground(Color.white);
		btnRegister.setFocusable(false);

		btnBack.setText("BACK");
		btnBack.setBounds(50, 580, 150, 40);
		// adding action listener
		btnBack.addActionListener(this);
		btnBack.setBackground(Color.black);
		btnBack.setForeground(Color.white);
		btnBack.setFocusable(false);

		btnClose.setText("CLOSE");
		btnClose.setBounds(430, 580, 150, 40);
		btnClose.addActionListener(this);
		btnClose.setBackground(Color.black);
		btnClose.setForeground(Color.white);
		btnClose.setFocusable(false);

		lblCreditCard.setText("Credit Card");
		lblCreditCard.setFont(new Font("Serif", Font.BOLD, 20));
		lblCreditCard.setBounds(30, 530, 150, 20);

		lblCreditCardFormat.setText("'xxxx xxxx xxxx xxxx'");
		lblCreditCardFormat.setBounds(150, 560, 150, 15);
		lblPhoneNumberValidation.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblPhoneNumberValidation.setForeground(Color.GRAY);

		// setting options for combo box
		String type[] = { "Non-Corporate", "Corporate" };
		// initializing combo box
		typeBox = new JComboBox(type);
		typeBox.setBounds(500, 525, 110, 35);
		typeBox.setFocusable(false);
		typeBox.setBackground(Color.white);

		// adding components to panel container
		panelContainer.add(typeBox);
		panelContainer.add(lblCustomerType);
		panelContainer.add(lblCreditCardFormat);
		panelContainer.add(lblCreditCard);
		panelContainer.add(txtCreditCard);
		panelContainer.add(btnClose);
		panelContainer.add(btnBack);
		panelContainer.add(txtAge);
		panelContainer.add(lblAge);
		panelContainer.add(txtConfirmPassword);
		panelContainer.add(lblConfirmPassword);
		panelContainer.add(txtUser_name);
		panelContainer.add(txtPassword);
		panelContainer.add(lblUser_name);
		panelContainer.add(lblPassword);
		panelContainer.add(radioButtonFemale);
		panelContainer.add(radioButtonMale);
		panelContainer.add(lblGender);
		panelContainer.add(lblAddressCity);
		panelContainer.add(lblAddressCountry);
		panelContainer.add(txtAddressCity);
		panelContainer.add(lblAddressPostalCode);
		panelContainer.add(btnRegister);
		panelContainer.add(txtAddressPostalCode);
		panelContainer.add(lblAddress);
		panelContainer.add(txtAddressCountry);
		panelContainer.add(lblEmailExample);
		panelContainer.add(lblPhoneNumberValidation);
		panelContainer.add(txtPhone_Number);
		panelContainer.add(txtEmail);
		panelContainer.add(lblPhoneNumber);
		panelContainer.add(lblEmail);
		panelContainer.add(lblFirstName);
		panelContainer.add(lblLastName);
		panelContainer.add(lblName);
		panelContainer.add(txtFirstName);
		panelContainer.add(txtLastName);

		// adding panelBackground and panelContainer to frame
		frame.add(panelBackground);
		frame.add(panelContainer);

		// adding components in panelBackground
		panelBackground.add(lblRegister);
		panelBackground.add(lblSlogan);

		frame.setVisible(true);

	}

	public static void main(String[] args) {
		// Creating an instance of the Register class and launching the registration page
		
		new Register();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			// disposing the frame if close button is clicked
			frame.dispose();
		} else if (e.getSource() == btnBack) {
			// launching LoginPage if back button is clicked and disposing the current frame
			new LoginPage();
			frame.dispose();
		} else if (e.getSource() == btnRegister) {
			String firstName = "";
			// Adding validation for the first name field
			if (!txtFirstName.getText().isEmpty()) {
				// Assigning the value of the first name field to the firstName variable
				firstName = txtFirstName.getText();
			} else {
				// Displaying an error message if the first name field is empty
				JOptionPane.showMessageDialog(null, "Please enter a first name.");
				return;
			}

			String lastName = "";
			// Adding validation for the last name field
			if (!txtLastName.getText().isEmpty()) {
				// Assigning the value of the last name field to the lastName variable
				lastName = txtLastName.getText();
			} else {
				// Displaying an error message if the last name field is empty
				JOptionPane.showMessageDialog(null, "Please enter a last name.");
				return;
			}

			String email = "";
			// Adding validation for the email field
			if (!txtEmail.getText().isEmpty()) {
				// Assigning the value of the email field to the email variable
				email = txtEmail.getText();
			} else {
				// Displaying an error message if the email field is empty
				JOptionPane.showMessageDialog(null, "Please enter an email.");
				return;
			}

			int phoneNumber = 0;
			// Adding validation for the phone number field
			if (!txtPhone_Number.getText().isEmpty()) {
				// assigning phoneNumber variable
				phoneNumber = Integer.parseInt(txtPhone_Number.getText());
			} else {
				// Displaying an error message if the phone number field is empty
				JOptionPane.showMessageDialog(null, "Please enter a phone number.");
				return;
			}

			String country = txtAddressCountry.getText();

			String city = txtAddressCity.getText();

			int zipCode = 0;
			// Adding validation for the zip code field
			if (!txtAddressPostalCode.getText().isEmpty()) {
				// Parsing the value of the zip code field to an integer and assigning it to the
				// zipCode variable
				zipCode = Integer.parseInt(txtAddressPostalCode.getText());
			} else {
				// Displaying an error message if the zip code field is empty
				JOptionPane.showMessageDialog(null, "Please enter a zip code.");
				return;
			}

			String gender = "";
			// Adding validation for the gender field
			if (radioButtonMale.isSelected()) {
				gender = "Male";
			} else if (radioButtonFemale.isSelected()) {
				gender = "Female";
			} else {
				// Displaying an error message if the gender field is not selected
				JOptionPane.showMessageDialog(null, "Please select a gender.");
				return;
			}

			int age = 0;
			// Adding validation for the age field
			if (!txtAge.getText().isEmpty()) {
				// Parsing the value of the age field to an integer and assigning it to the age
				// variable
				age = Integer.parseInt(txtAge.getText());
			} else {
				// Displaying an error message if the age field is empty
				JOptionPane.showMessageDialog(null, "Please enter an age.");
				return;
			}

			String userName = "";
			// Adding validation for the username field
			if (!txtUser_name.getText().isEmpty()) {
				// Assigning the value of the username field to the userName variable
				userName = txtUser_name.getText();
			} else {
				// Displaying an error message if the username field is empty
				JOptionPane.showMessageDialog(null, "Please enter a username.");
				return;
			}

			// checking if the password is matched with confirm password
			boolean passwordsMatch = txtPassword.getText().equals(txtConfirmPassword.getText());
			String password = "";
			if (!txtPassword.getText().isEmpty()) {
				if (passwordsMatch) {
					// assigning value if password matched
					password = txtPassword.getText();
				}
				else {
					// displaying error message if password not matched
					JOptionPane.showMessageDialog(frame, "password not matched");
					return;
				}
			}
			else {
				JOptionPane.showMessageDialog(frame, "Please enter a password");
				return;
			}

			String creditCard = "";
			// Adding validation for the credit card field
			if (!txtCreditCard.getText().isEmpty()) {
				// Assigning the value of the credit card field to the creditCard variable
				creditCard = txtCreditCard.getText();
			} else {
				// Displaying an error message
				JOptionPane.showMessageDialog(null, "Please enter credit card number.");
				return;
			}
			// getting the customer type (corporate/non-corporate)
			String customerType = typeBox.getSelectedItem().toString();

			// creating a object of UserRegistration to send information of user
			UserRegistration user = new UserRegistration(firstName, lastName, email, phoneNumber, country, city,
					zipCode, gender, age, userName, password, creditCard, customerType);

			// Creating object of JdbcRegistration to connect with database
			JdbcRegistration jdbc = new JdbcRegistration();

			// calling register method from JdbcRegistration class to register user
			boolean result = jdbc.register(user);

			if (result) {
				// displaying message that the user is registered
				JOptionPane.showMessageDialog(frame, "Record saved ");
				// creating instance of LoginPage class
				new LoginPage();
				// closing current frame
				frame.dispose();
			} else {
				// displaying error message
				JOptionPane.showMessageDialog(frame, "Record not saved");
			}
		}
	}
}
