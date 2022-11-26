//Author: Zachary Stewart & Aaliyah Adebukunola

package records;

//Importing scanner package to receive input from the user
import java.util.Scanner;

//package readingFiles;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

//Creating Administrator Parent Class
public class Administrator 
{	
	//Attributes of Administrator Class	
	protected String id;
	protected Name name;
	protected String username;
	protected String password;
	
	// Default Constructor
	public Administrator()
	{
		id = "";
		name = new Name();
		username = "";
		password = "";		
	}
	
	//Primary Constructor 
	public Administrator(String id, Name name, String username, String password)
	{
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;		
	}
	
	//Copy Constructor
	public Administrator(Administrator obj)
	{
		this.id = obj.id;
		this.name = obj.name;
		this.username = obj.username;
		this.password = obj.password;		
	}

	//Generating the Accessors and Mutators
	public String getID() 
	{
		return id;
	}

	public void setID(String id) 
	{
		this.id = id;
	}

	public Name getName() 
	{
		return name;
	}

	public void setName(Name name) 
	{
		this.name = name;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	//Method to enter/view data for new Staff Members
	public void newStaff() 
	{
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);			
		String CHOICE = "a";
		
		do
		{
		    System.out.println("\n---------------- A D M I N I S T R A T O R  M E N U ----------------");
		    System.out.println("|                                                                  |");
		    System.out.println("|  (A)dd A Staff Account                                           |");
		    System.out.println("|  (D)isplay Staff                                                 |");
		    System.out.println("|  (Q)uit                                                          |");
		    System.out.println("|                                                                  |");
		    System.out.println("--------------------------------------------------------------------");
		    System.out.print("Please Enter your Choice: ");
		    	 
		    CHOICE = INPUT.nextLine().toLowerCase(); //converts user input to lower case
		    	 
		    switch(CHOICE.charAt(0))
		    {
		    	//Add Staff
		    	case 'a':
		    		Scanner INPUT1 = new Scanner (System.in);		    				
		   			String CHOICE1= "a";
		    		File myFile = new File ("staff.txt");
			    	File myFile1 = new File ("staffusrpass.txt");						   		
			   		 
			   		try
			    	{
			   			if (!myFile.exists()) 
			   			{
			   				myFile.createNewFile(); //creates a student file if none exists
			    			System.out.println("[Staff File Created Successfully]");
			    		}
			    	}
			   		catch (IOException e)
			   		{
			   			System.err.println("Staff File Could Not Be Created.");
			   		}
		    		 
			   		try
			   		{
		    			if (!myFile1.exists())
		    			{
			    			 myFile1.createNewFile(); //creates a student login file if none exists
			    			 System.out.println("[Staff Login File Created Successfully]");
			   			}
			   		}
			   		catch (IOException e)
			   		{
			   			System.err.println("Staff Login Could Not Be Created.");
			   		} 
		   			
		   			do
		   			{				   				
		   		    	switch(CHOICE1.charAt(0))
		   		    	{
		   		    		// Add another
		   		    		case 'a': 
		   		    			// Populating the staff record via user input
		   		    			System.out.println("\n\n\n--------------- A D D I N G  S T A F F  R E C O R D ----------------\n"); 
		   		    		 	System.out.print("Enter Staff ID: ");
		   						String code = s1.nextLine();
		   												
		   						System.out.print("Enter First Name: ");
		   						String fName = s1.nextLine();
		   						
		   						System.out.print("Enter Middle Name: ");
		   						String mName = s1.nextLine();
		   						
		   						System.out.print("Enter Last Name: ");
		   						String lName = s1.nextLine();
		   										
		   						System.out.print("Enter Username: ");
		   						String username = s1.nextLine();									
		   													
		   						System.out.print("Enter Password: ");
		   						String password = s1.nextLine();
		   						
		   						//Writing user input to file
			   		 			try 
			   		 			{
				   		 			FileWriter output = new FileWriter ("staff.txt", true);
				   		 			output.write(code+ " ");
				   		 			output.write("\n");
				   		 			output.write(fName+ " ");
				   		 			output.write("\n");
				   		 			output.write(mName+ " ");
				   		 			output.write("\n");
				   		 			output.write(lName+" ");
				   		 			output.write("\n");
				   		 			output.write(username+" ");
				   		 			output.write("\n");
				   		 			output.write(password+" ");	
				   		 			System.out.println("\n"+fName+" "+lName+" ("+code+") was Registered Successfully!"); // Informing the user that the staff has been registered	
				   		 			output.close(); 
			   		 			} 
			   		 			catch (IOException e) 
			   		 			{
			   		 				System.err.println("Staff Account Could Not Be Added");	
			   		 			} 
			   		 			
			   		 			try 
			   		 			{
			   			 			FileWriter output = new FileWriter ("staffusrpass.txt",true);
			   			 			
			   			 			output.write(username+" ");
			   			 			output.write("\n");
			   			 			output.write(password+" ");
			   			 			output.write("\n");
			   			 			System.out.println("\nUsername: "+username+"\nPassword: "+password); // Displaying staff member's login details
			   			 			output.close(); 
			   			 		} 
			   		 			catch (IOException e) 
			   		 			{
			   			 			System.out.println("Staff Login Information Could Not Be Added");	
			   			 		}
			   		 			break;
			   		 		
			   		 		//Back		   		 			
		   		    		case 'b':
		   		    			break; 
		   		    		
		   		    			//Other	
		   		    	 	default:
		   		    	 		System.out.print("\nInvalid Input\n");
		   		    	 		break;
		   		    	}
		   		    	System.out.print("\n-------------------------------------------------------------------");	
		   		    	System.out.print("\n|    (A)dd Another                                                |");
		   		    	System.out.print("\n|    (B)ack                                                       |");
		   		    	System.out.print("\n-------------------------------------------------------------------\n");
		   		     	System.out.print("Please Enter your Choice: ");
			   		    CHOICE1 = INPUT1.nextLine().toLowerCase(); 
	 
		   		    }while(CHOICE1.charAt(0) != 'b');
		   			System.out.print("\n\n\n");		    		
		    		break;
		    		
    	  		//Display Staff Records  	 
		    	case 'd': 		 
		    		char[] data = new char[1000];

		    		System.out.println("\n\n\n-------------------- S T A F F  R E C O R D S ----------------------\n");
		    		
		    		//Reading data from file
		 			try
		 			{
		 				FileReader input = new FileReader ("staff.txt");
		 				input.read(data);
		 				System.out.println(data);
		 				input.close();	
		 			} 
		 			catch(IOException e) 
		 			{	
		 				System.out.println("Staff File Could Not Be Read.");
		 			}
		 			break; 
		    	
		 		//Quit		  	 
		    	case 'q':
		    		System.out.print("\n\n\n");
		    		break; 
		    	
		    	//Other
		    	default:
		    		System.out.print("\nInvalid Input\n");
		    		break;
		    }		    	 
		} while(CHOICE.charAt(0) != 'q');
		
		s.close();
		s1.close();
		INPUT.close();
	}	
	
	// Tostring method to display attribute values
	public String toString()
	{
		String output;
		
		output =  "I.D.        : "+id;
		output += "\nFirst Name  : "+name.GetFName();
		output += "\nMiddle Name : "+name.GetMName();
		output += "\nLast Name   : "+name.GetLName();
		output += "\nUsername    : "+username;
		output += "\nPassword    : "+password;
		
		return output;
	}
}