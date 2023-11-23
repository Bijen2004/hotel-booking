package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class Foods implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panelBackground,panelHeader,panelMain,panelBooking;
	Border border,border2;
	JLabel lblHotelName,lblLogo,lblPanelImage,lblContact,lblPhoneNumber,lblEmail,lblFoodImage;
	JButton btnBooking,btnServices,btnFoods,btnSettings,btnUpcomingEvents,btnRestaurant,btnBar,btnCafe,btnBack;
	
	public Foods() {
		//initializing variables
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
		btnRestaurant = new JButton();
		btnBar = new JButton();
		btnCafe = new JButton();
		lblContact = new JLabel();
		lblPhoneNumber = new JLabel();
		lblEmail = new JLabel();
		lblFoodImage = new JLabel();
		btnBack = new JButton();
		
		border = BorderFactory.createLineBorder(Color.black, 3);
		
		border2 = BorderFactory.createLineBorder(new Color(144, 238, 144), 3);
		
		//setting properties of the frame
		frame.setTitle("FOODS / DRINKS");
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
		
		panelBooking.setBounds(138,120,310,327);
		panelBooking.setOpaque(false);
		panelBooking.setLayout(null);
		panelBooking.setBorder(border2);
		
		panelMain.setBounds(0,110,1185,670);
		panelMain.setLayout(null);
		
		//add logo of hotel
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10,0,110,110);
		
		lblHotelName.setText("LUTON HOTEL");
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170,10,200,15);

		//get the color of header panel
		Color panelColor = new Color(panelHeader.getBackground().getRGB());
		
		btnBooking.setText("BOOKING");
		btnBooking.setBounds(240,60,170,45);
		btnBooking.setFocusable(false);
		btnBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnBooking.setBackground(panelColor);
		btnBooking.setBorder(null);
		btnBooking.addActionListener(this);
		btnBooking.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	//changing color and adding border in button when mouse enters(hover)
            	btnBooking.setBackground(new Color(197, 197, 170));
            	btnBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	//changing color and removing border when mouse exits
            	btnBooking.setBackground(panelColor);
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
		btnFoods.setBackground(Color.LIGHT_GRAY);
		btnFoods.setBorder(null);
		btnFoods.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	btnFoods.setBackground(new Color(197, 197, 170));
            	btnFoods.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnFoods.setBackground(Color.LIGHT_GRAY);
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
            	btnSettings.setBackground(new Color(197, 197, 170));
            	btnSettings.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
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
            	btnUpcomingEvents.setBackground(new Color(197, 197, 170));
            	btnUpcomingEvents.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnUpcomingEvents.setBackground(panelColor);
            	btnUpcomingEvents.setBorder(null);
            }
	}
	);
		
		//background image
		ImageIcon image2 = new ImageIcon("photos/panel.jpg");
		lblPanelImage.setIcon(image2);
		lblPanelImage.setBounds(0,0,1185,680);
		
		
		btnRestaurant.setBounds(40,50,230,60);
		btnRestaurant.setFont(new Font("Arial", Font.BOLD, 20));
		btnRestaurant.setBackground(new Color(220, 230, 240));
		btnRestaurant.setText("Restaurant");
		btnRestaurant.setFocusable(false);
		btnRestaurant.addActionListener(this);
		btnRestaurant.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	            	btnRestaurant.setBackground(new Color(197, 197, 170));
	            	btnRestaurant.setForeground(Color.black);
	            	btnRestaurant.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	            }
	            public void mouseExited(MouseEvent evt) {
	            	btnRestaurant.setBackground(new Color(220, 230, 240));
	            	btnRestaurant.setForeground(Color.black);
	            	btnRestaurant.setBorder(null);
	            }
		}
		);
		
		btnBar.setBounds(40,130,230,60);
		btnBar.setFont(new Font("Arial", Font.BOLD, 20));
		btnBar.setBackground(new Color(220, 230, 240));
		btnBar.setText("Bar");
		btnBar.addActionListener(this);
		btnBar.setFocusable(false);
		btnBar.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	            	btnBar.setBackground(new Color(197, 197, 170));
	            	btnBar.setForeground(Color.black);
	            	btnBar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	            }
	            public void mouseExited(MouseEvent evt) {
	            	btnBar.setBackground(new Color(220, 230, 240));
	            	btnBar.setForeground(Color.black);
	            	btnBar.setBorder(null);
	            }
		}
		);
		
		btnCafe.setBounds(40,210,230,60);
		btnCafe.setFont(new Font("Arial", Font.BOLD, 20));
		btnCafe.setBackground(new Color(220, 230, 240));
		btnCafe.setText("Cafe");
		btnCafe.addActionListener(this);
		btnCafe.setFocusable(false);
		btnCafe.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	            	btnCafe.setBackground(new Color(197, 197, 170));
	            	btnCafe.setForeground(Color.black);
	            	btnCafe.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	            }
	            public void mouseExited(MouseEvent evt) {
	            	btnCafe.setBackground(new Color(220, 230, 240));
	            	btnCafe.setForeground(Color.black);
	            	btnCafe.setBorder(null);
	            }
		}
		);
		
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
		
		ImageIcon foodTemplate = new ImageIcon("photos/templateFood.jpg");
		lblFoodImage.setIcon(foodTemplate);
		lblFoodImage.setBounds(570,50,550,550);
		
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
		//adding components to panel , image label ,frame
		lblPanelImage.add(btnBack);
		lblPanelImage.add(lblFoodImage);
		lblPanelImage.add(lblEmail);
		lblPanelImage.add(lblPhoneNumber);
		lblPanelImage.add(lblContact);
		panelBooking.add(btnBar);
		panelBooking.add(btnCafe);
		panelBooking.add(btnRestaurant);
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
		//launching foods page
		new Foods();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== btnBar) {
			//creating instance of bar class
			new Bar();
		}
		
		else if(e.getSource() == btnCafe) {
			//creating instance of Cafe class
			new Cafe();
		}
		
		else if(e.getSource()==btnBooking) {
			//opening booking page and disposing current frame
			new Booking();
			frame.dispose();
		}
		else if(e.getSource()==btnServices) {
			//opening Services page and disposing current frame
			new Services();
			frame.dispose();
		}
		else if(e.getSource()==btnSettings) {
			//opening Settings page and disposing current frame
			new Settings();
			frame.dispose();
		}
		else if(e.getSource()==btnUpcomingEvents) {
			//opening Events page and disposing current frame
			new Events();
			frame.dispose();
		}
		else if(e.getSource()==btnRestaurant) {
			//creating instance of Restaurant class
			new Restaurant();
		}
		else if(e.getSource()==btnBack) {
			//going back to main dashboard and disposing current frame
			new MainDashboard();
			frame.dispose();
		}
	}

}
