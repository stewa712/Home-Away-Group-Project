
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
	}	  
		public static void addCourse() {
			
			  Scanner s= new Scanner(System.in);
			  Scanner s1= new Scanner(System.in);
				
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
				output.write("\n");
				output.write(code);
				output.write("\n");
				output.write(name);
				output.write("\n");
				output.write(desc);
				output.write("\n");
				output.write(credits);
				output.write("\n");
				output.write(preR);
				System.out.println("Data Appended Successfully");	
				output.close(); 
				} catch (IOException e) {
					System.out.println("File Append Error");
				}

		}
		
		
		public static void DisplayCourse()
		{
		 char[] data= new char [100];
			
			try {
				FileReader input = new FileReader ("Course1.txt");
				input.read(data);
				System.out.println("Data Retrieved From File");
				System.out.println(data);
				input.close();
			} catch (IOException e) {
				
				System.out.println("File Read Error");
			}		
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
					
		
	
	 
 

	
	
