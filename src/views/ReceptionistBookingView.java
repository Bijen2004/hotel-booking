package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controls.JdbcHotelRooms;
import controls.JdbcUpdateBooking;
import models.HotelRoomModel;
import models.UpdateBooking;

public class ReceptionistBookingView implements ListSelectionListener, ActionListener {
	JFrame frame;
	JPanel panelBackground;
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	JLabel lblBookingId, lblCheckIn, lblCheckOut, lblChildrens, lblAdults, lblBookingStatus, lblUserId, lblRoomId,
			lblReceptionist,lblRoom;
	JTextField txtBookingId, txtCheckIn, txtCheckOut, txtChildrens, txtAdults, txtBookingStatus, txtUserId, txtRoomId,txtRoom;
	JButton btnUpdate, btnConfirmBooking, btnBack, btnViewBooking, btnViewCustomer,btnCheck,btnViewRoom;

	public ReceptionistBookingView() {
		frame = new JFrame();
		panelBackground = new JPanel();
		tableModel = new DefaultTableModel();
		table1 = new JTable();
		scroll = new JScrollPane(table1);
		lblBookingId = new JLabel();
		txtRoomId = new JTextField();
		txtUserId = new JTextField();
		txtBookingStatus = new JTextField();
		txtAdults = new JTextField();
		txtChildrens = new JTextField();
		txtBookingId = new JTextField();
		lblCheckIn = new JLabel();
		txtCheckIn = new JTextField();
		lblCheckOut = new JLabel();
		txtCheckOut = new JTextField();
		lblRoomId = new JLabel();
		lblUserId = new JLabel();
		lblBookingStatus = new JLabel();
		lblAdults = new JLabel();
		lblChildrens = new JLabel();
		btnUpdate = new JButton();
		btnConfirmBooking = new JButton();
		btnBack = new JButton();
		btnViewBooking = new JButton();
		btnViewCustomer = new JButton();
		lblReceptionist = new JLabel();
		lblRoom = new JLabel();
		txtRoom = new JTextField();
		btnCheck = new JButton();
		btnViewRoom = new JButton();
		
		frame.setTitle("View Booking");
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		panelBackground.setLayout(null);
		panelBackground.setBounds(0, 0, 1200, 800);
		panelBackground.setBackground(Color.black);

		String[] columnNames = { "booking_id", "check_in", "check_out", "childrens", "adults", "booking_status",
				"user_id", "room_id","room_no" };
		tableModel.setColumnIdentifiers(columnNames);
		table1.setModel(tableModel);
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table1.setFillsViewportHeight(true);
		table1.getSelectionModel().addListSelectionListener(this);
		table1.setDefaultEditor(Object.class, null);


		scroll.setBounds(60, 100, 1070, 200);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		JTableHeader header = table1.getTableHeader();
		header.setBackground(Color.black);
		header.setForeground(Color.white);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
			String sql = "SELECT * FROM booking";
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				int booking_id = rs.getInt("booking_id");
				String check_in = rs.getString("check_in");
				String check_out = rs.getString("check_out");
				int childrens = rs.getInt("childrens");
				int adults = rs.getInt("adults");
				String booking_status = rs.getString("booking_status");
				int user_id = rs.getInt("user_id");
				int room_id = rs.getInt("room_id");
				int room_no = rs.getInt("room_no");

				tableModel.addRow(new Object[] { booking_id, check_in, check_out, childrens, adults, booking_status,
						user_id, room_id,room_no });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		lblBookingId.setText("Booking Id:");
		lblBookingId.setBounds(50, 350, 150, 30);
		lblBookingId.setForeground(Color.WHITE);
		lblBookingId.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblCheckIn.setText("Check In:");
		lblCheckIn.setBounds(450, 350, 150, 30);
		lblCheckIn.setForeground(Color.WHITE);
		lblCheckIn.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblCheckOut.setText("Check Out:");
		lblCheckOut.setBounds(850, 350, 150, 30);
		lblCheckOut.setForeground(Color.WHITE);
		lblCheckOut.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblChildrens.setText("Childrens:");
		lblChildrens.setBounds(50, 420, 150, 30);
		lblChildrens.setForeground(Color.WHITE);
		lblChildrens.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblAdults.setText("Adults:");
		lblAdults.setBounds(450, 420, 150, 30);
		lblAdults.setForeground(Color.WHITE);
		lblAdults.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblBookingStatus.setText("Booking Status:");
		lblBookingStatus.setBounds(845, 420, 200, 30);
		lblBookingStatus.setForeground(Color.WHITE);
		lblBookingStatus.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblUserId.setText("User Id:");
		lblUserId.setBounds(50, 490, 150, 30);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblRoomId.setText("Room Id:");
		lblRoomId.setBounds(450, 490, 150, 30);
		lblRoomId.setForeground(Color.WHITE);
		lblRoomId.setFont(new Font("Pacifico", Font.BOLD, 24));
		
		lblRoom.setText("Room no:");
		lblRoom.setBounds(845, 490, 200, 30);
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setFont(new Font("Pacifico", Font.BOLD, 24));
		
		txtRoom.setBounds(1020, 490, 150, 35);
		txtRoom.setFont(new Font("Pacifico", Font.BOLD, 18));

		txtBookingId.setBounds(220, 350, 150, 35);
		txtBookingId.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtBookingId.setEditable(false);
		txtCheckIn.setBounds(620, 350, 150, 35);
		txtCheckIn.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtCheckOut.setBounds(1020, 350, 150, 35);
		txtCheckOut.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtChildrens.setBounds(220, 420, 150, 35);
		txtChildrens.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtAdults.setBounds(620, 420, 150, 35);
		txtAdults.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtBookingStatus.setBounds(1020, 420, 150, 35);
		txtBookingStatus.setFont(new Font("Pacifico", Font.BOLD, 16));
		txtUserId.setBounds(220, 490, 150, 35);
		txtUserId.setEditable(false);
		txtUserId.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtRoomId.setBounds(620, 490, 150, 35);
		txtRoomId.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtRoomId.setEditable(false);
		

		btnUpdate.setText("Update");
		btnUpdate.setBounds(380, 600, 200, 45);
		btnUpdate.setFocusable(false);
		btnUpdate.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(255, 255, 200));
		btnUpdate.setForeground(Color.black);
		btnUpdate.setBorder(null);
		btnUpdate.addActionListener(this);
		btnUpdate.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnUpdate.setBackground(new Color(197, 197, 170));
				btnUpdate.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnUpdate.setBackground(new Color(255, 255, 200));
				btnUpdate.setBorder(null);
			}
		});

		btnConfirmBooking.setText("Confirm Booking");
		btnConfirmBooking.setBounds(630, 600, 200, 45);
		btnConfirmBooking.setFocusable(false);
		btnConfirmBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnConfirmBooking.setBackground(new Color(255, 255, 200));
		btnConfirmBooking.setForeground(Color.black);
		btnConfirmBooking.setBorder(null);
		btnConfirmBooking.addActionListener(this);
		btnConfirmBooking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnConfirmBooking.setBackground(new Color(197, 197, 170));
				btnConfirmBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnConfirmBooking.setBackground(new Color(255, 255, 200));
				btnConfirmBooking.setBorder(null);
			}
		});
		
		btnCheck.setText("Check");
		btnCheck.setBounds(1000, 600, 110, 45);
		btnCheck.setFocusable(false);
		btnCheck.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnCheck.setBackground(new Color(255, 255, 200));
		btnCheck.setForeground(Color.black);
		btnCheck.setBorder(null);
		btnCheck.addActionListener(this);
		btnCheck.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnCheck.setBackground(new Color(197, 197, 170));
				btnCheck.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnCheck.setBackground(new Color(255, 255, 200));
				btnCheck.setBorder(null);
			}
		});

		btnViewBooking.setText("Booking");
		btnViewBooking.setBounds(380, 25, 200, 45);
		btnViewBooking.setFocusable(false);
		btnViewBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnViewBooking.setBackground(new Color(197, 197, 170));
		btnViewBooking.setForeground(Color.black);
		btnViewBooking.setBorder(null);
		btnViewBooking.addActionListener(this);
		btnViewBooking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnViewBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnViewBooking.setBorder(null);
			}
		});

		btnViewCustomer.setText("Customer");
		btnViewCustomer.setBounds(600, 25, 200, 45);
		btnViewCustomer.setFocusable(false);
		btnViewCustomer.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnViewCustomer.setBackground(new Color(255, 255, 200));
		btnViewCustomer.setForeground(Color.black);
		btnViewCustomer.setBorder(null);
		btnViewCustomer.addActionListener(this);
		btnViewCustomer.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnViewCustomer.setBackground(new Color(197, 197, 170));
				btnViewCustomer.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnViewCustomer.setBackground(new Color(255, 255, 200));
				btnViewCustomer.setBorder(null);
			}
		});
		
		btnViewRoom.setText("Room");
		btnViewRoom.setBounds(820, 25, 200, 45);
		btnViewRoom.setFocusable(false);
		btnViewRoom.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnViewRoom.setBackground(new Color(255, 255, 200));
		btnViewRoom.setForeground(Color.black);
		btnViewRoom.setBorder(null);
		btnViewRoom.addActionListener(this);
		btnViewRoom.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnViewRoom.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnViewRoom.setBorder(null);
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
		lblReceptionist.setText("Receptionist");
		lblReceptionist.setBounds(25, 25, 190, 30);
		lblReceptionist.setFont(new Font("Pacifico", Font.BOLD, 32));
		lblReceptionist.setForeground(Color.red);

		panelBackground.add(lblRoom);
		panelBackground.add(txtRoom);
		panelBackground.add(btnCheck);
		panelBackground.add(btnViewRoom);
		panelBackground.add(btnViewCustomer);
		panelBackground.add(btnViewBooking);
		panelBackground.add(lblReceptionist);
		panelBackground.add(btnBack);
		panelBackground.add(btnConfirmBooking);
		panelBackground.add(btnUpdate);
		panelBackground.add(txtChildrens);
		panelBackground.add(txtAdults);
		panelBackground.add(txtBookingStatus);
		panelBackground.add(txtUserId);
		panelBackground.add(txtRoomId);
		panelBackground.add(lblRoomId);
		panelBackground.add(lblUserId);
		panelBackground.add(lblAdults);
		panelBackground.add(lblBookingStatus);
		panelBackground.add(lblChildrens);
		panelBackground.add(lblCheckOut);
		panelBackground.add(txtCheckOut);
		panelBackground.add(lblCheckIn);
		panelBackground.add(txtCheckIn);
		panelBackground.add(txtBookingId);
		panelBackground.add(lblBookingId);
		panelBackground.add(scroll);
		frame.add(panelBackground);

		frame.setVisible(true);

	}

	public void valueChanged(ListSelectionEvent event) {
		if (event.getValueIsAdjusting()) {
			return;
		}

		int selectedRow = table1.getSelectedRow();

		if (selectedRow == -1) {
			return;
		}

		DefaultTableModel model = (DefaultTableModel) table1.getModel();
		Object id = model.getValueAt(selectedRow, 0);
		Object checkIn = model.getValueAt(selectedRow, 1);
		Object checkOut = model.getValueAt(selectedRow, 2);
		Object childrens = model.getValueAt(selectedRow, 3);
		Object adults = model.getValueAt(selectedRow, 4);
		Object status = model.getValueAt(selectedRow, 5);
		Object userId = model.getValueAt(selectedRow, 6);
		Object roomId = model.getValueAt(selectedRow, 7);
		Object roomNo = model.getValueAt(selectedRow, 8);

		txtBookingId.setText(id.toString());
		txtCheckIn.setText(checkIn.toString());
		txtCheckOut.setText(checkOut.toString());
		txtChildrens.setText(childrens.toString());
		txtAdults.setText(adults.toString());
		txtBookingStatus.setText(status.toString());
		txtUserId.setText(userId.toString());
		txtRoomId.setText(roomId.toString());
		txtRoom.setText(roomNo.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnUpdate) {
			JdbcUpdateBooking jdbc = new JdbcUpdateBooking();

			String checkin =txtCheckIn.getText() ;
			String checkout =txtCheckOut.getText();
			int adults = Integer.parseInt(txtAdults.getText());
			int bookingid =Integer.parseInt(txtBookingId.getText());
			int children = Integer.parseInt(txtChildrens.getText());
			String BookingStatus =txtBookingStatus.getText();
			int roomNo = Integer.parseInt(txtRoom.getText());
			if(roomNo==0 || roomNo<11 || roomNo>20) {
				JOptionPane.showMessageDialog(frame, "Please assign a valid room number.");
				return;
			}
			UpdateBooking booking = new UpdateBooking(bookingid,checkin, checkout,children, adults,BookingStatus,roomNo);
			
			boolean result = jdbc.update(booking);
			if (result) {
				JOptionPane.showMessageDialog(frame, "Record Updated");
				new ReceptionistBookingView();
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(frame, "Record failed to update");
			}
			HotelRoomModel room = new HotelRoomModel(roomNo);
			JdbcHotelRooms jdbc2 = new JdbcHotelRooms();
			jdbc2.assign(room);
			
		} else if (e.getSource() == btnBack) {
			new LoginPage();
			frame.dispose();
		} 
		else if (e.getSource() == btnConfirmBooking) {
			txtBookingStatus.setText("Booking Confirmed");
		} else if (e.getSource() == btnViewCustomer) {
			new ReceptionistCustomerView();
			frame.dispose();
		}
		else if(e.getSource()==btnCheck) {
			new HotelRooms();
		}
		else if(e.getSource()== btnViewRoom) {
			new ReceptionistRoomView();
		}
	}


	public static void main(String[] args) {
		new ReceptionistBookingView();
	}

}