package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;


public class MainDashboard implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panelBackground,panelHeader,panelMain;
	Border border;
	JLabel lblHotelName,lblLogo,lblPanelImage,lblSlogan,lblSlogan2,lblEmail,lblContact,lblPhoneNumber;
	JButton btnBooking,btnServices,btnFoods,btnSettings,btnUpcomingEvents,btnClose;
	
	
	public MainDashboard() {
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
		lblSlogan = new JLabel();
		lblSlogan2 = new JLabel();
		lblPhoneNumber = new JLabel();
		lblContact = new JLabel();
		lblEmail = new JLabel();
		btnClose = new JButton();
		
		border = BorderFactory.createLineBorder(Color.black, 3);
		
		//properties of frame
		frame.setTitle("Welcome : " +LoginTest.username);
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
		
		ImageIcon image1 = new ImageIcon("photos/logo.png");
		lblLogo.setIcon(image1);
		lblLogo.setBounds(10,0,110,110);
		
		lblHotelName.setText("LUTON HOTEL");
		lblHotelName.setFont(new Font("Pacifico", Font.BOLD, 20));
		lblHotelName.setBounds(170,10,200,15);
		
		btnBooking.setText("BOOKING");
		btnBooking.setBounds(240,60,170,45);
		btnBooking.setFocusable(false);
		btnBooking.setFont(new Font("Pacifico", Font.BOLD, 20));
		Color panelColor = new Color(panelHeader.getBackground().getRGB());
		btnBooking.setBackground(panelColor);
		btnBooking.addActionListener(this);
		btnBooking.setBorder(null);
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
		
		//setting background image
		ImageIcon image2 = new ImageIcon("photos/hotelBackgrounddd.jpg");
		lblPanelImage.setIcon(image2);
		lblPanelImage.setBounds(0,0,1185,680);
		
		lblSlogan.setText("Welcome to your perfect stay.");
		lblSlogan.setBounds(70,180,900,60);
		lblSlogan.setFont(new Font("Pacifico", Font.BOLD, 50));
		lblSlogan.setForeground(Color.white);
		
		lblSlogan2.setText("Let's start planning your dream experience.");
		lblSlogan2.setBounds(70,250,1100,60);
		lblSlogan2.setFont(new Font("Pacifico", Font.BOLD, 50));
		lblSlogan2.setForeground(Color.white);
		
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
		
		btnClose.setText("Close");
		btnClose.setBounds(1030,570,110,45);
		btnClose.setFocusable(false);
		btnClose.setFont(new Font("Pacifico", Font.BOLD, 20));
		btnClose.setBackground(Color.white);
		btnClose.setBorder(null);
		btnClose.addActionListener(this);
		btnClose.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	btnClose.setBackground(new Color(197, 197, 170));
            	btnClose.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnClose.setBackground(Color.white);
            	btnClose.setBorder(null);
            }
	}
	);

		//adding components in image label,panels and frame
		lblPanelImage.add(btnClose);
		lblPanelImage.add(lblPhoneNumber);
		lblPanelImage.add(lblContact);
		lblPanelImage.add(lblEmail);
		lblPanelImage.add(lblSlogan);
		lblPanelImage.add(lblSlogan2);
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
		//launching maindashboard page
		new MainDashboard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBooking) {
			//launching booking page and disposing current frame
			new Booking();
			frame.dispose();
		}
		
		else if(e.getSource()== btnFoods) {
			//launching Foods page and disposing current frame
			new Foods();
			frame.dispose();
		}
		else if(e.getSource()==btnServices) {
			//launching Services page and disposing current frame
			new Services();
			frame.dispose();
		}
		else if(e.getSource()==btnSettings) {
			//launching Settings page and disposing current frame
			new Settings();
			frame.dispose();
		}
		else if(e.getSource()==btnSettings) {
			//launching Settings page and disposing current frame
			new Settings();
			frame.dispose();
		}
		else if(e.getSource()==btnClose) {
			//disposing current frame
			frame.dispose();
		}
		else if(e.getSource()==btnUpcomingEvents) {
			//launching Events page and disposing current frame
			new Events();
			frame.dispose();
		}
	}

}
