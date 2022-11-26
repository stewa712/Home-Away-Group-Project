//Created By: Aaliyah Adebukunola, Aaron Brown, Kevaughn Miles, Zachary Stewart
//ID: 2101823
//CIT 2004 UM1 Tuesday 8am Lab Group Project

package HomeAway;


import java.util.ArrayList;
import java.util.Collection;
//Importing scanner package to receive input from the user
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Importing Java input/output packages to create files
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


public class Driver {	
	
	
	private static JLabel label1;
	private static JLabel label2;
	private static JLabel label3;
	private static JLabel label4;
	private static JLabel label5;
	private static JTextField selectLabel;
	private static JButton button;


	public static void main(String[] args) {	
		
		System.out.println("\t\t\t\t\t\t*******************************************************************\n");
		
		System.out.println("\t\t\t\t\t\t            T H E   H O M E   &    A W A Y   I N S T I T U T E\n");
		
		System.out.println("\t\t\t\t\t\t*******************************************************************\n"); 
		
		
		
		while(true) {
			
			
			
			
			 //Creating objects of each class to manipulate data and access files
			
			Verification vfy = new Verification(); 
			
			/*
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			
			frame.setSize(500, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.add(panel);
			
			
			
			panel.setLayout(null);
			
			
			
			label1 = new JLabel("(1) Administration");
			label1.setBounds(10,20,200,25);
			panel.add(label1);
			
			label2 = new JLabel("(2) Staff");
			label2.setBounds(10,50,200,25);
			panel.add(label2);
			
			label3 = new JLabel("(3) Student");
			label3.setBounds(10,80,200,25);
			panel.add(label3);
			
			label4 = new JLabel("(4) Quit");
			label4.setBounds(10,110,200,25);
			panel.add(label4);
			
			label4 = new JLabel("Enter Selection");
			label4.setBounds(10,140,200,25);
			panel.add(label4);
			
			selectLabel = new JTextField(5);
			selectLabel.setBounds(100, 140, 50, 25);
			selectLabel.addActionListener(new Driver());
			panel.add(selectLabel);
			
			button = new JButton("Select");
			button.setBounds(10, 170, 100, 25);
			panel.add(button);
			
					
			*/
			
						
			
			 System.out.print("\n-----------Main Menu-------------");	
		   	 System.out.print("\n|  (1)Administrator          |");
		   	 System.out.print("\n|  (2)Staff                  |");
		   	 System.out.print("\n|  (3)Student                |");
		   	 System.out.print("\n|  (4)Quit                   |");
		   	 System.out.print("\n---------------------------------\n");
	    	 System.out.print("Please Enter your Choice: \n");
	    	
	    	 try {
	    		 
	    		 //Creating scanner to store user input
		    	 Scanner ch = new Scanner(System.in);
		    	 int choice = ch.nextInt();
		    	 
		    	 
		    	//Administrator validation
		       	 if(choice==1) {
		       		 
		       		
		       		
		       		 try {
		       			 
		       			 String username, password;
		       			
				 		 Scanner s = new Scanner(System.in);
		    			
		    						
		    			System.out.println("\n\n\n********** A D M I N    L O G I N **********\n");
		    			
		    			while (true) 
		    			{
		    				
		    				
		    				
		    				System.out.print("Enter username: ");
			 	            username = s.nextLine();
			 	            System.out.print("Enter password: ");
			 	            password = s.nextLine();
			 	            vfy.adminVerify(username, password);
			 	            break;
			 	           
			 	           
		    				/*
		    				String usrnme = JOptionPane.showInputDialog("Enter Username: ");
		    				username = usrnme;
		    				String psswrd = JOptionPane.showInputDialog("Enter Password: ");
		    				password = psswrd;
		    	            vfy.adminVerify(username, password);
		    	            break;*/
		    	            
		    	            
		    			}//End while
		       		 
		       			 
		       		 }catch(Exception ex) {
		       			 
		       			JOptionPane.showMessageDialog(null, "Please enter valid inputs","System Error", JOptionPane.INFORMATION_MESSAGE);		 
		       		 }
		       		
		       	 }//End choice 1 if
		       	 
		    	 
		    	 
				
		    	 
		    	 
		    	 //Staff validation
		    	 if(choice==2) {
		    		 
		    		 String username, password;
			 			
			 			Scanner s = new Scanner(System.in);
			 			
			 			System.out.println("\n\n\n*********S T A F F   L O G I N **********\n");
			 			
			 			while (true) 
			 			{
			 				System.out.print("Enter username: ");
			 	            username = s.nextLine();
			 	            System.out.print("Enter password: ");
			 	            password = s.nextLine();
			 	            vfy.staffVerify(username, password);
			 	            break;
			 	            
			 	            
			 			}//End while
			    		 
		    		 
		    	 }//End choice 2 if
		    	 
		    	 
		    	//Student validation
		    	 if(choice==3) {
		    		 
		    		 String username, password;
			 			
			 			Scanner s = new Scanner(System.in);
			 			
			 			System.out.println("\n\n\n*********S T U D E N T   L O G I N **********\n");
			 			
			 			while (true) 
			 			{
			 				System.out.print("Enter username: ");
			 	            username = s.nextLine();
			 	            System.out.print("Enter password: ");
			 	            password = s.nextLine();
			 	            vfy.stuVerify(username, password);
			 	            break;
			 	            
			 	            
			 			}//End while
			    		 
		    		 
		    	 }//End choice 3 if
		    	 
		    	 
		    	 if(choice==4) {
		    		 
		    		 System.out.println("\n\nGoodbye!");
		    		 System.exit(1);
		    	 }//End choice 4 if
		    	 
		    	 
		    	 if(choice!=1 && choice!=2 && choice!=3 && choice!=4) {
		    		 
		    		 System.out.println("\nInvalid Entry\n\n");
		    		 continue;
		    		 
		    	 }//End invalid if
		    	 
	    		 
	    	 }catch(Exception e) {
	    		 
	    		  System.err.println("Invalid Entry!");
	    		 System.err.println("Must enter number value");
	    			    		 
	    	 }finally{
	    		 
	    		 System.out.println("\n\n");
	    		 continue;	    		
	    	 }
			
			
		}//End outer while	
		
        
        
	}//End main

	/*

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int choice = Integer.parseInt(selectLabel.getText());
		
		 Verification vfy = new Verification();
				
		//Administrator validation
   	 if(choice==1) {
   		 
   		
   		
   		 try {
   			 
   			 String username, password;
			
						
			System.out.println("\n\n\n********** A D M I N    L O G I N **********\n");
			
			while (true) 
			{
				String usrnme = JOptionPane.showInputDialog("Enter Username: ");
				username = usrnme;
				String psswrd = JOptionPane.showInputDialog("Enter Password: ");
				password = psswrd;
	            vfy.adminVerify(username, password);
	            break;
	            
	            
			}//End while
   		 
   			 
   		 }catch(Exception ex) {
   			 
   			JOptionPane.showMessageDialog(null, "Please enter valid inputs","System Error", JOptionPane.INFORMATION_MESSAGE);		 
   		 }
   		
   	 }//End choice 1 if
   	 
   	 
   	 	
 	//Administrator validation
   	 if(choice==2) {
   		 
   		
   		
   		 try {
   			 
   			 String username, password;
						
						
			while (true) 
			{
				String usrnme = JOptionPane.showInputDialog("Enter Username: ");
				username = usrnme;
				String psswrd = JOptionPane.showInputDialog("Enter Password: ");
				password = psswrd;
	            vfy.adminVerify(username, password);
	            break;
	            
	            
			}//End while
   		 
   			 
   		 }catch(Exception ex) {
   			 
   			JOptionPane.showMessageDialog(null, "Sysyem Error!");		 
   		 }
   		
   	 }//End choice 2 if
		
	}*/
	

	

}//End class
