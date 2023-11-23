package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HotelRooms {
	//declaring variables
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	JFrame frame;

	public HotelRooms() {
		//initializing frame
		frame = new JFrame();
		
		//properties of this frame
		frame.setTitle("Rooms");
		frame.setSize(450, 350);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		//setting heading column of table
		String[] columnNames = { "room_no", "room_type","room_status" };
		
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(columnNames);
		//initializing table
		table1 = new JTable();
		//setting table model
		table1.setModel(tableModel);
		//disable edit of cells of table
		table1.setDefaultEditor(Object.class, null);
		//auto resizing all the column size according to table width
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		// Set the table to fill the height of the viewport
		table1.setFillsViewportHeight(true);
		//initializing scrollpane
		scroll = new JScrollPane(table1);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establishing connection with the hotelmanagement database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement", "root", "");
			//sql statement to retrieve all data froom hotel rooms table
			String sql = "SELECT * FROM hotel_rooms";
			//preparing statement with sql
			PreparedStatement pstat = conn.prepareStatement(sql);
			//executing sql query and retrieving result
			ResultSet rs = pstat.executeQuery();
			//retrieving data and storing them
			while (rs.next()) {
				int roomNo = rs.getInt("room_no");
				String type = rs.getString("room_type");
				String status = rs.getString("room_status");
				//adding row in table with retrieved data
				tableModel.addRow(new Object[] { roomNo, type, status });
			}
			//closing result set, statement , and connection
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			// print the error message to the console
			System.out.println("Error : " + ex.getMessage());
		}
		//adding components in frame
		frame.add(scroll);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		//launching hotel rooms page
		new HotelRooms();
	}
}
