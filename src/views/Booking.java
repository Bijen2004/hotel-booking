package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class Booking implements ActionListener {
	// declaring variables
	JFrame frame;
	JPanel panelBackground, panelHeader, panelMain, panelBooking;
	Border border, border2, border3;
	JLabel lblHotelName, lblLogo, lblPanelImage, lblSlogan, lblSlogan2, lblPhoneNumber, lblEmail, lblContact,
			lblAnniversaryImage;
	JButton btnBooking, btnServices, btnFoods, btnSettings, btnUpcomingEvents, btnBookNow, btnViewBooking, btnBack;

	public Booking() {
		// initializing variable
		frame = new JFrame();
		panelBackground = new JPanel();
		panelHeader = new JPanel();
		panelMain = new JPanel();
		lblHotelName = new JLabel();
		lblPanelImage = new JLabel();
		lblLogo = new JLabel();
		btnBooking = new JButton();
		btnServices = new JButton();
		btnFoods = new JButton();
		btnSettings = new JButton();
		btnUpcomingEvents = new JButton();
		panelBooking = new JPanel();
		btnBookNow = new JButton();
		btnViewBooking = new JButton();
		lblSlogan = new JLabel();
		lblSlogan2 = new JLabel();
		btnBack = new JButton();
		lblContact = new JLabel();
		lblEmail = new JLabel();
		lblPhoneNumber = new JLabel();
		lblAnniversaryImage = new JLabel();

		border = BorderFactory.createLineBorder(Color.black, 3);
		border3 = BorderFactory.createLineBorder(new Color(205, 189, 234), 3);
		border2 = BorderFactory.createLineBorder(Color.white, 3);

		// properties of frame
		frame.setTitle("BOOKING : " + LoginTest.username);
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		// adding panels in frame
		panelBackground.setBackground(Color.white);
		panelBackground.setBounds(0, 0, 1200, 800);
		panelBackground.setLayout(null);

		panelHeader.setBounds(0, 0, 1185, 110);
		panelHeader.setBackground(Color.white);
		panelHeader.setLayout(null);
		panelHeader.setBorder(border);

		panelBooking.setBounds(138, 120, 310, 327);
		panelBooking.setOpaque(false);
		panelBooking.setLayout(null);
		panelBooking.setBorder(border3);

		panelMain.setBounds(0, 110, 1185, 670);
		panelMain.setLayout(null);

		// logo of hotel luton
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10, 0, 110, 110);

		lblHotelName.setText("LUTON HOTEL");
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170, 10, 200, 15);

		// get the color of header panel.Later it is used in buttons
		Color panelColor = new Color(panelHeader.getBackground().getRGB());

		btnBooking.setText("BOOKING");
		btnBooking.setBounds(240, 60, 170, 45);
		btnBooking.setFocusable(false);
		btnBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		// color of this button is light grey
		btnBooking.setBackground(Color.LIGHT_GRAY);
		btnBooking.setBorder(null);
		btnBooking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				// changing color of button and adding border to button when mouse enters(hover)
				btnBooking.setBackground(new Color(197, 197, 170));
				btnBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				// changing color and removing border when mouse exits
				btnBooking.setBackground(Color.LIGHT_GRAY);
				btnBooking.setBorder(null);
			}
		});

		btnServices.setText("SERVICES");
		btnServices.setBounds(410, 60, 170, 45);
		btnServices.setFocusable(false);
		btnServices.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnServices.setBackground(panelColor);
		btnServices.setBorder(null);
		btnServices.addActionListener(this);
		btnServices.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				// changing color of button and adding border to button when mouse enters(hover)
				btnServices.setBackground(new Color(197, 197, 170));
				btnServices.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				// changing color and removing border when mouse exits
				btnServices.setBackground(panelColor);
				btnServices.setBorder(null);
			}
		});

		btnFoods.setText("FOODS / DRINKS");
		btnFoods.setBounds(580, 60, 170, 45);
		btnFoods.setFocusable(false);
		btnFoods.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnFoods.setBackground(panelColor);
		btnFoods.setBorder(null);
		btnFoods.addActionListener(this);
		btnFoods.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				// changing color of button and adding border to button when mouse enters(hover)
				btnFoods.setBackground(new Color(197, 197, 170));
				btnFoods.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				// changing color and removing border when mouse exits
				btnFoods.setBackground(panelColor);
				btnFoods.setBorder(null);
			}
		});

		btnSettings.setText("SETTINGS");
		btnSettings.setBounds(920, 60, 170, 45);
		btnSettings.setFocusable(false);
		btnSettings.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnSettings.setBackground(panelColor);
		btnSettings.setBorder(null);
		btnSettings.addActionListener(this);
		btnSettings.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnSettings.setBackground(new Color(197, 197, 170));
				btnSettings.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnSettings.setBackground(panelColor);
				btnSettings.setBorder(null);
			}
		});

		btnUpcomingEvents.setText("EVENTS");
		btnUpcomingEvents.setBounds(750, 60, 170, 45);
		btnUpcomingEvents.setFocusable(false);
		btnUpcomingEvents.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnUpcomingEvents.setBackground(panelColor);
		btnUpcomingEvents.setBorder(null);
		btnUpcomingEvents.addActionListener(this);
		btnUpcomingEvents.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnUpcomingEvents.setBackground(new Color(197, 197, 170));
				btnUpcomingEvents.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnUpcomingEvents.setBackground(panelColor);
				btnUpcomingEvents.setBorder(null);
			}
		});

		// background image of this panel
		ImageIcon image2 = new ImageIcon("photos/panel.jpg");
		lblPanelImage.setIcon(image2);
		lblPanelImage.setBounds(0, 0, 1185, 680);

		// add template of 25th anniversary of hotel
		ImageIcon anniversaryImage = new ImageIcon("photos/25thAnniversaryTemplateee.jpg");
		lblAnniversaryImage.setIcon(anniversaryImage);
		lblAnniversaryImage.setBounds(570, 50, 550, 550);

		btnBookNow.setBounds(40, 90, 230, 60);
		btnBookNow.setFont(new Font("Arial", Font.BOLD, 20));
		btnBookNow.setBackground(new Color(220, 230, 240));
		btnBookNow.setText("BOOK NOW");
		btnBookNow.setFocusable(false);
		btnBookNow.addActionListener(this);
		btnBookNow.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnBookNow.setBackground(new Color(197, 197, 170));
				btnBookNow.setForeground(Color.black);
				btnBookNow.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnBookNow.setBackground(new Color(220, 230, 240));
				btnBookNow.setForeground(Color.black);
				btnBookNow.setBorder(null);
			}
		});

		btnViewBooking.setBounds(40, 170, 230, 60);
		btnViewBooking.setFont(new Font("Arial", Font.BOLD, 20));
		btnViewBooking.setBackground(new Color(220, 230, 240));
		btnViewBooking.setText("View Booking");
		btnViewBooking.setFocusable(false);
		btnViewBooking.addActionListener(this);
		btnViewBooking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnViewBooking.setBackground(new Color(197, 197, 170));
				btnViewBooking.setForeground(Color.black);
				btnViewBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnViewBooking.setBackground(new Color(220, 230, 240));
				btnViewBooking.setForeground(Color.black);
				btnViewBooking.setBorder(null);
			}
		});

		// slogan
		lblSlogan.setText("Plan your escape.");
		lblSlogan.setBounds(50, 35, 900, 40);
		lblSlogan.setFont(new Font("Pacifico", Font.BOLD, 32));
		lblSlogan.setForeground(new Color(255, 255, 204));

		lblSlogan2.setText("We'll take care of the rest.");
		lblSlogan2.setBounds(80, 70, 900, 40);
		lblSlogan2.setFont(new Font("Pacifico", Font.BOLD, 32));
		lblSlogan2.setForeground(new Color(255, 255, 204));

		btnBack.setText("Back");
		btnBack.setBounds(1030, 570, 110, 45);
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
		lblContact.setText("Contact us :");
		lblContact.setBounds(40, 540, 200, 30);
		lblContact.setFont(new Font("Serif", Font.BOLD, 28));
		lblContact.setForeground(Color.white);

		lblPhoneNumber.setText("5578484 , +9779821458799");
		lblPhoneNumber.setBounds(40, 575, 300, 30);
		lblPhoneNumber.setFont(new Font("Serif", Font.BOLD, 24));
		lblPhoneNumber.setForeground(Color.white);

		lblEmail.setText("lutonhotelcustomerservice@gmail.com");
		lblEmail.setBounds(40, 600, 450, 30);
		lblEmail.setFont(new Font("Serif", Font.BOLD, 24));
		lblEmail.setForeground(Color.white);

		//adding components to panels and frame
		lblPanelImage.add(lblAnniversaryImage);
		lblPanelImage.add(lblContact);
		lblPanelImage.add(lblEmail);
		lblPanelImage.add(lblPhoneNumber);
		lblPanelImage.add(btnBack);
		lblPanelImage.add(lblSlogan);
		lblPanelImage.add(lblSlogan2);
		panelBooking.add(btnViewBooking);
		panelBooking.add(btnBookNow);
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
		//launching booking page
		new Booking();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnFoods) {
			//creating instance of food class and launching food page if foods button is clicked and disposing current frame
			new Foods();
			frame.dispose();
		} else if (e.getSource() == btnServices) {
			//creating instance of service class and launching services page if services button is clicked and disposing current frame
			new Services();
			frame.dispose();
		} else if (e.getSource() == btnSettings) {
			//creating instance of settings class and launching settings page if settings button is clicked and disposing current frame
			new Settings();
			frame.dispose();
		} else if (e.getSource() == btnBookNow) {
			//creating instance of booknow class and launching booknow page if book now button is clicked and disposing current frame
			new Booknow();
			frame.dispose();
		} else if (e.getSource() == btnUpcomingEvents) {
			//creating instance of events class and launching events page if events button is clicked and disposing current frame
			new Events();
			frame.dispose();
		} else if (e.getSource() == btnBack) {
			//going back to main dashboard and disposing current frame if back button is clicked
			new MainDashboard();
			frame.dispose();
		} else if (e.getSource() == btnViewBooking) {
			//take to view booking page when view booking button is clicked and dispose current frame
			new ViewBooking();
			frame.dispose();
		}

	}

}
