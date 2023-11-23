package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import models.UserLogin;


public class JdbcLogin {
	//io in database
	public UserLogin login(UserLogin user) {
		String sql = "SELECT * FROM customer_table WHERE user_name = ? AND password=?";
		try {
			//connect
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root","");
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, user.getUserName());
			pstat.setString(2, user.getUserPass());
			//run sql statement
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				user.setUser_id(rs.getInt("user_id"));
			}
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return user;
	}
}

