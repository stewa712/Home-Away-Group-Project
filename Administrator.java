//Created By Zachary Stewart
//ID: 2101823

package HomeAway;

//Importing scanner package to receive input from the user
import java.util.Scanner;

//package readingFiles;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;



//Creating Administrator Parent Class

public class Administrator {	
	
	
	
	//Attributes of Administrator Class
	
	protected int id;
	protected Name name;
	protected String username;
	protected String password;
	
	// Default Constructor
	public Administrator()
	{
		id = 0000;
		name = new Name();
		username = "";
		password = "";
		
	}
	
	// Primary Constructor 
	public Administrator(int id, Name name, String username, String password)
	{
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		
	}
	
	// Copy Constructor
	public Administrator(Administrator obj)
	{
		this.id = obj.id;
		this.name = obj.name;
		this.username = obj.username;
		this.password = obj.password;
		
	}

	//Generating the Accesors and Mutators
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//Method to enter data for new Staff Member and write to file
	public void newStaff() {

		
		
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);
			
		String CHOICE= " ";   
	    System.out.print("Staff Record File Access");
	    System.out.print("\n\n");	
		    
		  while(CHOICE.charAt(0) != 'q')
		     {
		    	 System.out.print("\n\n");	
		    	 System.out.print("\n----------- Menu -------------");	
		    	 System.out.print("\n|  (C)reate A New Staff File |");
		    	 System.out.print("\n|  (A)dd A Record            |");
		    	 System.out.print("\n|  (D)isplay Record          |");
		    	 System.out.print("\n|  (Q)uit                    |");
		    	 System.out.print("\n--------------------------\n");
		     	 System.out.print("Please Enter your Choice: \n");
		    	 
		    	 CHOICE = INPUT.nextLine();
		    	 CHOICE = CHOICE.toLowerCase(); 
		    	 
		    	 switch(CHOICE.charAt(0))
		    	 {
		    	 case 'c': 
		    	
		    		 //Creating the file 
		    			File myFile = new File ("staff.txt");
		    			File myFile1 = new File ("staffusrpass.txt");
		    			
		    			try {
		    				if(myFile.createNewFile())
		    				{
		    					System.out.println("Staff File Ceated Scuccessfully");
		    				}
		    				else {
		    					System.out.println("Staff File Creation Error");
		    				} 
		    			} catch (IOException e) {
		    				System.out.println("Staff File Error");
		    			}
		    			
		    			try {
		    				if(myFile1.createNewFile())
		    				{
		    					System.out.println("Staff Usr/Pass File Ceated Scuccessfully");
		    				}
		    				else {
		    					System.out.println("Staff Usr/Pass File Creation Error");
		    				} 
		    			} catch (IOException e) {
		    				System.out.println("Staff Usr/Pass File Error");
		    			}
		    		 
		    		 break;
		    		    		 
		    	 case 'a':
		    		 	System.out.println("Enter Staff ID: ");
						int code = s.nextInt();
												
						System.out.println("Enter First Name: ");
						String fname = s1.nextLine();
						
						System.out.println("Enter Middle Name: ");
						String mname = s1.nextLine();
						
						System.out.println("Enter Last Name: ");
						String lname = s1.nextLine();
										
						System.out.println("Enter Username: ");
						String usrname = s1.nextLine();									
													
						System.out.println("Enter Password: ");
						String password = s1.nextLine();
						
						
		 			try {
		 			FileWriter output = new FileWriter ("staff.txt",true);
		 			output.write(code+ " ");
		 			output.write("\n");
		 			output.write(fname+ " ");
		 			output.write("\n");
		 			output.write(mname+ " ");
		 			output.write("\n");
		 			output.write(lname+" ");
		 			output.write("\n");
		 			output.write(usrname+" ");
		 			output.write("\n");
		 			output.write(password+" ");
		 			System.out.println("\n\n");
		 			System.out.println("Data Appended Successfully");	
		 			output.close(); 
		 			} catch (IOException e) {
		 				System.out.println("File Append Error");	
		 			} 
		 			
		 			try {
			 			FileWriter output = new FileWriter ("staffusrpass.txt",true);
			 			
			 			output.write(usrname+" ");
			 			output.write("\n");
			 			output.write(password+" ");
			 			output.write("\n");
			 			
			 			System.out.println("\n\n");
			 			System.out.println("Data Appended Successfully");	
			 			output.close(); 
			 			} catch (IOException e) {
			 				System.out.println("File Append Error");	
			 			} 
	 
		    	 break; 
		    	 
		    		    	 
		    	 case 'd': 
		    		 
		    		 char[] data= new char [1000];
						
		 			try {
		 				
		 				FileReader input = new FileReader ("staff.txt");
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
		    	 
		     }//End while				
				
				
	}
	
	
	// Tostring method to display attribute values
	public String toString()
	{
		String output;
		
		output  = "I.D                                            : "+id;
		output +="\nFirst Name                                    : "+name.GetFname();
		output +="\nMiddle Name                                   : "+name.GetMName();
		output +="\nLast Name                                     : "+name.GetLName();
		output +="\nUsername                                      : "+username;
		output +="\nPassword                                      : "+password;
		
		return output;
	}


}
