package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import models.UserRegistration;

public class JdbcRegistration {

	
	public boolean register(UserRegistration user) {
		boolean r = false;
		String sql = "INSERT INTO customer_table ( `first_name`, `last_name`, `email`, `phone_number`, `country`, `city`, `zip_code`, `gender`, `age`, `user_name`, `password`, `credit_card`, `customer_type`)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, user.getFirstName());
			pstat.setString(2, user.getLastName());
			pstat.setString(3, user.getEmail());
			pstat.setInt(4, user.getPhoneNumber());
			pstat.setString(5, user.getCountry());
			pstat.setString(6, user.getCity());
			pstat.setInt(7, user.getZipCode());
			pstat.setString(8, user.getGender());
			pstat.setInt(9, user.getAge());
			pstat.setString(10, user.getUserName());
			pstat.setString(11, user.getPassword());
			pstat.setString(12, user.getCreditCard());
			pstat.setString(13, user.getCustomerType());
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			r = true;
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return r;
	}
}
