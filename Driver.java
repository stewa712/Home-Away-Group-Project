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
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


public class Driver {	
	


	public static void main(String[] args) {	
		
		
		
		
		System.out.println("*******************************************************************\n");
		
		System.out.println("            T H E   H O M E   &    A W A Y   I N S T I T U T E\n");
		
		System.out.println("*******************************************************************\n"); 
		
		
       
		
		
		Administrator adm = new Administrator();
		adm.newStaff();
		Verification vfy = new Verification();
		
		String username, password;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("********* S Y S T E M  L O G I N *********\n");
		
		while (true) 
		{
			System.out.print("Enter username: ");
            username = s.nextLine();
            System.out.print("Enter password: ");
            password = s.nextLine();
            vfy.staffVerify(username, password);
           
            
            
            
		}
            
                        
            
        
		
		
		
		
		
		
		
		
		
        
        
	}//End main

	

}//End class
