//Created By Zachary Stewart
//ID: 2101823

package HomeAway;

//package readingFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//Creating Administrator Parent Class

public class Admin  {	
	
	
	
	//Attributes of Administrator Class
	
	protected int id;
	protected Name name;
	protected String username;
	protected String password;
	
	// Default Constructor
	public Admin()
	{
		id = 0000;
		name = new Name();
		username = "";
		password = "";
		
	}
	
	// Primary Constructor 
	public Admin(int id, Name name, String user, String pass)
	{
		id = id;
		name = name;
		username = user;
		password = pass;
		
	}
	
	// Copy Constructor
	public Admin(Admin obj)
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
		    		 
		    		 try
		    			{
		    				FileWriter fileObject = new FileWriter("staff.txt",true);
		    				System.out.println("Enter Staff ID: ");
		    				int id = s.nextInt();
		    				fileObject.write(id + " ");
		    				fileObject.write(name + " ");
		    				fileObject.write(username + " ");
		    				fileObject.write(password + " ");
		    				fileObject.write("\n");
		    				fileObject.close();
		    			} catch (
		    					IOException e)
		    			{
		    				System.err.println(	"Error, user information could not be stored.");
		    				e.printStackTrace();
		    			}
		    		 
		    		 break;
		    		 	
		    	 
		    		    	 
		    	 case 'd': 
		    		 
		    		 try
		    			{
		    				Scanner in = new Scanner(System.in);
		    				//blank out attributes
		    				id = 0;
		    				username = "";
		    				password = "";
		    				System.out.print("Enter user name: ");
		    				String usrnm = in.next();
		    				int ui;
		    				String un;
		    				String pw;
		    				Scanner fileInp = new Scanner(new File("staff.txt"));
		    				while (fileInp.hasNext())
		    			{
		    				ui=fileInp.nextInt();
		    				un = fileInp.next();
		    				pw=fileInp.next();
		    				if(un.equals(usrnm))
		    			{
		    				username = un;
		    				id = ui;
		    				password = pw;
		    				break;
		    			}
		    			} 	fileInp.close();
		    			if (id==0)
		    			{
		    				System.out.println("User not found.");
		    			}
		    			} catch (
		    			FileNotFoundException e)
		    			{
		    			System.err.println(
		    			"Error, user information could not be retrieved.");
		    			e.printStackTrace();
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
