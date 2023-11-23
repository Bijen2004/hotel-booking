package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;



public class Services implements ActionListener {
	//declaring variables
	JFrame frame;
	JPanel panelBackground, panelHeader, panelMain, panelBooking;
	Border border, border2;
	JLabel lblHotelName, lblLogo, lblPanelImage, lblServices, lblCreditCard, lblPrice, lblCreditCardFormat,lblContact,lblEmail,lblPhoneNumber,lblSlogan;
	JButton btnBooking, btnServices, btnFoods, btnSettings, btnUpcomingEvents, btnRequest,btnBack;
	JComboBox boxServices;
	JTextField txtPrice, txtCreditCard;

	public Services() {
		//initializing variables
		frame = new JFrame();
		panelBackground = new JPanel();
		panelHeader = new JPanel();
		panelMain = new JPanel();
		lblHotelName = new JLabel();
		lblPanelImage = new JLabel();
		lblLogo = new JLabel();
		lblCreditCard = new JLabel();
		lblServices = new JLabel();
		lblPrice = new JLabel();
		lblCreditCardFormat = new JLabel();
		btnBooking = new JButton();
		btnServices = new JButton();
		btnFoods = new JButton();
		btnSettings = new JButton();
		btnUpcomingEvents = new JButton();
		btnRequest = new JButton();
		panelBooking = new JPanel();
		boxServices = new JComboBox();
		txtPrice = new JTextField();
		txtCreditCard = new JTextField();
		lblPhoneNumber = new JLabel();
		lblEmail = new JLabel();
		lblContact = new JLabel();
		btnBack = new JButton();
		lblSlogan = new JLabel();

		border = BorderFactory.createLineBorder(Color.black, 3);

		border2 = BorderFactory.createLineBorder(new Color(255, 255, 204), 3);

		//properties of frame
		frame.setTitle("Hotel Services" );
		frame.setLayout(null);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

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
		panelBooking.setBorder(border2);

		panelMain.setBounds(0, 110, 1185, 670);
		panelMain.setLayout(null);

		//logo of hotel
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10, 0, 110, 110);

		lblHotelName.setText("LUTON HOTEL");
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170, 10, 200, 15);

		//getting color from header panel
		Color panelColor = new Color(panelHeader.getBackground().getRGB());

		btnBooking.setText("BOOKING");
		btnBooking.setBounds(240, 60, 170, 45);
		btnBooking.setFocusable(false);
		btnBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnBooking.setBackground(panelColor);
		btnBooking.setBorder(null);
		btnBooking.addActionListener(this);
		btnBooking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				//changing background color and adding border when mouse enters
				btnBooking.setBackground(new Color(197, 197, 170));
				btnBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				//changing background color and removing border when mouse exits
				btnBooking.setBackground(panelColor);
				btnBooking.setBorder(null);
			}
		});

		btnServices.setText("SERVICES");
		btnServices.setBounds(410, 60, 170, 45);
		btnServices.setFocusable(false);
		btnServices.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnServices.setBackground(Color.LIGHT_GRAY);
		btnServices.setBorder(null);
		btnServices.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnServices.setBackground(new Color(197, 197, 170));
				btnServices.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
				btnServices.setBackground(Color.LIGHT_GRAY);
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
				btnFoods.setBackground(new Color(197, 197, 170));
				btnFoods.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}

			public void mouseExited(MouseEvent evt) {
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

		ImageIcon image2 = new ImageIcon("photos/panel.jpg");
		lblPanelImage.setIcon(image2);
		lblPanelImage.setBounds(0, 0, 1185, 680);

		lblServices.setText("Services: ");
		lblServices.setFont(new Font("Serif", Font.BOLD, 16));
		lblServices.setForeground(Color.white);
		lblServices.setBounds(60, 58, 200, 40);

		String Serviceoptions[] = { "MASSAGE", "DRY CLEANING", "CAR RENTAL" };
		boxServices = new JComboBox(Serviceoptions);
		boxServices.setFocusable(false);
		boxServices.setBounds(140, 60, 120, 30);
		boxServices.addActionListener(this);
		boxServices.setSelectedIndex(0);

		lblPrice.setText("Price: ");
		lblPrice.setForeground(Color.white);
		lblPrice.setFont(new Font("Serif", Font.PLAIN, 16));
		lblPrice.setBounds(60, 120, 100, 30);

		txtPrice.setBounds(140, 120, 120, 30);
		txtPrice.setText("999");
		txtPrice.setForeground(Color.red);
		txtPrice.setEditable(false);

		lblCreditCard.setText("Credit Card");
		lblCreditCard.setFont(new Font("Serif", Font.PLAIN, 16));
		lblCreditCard.setForeground(Color.white);
		lblCreditCard.setBounds(60, 180, 120, 30);

		lblCreditCardFormat.setText("'xxxx xxxx xxxx xxxx'");
		lblCreditCardFormat.setBounds(140, 215, 150, 15);
		lblCreditCardFormat.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblCreditCardFormat.setForeground(Color.white);

		btnRequest.setText("REQUEST");
		btnRequest.setBounds(95, 270, 120, 30);
		btnRequest.addActionListener(this);
		btnRequest.setFont(new Font("Arial", Font.BOLD, 16));
		btnRequest.setBackground(new Color(255, 255, 187));
		btnRequest.setFocusable(false);
		btnRequest.addActionListener(this);
		btnRequest.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				btnRequest.setBackground(new Color(197, 197, 170));
				btnRequest.setBorder(BorderFactory.createLineBorder(Color.white, 1));
			}

			public void mouseExited(MouseEvent evt) {
				btnRequest.setBackground(new Color(255, 255, 187));
				btnRequest.setBorder(null);
			}
		});

		

		txtCreditCard.setBounds(140, 180, 120, 30);
		
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
		
		lblSlogan.setText("Elevate your stay with our exceptional service.");
		lblSlogan.setBounds(90,45,900,60);
		lblSlogan.setFont(new Font("Pacifico", Font.BOLD, 40));
		lblSlogan.setForeground(new Color(255, 255, 204));
		
		
		btnBack.setText("Back");
		btnBack.setBounds(1030,570,110,45);
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

		//adding components to image label,panel and frame
		lblPanelImage.add(lblSlogan);
		lblPanelImage.add(btnBack);
		lblPanelImage.add(lblEmail);
		lblPanelImage.add(lblPhoneNumber);
		lblPanelImage.add(lblContact);
		panelBooking.add(btnRequest);
		panelBooking.add(boxServices);
		panelBooking.add(lblCreditCard);
		panelBooking.add(lblCreditCardFormat);
		panelBooking.add(lblPrice);
		panelBooking.add(lblServices);
		panelBooking.add(txtCreditCard);
		panelBooking.add(txtPrice);
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
		//launching services page
		new Services();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	
		if (e.getSource() == boxServices) {
			//getting selected index from combobox
			if (boxServices.getSelectedIndex() == 1) {
				//setting price according to index
				int price = 1100;
				String servicePrice = price + "";
				txtPrice.setText(servicePrice);

			} else if (boxServices.getSelectedIndex() == 0) {
				int price = 999;
				String unitPrice = price + "";
				txtPrice.setText(unitPrice);

			} else if (boxServices.getSelectedIndex() == 2) {
				int price = 1222;
				String unitPrice = price + "";
				txtPrice.setText(unitPrice);

			}
			

		}
		
		else if(e.getSource()==btnBooking) {
			//creating instance of Booking class and disposing current frame
			new Booking();
			frame.dispose();
		}
		
		else if(e.getSource()== btnFoods) {
			//creating instance of foods class and disposing current frame
			new Foods();
			frame.dispose();
		}
		else if(e.getSource()==btnSettings) {
			//creating instance of Settings class and disposing current frame
			new Settings();
			frame.dispose();
		}
		else if(e.getSource()==btnUpcomingEvents) {
			//creating instance of Events class and disposing current frame
			new Events();
			frame.dispose();
		}
		else if(e.getSource()==btnBack) {
			//going back to main dashboard and disposing current frame
			new MainDashboard();
			frame.dispose();
		}
	}

}
