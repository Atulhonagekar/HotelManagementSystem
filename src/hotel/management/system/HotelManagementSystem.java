/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                setSize(1200,730);          
                //setContentPane(300,300,1366,390);   //frame size
                setLayout(null);
                setLocation(90,0);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                b1.setFont(new Font("serif",Font.BOLD,20));

                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1200, 730,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("PREM HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(70,30,2500,630);
                lid.setFont(new Font("serif",Font.PLAIN,60));
                lid.setForeground(Color.white);
                l1.add(lid);
                
                b1.setBounds(1045,625,100,50);
		l1.setBounds(0, 0, 1200, 730);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}