package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.UpdateBooking;

public class JdbcUpdateBooking {

	
	
	public boolean update(UpdateBooking booking) {
		boolean r = false;
		String sql = "UPDATE booking SET `check_in`=?, `check_out`=?, `childrens`=?, `adults`=?,`booking_status`=?,`room_no`=? WHERE `booking_id`=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
			PreparedStatement pstat = con.prepareStatement(sql);
			pstat.setString(1 , booking.getCheckIn());
			pstat.setString(2 , booking.getCheckOut());
			pstat.setInt(3 , booking.getChildrens());
			pstat.setInt(4 , booking.getAdults());
			pstat.setString(5 , booking.getBookingStatus());
			pstat.setInt(6 , booking.getRoomNo());
			pstat.setInt(7 , booking.getBookingId());
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
