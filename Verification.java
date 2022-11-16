package HomeAway;

//Importing scanner package to receive input from the user
import java.util.Scanner;

//package readingFiles;
import java.io.*;
import java.time.LocalDate;
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
		
		
		
		//Method to verify  username and password
	
		public void adminVerify(String user, String pass) {
		
			
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
				System.out.println("\nPassword Accepted");
				
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
		}//End adminVerify
		
		
		public void staffVerify(String user, String pass) {
			
			
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
				System.out.println("\nPassword Accepted\n");
				
				
				Scanner INPUT = new Scanner (System.in);
				Staff stf = new Staff();
					
				String CHOICE= " ";   

			      
			    while(CHOICE.charAt(0) != 'q')
			    {
				    	 System.out.print("\n-----------STAFF MENU------------");	
				    	 System.out.print("\n|  (R)egister Student          |");
				    	 System.out.print("\n|  (C)reate Programme          |");
				    	 System.out.print("\n|  (M)dodify Programme Details |");
				    	 System.out.print("\n|  (G)enerate Student List     |");
				    	 System.out.print("\n|  (Q)uit                      |");
				    	 System.out.print("\n---------------------------------\n");
				     	 System.out.print("Please Enter your Choice: ");
				    	 
				    	 CHOICE = INPUT.nextLine();
				    	 CHOICE = CHOICE.toLowerCase(); 
				    	 
				    	 switch(CHOICE.charAt(0))
				    	 {
				    	 case 'r': 
				    		 
				    		 System.out.println("\n\n");
				    		 stf.registerStudent();
				    		 
				    		 break;
				    		    		 
				    	 case 'c':
				    		 
				    		 System.out.println("\n\n");
				    		 stf.createProgramme();
				    		 
				    		break;
				    		
				    	 case 'm':
				    		 
				    		 System.out.println("\n\n");
				    		 stf.modifyProgramme();
				    		 
				    		break;
				    		
				    	 case 'g':
				    		 
				    		 System.out.println("\n\n");
				    		 stf.generateList();
				    		 
				    		break;				    	
				    	 		  	 
				    	 case 'q': break;
				    	 
				    	 default :  System.out.print("\n\tInvald Input\n");
				    	 
				    	 }
				    	 
				     }//End while							
				
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
		}//End staffVerify
		
		
		public void stuVerify(String user, String pass) {
			
			//Verification vfy = new Verification();
			try {
				String un;
				String pw;
				Scanner fileInp = new Scanner(new File("staffusrpass.txt"));
				while (fileInp.hasNext())
			{
				un = fileInp.next();
				pw = fileInp.next();
				
				if(user.equals(un)&& pass.equals(pw)) {
					
					System.out.println("\nPassword Accepted\n");
					
					Scanner INPUT = new Scanner (System.in);
					Student stu = new Student();
					Staff stf = new Staff();
						
					String CHOICE= " ";  
					
					while(CHOICE.charAt(0) != 'q') {
						
						System.out.print("\n-----------STUDENT MENU------------");  
                        System.out.print("\n|  (V)iew Programme Details    |");
                        System.out.print("\n|  (A)dd Course                |");
                        System.out.print("\n|  (G)enerate Fee Breakdown    |");
                        System.out.print("\n|  (P)rogress Report           |");
                        System.out.print("\n|  (Q)uit                      |");
                        System.out.print("\n---------------------------------\n");
                        System.out.print("Please Enter your Choice: ");
                        
                        CHOICE = INPUT.nextLine();
                        CHOICE = CHOICE.toLowerCase(); 
                        
                        switch(CHOICE.charAt(0)) {
                        
                        case 'v': 
                            
                            System.out.println("\n\n");
                            stu.viewProgram();
                            
                            break;
                                        
                        case 'a':
                            
                            System.out.println("\n\n");
                            stu.addCourse();
                            
                           break;
                           
                        case 'g':
                            
                            System.out.println("\n\n");
                            stf.modifyProgramme();
                            
                           break;
                           
                        case 'p':
                            
                            System.out.println("\n\n");
                            stf.generateList();
                            
                           break;                      
                                    
                        case 'q': break;
                        
                        default :  System.out.print("\n\tInvald Input\n");               
                       
                        
                        }//End switch
                        
					}//End inner while					
					
				}else {
					continue;
				}//End else if			     
					    	 		
				
				
			}//end while
			fileInp.close();
			
			} catch (
			FileNotFoundException e)
			{
			System.err.println(
			"Error, user information could not be retrieved.");
			e.printStackTrace();
			}
		}//End stuVerify
		
		
	
	

}//End class Verification
