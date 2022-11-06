package p1;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class CourseRecords{
	
	public static Scanner INPUT = new Scanner (System.in);
	public static Course CG;

	public static void main(String[] args)  
	{
		  Scanner s= new Scanner(System.in);
		  Scanner s1= new Scanner(System.in);	
			
			String CHOICE= " ";   
		    System.out.print("Course Record File Access");
		    System.out.print("\n\n");	
		    
		  while(CHOICE.charAt(0) != 'q')
		     {
		    	 System.out.print("\n\n");	
		    	 System.out.print("\n---------Main Menu------------");	
		    	 System.out.print("\n|   (C)reate A Course File   |");
		    	 System.out.print("\n|   (A)dd A Record           |");
		    	 System.out.print("\n|   (D)isplay Record         |");
		    	 System.out.print("\n|   (Q)uit                   |");
		    	 System.out.print("\n--------------------------\n");
		     	 System.out.print("Please Enter your Choice: \n");
		    	 
		    	 CHOICE = INPUT.nextLine();
		    	 CHOICE = CHOICE.toLowerCase(); 
		    	 
		    	 switch(CHOICE.charAt(0))
		    	 {
		    	 case 'c': 
		    	
		 			File myFile = new File ("Course1.txt");
		 			
		 			try {
		 				if(myFile.createNewFile())
		 				{
		 					System.out.println("File Ceated Scuccessfully");
		 				}
		 				else {
		 					System.out.println("File Creation Error");
		 				}
		 			} catch (IOException e) {
		 				System.out.println("File Error");
		 			}
		    		 
		    		 break;
		    		    		 
		    	 case 'a':
		    		 System.out.println("\n");	
		    		    System.out.println("Enter Code: ");
						String code = s1.nextLine();
												
						System.out.println("Enter Name: ");
						String name = s1.nextLine();
										
						System.out.println("Enter Description: ");
						String desc = s1.nextLine();				
						
						System.out.println("Enter Credtis: ");
						int credits = s.nextInt();
						
						System.out.println("Enter Pre-Requisites: ");
						String preR = s1.nextLine();
						
		 			try {
		 			FileWriter output = new FileWriter ("Course1.txt",true);
		 			output.write(code);
		 			output.write(name);
		 			output.write(desc);
		 			output.write(credits);
		 			output.write(preR);
		 			System.out.println("Data Appended Successfully");	
		 			output.close(); 
		 			} catch (IOException e) {
		 				System.out.println("File Append Error");	
		 			} 
	 
		    	 break; 
		    	 
		    		    	 
		    	 case 'd': 
		    		 
		    		 char[] data= new char [100];
						
		 			try {
		 				FileReader input = new FileReader ("Course1.txt");
		 				input.read(data);
		 				System.out.println("Data Received From File");
		 				System.out.println(data);
		 				input.close();
		 			} catch (IOException e) {
		 				
		 				System.out.println("File Read Error");
		 			}
		 			
		    	 break; 
		    	 		  	 
		    	 case 'q': break; 
		    	 default :  System.out.print("\n\tInvald Input\n");
		    	 }
		     }
		   
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
//------------------------------------------------------------------------------------------------------------
			
		  /*create the file 
			File myFile = new File ("Course1.txt");
			
			try {
				if(myFile.createNewFile())
				{
					System.out.println("File Ceated Scuccessfully");
				}
				else {
					System.out.println("File Creation Error");
				} 
			} catch (IOException e) {
				System.out.println("File Error");
			}*/
		
//------------------------------------------------------------------------------------------------------------
				
			/*write data to the file 
			String code = s1.nextLine();
			String name = s1.nextLine();
			String desc = s1.nextLine();
			int credits = s.nextInt();
			String preR = s1.nextLine();
			
			
			try {
				FileWriter output = new FileWriter ("Course1.txt");
				output.write(code);
				output.write(name);
				output.write(desc);
				output.write(credits);
				output.write(preR);
				System.out.println("Data is written Successfully");
				output.close();
			} catch (IOException e) {
				
				System.out.println("File Write Error");
			}*/
//------------------------------------------------------------------------------------------------------------
			
			
			/*Read data from the file 
			char[] data= new char [100];
						
			try {
				FileReader input = new FileReader ("Course1.txt");
				input.read(data);
				System.out.println("Data Received From File");
				System.out.println(data);
				input.close();
			} catch (IOException e) {
				
				System.out.println("File Read Error");
			}*/
//------------------------------------------------------------------------------------------------------------
						
			/*Append Data to File 
			String code = s1.nextLine();
			String name = s1.nextLine();
			String desc = s1.nextLine();
			int credits = s.nextInt();
			String preR = s1.nextLine();
			
			try {
			FileWriter output = new FileWriter ("Course1.txt",true);
			output.write(code);
			output.write(name);
			output.write(desc);
			output.write(credits);
			output.write(preR);
			System.out.println("Data Appended Successfully");	
			output.close(); 
			} catch (IOException e) {
				System.out.println("File Append Error");	
			} */

//------------------------------------------------------------------------------------------------------------
					
		
	}	
}

	 
 

	
	
