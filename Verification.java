package HomeAway;

//Importing scanner package to receive input from the user
import java.util.Scanner;

//package readingFiles;
import java.io.*;
import java.util.*;

public class Verification {
	
	
	//Attributes of Administrator Class
	
		
		protected String usrname;
		protected String passwrd;
		
		
		// Default Constructor
		public Verification()
		{
			usrname = "";
			passwrd = "";
			
		}
		
		// Primary Constructor 
		public Verification(String username, String password)
		{
			this.usrname = username;
			this.passwrd = password;
						
		}
		
		// Copy Constructor
		public Verification(Verification obj)
		{
			this.usrname = obj.usrname;
			this.passwrd = obj.passwrd;
			
		}

		//Generating the Accesors and Mutators
		public String getUsername() {
			return usrname;
		}

		public void setUsername(String username) {
			this.usrname = username;
		}

		public String getPassword() {
			return passwrd;
		}

		public void setPassword(String password) {
			this.passwrd = password;
		}
		
		
		//Method to verify Staff username and password
	
		public void staffVerify(String user, String pass) {
		
			//Verification vfy = new Verification();
			try {
				String un;
				String pw;
				Scanner fileInp = new Scanner(new File("staffusrpass.txt"));
				while (fileInp.hasNext())
			{
				un = fileInp.next();
				pw = fileInp.next();
				
				if(user.equals(un)&& pass.equals(pw))
			{
				System.out.println("\nWelcome!");
				
		    		//Creating object of class Administrator
					Administrator adm = new Administrator();
					
					//Calling newStaff method t
					adm.newStaff();				
				
				
				
			}else {
				continue;				
			}//end if
				
			
							
			}//end while
			fileInp.close();
			
			} catch (
			FileNotFoundException e)
			{
			System.err.println(
			"Error, user information could not be retrieved.");
			e.printStackTrace();
			}
		}
		
	
	

}//End class Verification
