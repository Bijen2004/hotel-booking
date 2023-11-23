package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;

import controls.JdbcBooking;
import models.RoomModels;
import models.UserBooking;

public class Booknow implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panelBackground,panelHeader,panelMain,panelBooking,panelSingleRoom,panelDoubleRoom,panelTwinRoom;
	Border border,border2,border3,border4;
	JLabel lblHotelName,lblLogo,lblPanelImage,lblSlogan,lblCheckIn,lblCheckOut,lblChildren,lblAdults,lblSingleRoom,lblDoubleRoom,lblTwinRoom,lblRoom,lbltwinRoom,lbldoubleRoom,lblsingleRoom,lblSingeRoomPrice,lblDoubleRoomPrice,lblTwinRoomPrice;
	JButton btnBooking,btnServices,btnFoods,btnSettings,btnUpcomingEvents,btnChildrenPlus,btnChildrenMinus,btnAdultMinus,btnAdultPlus,btnBack,btnBookNow;
	JDateChooser checkInDate,checkOutDate;
	JTextField txtChildren,txtAdults,txtSingleRoomPrice,txtDoubleRoomPrice,txtTwinRoomPrice;
	JRadioButton radioButtonSingleRoom,radioButtonDoubleRoom,radioButtonTwinRoom;
	ButtonGroup bg;
	
	public Booknow() {
		//initializing variables
		frame = new JFrame();
		
		panelBackground = new JPanel();
		panelHeader = new JPanel();
		panelMain = new JPanel();
		panelBooking = new JPanel();
		lblHotelName = new JLabel();
		lblPanelImage = new JLabel();
		lblLogo = new JLabel();
		btnBooking = new JButton();
		btnServices = new JButton();
		btnFoods = new JButton();
		btnSettings = new JButton();
		btnUpcomingEvents = new JButton();
		lblSlogan = new JLabel();
		lblCheckIn = new JLabel();
		lblCheckOut = new JLabel();
		checkInDate = new JDateChooser();
		checkOutDate = new JDateChooser();
		lblChildren = new JLabel();
		txtChildren = new JTextField();
		lblAdults = new JLabel();
		txtAdults = new JTextField();
		btnChildrenPlus = new JButton();
		btnChildrenMinus = new JButton();
		btnAdultMinus = new JButton();
		btnAdultPlus = new JButton();
		panelSingleRoom = new JPanel();
		panelDoubleRoom = new JPanel();
		panelTwinRoom = new JPanel();
		btnBack = new JButton();
		lblSingleRoom = new JLabel();
		lblDoubleRoom = new JLabel();
		lblTwinRoom = new JLabel();
		lblRoom = new JLabel();
		lblsingleRoom = new JLabel();
		lbltwinRoom = new JLabel();
		lbldoubleRoom = new JLabel();
		lblSingeRoomPrice = new JLabel();
		txtSingleRoomPrice = new JTextField();
		txtDoubleRoomPrice = new JTextField();
		lblDoubleRoomPrice = new JLabel();
		lblTwinRoomPrice = new JLabel();
		txtTwinRoomPrice = new JTextField();
		btnBookNow = new JButton();
		radioButtonSingleRoom = new JRadioButton();
		radioButtonDoubleRoom = new JRadioButton();
		radioButtonTwinRoom = new JRadioButton();
		bg = new ButtonGroup();
		
		border = BorderFactory.createLineBorder(Color.black, 3);
		border2 = BorderFactory.createLineBorder(new Color(231, 221, 255), 3);
		border3 = BorderFactory.createLineBorder(new Color(218, 205, 245), 3);
		border4 = BorderFactory.createLineBorder(new Color(205, 189, 234), 3);
	
		
		//properties of frame
		frame.setTitle("Book Now : "+LoginTest.username);
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		panelBackground.setBackground(Color.white);
		panelBackground.setBounds(0, 0,1200,800);
		panelBackground.setLayout(null);
		
		panelHeader.setBounds(0,0,1185,110);
		panelHeader.setBackground(Color.white);
		panelHeader.setLayout(null);
		panelHeader.setBorder(border);
		
		panelMain.setBounds(0,110,1185,670);
		panelMain.setLayout(null);
		
		panelBooking.setBounds(97,105,1000,515);
		panelBooking.setLayout(null);
		panelBooking.setBorder(border4);
		panelBooking.setOpaque(false);
		
		//panel for single room
		panelSingleRoom.setBounds(30,155,300,330);
		panelSingleRoom.setLayout(null);
		panelSingleRoom.setBorder(border2);
		panelSingleRoom.setOpaque(false);
		
		//panel for double room
		panelDoubleRoom.setBounds(350,155,300,330);
		panelDoubleRoom.setLayout(null);
		panelDoubleRoom.setBorder(border3);
		panelDoubleRoom.setOpaque(false);
		
		//panel for twin room
		panelTwinRoom.setBounds(670,155,300,330);
		panelTwinRoom.setLayout(null);
		panelTwinRoom.setBorder(border4);
		panelTwinRoom.setOpaque(false);
		
		//logo of hotel
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10,0,110,110);
		
		lblHotelName.setText("LUTON HOTEL");
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170,10,200,15);
		
		//get color from header panel
		Color panelColor = new Color(panelHeader.getBackground().getRGB());
		
		btnBooking.setText("BOOKING");
		btnBooking.setBounds(240,60,170,45);
		btnBooking.setFocusable(false);
		btnBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnBooking.setBackground(Color.LIGHT_GRAY);
		btnBooking.setBorder(null);
		btnBooking.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing color and adding border when mouse enters(hover)
            	btnBooking.setBackground(new Color(197, 197, 170));
            	btnBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing color and removing border when mouse exits
            	btnBooking.setBackground(Color.LIGHT_GRAY);
            	btnBooking.setBorder(null);
            }
	}
	);
		
		
		btnServices.setText("SERVICES");
		btnServices.setBounds(410,60,170,45);
		btnServices.setFocusable(false);
		btnServices.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnServices.setBackground(panelColor);
		btnServices.setBorder(null);
		btnServices.addActionListener(this);
		btnServices.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing color and adding border when mouse enters(hover)
            	btnServices.setBackground(new Color(197, 197, 170));
            	btnServices.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing color and removing border when mouse exits
            	btnServices.setBackground(panelColor);
            	btnServices.setBorder(null);
            }
	}
	);
		
		btnFoods.setText("FOODS / DRINKS");
		btnFoods.setBounds(580,60,170,45);
		btnFoods.setFocusable(false);
		btnFoods.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnFoods.setBackground(panelColor);
		btnFoods.setBorder(null);
		btnFoods.addActionListener(this);
		btnFoods.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing color and adding border when mouse enters(hover)
            	btnFoods.setBackground(new Color(197, 197, 170));
            	btnFoods.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing color and removing border when mouse exits
            	btnFoods.setBackground(panelColor);
            	btnFoods.setBorder(null);
            }
	}
	);
		
		btnSettings.setText("SETTINGS");
		btnSettings.setBounds(920,60,170,45);
		btnSettings.setFocusable(false);
		btnSettings.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnSettings.setBackground(panelColor);
		btnSettings.setBorder(null);
		btnSettings.addActionListener(this);
		btnSettings.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing color and adding border when mouse enters(hover)
            	btnSettings.setBackground(new Color(197, 197, 170));
            	btnSettings.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing color and removing border when mouse exits
            	btnSettings.setBackground(panelColor);
            	btnSettings.setBorder(null);
            }
	}
	);
		
		btnUpcomingEvents.setText("EVENTS");
		btnUpcomingEvents.setBounds(750,60,170,45);
		btnUpcomingEvents.setFocusable(false);
		btnUpcomingEvents.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnUpcomingEvents.setBackground(panelColor);
		btnUpcomingEvents.setBorder(null);
		btnUpcomingEvents.addActionListener(this);
		btnUpcomingEvents.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing color and adding border when mouse enters(hover)
            	btnUpcomingEvents.setBackground(new Color(197, 197, 170));
            	btnUpcomingEvents.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing color and removing border when mouse exits
            	btnUpcomingEvents.setBackground(panelColor);
            	btnUpcomingEvents.setBorder(null);
            }
	}
	);
		
		//set image in panel background
		ImageIcon image2 = new ImageIcon("photos/panelBooking.jpg");
		lblPanelImage.setIcon(image2);
		lblPanelImage.setBounds(0,0,1185,680);
		
		lblSlogan.setText("Book a date, make memories, have fun.");
		lblSlogan.setBounds(95,50,900,60);
		lblSlogan.setFont(new Font("Pacifico", Font.BOLD, 40));
		lblSlogan.setForeground(new Color(255, 255, 204));
		
		lblCheckIn.setText("Check-in");
		lblCheckIn.setBounds(95,10,90,30);
		lblCheckIn.setFont(new Font("Pacifico", Font.PLAIN, 22));
		lblCheckIn.setForeground(Color.white);
		
		lblCheckOut.setText("Check-out");
		lblCheckOut.setBounds(400,10,110,30);
		lblCheckOut.setFont(new Font("Pacifico", Font.PLAIN, 22));
		lblCheckOut.setForeground(Color.white);
		
		checkInDate.setBounds(200, 10, 150, 35);
		checkOutDate.setBounds(505,10,150,35);
		
		lblChildren.setText("No. of Children");
		lblChildren.setBounds(95,50,150,30);
		lblChildren.setFont(new Font("Pacifico", Font.PLAIN, 22));
		lblChildren.setForeground(Color.white);

		lblAdults.setText("No. of Adults");
		lblAdults.setBounds(520,50,150,30);
		lblAdults.setFont(new Font("Pacifico", Font.PLAIN, 22));
		lblAdults.setForeground(Color.white);
		
		txtChildren.setBounds(250,50,50,30);
		txtChildren.setText("0");
		txtChildren.setForeground(Color.red);
		txtChildren.setEditable(false);
		
		
		txtAdults.setBounds(655,50,50,30);
		txtAdults.setText("0");
		txtAdults.setForeground(Color.red);
		txtAdults.setEditable(false);
		
		btnChildrenPlus.setBounds(305,50,45,30);
		btnChildrenPlus.setText("+");
		btnChildrenPlus.setBackground(Color.white);
		btnChildrenPlus.setForeground(Color.black);
		btnChildrenPlus.setFocusable(false);
		btnChildrenPlus.addActionListener(this);
		
		btnChildrenMinus.setBounds(350,50,45,30);
		btnChildrenMinus.setText("-");
		btnChildrenMinus.setBackground(Color.white);
		btnChildrenMinus.setForeground(Color.black);
		btnChildrenMinus.setFocusable(false);
		btnChildrenMinus.addActionListener(this);
		
		btnAdultPlus.setBounds(710,50,45,30);
		btnAdultPlus.setText("+");
		btnAdultPlus.setBackground(Color.white);
		btnAdultPlus.setForeground(Color.black);
		btnAdultPlus.setFocusable(false);
		btnAdultPlus.addActionListener(this);
		
		btnAdultMinus.setBounds(755,50,45,30);
		btnAdultMinus.setText("-");
		btnAdultMinus.setBackground(Color.white);
		btnAdultMinus.setForeground(Color.black);
		btnAdultMinus.setFocusable(false);
		btnAdultMinus.addActionListener(this);
		
		lblRoom.setText("Room:");
		lblRoom.setBounds(90,90,100,30);
		lblRoom.setFont(new Font("Pacifico", Font.BOLD, 22));
		lblRoom.setForeground(Color.white);
		
		lblsingleRoom.setText("Single Room");
		lblsingleRoom.setBounds(30,120,200,30);
		lblsingleRoom.setFont(new Font("Pacifico", Font.BOLD, 22));
		lblsingleRoom.setForeground(new Color(231, 221, 255));
		
		lbldoubleRoom.setText("Double Room");
		lbldoubleRoom.setBounds(350,120,200,30);
		lbldoubleRoom.setFont(new Font("Pacifico", Font.BOLD, 22));
		lbldoubleRoom.setForeground(new Color(218, 205, 245));
		
		lbltwinRoom.setText("Twin Room");
		lbltwinRoom.setBounds(670,120,200,30);
		lbltwinRoom.setFont(new Font("Pacifico", Font.BOLD, 22));
		lbltwinRoom.setForeground(new Color(205, 189, 234));

		btnBack.setText("Back");
		btnBack.setBounds(1050,600,110,45);
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
	}
	);
		//image of single room
		ImageIcon singleRoom = new ImageIcon("photos/singleroom.jpg");
		lblSingleRoom.setIcon(singleRoom);
		lblSingleRoom.setBounds(3,4,294,200);
		
		//image of double room
		ImageIcon doubleRoom = new ImageIcon("photos/doubleRoom.jpg");
		lblDoubleRoom.setIcon(doubleRoom);
		lblDoubleRoom.setBounds(3,4,294,200);
		
		//image of twin room
		ImageIcon twinRoom = new ImageIcon("photos/twinRoom.jpg");
		lblTwinRoom.setIcon(twinRoom);
		lblTwinRoom.setBounds(3,4,294,200);

		lblSingeRoomPrice.setText("Price");
		lblSingeRoomPrice.setForeground(Color.white);
		lblSingeRoomPrice.setFont(new Font("Serif", Font.PLAIN, 20));
		lblSingeRoomPrice.setBounds(70,230,100,30);
		
		txtSingleRoomPrice.setBounds(150,230,80,30);
		txtSingleRoomPrice.setText("2222");
		txtSingleRoomPrice.setForeground(Color.red);
		txtSingleRoomPrice.setEditable(false);
		
		lblDoubleRoomPrice.setText("Price");
		lblDoubleRoomPrice.setForeground(Color.white);
		lblDoubleRoomPrice.setFont(new Font("Serif", Font.PLAIN, 20));
		lblDoubleRoomPrice.setBounds(70,230,100,30);
		
		txtDoubleRoomPrice.setBounds(150,230,80,30);
		txtDoubleRoomPrice.setText("2900");
		txtDoubleRoomPrice.setForeground(Color.red);
		txtDoubleRoomPrice.setEditable(false);
		
		lblTwinRoomPrice.setText("Price");
		lblTwinRoomPrice.setForeground(Color.white);
		lblTwinRoomPrice.setFont(new Font("Serif", Font.PLAIN, 20));
		lblTwinRoomPrice.setBounds(70,230,100,30);
		
		txtTwinRoomPrice.setBounds(150,230,80,30);
		txtTwinRoomPrice.setText("3200");
		txtTwinRoomPrice.setForeground(Color.red);
		txtTwinRoomPrice.setEditable(false);
		
		
		
		btnBookNow.setText("Book Now");
		btnBookNow.setBounds(500,600,200,45);
		btnBookNow.setFocusable(false);
		btnBookNow.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnBookNow.setBackground(Color.black);
		btnBookNow.setForeground(Color.white);
		btnBookNow.setBorder(null);
		btnBookNow.addActionListener(this);
		btnBookNow.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing background color and also text color and adding border when mouse enters
            	btnBookNow.setBackground(new Color(197, 197, 170));
        		btnBookNow.setForeground(Color.black);
            	btnBookNow.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//change color and remove border when mouse exits
            	btnBookNow.setBackground(Color.black);
        		btnBookNow.setForeground(Color.white);
            	btnBookNow.setBorder(null);
            }
	}
	);
		
	
		//radio buttons to select a room
		radioButtonSingleRoom.setBounds(140, 280, 20, 20);
		radioButtonSingleRoom.setBackground(new Color(218, 238, 255));
		radioButtonSingleRoom.setFocusable(false);

		radioButtonDoubleRoom.setBounds(140, 280, 20, 20);
		radioButtonDoubleRoom.setBackground(new Color(218, 238, 255));
		radioButtonDoubleRoom.setFocusable(false);
		
		radioButtonTwinRoom.setBounds(140, 280, 20, 20);
		radioButtonTwinRoom.setBackground(new Color(218, 238, 255));
		radioButtonTwinRoom.setFocusable(false);

		//adding radio buttons in button group
		bg.add(radioButtonSingleRoom);
		bg.add(radioButtonDoubleRoom);
		bg.add(radioButtonTwinRoom);
		
		//adding components to panel and frame and also image label
		panelSingleRoom.add(radioButtonSingleRoom);
		panelTwinRoom.add(radioButtonTwinRoom);
		panelDoubleRoom.add(radioButtonDoubleRoom);
		lblPanelImage.add(btnBookNow);
		panelTwinRoom.add(txtTwinRoomPrice);
		panelTwinRoom.add(lblTwinRoomPrice);
		panelDoubleRoom.add(lblDoubleRoomPrice);
		panelDoubleRoom.add(txtDoubleRoomPrice);
		panelSingleRoom.add(txtSingleRoomPrice);
		panelSingleRoom.add(lblSingeRoomPrice);
		panelBooking.add(lblsingleRoom);
		panelBooking.add(lbldoubleRoom);
		panelBooking.add(lbltwinRoom);
		panelBooking.add(lblRoom);
		panelTwinRoom.add(lblTwinRoom);
		panelDoubleRoom.add(lblDoubleRoom);
		panelSingleRoom.add(lblSingleRoom);
		lblPanelImage.add(btnBack);
		panelBooking.add(panelDoubleRoom);
		panelBooking.add(panelTwinRoom);
		panelBooking.add(panelSingleRoom);
		panelBooking.add(txtChildren);
		panelBooking.add(btnAdultMinus);
		panelBooking.add(btnAdultPlus);
		panelBooking.add(btnChildrenMinus);
		panelBooking.add(btnChildrenPlus);
		panelBooking.add(txtAdults);
		panelBooking.add(lblAdults);
		panelBooking.add(lblChildren);
		panelBooking.add(lblCheckOut);
		panelBooking.add(checkOutDate);
		panelBooking.add(checkInDate);
		panelBooking.add(lblCheckIn);
		lblPanelImage.add(lblSlogan);
		lblPanelImage.add(panelBooking);
		panelMain.add(lblPanelImage);
		panelHeader.add(btnUpcomingEvents);
		panelHeader.add(btnFoods);
		panelHeader.add(btnSettings);
		panelHeader.add(btnBooking);
		panelHeader.add(btnServices);
		panelHeader.add(lblLogo);
		panelHeader.add(lblHotelName);
		frame.add(panelMain);
		panelBackground.add(panelHeader);
		frame.add(panelBackground);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Booknow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnFoods) {
			//launching food page when food button is clicked and disposing current frame
			new Foods();
			frame.dispose();
		}
		else if(e.getSource()==btnServices) {
			//launching Services page when Services button is clicked and disposing current frame
			new Services();
			frame.dispose();
		}
		else if(e.getSource()==btnUpcomingEvents) {
			//launching Events page when Events button is clicked and disposing current frame
			new Events();
			frame.dispose();
		}
		else if(e.getSource()==btnSettings) {
			//launching Settings page when Settings button is clicked and disposing current frame
			new Settings();
			frame.dispose();
		}
		else if(e.getSource()==btnChildrenPlus) {
			//increase the number of children by 1 when plus button is clicked
			//get integer text from children text field
			int a = Integer.parseInt(txtChildren.getText());
			//add the number by 1
			int b = a + 1;
			//set the increased value in text field
			txtChildren.setText(b+"");
		}
		else if(e.getSource()==btnChildrenMinus) {
			//decrease the number of childrens by 1 when minus button is clicked
			//get integer text from childrens text field
			int a = Integer.parseInt(txtChildren.getText());
			//subtract the number by 1
			int b = a - 1;
			//set the decreased value in text field
			txtChildren.setText(b+"");
		}
		else if(e.getSource()==btnAdultPlus) {
			//increase the number of adults by 1 when plus button is clicked
			//get integer text from adults text field
			int a = Integer.parseInt(txtAdults.getText());
			//add the number by 1
			int b = a + 1;
			//set the increased value in text field
			txtAdults.setText(b+"");
		}
		else if(e.getSource()==btnAdultMinus) {
			//decrease the number of adults by 1 when minus button is clicked
			//get integer text from adults text field
			int a = Integer.parseInt(txtAdults.getText());
			//subtract the number by 1
			int b = a - 1;
			//set the decreased value in text field
			txtAdults.setText(b+"");
		}

		else if(e.getSource()==btnBack) {
			//go back to booking page and dispose the current book now frame
			new Booking();
			frame.dispose();
		}
		
		else if(e.getSource()==btnBookNow) {
			  //get the selected check in date and change its format to yyyy-MM-dd
		    Date selectedCheckInDate = checkInDate.getDate();
		    String checkIn = null;
		    //checking if the date is selected or not
		    if (selectedCheckInDate != null) {
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        checkIn = dateFormat.format(selectedCheckInDate);
		    } else {
		        JOptionPane.showMessageDialog(frame, "Please select a valid check-in date.");
		        return;
		    }

		    //get the selected check out date and change its format to yyyy-MM-dd
		    Date selectedCheckOutDate = checkOutDate.getDate();
		    String checkOut = null;
		    if (selectedCheckOutDate != null) {
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        checkOut = dateFormat.format(selectedCheckOutDate);
		    } else {
		        JOptionPane.showMessageDialog(frame, "Please select a valid check-out date.");
		        return;
		    }
		    // checking if checkout date is before check in date
		    if (selectedCheckOutDate.before(selectedCheckInDate)) {
		        JOptionPane.showMessageDialog(frame, "Please select a check-out date that is after the check-in date.");
		        return;
		    }
		    
			int childrens = Integer.parseInt(txtChildren.getText());
			//get the integer value of no of adults from adults text field
			int adults = Integer.parseInt(txtAdults.getText());
			//get userId from global variable stored in LoginTest class
			int userId = LoginTest.userid;
			
			//check that at least one room type is selected
		    if (!radioButtonSingleRoom.isSelected() && !radioButtonDoubleRoom.isSelected() && !radioButtonTwinRoom.isSelected()) {
		        JOptionPane.showMessageDialog(frame, "Please select a room type.");
		        return;
		    }
			//set the booking status to booking pending
			String bookingStatus = "Booking Pending";
			
			String roomType = null;
			int roomPrice = 0;
			if(radioButtonSingleRoom.isSelected()) {
				//set roomtype to single and get the price of single room when radio button single room is selected
				roomType = "Single";
				roomPrice = Integer.parseInt(txtSingleRoomPrice.getText());
			}
			else if(radioButtonDoubleRoom.isSelected()) {
				//set roomtype to Double and get the price of Double room when radio button Double room is selected
				roomType = "Double";
				roomPrice = Integer.parseInt(txtDoubleRoomPrice.getText());
			}
			else if(radioButtonTwinRoom.isSelected()) {
				//set roomtype to Twin and get the price of Twin room when radio button Twin room is selected
				roomType = "Twin";
				roomPrice = Integer.parseInt(txtTwinRoomPrice.getText());
			}
			
			//set room availability to available
			String roomAvailability = "Room Available";
			
			// Creating objects for RoomModels, UserBooking and JdbcBooking classes
			RoomModels room = new RoomModels();
			UserBooking book = new UserBooking();
			JdbcBooking jdbc = new JdbcBooking();
			
			//setting value in room model objects
			room.setRoomPrice(roomPrice);
			room.setRoomType(roomType);
			room.setRoomAvailability(roomAvailability);

			//setting value in user booking objects
			book.setAdults(adults);
			book.setCheckIn(checkIn);
			book.setCheckOut(checkOut);
			book.setBookingStatus(bookingStatus);
			book.setChildrens(childrens);
			book.setUserId(userId);
			
			
			//passing value of room and book in jdbc to save the booking record in database
			boolean result = jdbc.room( room ,book);
			if(result) {
				//display record saved if the connection is successful and record is saved
				JOptionPane.showMessageDialog(frame, "Record saved.");
				new Booking();
				frame.dispose();
			}
			else {
				//display error message if the connection is not successful
				JOptionPane.showMessageDialog(frame, "Record not saved");
			}
			
		}
	
	}

}
