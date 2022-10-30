//Created By Zachary Stewart
//ID: 2101823
//CIT 2004 UM1 Tuesday 8am Lab Group Project

package HomeAway;


import java.util.ArrayList;
import java.util.Collection;
//Importing scanner package to receive input from the user
import java.util.Scanner;


//Importing Java input/output packages to create files
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


public class Driver {

	public static void main(String[] args) {
		
		
		
		System.out.println("*******************************************************************\n");
		
		System.out.println("            T H E   H O M E   &    A W A Y   I N S T I T U T E\n");
		
		System.out.println("*******************************************************************\n");     
       
		
		
		//--------------------------------------------------------------------------------------------------------------------------
		
		//  --------------------------------- D A T A    E N T R Y    F O R   F I L E S -------------------------------------------   
		
		//--------------------------------------------------------------------------------------------------------------------------
		
		while(true) {				
				
					
				//Creating local variables to verify the username and password			
				String username, password;
				
				Scanner s = new Scanner(System.in);
				
				System.out.println("*********      S Y S T E M  L O G I N         *********\n");
				
				while (true) 
				{
		            System.out.print("Enter username: ");
		            username = s.nextLine();
		            System.out.print("Enter password: ");
		            password = s.nextLine();
		            
		            if(username.equals("user") && password.equals("user")) 
		            {
		                break;
		            }//End if
		            
		            System.out.println("Authentication Failed. Please try again.\n");
		        }//End login while
				
		        System.out.println("Authentication Successful.\n");
			
				
				System.out.println("\nEntering Staff Details.\n");
				
				//Creating Array List to store records of each entry
				
				ArrayList<String> stf = new ArrayList<String>();
				
				
				
				
				
				//Adding records for staff to the Array List
				
				Administrator adm = new Administrator();
				
			
				adm.newStaff();
				
				int stfID = adm.getID();
				
				stf.add(new ArrayList(stfID));
				
				
			    System.out.println(stfID);
										
			
			
			
			
		}//End outer while
		
		
		
		
		
		
		
		
		
		
		
        
        
	}//End main

	

}//End class
