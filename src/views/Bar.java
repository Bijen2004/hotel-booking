package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Bar implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panel;
	JLabel lblImage;
	JLabel lblBarName;
	JLabel lblDrink;
	JLabel lblPrice;
	JComboBox boxDrinks;
	JTextField txtPrice;
	JLabel lblQuantity;
	JTextField txtQuantity;
	JTextField txtTotal;
	JButton btnAdd;
	JButton btnOrder;
	JButton btnClose;
	JLabel lblTotal;
	JLabel lblCreditCard;
	JLabel lblCreditCardFormat;
	JTextField txtCreditCard;
	
	public Bar() {
		//initializing variables that are declared
	frame = new JFrame();
	panel = new JPanel();
	lblImage = new JLabel();
	lblBarName = new JLabel();
	lblDrink = new JLabel();
	lblPrice = new JLabel();
	txtPrice = new JTextField();
	lblQuantity = new JLabel();
	txtQuantity = new JTextField();
	boxDrinks = new JComboBox();
	btnAdd = new JButton();
	lblTotal = new JLabel();
	txtTotal = new JTextField();
	txtCreditCard = new JTextField();
	btnOrder = new JButton();
	btnClose = new JButton();
	lblCreditCard = new JLabel();
	lblCreditCardFormat = new JLabel();
	
	
	//properties of this frame
	frame.setTitle("Bar : "+LoginTest.username);
	//setting the layout of frame to grid layout of 1 row and 2 column
	frame.setLayout(new GridLayout(1,2));
	frame.setSize(600, 400);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	
	//image of bar
	ImageIcon image = new ImageIcon("photos/My project.jpg");
	lblImage.setIcon(image);
	
	
	panel.setBackground(new Color(218, 238, 255));
	panel.setLayout(null);
	
	//label of bar name
	lblBarName.setText("Beers and Cheers");
	//changing font and size
	lblBarName.setFont(new Font("Pacifico", Font.BOLD, 16));
	lblBarName.setBounds(80,10,200,30);
	
	lblDrink.setText("Drinks ");
	lblDrink.setFont(new Font("Serif", Font.BOLD, 24));
	lblDrink.setBounds(20,60,100,30);
	
	//these are drinks that is available in bar
	String Drinkoptions[] = {"Margarita","Martini","Manhattan","Old Fashioned","Daiquiri","Negroni","Gin and Tonic","Whiskey Sour","Cosmopolitan","Bloody Mary"};
	boxDrinks = new JComboBox(Drinkoptions);
	boxDrinks.setFocusable(false);
	boxDrinks.setBounds(100,60,180,30);
	boxDrinks.addActionListener(this);
	boxDrinks.setSelectedIndex(0);
	
	//price label
	lblPrice.setText("Price");
	lblPrice.setForeground(Color.red);
	lblPrice.setFont(new Font("Serif", Font.PLAIN, 16));
	lblPrice.setBounds(20,110,100,30);
	
	//quantity label
	lblQuantity.setText("Quantity");
	lblQuantity.setFont(new Font("Serif", Font.PLAIN, 16));
	lblQuantity.setBounds(20,150,100,30);
	
	//add button to multiply price and quantity to show total amount
	btnAdd.setText("ADD");
	btnAdd.setBounds(120,190,60,30);
	btnAdd.addActionListener(this);
	
	lblTotal.setText("Total");
	lblTotal.setFont(new Font("Serif", Font.PLAIN, 16));
	lblTotal.setBounds(20,230,100,30);

	//credit card details to pay after ordering drink 
	lblCreditCard.setText("Credit Card");
	lblCreditCard.setFont(new Font("Serif", Font.PLAIN, 16));
	lblCreditCard.setBounds(20,270,100,30);
	
	//format of credit card
	lblCreditCardFormat.setText("'xxxx xxxx xxxx xxxx'");
	lblCreditCardFormat.setBounds(100, 300, 150, 15);
	lblCreditCardFormat.setFont(new Font("SansSerif", Font.PLAIN, 12));
	lblCreditCardFormat.setForeground(Color.GRAY);
	
	txtPrice.setBounds(100,110,180,30);
	txtPrice.setText("140");
	txtPrice.setForeground(Color.red);
	txtPrice.setEditable(false);
	
	txtQuantity.setBounds(100,150,180,30);
	
	txtCreditCard.setBounds(100,270,180,30);
	
	txtTotal.setBounds(100,230,180,30);
	txtTotal.setEditable(false);
	
	btnOrder.setText("ORDER");
	btnOrder.setBounds(25,320,100,30);
	btnOrder.addActionListener(this);
	
	btnClose.setText("CLOSE");
	btnClose.setBounds(175,320,100,30);
	btnClose.addActionListener(this);
	
	panel.add(lblCreditCardFormat);
	panel.add(txtCreditCard);
	panel.add(lblCreditCard);
	panel.add(btnClose);
	panel.add(btnOrder);
	panel.add(txtTotal);
	panel.add(btnAdd);
	panel.add(lblTotal);
	panel.add(lblQuantity);
	panel.add(txtQuantity);
	panel.add(txtPrice);
	panel.add(lblPrice);
	panel.add(boxDrinks);
	panel.add(lblBarName);
	panel.add(lblDrink);
	
	frame.add(panel);
	frame.add(lblImage);
	
	frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==boxDrinks) {
		//getting the selected drink from conbobox and changing price according to drink
		if (boxDrinks.getSelectedIndex()==0) {
			int price = 140;
			String unitPrice = price+"";
			//setting price of drink
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		
		else if (boxDrinks.getSelectedIndex()==1) {
			int price = 233;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==2) {
			int price = 222;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==3) {
			int price = 211;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==4) {
			int price = 244;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==5) {
			int price = 390;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==6) {
			int price = 70;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==7) {
			int price = 450;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==8) {
			int price = 333;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxDrinks.getSelectedIndex()==9) {
			int price = 398;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		
	}
	else if (e.getSource()==btnAdd) {
		if(txtQuantity.getText().isEmpty()) {
			//throwing error message if quantity field is empty 
			JOptionPane.showMessageDialog(frame, "Please enter number of Quantity");
		}
		else {
	int price = Integer.parseInt(txtPrice.getText());
	int quantity = Integer.parseInt(txtQuantity.getText());
	//multiplying quantity and price to calculate total amount 
	int total = price*quantity;
	String totalAmount = total+"";
	txtTotal.setText(totalAmount);
		}
	}
	
	else if (e.getSource()==btnOrder) {
		if(txtQuantity.getText().isEmpty()) {
			//checking if quantity field is empty and throwing message
			JOptionPane.showMessageDialog(frame, "Please enter number of Quantity");
		}
		else if(txtCreditCard.getText().isEmpty()) {
			//checking if credit card text field is empty and throwing message
			JOptionPane.showMessageDialog(frame, "Enter your credit card number to place an order");
		}
		else {
		 JOptionPane.showMessageDialog(frame, "ORDER PLACED SUCESSFULLY");
			  // Clear the text field
		 		txtCreditCard.setText("");
				txtTotal.setText("");
				txtQuantity.setText("");
		}
		}
	
	else if(e.getSource()==btnClose) {
		//dispose frame if close button is clicked
		frame.dispose();
	}
	
	}
	public static void main(String[] args) {
		//creating instance of bar class and launching bar page
			new Bar();
	}


}
