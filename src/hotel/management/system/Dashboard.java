/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ATUL HONAGEKAR
 */


package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel AirlineManagementSystem = new JLabel("THE PREM-HOTEL GROUP WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.black);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	AirlineManagementSystem.setBounds(270, 60, 1000, 85);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	menuBar.setBackground(Color.darkGray);
	menuBar.setSize(20,32);

        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setForeground(Color.white);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	AirlineSystem.add(FlightDetails);
		
	JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.white);
	menuBar.add(AirlineSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	AirlineSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
	AirlineSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRooms().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	AirlineSystemHello.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}