package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Restaurant implements ActionListener{
	//declaring variables
	JFrame frame;
	JPanel panel;
	JLabel lblImage;
	JLabel lblBarName;
	JLabel lblDrink;
	JLabel lblPrice;
	JComboBox boxFoods;
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
	
	public Restaurant() {
		//initializing variables
	frame = new JFrame();
	panel = new JPanel();
	lblImage = new JLabel();
	lblBarName = new JLabel();
	lblDrink = new JLabel();
	lblPrice = new JLabel();
	txtPrice = new JTextField();
	lblQuantity = new JLabel();
	txtQuantity = new JTextField();
	boxFoods = new JComboBox();
	btnAdd = new JButton();
	lblTotal = new JLabel();
	txtTotal = new JTextField();
	txtCreditCard = new JTextField();
	btnOrder = new JButton();
	btnClose = new JButton();
	lblCreditCard = new JLabel();
	lblCreditCardFormat = new JLabel();
	
	//properties of frame
	frame.setTitle("Restaurant : "+LoginTest.username);
	frame.setLayout(new GridLayout(1,2));
	frame.setSize(600, 400);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	
	//set image of restaurant
	ImageIcon image = new ImageIcon("photos/Restaurantt.jpg");
	lblImage.setIcon(image);
	
	//set panel background and layout
	panel.setBackground (new Color(255, 255, 200));
	panel.setLayout(null);
	
	lblBarName.setText("Bites and Delights");
	lblBarName.setFont(new Font("Pacifico", Font.BOLD, 16));
	lblBarName.setBounds(80,10,200,30);
	
	lblDrink.setText("Drinks ");
	lblDrink.setFont(new Font("Serif", Font.BOLD, 24));
	lblDrink.setBounds(20,60,100,30);
	
	String foods[] = {"Sushi", "Tacos", "Steak", "PadThai", "Lobster", "Burger", "Ravioli", "Curry", "Falafel", "Bruschetta"};
	boxFoods = new JComboBox(foods);
	boxFoods.setFocusable(false);
	boxFoods.setBounds(100,60,180,30);
	boxFoods.addActionListener(this);
	boxFoods.setSelectedIndex(0);
	
	lblPrice.setText("Price");
	lblPrice.setForeground(Color.red);
	lblPrice.setFont(new Font("Serif", Font.PLAIN, 16));
	lblPrice.setBounds(20,110,100,30);
	
	lblQuantity.setText("Quantity");
	lblQuantity.setFont(new Font("Serif", Font.PLAIN, 16));
	lblQuantity.setBounds(20,150,100,30);
	
	btnAdd.setText("ADD");
	btnAdd.setBounds(120,190,60,30);
	btnAdd.addActionListener(this);
	
	lblTotal.setText("Total");
	lblTotal.setFont(new Font("Serif", Font.PLAIN, 16));
	lblTotal.setBounds(20,230,100,30);

	lblCreditCard.setText("Credit Card");
	lblCreditCard.setFont(new Font("Serif", Font.PLAIN, 16));
	lblCreditCard.setBounds(20,270,100,30);
	
	lblCreditCardFormat.setText("'xxxx xxxx xxxx xxxx'");
	lblCreditCardFormat.setBounds(100, 300, 150, 15);
	lblCreditCardFormat.setFont(new Font("SansSerif", Font.PLAIN, 12));
	lblCreditCardFormat.setForeground(Color.GRAY);
	
	txtPrice.setBounds(100,110,180,30);
	txtPrice.setText("280");
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
	
	//adding components to panel
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
	panel.add(boxFoods);
	panel.add(lblBarName);
	panel.add(lblDrink);
	
	//adding components to frame
	frame.add(panel);
	frame.add(lblImage);
	
	frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==boxFoods) {
		//getting the selected food from conbobox and changing price according to food
		if (boxFoods.getSelectedIndex()==0) {
			//setting price of food
			int price = 280;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		
		else if (boxFoods.getSelectedIndex()==1) {
			int price = 253;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==2) {
			int price = 232;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==3) {
			int price = 343;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==4) {
			int price = 254;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==5) {
			int price = 590;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==6) {
			int price = 350;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==7) {
			int price = 150;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==8) {
			int price = 343;
			String unitPrice = price+"";
			txtPrice.setText(unitPrice);
			txtQuantity.setText("");
			txtTotal.setText("");
		}
		else if (boxFoods.getSelectedIndex()==9) {
			int price = 328;
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
		//creating instance of Restaurant class and launching Restaurant page
			new Restaurant();
	}


}
