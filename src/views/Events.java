package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class Events implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panelBackground,panelHeader,panelMain;
	Border border;
	JLabel lblHotelName,lblLogo,lblpanelImage,lblComingSoon,lblImageEvent;
	JButton btnBooking,btnServices,btnFoods,btnSettings,btnUpcomingEvents,btnBack;
	
	public Events() {
		//initializing variables
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
		lblComingSoon = new JLabel();
		lblImageEvent = new JLabel();
		btnBack = new JButton();
		
		border = BorderFactory.createLineBorder(Color.black, 3);
		
		//set properties of frame
		frame.setTitle("Events");
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
		
		//adding image logo 
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
		btnUpcomingEvents.setBackground(Color.LIGHT_GRAY);
		btnUpcomingEvents.setBorder(null);
		btnUpcomingEvents.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	btnUpcomingEvents.setBackground(new Color(197, 197, 170));
            	btnUpcomingEvents.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            }
            public void mouseExited(MouseEvent evt) {
            	btnUpcomingEvents.setBackground(Color.LIGHT_GRAY);
            	btnUpcomingEvents.setBorder(null);
            }
	}
	);
		
		//adding background image
		ImageIcon image2 = new ImageIcon("photos/hotelBackgrounddd.jpg");
		lblpanelImage.setIcon(image2);
		lblpanelImage.setBounds(0,0,1185,680);
		
		lblComingSoon.setText("Coming soon !!!");
		lblComingSoon.setBounds(95,50,900,60);
		lblComingSoon.setFont(new Font("Pacifico", Font.BOLD, 40));
		lblComingSoon.setForeground(new Color(255, 255, 204));
		
		//adding image of the event
		ImageIcon imageEvent = new ImageIcon("photos/events.jpg");
		lblImageEvent.setIcon(imageEvent);
		lblImageEvent.setBounds(350,30,800,680);
		
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
		
		//adding components to image label panel and frame
		lblpanelImage.add(btnBack);
		lblpanelImage.add(lblImageEvent);
		lblpanelImage.add(lblComingSoon);
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
		new Events();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBooking) {
			//opening booking page and disposing current frame
			new Booking();
			frame.dispose();
		}
		else if (e.getSource()==btnFoods) {
			//opening Foods page and disposing current frame
			new Foods();
			frame.dispose();
		}
		else if (e.getSource()==btnSettings) {
			//opening Settings page and disposing current frame
			new Settings();
			frame.dispose();
		}
		else if (e.getSource()==btnServices) {
			//opening Services page and disposing current frame
			new Services();
			frame.dispose();
		}
		else if (e.getSource()==btnBack) {
			//going back to main dashboard and disposing current frame
			new MainDashboard();
			frame.dispose();
		}
	}

}
