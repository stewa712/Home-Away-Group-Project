package records;

//Importing scanner package to receive input from the user
import java.util.Scanner;

//package readingFiles;
import java.io.*;
import java.util.*;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;


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

	//Generating the Accessors and Mutators
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
		Scanner input = new Scanner (System.in);
		Formatter output = null;

		
		
		String CHOICE = " ";   
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
		    		 try
		    		 {
		    			 output = new Formatter ("staff.txt");
		    	     }
		    				catch (SecurityException securityException)
		    				{
		    					System.err.println("Write permission denied. Terminating.");
		    					System.exit(1); // terminate the program
		    				}
		    				catch (FileNotFoundException fileNotFoundException)
		    				{
		    					System.err.println("Error opening file. Terminating.");
		    					System.exit(1); // terminate the program
		    				}
		    		 break;
		    		    		 
		    	 case 'a':
		    		 //OPEN FILE staff.txt
		    		 try
		    		 {
		    			 output = new Formatter ("staff.txt"); //open the file
		    		 }
		    		 catch (SecurityException securityException)
		    		 {
		    			 System.err.println("Write permission denied. Terminating.");
		    			 System.exit(1); // terminate the program
		    		 }
		    		 catch (FileNotFoundException fileNotFoundException)
		    		 {
		    			 System.err.println("Error opening file. Terminating.");
		    			 System.exit(1); // terminate the program
		    		 }
		    		 
		    		 //ADD RECORDS TO FILE
		    		 System.out.printf("%s%n%s%n", "Enter staff ID, first name, middle name, last name, username and password.", "Enter end-of-file indicator (Ctrl+Z) to end input.");
		    		 
		    		 while (input.hasNext()) // loop until end-of-file indicator
		    		 {
		    			 try
		    			 {
		    				 // output new record to file; assumes valid input
							 output.format("%d %s %s %s %s %s%n", input.nextInt(), input.next(), input.next(), input.next(), input.next(), input.next());
						 }
						 catch (FormatterClosedException formatterClosedException)
						 {
							 System.err.println("Error writing to file. Terminating.");
							 break;
						 }
						 catch (NoSuchElementException elementException)
						 {
							 System.err.println("Invalid input. Please try again.");
							 input.nextLine(); // discard input so user can try again
						 }
							
						 //System.out.print("? ");
					 }// end while
								
		    	 	 // close file
					 if (output != null)
						 output.close();
					
					 
					 //OPEN FILE staff.txt
					 try
					 {
						 input = new Scanner(Paths.get("staff.txt"));
					 }
					 catch (IOException ioException)
					 {
						 System.err.println("eRROR OPENING FILE. Terminsting.");
						 System.exit(1);
					 }
					 
					 //READ RECORD FROM FILE
					 System.out.println("\n\n");
					 System.out.printf("%-12s%-12s%-12s%-12s%10s%10s%n", "ID Number", "First Name", "Middle Name", "Last Name", "Username", "Password");
					 
					 try
					 {
						 while (input.hasNext()) // while there is more to read
						 {
							 //display record contents
							 System.out.printf("%-12d%-12s%-12s%-12s%10s%10s%n", input.nextInt(), input.next(), input.next(), input.next(), input.next(), input.next());
						 }
					 }
					 catch (NoSuchElementException elementException)
					 {
						 System.err.println("File improperly formed. Terminating.");
					 }
					 catch (IllegalStateException stateException)
					 {
						 System.err.println("Error reading from file. Terminating. ");
					 }
							
					 // close file
					 if (input != null)
						 input.close();		
							
					 break;
							
		    	/* case 'd': 
		    		 
		    		 char[] data= new char [100];
						
		 			try {
		 				FileReader input = new FileReader ("staff.txt");
		 				input.read(data);
		 				System.out.println("Data Received From File");
		 				System.out.println(data);
		 				input.close();
		 			} catch (IOException e) {
		 				
		 				System.out.println("File Read Error");
		 			}
		 			
		    	 break; */
		    	 		  	 
		    	 case 'q': break; 
		    	 default :  System.out.print("\n\tInvald Input\n");
		    	 }    	 
		     }//End while									
	}
	
	// toString method to display attribute values
	public String toString()
	{
		String output;
		
		output  = "I.D                                            : "+id;
		output +="\nFirst Name                                    : "+name.GetFName();
		output +="\nMiddle Name                                   : "+name.GetMName();
		output +="\nLast Name                                     : "+name.GetLName();
		output +="\nUsername                                      : "+username;
		output +="\nPassword                                      : "+password;
		
		return output;
	}
}