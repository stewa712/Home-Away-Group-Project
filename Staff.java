/*
 * Aaliyah Adebukunola (2103579)
 */

package records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Importing scanner package to receive input from the user
import java.util.Scanner;

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
	
	// METHOD TO REGISTER STUDENTS
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
		    		 
		    		File myFile = new File ("student.txt");
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
		   						
		   						int sequence = 0; //initialising sequence as 0
			   				    
		   						// Auto-incrementing sequence
		   						try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) 
			   				    {
			   				      while (reader.readLine() != null) 
			   				    	  sequence++; 
			   				    } 
			   				    catch (IOException e) 
			   				    {
			   				          e.printStackTrace();
			   				    }
			   				    
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
		 				FileReader input = new FileReader ("student.txt");
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
	
	// METHOD TO CREATE PROGRAMMES
	public void createProgramme()
	{	
		File myFile = new File ("programme.txt");
		
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
						
					// Informing the user that the programme has been registered successfully
		 			try 
		 			{
		 				FileWriter output = new FileWriter ("programme.txt",true);
		  		 		
		  		 		output.write(programmeCode+"   "+name+"   "+maxCourses+"   "+award+"   "+accreditation+"\n");
		  				System.out.println("\n*******************************************************************");
		  	 			System.out.println("\n"+name+" ("+programmeCode+") was Registered Successfully!");	
	 		 			System.out.println("\n*******************************************************************");
	 		 			output.close(); 
			 		} 
			 		catch (IOException e) 
			 		{
			 			System.err.println("File Append Error");	
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
	
	// METHOD TO DISPLAY PROGRAMMES
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
	
	// METHOD TO MODIFY PROGRAMME
	public void modifyProgramme()
	{
        System.out.println("Programme code: ");
        
		/* allow:
		 * addition, 
		 * removal, 
		 * editing of programmes
		*/
	} 
	
	// METHOD TO GENERATE STUDENT LIST
	public void generateList()
	{			
		System.out.println("------------ S T U D E N T  L I S T  G E N E R A T I O N ------------\n");
		try
		{
			Scanner sInFile = new Scanner(new File("student.txt"));
			Scanner s= new Scanner(System.in);
			Scanner s1= new Scanner(System.in);
			String search;
			
			System.out.print("Programme code: ");
			search = s.nextLine(); //assigns programme code entered to the search variable
			
			while(sInFile.hasNext())
			{
				String line = sInFile.nextLine().toLowerCase().toString();
	            if(line.contains(search))
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