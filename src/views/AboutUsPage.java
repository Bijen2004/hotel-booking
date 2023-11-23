package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class AboutUsPage implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panelBackground,panelHeader,panelMain,panelHotelImage;
	Border border,border2;
	JLabel lblHotelName,lblLogo,lblpanelImage,lblAboutUs,lblHotelImage;
	JButton btnBooking,btnServices,btnFoods,btnSettings,btnUpcomingEvents,btnBack;
	JTextArea txtAboutUs;
	
	public AboutUsPage() {
		//initializing all variables that are declared above
		frame = new JFrame();
		panelBackground = new JPanel();
		panelHeader = new JPanel();
		panelMain = new JPanel();
		lblHotelName = new JLabel();
		lblpanelImage = new JLabel();
		lblLogo = new JLabel();
		btnBooking = new JButton();
		btnServices = new JButton();
		btnFoods = new JButton();
		btnSettings = new JButton();
		btnUpcomingEvents = new JButton();
		lblAboutUs = new JLabel();
		txtAboutUs = new JTextArea();
		panelHotelImage = new JPanel();
		lblHotelImage = new JLabel();
		btnBack = new JButton();
		
		border = BorderFactory.createLineBorder(Color.black, 3);
		
		border2 = BorderFactory.createLineBorder(new Color(255, 255, 204), 3);
		
		//properties of this frame
		frame.setTitle("About Us");
		//setting frame layout to null
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		//background panel 
		panelBackground.setBackground(Color.white);
		panelBackground.setBounds(0, 0,1200,800);
		panelBackground.setLayout(null);
		
		//header panel that occupies the top part of this frame
		panelHeader.setBounds(0,0,1185,110);
		panelHeader.setBackground(Color.white);
		panelHeader.setLayout(null);
		panelHeader.setBorder(border);
		// main panel , the body part of this frame
		panelMain.setBounds(0,110,1185,670);
		panelMain.setLayout(null);
		
		//logo of hotel luton
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10,0,110,110);
		
		//label for hotel name
		lblHotelName.setText("LUTON HOTEL");
		//setting font 
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170,10,200,15);
		
		
		btnBooking.setText("BOOKING");
		btnBooking.setBounds(240,60,170,45);
		//setting button focusable to false
		btnBooking.setFocusable(false);
		//changing text font of button
		btnBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		//getting the background color of header panel 
		Color panelColor = new Color(panelHeader.getBackground().getRGB());
		//setting color of button which is also color of header panel
		btnBooking.setBackground(panelColor);
		//removing border of button
		btnBooking.setBorder(null);
		//adding action listener to button
		btnBooking.addActionListener(this);
		btnBooking.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing background color of button and also adding border to the button when mouse enters the button(hover)
            	btnBooking.setBackground(new Color(197, 197, 170));
            	btnBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing the color of button and removing border of button when mouse exits from button
            	btnBooking.setBackground(panelColor);
            	btnBooking.setBorder(null);
            }
	}
	);
		
		
		btnServices.setText("SERIVCES");
		btnServices.setBounds(410,60,170,45);
		btnServices.setFocusable(false);
		btnServices.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnServices.setBackground(panelColor);
		btnServices.setBorder(null);
		btnServices.addActionListener(this);
		btnServices.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	btnServices.setBackground(new Color(197, 197, 170));
            	btnServices.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
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
            	btnFoods.setBackground(new Color(197, 197, 170));
            	btnFoods.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnFoods.setBackground(panelColor);
            	btnFoods.setBorder(null);
            }
	}
	);
		
		btnSettings.setText("SETTINGS");
		btnSettings.setBounds(920,60,170,45);
		btnSettings.setFocusable(false);
		btnSettings.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnSettings.setBackground(Color.LIGHT_GRAY);
		btnSettings.setBorder(null);
		btnSettings.addActionListener(this);
		btnSettings.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	btnSettings.setBackground(new Color(197, 197, 170));
            	btnSettings.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnSettings.setBackground(Color.LIGHT_GRAY);
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
		btnFoods.addActionListener(this);
		btnUpcomingEvents.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	btnUpcomingEvents.setBackground(new Color(197, 197, 170));
            	btnUpcomingEvents.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnUpcomingEvents.setBackground(panelColor);
            	btnUpcomingEvents.setBorder(null);
            }
	}
	);
		
		//adding background image in main panel
		ImageIcon image2 = new ImageIcon("photos/hotelBackgrounddd.jpg");
		lblpanelImage.setIcon(image2);
		lblpanelImage.setBounds(0,0,1185,680);
		
		lblAboutUs.setText("About Us");
		lblAboutUs.setFont(new Font("Pacifico", Font.BOLD, 40));
		lblAboutUs.setBounds(170,40,200,45);
		lblAboutUs.setForeground(new Color(255, 255, 204));
		
		//adding brief text about the hotel in text area
		txtAboutUs.setEditable(false);
		txtAboutUs.setBounds(520,200,560,300);
		//making text area transparent
		txtAboutUs.setOpaque(false);
		txtAboutUs.setText(" Welcome to Luton Hotel, a large independently run hotel situated in the\n beautiful town of Luton. We offer a range of comfortable accommodation\n options including single, twin, and double rooms, all of which come with\n en-suite facilities, a telephone with an outside line, and a mini-bar. Our\n hotel features a bar and restaurant where our guests can enjoy a\n delicious meal or a refreshing drink, and room service is also available.\n We take pride in our exceptional customer service and have developed\n an online booking system to make it easy for our guests to book a room\n and manage their bookings. Whether you are travelling for business or\n pleasure, we strive to provide a relaxing and comfortable stay. \n \nThank you for considering Luton Hotel for your next trip.");
		txtAboutUs.setFont(new Font("Pacifico", Font.BOLD, 16));
		txtAboutUs.setForeground(Color.white);
		
		//adding a image panel for adding a image
		panelHotelImage.setBounds(40,140,450,450);
		panelHotelImage.setBackground(Color.white);
		panelHotelImage.setLayout(null);
		panelHotelImage.setOpaque(false);
		panelHotelImage.setBorder(border2);
		
		//adding image in hotel image panel
		ImageIcon image = new ImageIcon("photos/hotelLutonImage.jpg");
		lblHotelImage.setIcon(image);
		lblHotelImage.setBounds(10,5,430,440);
		
		btnBack.setText("Back");
		btnBack.setBounds(1000,570,110,45);
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
		
		//adding components
		lblpanelImage.add(btnBack);
		panelHotelImage.add(lblHotelImage);
		lblpanelImage.add(panelHotelImage);
		lblpanelImage.add(txtAboutUs);
		lblpanelImage.add(lblAboutUs);
		panelMain.add(lblpanelImage);
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
		// Creating an instance of the AboutUsPage class and launching the about us page
		new AboutUsPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBack) {
			//creating instance of Settings class and disposing current frame when back button is clicked
			new Settings();
			frame.dispose();
		}
		if(e.getSource()==btnBooking) {
			//creating instance of Booking class and disposing current frame when booking button is clicked
			new Booking();
			frame.dispose();
		}
		else if(e.getSource()==btnServices) {
			//creating instance of Services class and disposing current frame when services button is clicked
			new Services();
			frame.dispose();
		}
		
		else if(e.getSource()==btnFoods) {
			//creating instance of foods class and disposing current frame when foods button is clicked
			new Foods();
			frame.dispose();
		}
		else if(e.getSource()==btnSettings) {
			//creating instance of Settings class and disposing current frame when settings button is clicked
			new Settings();
			frame.dispose();
		}
	}

}
