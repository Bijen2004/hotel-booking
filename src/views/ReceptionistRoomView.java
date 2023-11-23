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

import controls.JdbcUpdateRoom;
import models.RoomModels;


public class ReceptionistRoomView implements ListSelectionListener, ActionListener {
	JFrame frame;
	JPanel panelBackground;
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	JLabel lblRoomType, lblRoomPrice, lblAvailability, lblRoomId,
			lblReceptionist;
	JTextField txtRoomType, txtRoomPrice, txtAvailability, txtRoomId;
	JButton btnUpdate, btnBack, btnViewBooking, btnViewCustomer,btnViewRoom;

	public ReceptionistRoomView() {
		frame = new JFrame();
		panelBackground = new JPanel();
		tableModel = new DefaultTableModel();
		table1 = new JTable();
		scroll = new JScrollPane(table1);
		lblRoomId = new JLabel();
		txtRoomId = new JTextField();
		txtAvailability = new JTextField();
		txtRoomId = new JTextField();
		lblRoomType = new JLabel();
		txtRoomType = new JTextField();
		lblRoomPrice = new JLabel();
		txtRoomPrice = new JTextField();
		lblRoomId = new JLabel();
		lblAvailability = new JLabel();
		btnUpdate = new JButton();
		btnBack = new JButton();
		btnViewBooking = new JButton();
		btnViewCustomer = new JButton();
		lblReceptionist = new JLabel();
		btnViewRoom = new JButton();
		
		frame.setTitle("View Booking");
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		panelBackground.setLayout(null);
		panelBackground.setBounds(0, 0, 1200, 800);
		panelBackground.setBackground(Color.black);

		String[] columnNames = { "room_id", "room_type", "room_price", "room_availability" };
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
			String sql = "SELECT * FROM room";
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				int room_id = rs.getInt("room_id");
				String room_type = rs.getString("room_type");
				int room_price = rs.getInt("room_price");
				String room_availability = rs.getString("room_availability");

				tableModel.addRow(new Object[] { room_id, room_type, room_price, room_availability});
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		lblRoomId.setText("Room Id:");
		lblRoomId.setBounds(50, 350, 150, 30);
		lblRoomId.setForeground(Color.WHITE);
		lblRoomId.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblRoomType.setText("Room Type:");
		lblRoomType.setBounds(450, 350, 150, 30);
		lblRoomType.setForeground(Color.WHITE);
		lblRoomType.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblRoomPrice.setText("Room Price:");
		lblRoomPrice.setBounds(850, 350, 150, 30);
		lblRoomPrice.setForeground(Color.WHITE);
		lblRoomPrice.setFont(new Font("Pacifico", Font.BOLD, 24));

		lblAvailability.setText("Availability:");
		lblAvailability.setBounds(50, 420, 150, 30);
		lblAvailability.setForeground(Color.WHITE);
		lblAvailability.setFont(new Font("Pacifico", Font.BOLD, 24));

	

		txtRoomId.setBounds(220, 350, 150, 35);
		txtRoomId.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtRoomId.setEditable(false);
		txtRoomType.setBounds(620, 350, 150, 35);
		txtRoomType.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtRoomPrice.setBounds(1020, 350, 150, 35);
		txtRoomPrice.setFont(new Font("Pacifico", Font.BOLD, 18));
		txtAvailability.setBounds(220, 420, 150, 35);
		txtAvailability.setFont(new Font("Pacifico", Font.BOLD, 18));
		
		

		btnUpdate.setText("Update");
		btnUpdate.setBounds(500, 600, 200, 45);
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



		btnViewBooking.setText("Booking");
		btnViewBooking.setBounds(380, 25, 200, 45);
		btnViewBooking.setFocusable(false);
		btnViewBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnViewBooking.setBackground(new Color(255, 255, 200));
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
		
		btnViewRoom.setText("Room");
		btnViewRoom.setBounds(820, 25, 200, 45);
		btnViewRoom.setFocusable(false);
		btnViewRoom.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnViewRoom.setBackground(new Color(197, 197, 170));
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

		panelBackground.add(btnViewRoom);
		panelBackground.add(btnViewCustomer);
		panelBackground.add(btnViewBooking);
		panelBackground.add(lblReceptionist);
		panelBackground.add(btnBack);
		panelBackground.add(btnUpdate);
		panelBackground.add(txtAvailability);
		panelBackground.add(lblAvailability);
		panelBackground.add(lblRoomPrice);
		panelBackground.add(txtRoomPrice);
		panelBackground.add(lblRoomType);
		panelBackground.add(txtRoomType);
		panelBackground.add(txtRoomId);
		panelBackground.add(lblRoomId);
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
		Object type = model.getValueAt(selectedRow, 1);
		Object price = model.getValueAt(selectedRow, 2);
		Object availability = model.getValueAt(selectedRow, 3);

		txtRoomId.setText(id.toString());
		txtRoomType.setText(type.toString());
		txtRoomPrice.setText(price.toString());
		txtAvailability.setText(availability.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnUpdate) {
				int roomId = Integer.parseInt(txtRoomId.getText());
				String roomType = txtRoomType.getText();
				String roomAvailability = txtAvailability.getText();
				int roomPrice = Integer.parseInt(txtRoomPrice.getText());
				
				RoomModels room = new RoomModels(roomType,roomPrice,roomAvailability,roomId);
				JdbcUpdateRoom jdbc = new JdbcUpdateRoom();
				boolean result = jdbc.updateRoom(room);
				if(result) {
					JOptionPane.showMessageDialog(frame, "Record updated");
					new ReceptionistRoomView();
					frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(frame, "Record failed to update");
				}
			}
			 else if (e.getSource() == btnViewCustomer) {
					new ReceptionistCustomerView();
					frame.dispose();
				}
			 else if (e.getSource() == btnViewBooking) {
					new ReceptionistBookingView();
					frame.dispose();
				}
			 else if (e.getSource() == btnBack) {
					new LoginPage();
					frame.dispose();
				}
	}


	public static void main(String[] args) {
		new ReceptionistRoomView();
	}

}