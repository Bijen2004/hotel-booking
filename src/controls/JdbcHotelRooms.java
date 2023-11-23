package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.HotelRoomModel;

public class JdbcHotelRooms {

		public boolean assign(HotelRoomModel hotelRoom) {
			boolean result = false;
			String sql = "UPDATE hotel_rooms SET room_status = 'booked' WHERE room_no =?";
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
				PreparedStatement pstat = con.prepareStatement(sql);
				pstat.setInt(1, hotelRoom.getRoomNo());
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
