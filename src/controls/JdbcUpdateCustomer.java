package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.UpdateCustomer;

public class JdbcUpdateCustomer {
	public boolean update(UpdateCustomer user) {
		String sql = "UPDATE customer_table SET `first_name`=?, `last_name`=?, `email`=?, `phone_number`=?, `country`=?, `city`=?, `zip_code`=?, `gender`=?, `age`=?, `user_name`=?, `password`=?, `credit_card`=? WHERE user_id =?";
		boolean r = false;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
			PreparedStatement pstat = con.prepareStatement(sql);
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
			pstat.setInt(13, user.getUserId());
			pstat.executeUpdate();
			pstat.close();
			con.close();
			r = true;
		}
		catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return r;
	}
}
