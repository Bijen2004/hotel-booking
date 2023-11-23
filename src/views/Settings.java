package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class Settings implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panelBackground,panelHeader,panelMain,panelBooking;
	Border border,border2;
	JLabel lblHotelName,lblLogo,lblPanelImage,lblContact,lblPhoneNumber,lblEmail;
	JButton btnBooking,btnServices,btnFoods,btnSettings,btnUpcomingEvents,btnViewProfile,btnAboutUs,btnLogout,btnBack;
	
	
	public Settings() {
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
		btnViewProfile = new JButton();
		btnAboutUs = new JButton();
		btnLogout = new JButton();
		lblEmail = new JLabel();
		lblPhoneNumber = new JLabel();
		lblContact = new JLabel();
		btnBack = new JButton();
		
		border = BorderFactory.createLineBorder(Color.black, 3);
		
		border2 = BorderFactory.createLineBorder(Color.white, 3);
		
		//setting properties of frame
		frame.setTitle("Settings");
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
		
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10,0,110,110);
		
		lblHotelName.setText("LUTON HOTEL");
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170,10,200,15);

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
            	btnBooking.setBackground(new Color(197, 197, 170));
            	btnBooking.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
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
		
		ImageIcon image2 = new ImageIcon("photos/panel.jpg");
		lblPanelImage.setIcon(image2);
		lblPanelImage.setBounds(0,0,1185,680);
		
		
		btnViewProfile.setBounds(40,50,230,60);
		btnViewProfile.setFont(new Font("Arial", Font.BOLD, 20));
		btnViewProfile.setBackground(new Color(220, 230, 240));
		btnViewProfile.setText("View Profile");
		btnViewProfile.setFocusable(false);
		btnViewProfile.addActionListener(this);
		btnViewProfile.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	            	btnViewProfile.setBackground(new Color(197, 197, 170));
	            	btnViewProfile.setForeground(Color.black);
	            	btnViewProfile.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	            }
	            public void mouseExited(MouseEvent evt) {
	            	btnViewProfile.setBackground(new Color(220, 230, 240));
	            	btnViewProfile.setForeground(Color.black);
	            	btnViewProfile.setBorder(null);
	            }
		}
		);
		
		btnAboutUs.setBounds(40,130,230,60);
		btnAboutUs.setFont(new Font("Arial", Font.BOLD, 20));
		btnAboutUs.setBackground(new Color(220, 230, 240));
		btnAboutUs.setText("About Us");
		btnAboutUs.addActionListener(this);
		btnAboutUs.setFocusable(false);
		btnAboutUs.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	            	btnAboutUs.setBackground(new Color(197, 197, 170));
	            	btnAboutUs.setForeground(Color.black);
	            	btnAboutUs.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	            }
	            public void mouseExited(MouseEvent evt) {
	            	btnAboutUs.setBackground(new Color(220, 230, 240));
	            	btnAboutUs.setForeground(Color.black);
	            	btnAboutUs.setBorder(null);
	            }
		}
		);
		
		btnLogout.setBounds(40,210,230,60);
		btnLogout.setFont(new Font("Arial", Font.BOLD, 20));
		btnLogout.setBackground(new Color(220, 230, 240));
		btnLogout.setText("Logout");
		btnLogout.addActionListener(this);
		btnLogout.setFocusable(false);
		btnLogout.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent evt) {
	            	btnLogout.setBackground(new Color(197, 197, 170));
	            	btnLogout.setForeground(Color.black);
	            	btnLogout.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	            }
	            public void mouseExited(MouseEvent evt) {
	            	btnLogout.setBackground(new Color(220, 230, 240));
	            	btnLogout.setForeground(Color.black);
	            	btnLogout.setBorder(null);
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
		
		//adding components to image label, panel and frame
		lblPanelImage.add(btnBack);
		lblPanelImage.add(lblEmail);
		lblPanelImage.add(lblPhoneNumber);
		lblPanelImage.add(lblContact);
		panelBooking.add(btnAboutUs);
		panelBooking.add(btnLogout);
		panelBooking.add(btnViewProfile);
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
		//launching settings page
		new Settings();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBooking) {
			//creating instance of booking class and disposing current frame
			new Booking();
			frame.dispose();
		}
		else if(e.getSource()==btnServices) {
			//creating instance of Services class and disposing current frame
			new Services();
			frame.dispose();
		}
		
		else if(e.getSource()==btnFoods) {
			//creating instance of Foods class and disposing current frame
			new Foods();
			frame.dispose();
		}
		
		else if(e.getSource()==btnLogout) {
			//logging out and returning to login page when log out button is clicked
			JOptionPane.showMessageDialog(frame, "Logged Out Sucessfully.");
			frame.dispose();
			new LoginPage();
		}
		
		else if(e.getSource()==btnAboutUs) {
			//launching about us page and disposing current frame
			new AboutUsPage();
			frame.dispose();
		}
		else if(e.getSource()==btnUpcomingEvents) {
			//creating instance of Events class and disposing current frame
			new Events();
			frame.dispose();
		}
		else if(e.getSource()==btnBack) {
			//going back to main dashboard when back button is clicked and disposing current frame
			new MainDashboard();
			frame.dispose();
		}
		else if(e.getSource()==btnViewProfile) {
			//launching CustomerProfile page and disposing current frame
			new CustomerProfile();
			frame.dispose();
		}
		
		
	}

}
