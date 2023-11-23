package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controls.JdbcUpdateCustomer;
import models.UpdateCustomer;

public class CustomerProfile implements ListSelectionListener, ActionListener {
	//declaring variables
	JFrame frame;
	JPanel panelBackground;
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	JLabel lblEmail, lblLastName, lblFirstName, lblPhoneNumber, lblCountry, lblCity, lblZipCode, lblUserId, lblGender,
			lblAge, lblUserName, lblPassword, lblCreditCard, lblProfile;
	JTextField txtUserId, txtFirstName, txtLastName, txtAge, txtGender, txtCountry, txtCity, txtUserName, txtPassword,
			txtCreditCard, txtZipCode, txtEmail, txtPhoneNumber;
	JButton btnUpdate, btnBack;

	public CustomerProfile() {
		//initializing variables
		frame = new JFrame();
		lblGender = new JLabel();
		lblAge = new JLabel();
		lblUserName = new JLabel();
		lblPassword = new JLabel();
		lblCreditCard = new JLabel();
		panelBackground = new JPanel();
		tableModel = new DefaultTableModel();
		table1 = new JTable();
		scroll = new JScrollPane(table1);
		lblZipCode = new JLabel();
		txtFirstName = new JTextField();
		txtUserId = new JTextField();
		txtLastName = new JTextField();
		txtAge = new JTextField();
		txtGender = new JTextField();
		txtGender = new JTextField();
		lblEmail = new JLabel();
		txtCountry = new JTextField();
		lblLastName = new JLabel();
		txtCity = new JTextField();
		txtUserName = new JTextField();
		txtPassword = new JTextField();
		txtCreditCard = new JTextField();
		txtZipCode = new JTextField();
		txtEmail = new JTextField();
		txtPhoneNumber = new JTextField();
		lblPhoneNumber = new JLabel();
		lblUserId = new JLabel();
		lblFirstName = new JLabel();
		lblCountry = new JLabel();
		lblCity = new JLabel();
		btnUpdate = new JButton();
		btnBack = new JButton();
		lblProfile = new JLabel();

		//properties of frame
		frame.setTitle("View Profile");
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		panelBackground.setLayout(null);
		panelBackground.setBounds(0, 0, 1200, 800);
		panelBackground.setBackground(Color.black);

		//header column of table
		String[] columnNames = { "user_id", "first_name", "last_name", "email", "phone_number", "country", "city",
				"zip_code", "gender", "age", "user_name", "password", "credit_card" };
		tableModel.setColumnIdentifiers(columnNames);
		//setting table model
		table1.setModel(tableModel);
		//disable edit of cells of table
		table1.setDefaultEditor(Object.class, null);
		//auto resizing all the column size according to table width
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		// Set the table to fill the height of the viewport
		table1.setFillsViewportHeight(true);
		// Adding list selection listener to the table
		table1.getSelectionModel().addListSelectionListener(this);

		
		scroll.setBounds(2, 150, 1185, 60);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		//getting table header and setting background color to black and text color to white
		JTableHeader header = table1.getTableHeader();
		header.setBackground(Color.black);
		header.setForeground(Color.white);

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establishing connection with the hotelmanagement database 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
			//sql statement to retreive data from customer table
			String sql = "SELECT * FROM customer_table WHERE user_id = ?";
			//preparing statement with sql
			PreparedStatement pstat = conn.prepareStatement(sql);
			//setting user id 
			pstat.setInt(1, LoginTest.userid);
			//executing sql query and retrieving result
			ResultSet rs = pstat.executeQuery();
			//storing data of customer from customer table in different variable
			while (rs.next()) {
				int user_id = rs.getInt("user_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				String phone_number = rs.getString("phone_number");
				String country = rs.getString("country");
				String city = rs.getString("city");
				int zip_code = rs.getInt("zip_code");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");
				String user_name = rs.getString("user_name");
				String password = rs.getString("password");
				String credit_card = rs.getString("credit_card");

				//adding a row in table with retrieved data
				tableModel.addRow(new Object[] { user_id, first_name, last_name, email, phone_number, country, city,
						zip_code, gender, age, user_name, password, credit_card });
			}

			// Close the result set, statement, and connection
			rs.close();
			pstat.close();
			conn.close();
			// Catch any exceptions that occur during the database operation and print the error message to the console
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		lblUserId.setText("User Id:");
		lblUserId.setBounds(50, 350, 150, 30);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblFirstName.setText("First Name:");
		lblFirstName.setBounds(450, 350, 150, 30);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblLastName.setText("Last Name:");
		lblLastName.setBounds(850, 350, 150, 30);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblEmail.setText("Email:");
		lblEmail.setBounds(50, 420, 150, 30);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblPhoneNumber.setText("Phone Number:");
		lblPhoneNumber.setBounds(420, 420, 200, 30);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblCountry.setText("Country:");
		lblCountry.setBounds(845, 420, 200, 30);
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblCity.setText("City:");
		lblCity.setBounds(50, 490, 150, 30);
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblZipCode.setText("Zip Code:");
		lblZipCode.setBounds(450, 490, 150, 30);
		lblZipCode.setForeground(Color.WHITE);
		lblZipCode.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblGender.setText("Gender:");
		lblGender.setBounds(845, 490, 150, 30);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblAge.setText("Age:");
		lblAge.setBounds(50, 560, 150, 30);
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblUserName.setText("User Name:");
		lblUserName.setBounds(450, 560, 150, 30);
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblPassword.setText("Password:");
		lblPassword.setBounds(845, 560, 150, 30);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblCreditCard.setText("Credit Card:");
		lblCreditCard.setBounds(50, 630, 150, 30);
		lblCreditCard.setForeground(Color.WHITE);
		lblCreditCard.setFont(new Font("Pacifico", Font.BOLD, 24));

		txtUserId.setBounds(220, 350, 150, 35);
		txtUserId.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtUserId.setEditable(false);
		txtFirstName.setBounds(620, 350, 150, 35);
		txtFirstName.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtLastName.setBounds(1020, 350, 150, 35);
		txtLastName.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtEmail.setBounds(220, 420, 150, 35);
		txtEmail.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtPhoneNumber.setBounds(620, 420, 150, 35);
		txtPhoneNumber.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtCountry.setBounds(1020, 420, 150, 35);
		txtCountry.setFont(new Font("Pacifico", Font.BOLD, 16));
		txtCity.setBounds(220, 490, 150, 35);
		txtCity.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtZipCode.setBounds(620, 490, 150, 35);
		txtZipCode.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtGender.setBounds(1020, 490, 150, 35);
		txtGender.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtAge.setBounds(220, 560, 150, 35);
		txtAge.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtUserName.setBounds(620, 560, 150, 35);
		txtUserName.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtPassword.setBounds(1020, 560, 150, 35);
		txtPassword.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtCreditCard.setBounds(220, 630, 150, 35);
		txtCreditCard.setFont(new Font("Pacifico", Font.BOLD, 18));

		lblProfile.setText(LoginTest.username + "'s Profile");
		lblProfile.setBounds(95, 50, 900, 60);
		lblProfile.setFont(new Font("Pacifico", Font.BOLD, 40));
		lblProfile.setForeground(new Color(255, 255, 204));

		btnUpdate.setText("Update");
		btnUpdate.setBounds(500, 700, 200, 45);
		btnUpdate.setFocusable(false);
		btnUpdate.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(255, 255, 200));
		btnUpdate.setForeground(Color.black);
		btnUpdate.setBorder(null);
		btnUpdate.addActionListener(this);
		btnUpdate.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				//changing background color and adding border in button when mouse enters(hover)
				btnUpdate.setBackground(new Color(197, 197, 170));
				btnUpdate.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				//changing background color and removing border when mouse exits
				btnUpdate.setBackground(new Color(255, 255, 200));
				btnUpdate.setBorder(null);
			}
		});

		btnBack.setText("Back");
		btnBack.setBounds(1000, 650, 110, 45);
		btnBack.setFocusable(false);
		btnBack.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnBack.setBackground(Color.white);
		btnBack.setBorder(null);
		btnBack.addActionListener(this);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnBack.setBackground(new Color(197, 197, 170));
				btnBack.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnBack.setBackground(Color.white);
				btnBack.setBorder(null);
			}
		});

		//adding components to panel and frame
		panelBackground.add(lblProfile);
		panelBackground.add(lblCreditCard);
		panelBackground.add(lblPassword);
		panelBackground.add(lblUserName);
		panelBackground.add(lblAge);
		panelBackground.add(lblGender);
		panelBackground.add(btnBack);
		panelBackground.add(btnUpdate);
		panelBackground.add(txtFirstName);
		panelBackground.add(txtEmail);
		panelBackground.add(txtLastName);
		panelBackground.add(txtUserId);
		panelBackground.add(txtPhoneNumber);
		panelBackground.add(lblCity);
		panelBackground.add(lblUserId);
		panelBackground.add(lblZipCode);
		panelBackground.add(lblFirstName);
		panelBackground.add(lblEmail);
		panelBackground.add(lblLastName);
		panelBackground.add(txtGender);
		panelBackground.add(lblPhoneNumber);
		panelBackground.add(txtAge);
		panelBackground.add(txtCreditCard);
		panelBackground.add(txtZipCode);
		panelBackground.add(txtUserName);
		panelBackground.add(txtPassword);
		panelBackground.add(txtCountry);
		panelBackground.add(txtCity);
		panelBackground.add(lblCountry);
		panelBackground.add(scroll);
		frame.add(panelBackground);

		frame.setVisible(true);

	}

	public void valueChanged(ListSelectionEvent event) {
		//adding corresponding texts on text fields when a row is selected
		if (event.getValueIsAdjusting()) {
			return;
		}
		// Getting the selected row from the table
		int selectedRow = table1.getSelectedRow();

		if (selectedRow == -1) {
			return;
		}

		DefaultTableModel model = (DefaultTableModel) table1.getModel();
		//storing value from table as object
		Object id = model.getValueAt(selectedRow, 0);
		Object firstName = model.getValueAt(selectedRow, 1);
		Object lastName = model.getValueAt(selectedRow, 2);
		Object email = model.getValueAt(selectedRow, 3);
		Object phoneNumber = model.getValueAt(selectedRow, 4);
		Object country = model.getValueAt(selectedRow, 5);
		Object city = model.getValueAt(selectedRow, 6);
		Object zipCode = model.getValueAt(selectedRow, 7);
		Object gender = model.getValueAt(selectedRow, 8);
		Object age = model.getValueAt(selectedRow, 9);
		Object userName = model.getValueAt(selectedRow, 10);
		Object password = model.getValueAt(selectedRow, 11);
		Object creditCard = model.getValueAt(selectedRow, 12);

		// Setting the value of corresponding text fields with row values
		txtUserId.setText(id.toString());
		txtFirstName.setText(firstName.toString());
		txtLastName.setText(lastName.toString());
		txtEmail.setText(email.toString());
		txtPhoneNumber.setText(phoneNumber.toString());
		txtCountry.setText(country.toString());
		txtCity.setText(city.toString());
		txtZipCode.setText(zipCode.toString());
		txtGender.setText(gender.toString());
		txtAge.setText(age.toString());
		txtUserName.setText(userName.toString());
		txtPassword.setText(password.toString());
		txtCreditCard.setText(creditCard.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnUpdate) {
			try {
				// Creating an instance of the UpdateCustomer class
				UpdateCustomer user = new UpdateCustomer();
				// Creating an instance of the JdbcUpdateCustomer class
				JdbcUpdateCustomer jdbc = new JdbcUpdateCustomer();
				//taking value from text fields and setting its value to object of UpdateCustomer
				user.setAge(Integer.parseInt(txtAge.getText()));
				user.setFirstName(txtFirstName.getText());
				user.setLastName(txtLastName.getText());
				user.setCity(txtCity.getText());
				user.setCountry(txtCountry.getText());
				user.setEmail(txtEmail.getText());
				user.setCreditCard(txtCreditCard.getText());
				user.setGender(txtGender.getText());
				user.setPassword(txtPassword.getText());
				user.setUserName(txtUserName.getText());
				user.setPhoneNumber(Integer.parseInt(txtPhoneNumber.getText()));
				user.setZipCode(Integer.parseInt(txtZipCode.getText()));
				user.setUserId(Integer.parseInt(txtUserId.getText()));
				//calling update method from JdbcUpdateCustomer class
				boolean result = jdbc.update(user);
				if (result) {
					//success message
					JOptionPane.showMessageDialog(frame, "Record Updated");
					//creating new CustomerProfile window
					new CustomerProfile();
					//disposing current frame
					frame.dispose();
				} else {
					//error message
					JOptionPane.showMessageDialog(frame, "Record failed to update");
				}
			} catch (Exception ex) {
				//error message
				JOptionPane.showMessageDialog(frame, ex.getMessage());
			}
		} else if (e.getSource() == btnBack) {
			//going back to Settings window
			new Settings();
			//disposing current window
			frame.dispose();
		}
	}

	public static void main(String[] args) {
		// Creating an instance of the CustomerProfile class and launching the CustomerProfile page
		new CustomerProfile();
	}

}