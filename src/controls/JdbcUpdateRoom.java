package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.RoomModels;

public class JdbcUpdateRoom {

	public boolean updateRoom(RoomModels room) {
		boolean result = false;
		String sql = "UPDATE room SET room_type = ?, room_price = ? ,room_availability = ? WHERE room_id = ?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
			PreparedStatement pstat = con.prepareStatement(sql);
			pstat.setInt(4, room.getRoomId());
			pstat.setString(1, room.getRoomType());
			pstat.setInt(2, room.getRoomPrice());
			pstat.setString(3, room.getRoomAvailability());
			pstat.executeUpdate();
			pstat.close();
			con.close();
			result = true;
		}
		catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return result;
	}
}
