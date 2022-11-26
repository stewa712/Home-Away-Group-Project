/*
 * student Adebukunola (2103579)
 */

package HomeAway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
//Importing scanner package to receive input from the user
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Staff extends Administrator
{
	private String faculty;
	private String department;
	private Date dateEmployed;

	// Default Constructor
	public Staff()
	{
		super();
		faculty = "";
		department = "";
		dateEmployed = new Date();
	}
	
	// Primary Constructor 
	public Staff(int id, Name name, String username, String password, String faculty, String department, Date dateEmployed)
	{
		super(id, name, username, password);
		this.faculty = faculty;
		this.department = department;
		this.dateEmployed = dateEmployed;
	}
	
	// Copy Constructor
	public Staff(Staff sta)
	{
		super(sta.id, sta.name, sta.username, sta.password);
		this.faculty = sta.faculty;
		this.department = sta.department;
		this.dateEmployed = sta.dateEmployed;
	}

	//Getters and Setters
	public String getFaculty() 
	{
		return faculty;
	}

	public void setFaculty(String faculty) 
	{
		this.faculty = faculty;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public Date getDateEmployed() 
	{
		return dateEmployed;
	}

	public void setDateEmployed(Date dateEmployed) 
	{
		this.dateEmployed = dateEmployed;
	}
	
	
	
	
	//------------------------------------------------------ METHOD TO REGISTER STUDENTS----------------------------------------------------------
	public void registerStudent()
	{
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);
			
		String CHOICE= " ";   
  
	    while(CHOICE.charAt(0) != 'b')
	    {
	    	System.out.print("\n-------------- S T U D E N T  R E G I S T R A T I O N -------------");	
		    System.out.print("\n|    (A)dd A Record                                               |");
		    System.out.print("\n|    (D)isplay Records                                            |");
		    System.out.print("\n|    (B)ack                                                       |");
		    System.out.print("\n-------------------------------------------------------------------\n");
		    System.out.print("Please Enter your Choice: ");
		    	 
		    CHOICE = INPUT.nextLine();
		    CHOICE = CHOICE.toLowerCase(); //converts user input to lower case
		    
		    switch(CHOICE.charAt(0))
		    {
		    	// Add Student Record
		    	case 'a':
		    		Scanner INPUT1 = new Scanner (System.in);
		    		String CHOICE1= "c";
		    		 
		    		File myFile = new File ("zachary.txt");
		    		File myFile1 = new File ("studentlogin.txt");
		    		 
		    		System.out.println("\n\n------------- A D D I N G  S T U D E N T  R E C O R D -------------"); 
		    		 
		    		try
		    		{
		    			if (!myFile.exists()) 
		    			{
		    				myFile.createNewFile(); //creates a student file if none exists
		    				System.out.println("[Student File Created Successfully]");
		    			}
		    		}
		    		catch (IOException e)
		    		{
		    			System.err.println("Student File Error");
		    		}
		    		 
		    		try
		    		{
		    			if (!myFile1.exists())
		    			{
			    			 myFile1.createNewFile(); //creates a student login file if none exists
			    			 System.out.println("[Student Login File Created Successfully]");
		    			}
		    		}
		    		catch (IOException e)
		    		{
		    			System.err.println("Student Login File Error");
		    		}
		    		 
		    		do
		    		{
		    			switch(CHOICE1.charAt(0))
		    			{
		    				// Continue
		    				case 'c':
		    					// Populating the student record via user input
		    					System.out.print("\nEnter First Name: ");
		   						String fName = s1.nextLine();
		   						
		   						System.out.print("\nEnter Middle Name: ");
		   						String mName = s1.nextLine();
		   						
		   						System.out.print("\nEnter Last Name: ");
		   						String lName = s1.nextLine();										
		   													
		   						System.out.print("\nEnter Password: ");
		   						String password = s1.nextLine();
		   						
		   						System.out.print("\nEnter Address: ");
		   						String address = s1.nextLine();
		   						
		   								   						
		   						
		   						
		   						System.out.println("\nEnter Date Enrolled");
		   						System.out.print("Day: ");
		   						int day = s.nextInt();
		   						System.out.print("Month: ");
		   						int month = s.nextInt();
		   						System.out.print("Year: ");
		   						int year = s.nextInt();
		   						
		   						System.out.print("\nEnter Programme Code: ");
		   				        String programmeCode = s1.nextLine();
		   				        programmeCode = programmeCode.toUpperCase(); //converts programme code entered to uppercase for aesthetical purposes
		   						
		   				        System.out.println("\nEnter Contact Number");
		   				        System.out.print("Area Code: ");
		   						int area = s.nextInt();
		   						System.out.print("Prefix: ");
		   						int prefix = s.nextInt();
		   						System.out.print("Line Number: ");
		   						int line = s.nextInt();
		   						
		   				        int enrollStatus = 0; //initialising enrollment status to zero
		   				        
		   						LocalDate currentdate = LocalDate.now(); //obtaining the current date from the system clock in the default time-zone
		   						int currentYear = currentdate.getYear(); //extracting the year 
		   						
		   						Random r = new Random();
		   						String sequence = 0+String.format("%04d", r.nextInt(1001));
		   						
		   						
		   						
		   									   				    
		   						// Concatenating current year, programme code and a sequence to generate ID number
		   						String idNum = currentYear+programmeCode+sequence; 
		   				    	
		   						// Informing the user that the student has been registered
			   		 			try 
			   		 			{
				   		 			FileWriter output = new FileWriter ("student.txt",true);
				   		 			
				   		 			output.write(idNum+"   "+fName+"   "+mName+"   "+lName+"   "+password+"   "+address+"   "+enrollStatus+"   "+day+"/"+month+"/"+year+"   "+programmeCode+"   ("+area+")"+prefix+"-"+line+"\n");
				   		 			
				   		 			System.out.println("\n*******************************************************************");
				   		 			System.out.println("\n"+fName+" "+lName+" ("+idNum+") was Registered Successfully!");	
				   		 			output.close(); 
			   		 			} 
			   		 			catch (IOException e) 
			   		 			{
			   		 				System.err.println("File Append Error");	
			   		 			} 
			   		 			
			   		 			// Displaying student's login details
			   		 			try 
			   		 			{
			   			 			FileWriter output = new FileWriter ("studentlogin.txt",true);
			   			 			
			   			 			output.write(idNum+" ");
			   			 			output.write("\n");
			   			 			output.write(password+" ");
			   			 			output.write("\n");
	
			   			 
			   			 			System.out.println("\nUsername: "+idNum+"\nPassword: "+password);
			   			 			System.out.println("\n*******************************************************************");
			   			 			output.close(); 
			   			 		} 
			   		 			catch (IOException e) 
			   		 			{
			   			 			System.err.println("File Append Error");	
			   			 		} 
			   		 			break;
		   		    	   	
			   		 		// Back
		   		    	 	case 'b':
		   		    	 		break; 
		   		    		 
		   		    	 	default:
		   		    	 		System.out.print("\n\tInvald Input\n");
		   		    	 }
		   		    	 
		   		    	 System.out.print("\n-------------------------------------------------------------------");	
		   		    	 System.out.print("\n|    (C)ontinue                                                   |");
		   		    	 System.out.print("\n|    (B)ack                                                       |");
		   		    	 System.out.print("\n-------------------------------------------------------------------\n");
		   		     	 System.out.print("Please Enter your Choice: ");
		   		    	 
		   		    	 CHOICE1 = INPUT1.nextLine();
		   		    	 CHOICE1 = CHOICE1.toLowerCase(); 
		   		    	 
		   		    } while(CHOICE1.charAt(0) != 'b'); // end while
		    		System.out.println("\n");			    		 
		    		
		    			break;	    		
		    	
		    	// Displaying Student Records
		    	case 'd':
		    		
		    		char[] data= new char [1000];
		    		
		    		System.out.println("\n\n------- D I S P L A Y I N G  S T U D E N T  R E C O R D S ---------\n"); 
					
		    		// Reading data from file
		 			try 
		 			{
		 				FileReader input = new FileReader ("zachary.txt");
		 				input.read(data);
		 				System.out.println(data);
		 				input.close();
		 			} 
		 			catch(IOException e) 
		 			{
		 				System.err.println("Student Records Cannot Be Displayed");
		 			}
		 			
		 			break; 
		    	
		 		// Quit
		    	case 'q': 
		    		break; 
		    		 
		    	default:  
		    		System.out.print("\n\tInvald Input\n");
		    }
		    	 
	    }// end while			
	}
	
	
	
	
	
	// ----------------------------------------------------METHOD TO CREATE PROGRAMMES-----------------------------------------------------------
	public void createProgramme()
	{	
		File myFile = new File ("compsci.txt");
		
		
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);
		Scanner INPUT1 = new Scanner (System.in);
		
		String CHOICE1= "c";
		
		System.out.println("\n--------------- P R O G R A M M E  C R E A T I O N ----------------\n"); 
		
		try 
		{
			if (!myFile.exists())
			{
				myFile.createNewFile(); //creates programme file if one does not exist
	        	System.out.println("[Programme File Created Successfully.]");
			}
		} 
		catch (IOException e) 
		{
			System.err.println("Error: Programme File Could Not Be Created.");
		}
		
		do
		{
			switch(CHOICE1.charAt(0))
			{
				// Continue
				case 'c':
					
					 boolean bError = true;
					 
					// Populating Programme Record
					System.out.print("\nEnter Programme Code: ");
					String programmeCode = s1.nextLine();
					
					programmeCode = programmeCode.toUpperCase(); //converting programme code entered to uppercase
						
					System.out.print("\nEnter Name: ");
					String name = s1.nextLine();
					
					System.out.print("\nEnter Maximum Courses: ");
					int maxCourses = s.nextInt();										
													
					System.out.print("\nEnter Award: ");
					String award = s1.nextLine();
						
					System.out.print("\nEnter Accreditation: ");
					String accreditation = s1.nextLine();
					
					
					
						
					// Writing data to the file and informing the user that the programme has been registered successfully
		 			try 
		 			{
		 				
		 				FileWriter output = new FileWriter ("compsci.txt",true);
		 				
		 				output.write(programmeCode+"  ");
		  		 		output.write("\n");
		  		 		output.write(name+"  ");
		  		 		output.write("\n");
		  		 		output.write(maxCourses+"  ");
		  		 		output.write("\n");
		  		 		output.write(award+"  ");
		  		 		output.write("\n");
		  		 		output.write(accreditation+" ");
		  		 		output.write("\n\n");
		  					 		 			
		  		 		
		  				System.out.println("\n*******************************************************************");
		  	 			System.out.println("\n"+name+" ("+programmeCode+") was Registered Successfully!");	
	 		 			System.out.println("\n*******************************************************************");
	 		 			output.close(); 
	 		 			  
			 		} 
			 		catch(FileNotFoundException fe) 
			 		{
			 			System.err.println("File Error");	
			 			
			 		}catch(IOException ioe) {
			 			
			 			System.out.println("Input Error!");
			 			
			 		}
			 			 
			 		break;
		    	
			 	// Quit
			    case 'q': 
			    	break; 
			    		 
			    default: 
			    	System.out.print("\n\tInvald Input\n");
			}
			    	 
			System.out.print("\n-------------------------------------------------------------------");	
	   		System.out.print("\n|    (C)ontinue                                                   |");
	   	    System.out.print("\n|    (B)ack                                                       |");
	   		System.out.print("\n-------------------------------------------------------------------\n");
	   		System.out.print("Please Enter your Choice: ");
			    	 
			CHOICE1 = INPUT1.nextLine();
			CHOICE1 = CHOICE1.toLowerCase(); 
		    	 
		} while(CHOICE1.charAt(0) != 'b');//end while
		
		System.out.println("\n");	
	}
	
	
	
	
	//--------------------------------------------------------- METHOD TO DISPLAY PROGRAMMES-----------------------------------------------------
	public void displayProgrammes()
	{
		char[] data= new char [1000];
		
		// Reading data from file
		try
		{
			FileReader input = new FileReader ("programme.txt");
			input.read(data);
			System.out.println("\nProgramme Records");
			System.out.println(data);
			input.close();		
		} 
		catch(IOException e) 
		{	
			System.err.println("File Read Error");
		}
	}
	
	
	
	
	// ----------------------------------------------------METHOD TO MODIFY PROGRAMME------------------------------------------------------------
	public void modifyProgramme()	{		

	    
	// Calling add() record method to add static data/(Hard CodedData) to linked List
    // hr.add(record);

     // Creating Scanner Object to read input
     Scanner input = new Scanner(System.in);

     // Creating option integer variable
     int option = 0;

    
	     do {
	         menu();
	         option = input.nextInt();
	
	         // Switch case
	         switch (option) {
	         
	         
   //----------------------------------------------C A S E   1 ( A D D I N G   C O U R S E S )----------------------------------------------------------------
	
	         
	         
	         // Case 1
	         case 1:
	
	        	Scanner s= new Scanner(System.in);
	     		Scanner s1= new Scanner(System.in);
	     		String CHOICE1= " ";
	     		Scanner INPUT1 = new Scanner (System.in);	
	     	 
	     	 
	     		          
	              // Entering course record
	       	while(CHOICE1.charAt(0) != 'q')
	     	     {
	     	    	 System.out.print("\n\n");	
	     	    	 System.out.print("\n-----------------------------");	
	     	    	 System.out.print("\n|  (C)hoose Program          |");
	     	    	 System.out.print("\n|  (Q)uit                    |");
	     	    	 System.out.print("\n-----------------------------\n");
	     	     	 System.out.print("Please Enter your Choice: \n");
	     	    	 
	     	    	 CHOICE1 = INPUT1.nextLine();
	     	    	 CHOICE1 = CHOICE1.toLowerCase(); 
	     	    	 
	     	    	 switch(CHOICE1.charAt(0))
	     	    	 {
	     	    	 case 'c':  	
	     	    		 	
	     	    		    
	     	    		    System.out.println("Enter Program Code: ");
	    					String progcode = s1.nextLine().toLowerCase();
	    					
	    					
	    					
while(!progcode.equals("cmpsci123")&&!progcode.equals("sprtsci123")&&!progcode.equals("eleceng123")) {
	    						
	    						System.out.println("\nInvalid Program Entry. Please Enter Valid Code\n");
	    						 System.out.println("Enter Program Code: ");
	 	    					 progcode = s1.nextLine().toLowerCase();
	 	    					
	    					}	
	    					
	    					
			//                          A D D I N G   C O M P U T E R   S C I E N C E   C O U R S E S---------------------------------			
	     	    		 	     					
	     					if(progcode.equals("cmpsci123")) {
	     						
	     						System.out.println("\n*****COMPUTER SCIENCE PROGRAM******\n");
	     						
	     						System.out.println("Enter Course Code: ");
	         					String code = s1.nextLine();
	         					System.out.println(code);
	         					  			
         					
         	     	 			try {
         	     	 			FileReader proginput = new FileReader("compsci.txt");
         	     	 			BufferedReader br = new BufferedReader(proginput);
         	     	 			FileWriter output = new FileWriter ("compsci.txt",true);
         	     	 			
         	     	 			String line;
      							
      							
      							while( (line = br.readLine() ) != null) {
      								while(line.contains(code)) {
      									
      									System.out.println("Course" +code + " Already Exists");
      									System.out.println("Enter Course Code: ");
      		         					code = s1.nextLine();
      									
      								}
      							}   	     	 			
         	     	 			
     	     	 				
     	     	 				System.out.println("Enter Course Name: ");
	         					String name = s1.nextLine();
	         					
	         					System.out.println("Enter Course Description: ");
	         					String desc = s1.nextLine();
	         					
	         					System.out.println("Enter Course Credits: ");
	         					String credits = s1.nextLine();
	         									
	         					System.out.println("Enter Pre-Requisites: ");
	         					String prereq = s1.nextLine();
	         					System.out.println(code);			
         	     	 			output.write(code+ " ");
         	     	 			output.write("\n");
         	     	 			output.write(name+ " ");
         	     	 			output.write("\n");
         	     	 			output.write(desc+ " ");
         	     	 			output.write("\n");
         	     	 			output.write(credits+" ");
         	     	 			output.write("\n");
         	     	 			output.write(prereq+" ");
         	     	 			output.write("\n");
         	     	 			
         	     	 			     	     	 			
         	     	 			//System.out.println("Data Appended Successfully");	
         	     	 			output.close(); 
         	     	 			} catch (IOException e) {
         	     	 			JOptionPane.showMessageDialog(null, "File Append Error");		
         	     	 			} 
	     						
	     					}
	     					
	     					
//		                 A D D I N G   E L E C T R  I C A L  E N G I N E E R I N G   C O U R S E S		
 	     					
			     					if(progcode.equals("eleceng123")) {
			     						
			     						System.out.println("\n*****ELECTRICAL ENGINEERING PROGRAM******\n");
			     						
			     						System.out.println("Enter Course Code: ");
			         					String code = s1.nextLine();
			         					System.out.println(code);
			         					  			
		         					
		         	     	 			try {
		         	     	 			FileReader proginput = new FileReader("elecengineer.txt");
		         	     	 			BufferedReader br = new BufferedReader(proginput);
		         	     	 			FileWriter output = new FileWriter ("elecengineer.txt",true);
		         	     	 			
		         	     	 			String line;
		      							
		      							
		      							while( (line = br.readLine() ) != null) {
		      								while(line.contains(code)) {
		      									
		      									System.out.println("Course" +code + " Already Exists");
		      									System.out.println("Enter Course Code: ");
		      		         					code = s1.nextLine();
		      									
		      								}
		      							}   	     	 			
		         	     	 			
		     	     	 				
		     	     	 				System.out.println("Enter Course Name: ");
			         					String name = s1.nextLine();
			         					
			         					System.out.println("Enter Course Description: ");
			         					String desc = s1.nextLine();
			         					
			         					System.out.println("Enter Course Credits: ");
			         					String credits = s1.nextLine();
			         									
			         					System.out.println("Enter Pre-Requisites: ");
			         					String prereq = s1.nextLine();
			         					System.out.println(code);			
		         	     	 			output.write(code+ " ");
		         	     	 			output.write("\n");
		         	     	 			output.write(name+ " ");
		         	     	 			output.write("\n");
		         	     	 			output.write(desc+ " ");
		         	     	 			output.write("\n");
		         	     	 			output.write(credits+" ");
		         	     	 			output.write("\n");
		         	     	 			output.write(prereq+" ");
		         	     	 			output.write("\n");
		         	     	 			
		         	     	 			     	     	 			
		         	     	 			//System.out.println("Data Appended Successfully");	
		         	     	 			output.close(); 
		         	     	 			} catch (IOException e) {
		         	     	 			JOptionPane.showMessageDialog(null, "File Append Error");		
		         	     	 			} 
			     						
			     					} 
			     					
			     					
//		                  A D D I N G   S P O R T   S C I E N C E   C O U R S E S			
     					
		     					if(progcode.equals("sprtsci123")) {
		     						
		     						System.out.println("\n*****SPORT SCIENCE PROGRAM******\n");
		     						
		     						System.out.println("Enter Course Code: ");
		         					String code = s1.nextLine();
		         					System.out.println(code);
		         					  			
	         					
	         	     	 			try {
	         	     	 			FileReader proginput = new FileReader("sportsci.txt");
	         	     	 			BufferedReader br = new BufferedReader(proginput);
	         	     	 			FileWriter output = new FileWriter ("sportsci.txt",true);
	         	     	 			
	         	     	 			String line;
	      							
	      							
	      							while( (line = br.readLine() ) != null) {
	      								while(line.contains(code)) {
	      									
	      									System.out.println("Course" +code + " Already Exists");
	      									System.out.println("Enter Course Code: ");
	      		         					code = s1.nextLine();
	      									
	      								}
	      							}   	     	 			
	         	     	 			
	     	     	 				
	     	     	 				System.out.println("Enter Course Name: ");
		         					String name = s1.nextLine();
		         					
		         					System.out.println("Enter Course Description: ");
		         					String desc = s1.nextLine();
		         					
		         					System.out.println("Enter Course Credits: ");
		         					String credits = s1.nextLine();
		         									
		         					System.out.println("Enter Pre-Requisites: ");
		         					String prereq = s1.nextLine();
		         					System.out.println(code);			
	         	     	 			output.write(code+ " ");
	         	     	 			output.write("\n");
	         	     	 			output.write(name+ " ");
	         	     	 			output.write("\n");
	         	     	 			output.write(desc+ " ");
	         	     	 			output.write("\n");
	         	     	 			output.write(credits+" ");
	         	     	 			output.write("\n");
	         	     	 			output.write(prereq+" ");
	         	     	 			output.write("\n");
	         	     	 			
	         	     	 			     	     	 			
	         	     	 			//System.out.println("Data Appended Successfully");	
	         	     	 			output.close(); 
	         	     	 			} catch (IOException e) {
	         	     	 			JOptionPane.showMessageDialog(null, "File Append Error");		
	         	     	 			} 
		     						
		     					}     			
	     					
	     			
	     	    	 case 'q': break; 
	     	    	 default :  System.out.print("\n\tInvald Input\n");
	     	    	 
	     	    	 }
	     	    	 
	     	     }//End while       	
	
	             break;
	             
	             
	             
	             
	             
       //----------------------------------------------C A S E   2 ( D E L E T I N G   C O U R S E S )--------------------------------------------
	             
	
	             
	             
	         // Case 2
	             
	         case 2:
	        	 
	        	Scanner d = new Scanner(System.in);
	      		Scanner d1 = new Scanner(System.in);
	      		String CHOICE2 = " ";
	      		Scanner INPUT2 = new Scanner (System.in);	
	      	 
	      	 
	      		          
	               // Entering course record
	        	while(CHOICE2.charAt(0) != 'q')
	      	     {
	      	    	 System.out.print("\n\n");	
	      	    	 System.out.print("\n-----------------------------");	
	      	    	 System.out.print("\n|  (E)nter Program Code      |");
	      	    	 System.out.print("\n|  (Q)uit                    |");
	      	    	 System.out.print("\n-----------------------------\n");
	      	     	 System.out.print("Please Enter your Choice: \n");
	      	    	 
	      	    	 CHOICE2 = INPUT2.nextLine();
	      	    	 CHOICE2 = CHOICE2.toLowerCase(); 
	      	    	 
	      	    	 switch(CHOICE2.charAt(0))
	      	    	 {
	      	    	 case 'e':  	    		 
	      	    		     	    		 	      	    		 	
	      	    		    
	      	    		    System.out.print("\n\n");
	      	    		    
	      	    		    System.out.println("Enter Program Code: ");
	     					String progcode = d1.nextLine().toLowerCase();
	     					
	     					
	     		//                 D E L E T I N G   C O M P U T E R   S C I E N C E   P R O G R A M
	      	    		 	     					
	      					if(progcode.equals("cmpsci123")) {
	      						
	      						System.out.println("\nCOMPUTER SCIENCE COURSES\n "+progcode);
	         					
	      						
	      						      						
	      				try {
	      							
	      							System.out.println("Enter Course Code To Delete: ");
	      							String code = d1.nextLine().toUpperCase();
	              					System.out.println(code);
	              					
	              					
	              					
	      							File inputFile = new File("compsci.txt");
	      							File tempFile = new File("myTempFile.txt");
	      							Scanner scan = new Scanner(System.in);
	      							 
	      						  							
	      							
	      							FileReader fr=new FileReader("compsci.txt");  
	      							
	      							System.out.println("\nINPUT FILE: "+inputFile);
	      					try{
	      							BufferedReader reader = new BufferedReader(fr);
	      							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
	      							
	      							String line;
	      							
	      							while( (line = reader.readLine() ) != null) {
	      								
	      															
	      							  
	      								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
	      									
	      									String oldcode = "";
	      									line = oldcode;
	      									System.out.println("CODECHECK "+oldcode);
	      									System.out.println("OLD CODE: "+oldcode);
	      									writer.write(line);
	      									writer.write("\n");
	      									
	      									String oldname = "";
	      									String namecheck = reader.readLine();
	      									System.out.println("NMCHECK "+namecheck);
	      									System.out.println("OLDNAME : "+oldname);
	      									writer.write(oldname);
	      									writer.write("\n");
	      									
	      									String olddesc ="";
	      									String desccheck = reader.readLine();
	      									System.out.println("DESCHECK "+desccheck);
	      									System.out.println("OLD DESC : "+olddesc);
	      									writer.write(olddesc);
	      									writer.write("\n");
	      									
	      									
	      									String oldcredits = "";
	      									String credcheck = reader.readLine();
	      									System.out.println("CREDCHECK "+credcheck);
	      									System.out.println("OLD CREDITS: "+oldcredits);
	      									writer.write(oldcredits);
	      									writer.write("\n");
	      									
	      									
	      									
	      									String oldpre = "";
	      									String prereqcheck = reader.readLine();
	      									System.out.println("PRECHECK "+prereqcheck);
	      									System.out.println("OLD PREREQ : "+oldpre);
	      									writer.write(oldpre); 
	      									writer.write("\n");
	      									continue;
	      	      						
	      									
	      									
	      								}else {
	      									
	      									
	      									writer.write(line);
	      									writer.write("\n");
	      									
	      								}
	      							   
	      							   
	      							}//End inner while     							
	      							
	      							      							
	      							writer.close(); 
	      							reader.close();      							
	      							
	      							//Deleting old file and replacing with updated version
	      							inputFile.delete();
	      							File dump = new File("C:\\Users\\stewa\\Documents\\School\\Java Files\\Group Project (Home & Away)\\cmpsci.txt");
	      							tempFile.renameTo(dump);
	      							
	      						}catch(IOException ex) {
	      							
	      						}   							
	      							
	      							
	      							
	      						     							
	      						}catch(Exception e) {
	      							
	      						}     	     	 			
	      						
	      					}//End if   
	      					
	      
	      					
     		//                D E L E T I N G   S P O R T   S C I E N C E   P R O G R A M
      	    		 	     					
      					if(progcode.equals("sprtsci123")) {
      						
      						System.out.println("\nSPORT SCIENCE COURSES\n "+progcode);
         					
      						
      						      						
      				try {
      							
      							System.out.println("Enter Course Code To Delete: ");
      							String code = d1.nextLine().toUpperCase();
              					System.out.println(code);
              					
              					
              					
      							File inputFile = new File("sportsci.txt");
      							File tempFile = new File("myTempFile.txt");
      							Scanner scan = new Scanner(System.in);
      							 
      						  							
      							
      							FileReader fr=new FileReader("sportsci.txt");  
      							
      							System.out.println("\nINPUT FILE: "+inputFile);
      					try{
      							BufferedReader reader = new BufferedReader(fr);
      							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
      							
      							String line;
      							
      							while( (line = reader.readLine() ) != null) {
      								
      															
      							  
      								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
      									
      									String oldcode = "";
      									line = oldcode;
      									System.out.println("CODECHECK "+oldcode);
      									System.out.println("OLD CODE: "+oldcode);
      									writer.write(line);
      									writer.write("\n");
      									
      									String oldname = "";
      									String namecheck = reader.readLine();
      									System.out.println("NMCHECK "+namecheck);
      									System.out.println("OLDNAME : "+oldname);
      									writer.write(oldname);
      									writer.write("\n");
      									
      									String olddesc ="";
      									String desccheck = reader.readLine();
      									System.out.println("DESCHECK "+desccheck);
      									System.out.println("OLD DESC : "+olddesc);
      									writer.write(olddesc);
      									writer.write("\n");
      									
      									
      									String oldcredits = "";
      									String credcheck = reader.readLine();
      									System.out.println("CREDCHECK "+credcheck);
      									System.out.println("OLD CREDITS: "+oldcredits);
      									writer.write(oldcredits);
      									writer.write("\n");
      									
      									
      									
      									String oldpre = "";
      									String prereqcheck = reader.readLine();
      									System.out.println("PRECHECK "+prereqcheck);
      									System.out.println("OLD PREREQ : "+oldpre);
      									writer.write(oldpre); 
      									writer.write("\n");
      									continue;
      	      						
      									
      									
      								}else {
      									
      									
      									writer.write(line);
      									writer.write("\n");
      									
      								}
      							   
      							   
      							}//End inner while     							
      							
      							      							
      							writer.close(); 
      							reader.close();      							
      							
      							//Deleting old file and replacing with updated version
      							inputFile.delete();
      							File dump = new File("C:\\Users\\stewa\\Documents\\School\\Java Files\\Group Project (Home & Away)\\cmpsci.txt");
      							tempFile.renameTo(dump);
      							
      						}catch(IOException ex) {
      							
      						}   							
      							
      							
      							
      						     							
      						}catch(Exception e) {
      							
      						}     	     	 			
      						
      					}//End if 
      					
      					
      					
      					
      					
     		//           D E L E T I N G   E L E C T R I C A L  E N G I N E E R I N G  C O U R S E S
      	    		 	     					
      					if(progcode.equals("eleceng123")) {
      						
      						System.out.println("\nELECTRICAL ENGINEERING COURSES\n "+progcode);
         					
      						
      						      						
      				try {
      							
      							System.out.println("Enter Course Code To Delete: ");
      							String code = d1.nextLine().toUpperCase();
              					System.out.println(code);
              					
              					
              					
      							File inputFile = new File("elecengineer.txt");
      							File tempFile = new File("myTempFile.txt");
      							Scanner scan = new Scanner(System.in);
      							 
      						  							
      							
      							FileReader fr=new FileReader("elecengineer.txt");  
      							
      							System.out.println("\nINPUT FILE: "+inputFile);
      					try{
      							BufferedReader reader = new BufferedReader(fr);
      							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
      							
      							String line;
      							
      							while( (line = reader.readLine() ) != null) {
      								
      															
      							  
      								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
      									
      									String oldcode = "";
      									line = oldcode;
      									System.out.println("CODECHECK "+oldcode);
      									System.out.println("OLD CODE: "+oldcode);
      									writer.write(line);
      									writer.write("\n");
      									
      									String oldname = "";
      									String namecheck = reader.readLine();
      									System.out.println("NMCHECK "+namecheck);
      									System.out.println("OLDNAME : "+oldname);
      									writer.write(oldname);
      									writer.write("\n");
      									
      									String olddesc ="";
      									String desccheck = reader.readLine();
      									System.out.println("DESCHECK "+desccheck);
      									System.out.println("OLD DESC : "+olddesc);
      									writer.write(olddesc);
      									writer.write("\n");
      									
      									
      									String oldcredits = "";
      									String credcheck = reader.readLine();
      									System.out.println("CREDCHECK "+credcheck);
      									System.out.println("OLD CREDITS: "+oldcredits);
      									writer.write(oldcredits);
      									writer.write("\n");
      									
      									
      									
      									String oldpre = "";
      									String prereqcheck = reader.readLine();
      									System.out.println("PRECHECK "+prereqcheck);
      									System.out.println("OLD PREREQ : "+oldpre);
      									writer.write(oldpre); 
      									writer.write("\n");
      									continue;
      	      						
      									
      									
      								}else {
      									
      									
      									writer.write(line);
      									writer.write("\n");
      									
      								}
      							   
      							   
      							}//End inner while     							
      							
      							      							
      							writer.close(); 
      							reader.close();      							
      							
      							//Deleting old file and replacing with updated version
      							inputFile.delete();
      							File dump = new File("C:\\Users\\stewa\\Documents\\School\\Java Files\\Group Project (Home & Away)\\cmpsci.txt");
      							tempFile.renameTo(dump);
      							
      						}catch(IOException ex) {
      							
      						}   							
      							
      							
      							
      						     							
      						}catch(Exception e) {
      							
      						}     	     	 			
      						
      					}//End if     					
	      					
	      			
	      	    	 case 'q': break; 
	      	    	 default :  System.out.print("\n\tInvald Input\n");
	      	    	 }
	      	    	 
	      	     }//End while       	
	
	             
	
	          break;//End case 2
	          
	          
	          
	          
	          
      //----------------------------------------------C A S E   3 ( U P D A T I N G   C O U R S E S )----------------------------------------------------------------
	             
	         
	          
	
	         // Case 3
	         case 3:
	        	 
	        	Scanner u = new Scanner(System.in);
	       		Scanner u1 = new Scanner(System.in);
	       		String CHOICE3 = " ";
	       		Scanner INPUT3 = new Scanner (System.in);	
	       	 
	       	 
	       		          
	                // Entering course record
	         	while(CHOICE3.charAt(0) != 'q')
	       	     {
	       	    	 System.out.print("\n\n");	
	       	    	 System.out.print("\n-----------------------------");	
	       	    	 System.out.print("\n|  (E)nter Program Code      |");
	       	    	 System.out.print("\n|  (Q)uit                    |");
	       	    	 System.out.print("\n-----------------------------\n");
	       	     	 System.out.print("Please Enter your Choice: \n");
	       	    	 
	       	    	 CHOICE3 = INPUT3.nextLine();
	       	    	 CHOICE3 = CHOICE3.toLowerCase(); 
	       	    	 
	       	    	 switch(CHOICE3.charAt(0))
	       	    	 {
	       	    	 case 'e':  	    		 
	       	    		 
	       	    		 	
	       	    		 	      	    		 	
	       	    		    System.out.print("Staff Record File Access");
	       	    		    System.out.print("\n\n");
	       	    		    
	       	    		    System.out.println("Enter Program Code: ");
	      					String progcode = u1.nextLine().toLowerCase();
	      					
	      					
	      					
		//                     U P D A T I N G   C O M P U T E R   S C I E N C E   P R O G R A M
	      					
	       	    		 	     					
	       					if(progcode.equals("cmpsci123")) {
	       						
	       						System.out.println("\nCOMPUTER SCIENCE COURSES\n "+progcode);
	          					
	       						
	       						      						
	       						try {
	       							
	       							System.out.println("Enter Course Code To Delete: ");
	       							String code = u1.nextLine().toUpperCase();
	               					System.out.println(code);
	               					
	               					
	               					
	       							File inputFile = new File("compcsi.txt");
	       							File tempFile = new File("myTempFile.txt");
	       							 
	       						
	       						   
	       							
	       							
	       							FileReader fr=new FileReader("compsci.txt");  
	       							
	       							System.out.println("\nINPUT FILE: "+inputFile);
	
	       							BufferedReader reader = new BufferedReader(fr);
	       							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
	       							
	       							String line = reader.readLine();
	       							
	       							
	       							while( (line = reader.readLine() ) != null) {
	       								
	       								writer.write(line);
	   									writer.write("\n");
	       								
	       																
	       							  
	       								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
	       									
	       									Scanner scan = new Scanner(System.in);
	       									Scanner scan1 = new Scanner(System.in);
	       									
	       									String oldcode = "";
	      									line = oldcode;
	      									
	      									writer.write(line);
	      									writer.write("\n");
	      									
	      									String oldname = "";
	      									String namecheck = reader.readLine();
	      									
	      									writer.write(oldname);
	      									writer.write("\n");
	      									
	      									String olddesc ="";
	      									String desccheck = reader.readLine();
	      									
	      									writer.write(olddesc);
	      									writer.write("\n");
	      									
	      									String oldcredits = "";
	      									String credcheck = reader.readLine();
	      									
	      									writer.write(oldcredits);
	      									writer.write("\n");
	      									
	      									String oldpre = "";
	      									String prereqcheck = reader.readLine();
	      									System.out.println("PRECHECK "+prereqcheck);
	      									System.out.println("OLD PREREQ : "+oldpre);
	      									writer.write(oldpre); 
	      									writer.write("\n");
	       									
	       									
	       									System.out.println("Enter New Course Code: ");
	       									String newcode = scan.nextLine();
	       									System.out.println("CODE: "+newcode);
	       									writer.write(newcode);
	       									writer.write("\n");
	       									
	       									
	       									System.out.println("Enter New Course Name: ");
	       									String newname = scan.nextLine();
	       									System.out.println("NAME : "+newname);
	       									writer.write(newname);
	       									writer.write("\n");
	       									
	       									System.out.println("Enter New Course Description: ");
	       									String newdesc = scan.nextLine();
	       									System.out.println("DESC : "+newdesc);
	       									writer.write(newdesc);
	       									writer.write("\n");
	       									
	       									//scan.nextLine();
	       									
	       									System.out.println("Enter New Course Credits: ");
	       									String newcred = scan1.nextLine();
	       									System.out.println("CREDITS: "+newcred);
	       									writer.write(newcred);
	       									writer.write("\n");
	       									
	       									System.out.println("Enter New Pre-Requisites: ");
	       									String newpre = scan.nextLine();
	       									System.out.println("OLD PREREQ : "+newpre);
	       									writer.write(newpre); 
	       									writer.write("\n");
	       									continue;
	       	      						
	       									
	       									
	       								}else {       									
	       									continue;      									
	       								}       							   
	       							   
	       							}//End inner while     							
	       							
	       							      							
	       							fr.close();
	      							reader.close();
	      							writer.flush();
	      							writer.close();      							
	       							
	       							//Deleting old file and replacing with updated version
	       							inputFile.delete();
	       							File dump = new File("C:\\Users\\stewa\\Documents\\School\\Java Files\\Group Project (Home & Away)\\cmpsci.txt");
	       							tempFile.renameTo(dump);
	       						     							
	       						}catch(Exception e) {
	       							
	       						} 
	       						
	       					}//End if
	       					
	       					
	       					
   					
//                          U P D A T I N G   S P O R T   S C I E N C E   P R O G R A M
  					
     					
   					if(progcode.equals("sprtsci123")) {
   						
   						System.out.println("\nSPORT SCIENCE COURSES\n "+progcode);
      					
   						
   						      						
   						try {
   							
   							System.out.println("Enter Course Code To Delete: ");
   							String code = u1.nextLine().toUpperCase();
           					System.out.println(code);
           					
           					
           					
   							File inputFile = new File("sportcsi.txt");
   							File tempFile = new File("myTempFile.txt");
   							 
   						
   						   
   							
   							
   							FileReader fr=new FileReader("sportsci.txt");  
   							
   							System.out.println("\nINPUT FILE: "+inputFile);

   							BufferedReader reader = new BufferedReader(fr);
   							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
   							
   							String line = reader.readLine();
   							
   							
   							while( (line = reader.readLine() ) != null) {
   								
   								writer.write(line);
								writer.write("\n");
   								
   														
   							  
   								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
   									
   									Scanner scan = new Scanner(System.in);
   									Scanner scan1 = new Scanner(System.in);
   									
   									String oldcode = "";
  									line = oldcode;
  									
  									writer.write(line);
  									writer.write("\n");
  									
  									String oldname = "";
  									String namecheck = reader.readLine();
  									
  									writer.write(oldname);
  									writer.write("\n");
  									
  									String olddesc ="";
  									String desccheck = reader.readLine();
  									
  									writer.write(olddesc);
  									writer.write("\n");
  									
  									String oldcredits = "";
  									String credcheck = reader.readLine();
  									
  									writer.write(oldcredits);
  									writer.write("\n");
  									
  									String oldpre = "";
  									String prereqcheck = reader.readLine();
  									System.out.println("PRECHECK "+prereqcheck);
  									System.out.println("OLD PREREQ : "+oldpre);
  									writer.write(oldpre); 
  									writer.write("\n");
   									
   									
   									System.out.println("Enter New Course Code: ");
   									String newcode = scan.nextLine();
   									System.out.println("CODE: "+newcode);
   									writer.write(newcode);
   									writer.write("\n");
   									
   									
   									System.out.println("Enter New Course Name: ");
   									String newname = scan.nextLine();
   									System.out.println("NAME : "+newname);
   									writer.write(newname);
   									writer.write("\n");
   									
   									System.out.println("Enter New Course Description: ");
   									String newdesc = scan.nextLine();
   									System.out.println("DESC : "+newdesc);
   									writer.write(newdesc);
   									writer.write("\n");
   									
   									//scan.nextLine();
   									
   									System.out.println("Enter New Course Credits: ");
   									String newcred = scan1.nextLine();
   									System.out.println("CREDITS: "+newcred);
   									writer.write(newcred);
   									writer.write("\n");
   									
   									System.out.println("Enter New Pre-Requisites: ");
   									String newpre = scan.nextLine();
   									System.out.println("OLD PREREQ : "+newpre);
   									writer.write(newpre); 
   									writer.write("\n");
   									continue;
   	      						
   									
   									
   								}else {       									
   									continue;      									
   								}       							   
   							   
   							}//End inner while     							
   							
   							      							
   							fr.close();
  							reader.close();
  							writer.flush();
  							writer.close();      							
   							
   							//Deleting old file and replacing with updated version
   							inputFile.delete();
   							File dump = new File("C:\\Users\\stewa\\Documents\\School\\Java Files\\Group Project (Home & Away)\\cmpsci.txt");
   							tempFile.renameTo(dump);
   						     							
   						}catch(Exception e) {
   							
   						} 
   						
   					}//End if
   					
   					
//                  U P D A T I N G   E L E C T R I C A L   E N G I N E E R I N G   C O U R S E S
  					
     					
  					if(progcode.equals("elecengi123")) {
  						
  						System.out.println("\nCOMPUTER SCIENCE COURSES\n "+progcode);
     					
  						
  						      						
  						try {
  							
  							System.out.println("Enter Course Code To Delete: ");
  							String code = u1.nextLine().toUpperCase();
          					System.out.println(code);
          					
          					
          					
  							File inputFile = new File("elecengineer.txt");
  							File tempFile = new File("myTempFile.txt");
  							 
  						
  						   
  							
  							
  							FileReader fr=new FileReader("compsci.txt");  
  							
  							System.out.println("\nINPUT FILE: "+inputFile);

  							BufferedReader reader = new BufferedReader(fr);
  							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
  							
  							String line = reader.readLine();
  							
  							
  							while( (line = reader.readLine() ) != null) {
  								
  								writer.write(line);
									writer.write("\n");
  								
  														
  							  
  								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
  									
  									Scanner scan = new Scanner(System.in);
  									Scanner scan1 = new Scanner(System.in);
  									
  									String oldcode = "";
 									line = oldcode;
 									
 									writer.write(line);
 									writer.write("\n");
 									
 									String oldname = "";
 									String namecheck = reader.readLine();
 									
 									writer.write(oldname);
 									writer.write("\n");
 									
 									String olddesc ="";
 									String desccheck = reader.readLine();
 									
 									writer.write(olddesc);
 									writer.write("\n");
 									
 									String oldcredits = "";
 									String credcheck = reader.readLine();
 									
 									writer.write(oldcredits);
 									writer.write("\n");
 									
 									String oldpre = "";
 									String prereqcheck = reader.readLine();
 									System.out.println("PRECHECK "+prereqcheck);
 									System.out.println("OLD PREREQ : "+oldpre);
 									writer.write(oldpre); 
 									writer.write("\n");
  									
  									
  									System.out.println("Enter New Course Code: ");
  									String newcode = scan.nextLine();
  									System.out.println("CODE: "+newcode);
  									writer.write(newcode);
  									writer.write("\n");
  									
  									
  									System.out.println("Enter New Course Name: ");
  									String newname = scan.nextLine();
  									System.out.println("NAME : "+newname);
  									writer.write(newname);
  									writer.write("\n");
  									
  									System.out.println("Enter New Course Description: ");
  									String newdesc = scan.nextLine();
  									System.out.println("DESC : "+newdesc);
  									writer.write(newdesc);
  									writer.write("\n");
  									
  									//scan.nextLine();
  									
  									System.out.println("Enter New Course Credits: ");
  									String newcred = scan1.nextLine();
  									System.out.println("CREDITS: "+newcred);
  									writer.write(newcred);
  									writer.write("\n");
  									
  									System.out.println("Enter New Pre-Requisites: ");
  									String newpre = scan.nextLine();
  									System.out.println("OLD PREREQ : "+newpre);
  									writer.write(newpre); 
  									writer.write("\n");
  									continue;
  	      						
  									
  									
  								}else {       									
  									continue;      									
  								}       							   
  							   
  							}//End inner while     							
  							
  							      							
  							fr.close();
 							reader.close();
 							writer.flush();
 							writer.close();      							
  							
  							//Deleting old file and replacing with updated version
  							inputFile.delete();
  							File dump = new File("C:\\Users\\stewa\\Documents\\School\\Java Files\\Group Project (Home & Away)\\cmpsci.txt");
  							tempFile.renameTo(dump);
  						     							
  						}catch(Exception e) {
  							
  						} 
  						
  					}//End if
  						
	       						
	       						
			 case 'q': break; 
  	    	 default :  System.out.print("\n\tInvald Input\n");
	          	    	 
	          	    	 }
	          	    	 
	          	     }//End while       	
	
	                 
	
	                 break;//End case 3	        
	
	         // Case 9
	         case 9:
	
	            break;//End case 9
	
	         // Case 4: Default case
	         // If none above case executes
	         default:
	
	             // Print statement
	             System.out.println("\nInvalid input\n");
	             break;
	         }
	     }
	
	     // Checking condition
	     while (option != 9);	
		
	} 
	
	 // Method 2
	 // Menu - Static menu for displaying options
	 public static void menu()
	 {
	
	     // Printing statements displaying menu on console
	     System.out.println("\nMENU");
	     System.out.println("\nComputer Science (COMSCI123)\nElectrical Engineering (ELECENG123)\nSport Science (SPRTSCI123)");
	     System.out.println("1: Add Course");
	     System.out.println("2: Delete Course");
	     System.out.println("3: Update Course");
	     System.out.println("9: Go Back");
	     System.out.print("Enter your selection : ");
	     System.out.println("\n\n");
	 }
	
	
	
	
	// ---------------------------------------------------METHOD TO GENERATE STUDENT LIST-------------------------------------------------------
	public void generateList()
	{			
		System.out.println("------------ S T U D E N T  L I S T  G E N E R A T I O N ------------\n");
		try
		{
			Scanner sInFile = new Scanner(new File("zachary.txt"));
			Scanner s= new Scanner(System.in);
			Scanner s1= new Scanner(System.in);
			String search;
			
			System.out.print("Programme code: ");
			search = s.nextLine(); //assigns programme code entered to the search variable
			
			while(sInFile.hasNext())
			{
				String line = sInFile.nextLine().toLowerCase().toString();
	            if(line.equals(search))
	            {
	                System.out.println(line); //prints student records that possess the programme code entered
	            }
			}
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Error: Student List cannot be found");
			e.printStackTrace();
		}
	}
	
	// Tostring Method
	public String toString()
	{
		String output;
		
		output = "********* S T U D E N T  D E T A I L S *********\n";
		output += super.toString();
		output += "Faculty                      : "+faculty;
		output += "\nDepartment                 : "+department;
		output += "\nDate Employed              : "+dateEmployed.toString();
		
		return output;
	}
}