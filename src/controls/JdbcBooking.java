package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import models.RoomModels;
import models.UserBooking;
import views.LoginTest;

public class JdbcBooking {

	public boolean room(RoomModels room, UserBooking book) {
		boolean r = false;
		String sql = "INSERT INTO room(`room_id`,`room_type`, `room_price`, `room_availability`) VALUES (?,?,?,?)";
		String bookingsql = "INSERT INTO booking (`check_in`, `check_out`, `childrens`, `adults`,`booking_status`, `user_id`, `room_id`) VALUES (?, ?, ?, ?, ?, ?,?)";

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
			PreparedStatement pstat = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstat.setInt(1, room.getRoomId());
			pstat.setString(2, room.getRoomType());
			pstat.setInt(3, room.getRoomPrice());
			pstat.setString(4, room.getRoomAvailability());

			pstat.executeUpdate();
			
			ResultSet result = pstat.getGeneratedKeys();
			int roomId = 0;
			if (result.next()) {

				roomId = result.getInt(1);
			}

		

			PreparedStatement pstat1 = con.prepareStatement(bookingsql);
			pstat1.setString(1, book.getCheckIn());
			pstat1.setString(2, book.getCheckOut());
			pstat1.setInt(3, book.getChildrens());
			pstat1.setInt(4, book.getAdults());
			pstat1.setString(5, book.getBookingStatus());
			pstat1.setInt(6, LoginTest.userid);
			pstat1.setInt(7, roomId);
			pstat1.executeUpdate();

			
			
			pstat.close();
			pstat1.close();
			con.close();
			
			
			r = true;

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			System.out.println(ex.getMessage());
	
		}

		return r;

	}

	
}
