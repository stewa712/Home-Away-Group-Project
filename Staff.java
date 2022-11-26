// Authors: Aaliyah Adebukunola & Zachary Stewart

package records;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
	public Staff(String id, Name name, String username, String password, String faculty, String department, Date dateEmployed)
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
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);		
		String CHOICE = "a";   
  
	    do
	    {
	    	System.out.println("\n------------- S T U D E N T  R E G I S T R A T I O N -------------");
		    System.out.println("|                                                                  |");
		    System.out.println("|  (A)dd A Student Account                                         |");
		    System.out.println("|  (D)isplay Staff                                                 |");
		    System.out.println("|  (Q)uit                                                          |");
		    System.out.println("|                                                                  |");
		    System.out.println("--------------------------------------------------------------------");
		    System.out.print("Please Enter your Choice: ");
		    	 
		    CHOICE = INPUT.nextLine().toLowerCase(); //converts user input to lower case
		    
		    switch(CHOICE.charAt(0))
		    {
		    	// Add Student Record
		    	case 'a':
		    		Scanner INPUT1 = new Scanner (System.in);
		    		String CHOICE1 = "a";
		    		File myFile = new File ("student.txt");
		    		File myFile1 = new File ("studentlogin.txt");
		    		 
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
		    				// Add another
		    				case 'a':
		    					// Populating the student record via user input
		    					System.out.println("\n\n\n------------- A D D I N G  S T U D E N T  R E C O R D --------------\n");
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
			   				    		   				
		   						String idNum = currentYear+programmeCode+sequence; //Concatenating current year, programme code and a sequence to generate ID number
		   				    	
		   						// Writing user input to file
			   		 			try 
			   		 			{
				   		 			FileWriter output = new FileWriter ("student.txt",true);
				   		 			
				   		 			output.write(idNum+"   "+fName+"   "+mName+"   "+lName+"   "+password+"   "+address+"   "+enrollStatus+"   "+day+"/"+month+"/"+year+"   "+programmeCode+"   ("+area+")"+prefix+"-"+line+"\n");
				   		 			
				   		 			System.out.println("\n*******************************************************************");
				   		 			System.out.println("\n"+fName+" "+lName+" ("+idNum+") was Registered Successfully!"); // Informing the user that the student has been registered
				   		 			output.close(); 
			   		 			} 
			   		 			catch (IOException e) 
			   		 			{
			   		 				System.err.println("Staff Account Could Not Be Added");	
			   		 			} 
			   		 						   		 
			   		 			try 
			   		 			{
			   			 			FileWriter output = new FileWriter ("studentlogin.txt",true);
			   			 			
			   			 			output.write(idNum+" ");
			   			 			output.write("\n");
			   			 			output.write(password+" ");
			   			 			output.write("\n");
	
			   			 			System.out.println("\nUsername: "+idNum+"\nPassword: "+password); // Displaying student's login details
			   			 			System.out.println("\n*******************************************************************");
			   			 			output.close(); 
			   			 		} 
			   		 			catch (IOException e) 
			   		 			{
			   			 			System.err.println("Student Login Information Could Not Be Added");	
			   			 		} 
			   		 			break;
		   		    	   	
			   		 		// Back
		   		    	 	case 'b':
		   		    	 		break; 
		   		    		// Other 
		   		    	 	default:
		   		    	 		System.out.print("\nInvald Input\n");
		   		    	 }
		   		    	 
		    			 System.out.print("\n-------------------------------------------------------------------");	
		   		    	 System.out.print("\n|    (A)dd Another                                                |");
		   		    	 System.out.print("\n|    (B)ack                                                       |");
		   		    	 System.out.print("\n-------------------------------------------------------------------\n");
		   		     	 System.out.print("Please Enter your Choice: ");
		   		    	 
		   		    	 CHOICE1 = INPUT1.nextLine();
		   		    	 CHOICE1 = CHOICE1.toLowerCase(); 
		   		    	 
		   		    }while(CHOICE1.charAt(0) != 'b');
		    		System.out.println("\n\n\n");
		    		break;	    		
		    	
		    	// Displaying Student Records
		    	case 'd':
		    		
		    		char[] data= new char [1000];
		    		
		    		System.out.println("\n\n\n------- D I S P L A Y I N G  S T U D E N T  R E C O R D S ---------\n"); 
					
		    		//Reading data from file
		 			try 
		 			{
		 				FileReader input = new FileReader ("student.txt");
		 				input.read(data);
		 				System.out.println(data);
		 				input.close();
		 			} 
		 			catch(IOException e) 
		 			{
		 				System.err.println("Student Records Could Not Be Displayed");
		 			}
		 			System.out.println("\n\n\n");
		 			break; 
		    	
		 		// Quit
		    	case 'q':
		    		System.out.print("\n\n\n");
		    		break; 
		    		
		    	// Other	 
		    	default:  
		    		System.out.print("\nInvald Input\n");
		    }
		    	 
	    } while(CHOICE.charAt(0) != 'q');	
	    
	    //closing scanners to prevent resource leaks
	    s.close();
	    s1.close();
	    INPUT.close();
	}
	
	// METHOD TO CREATE PROGRAMMES
	public void createProgramme()
	{	
		File myFile = new File ("programme.txt");		
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);		
		String CHOICE1= "c";
			
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
				// Add Another
				case 'c':
					// Populating the programme record with user input
					System.out.println("\n\n\n---------------- P R O G R A M M E  C R E A T I O N ----------------\n"); 
					
					System.out.print("Enter Programme Code: ");
					String programmeCode = s1.nextLine().toUpperCase(); //converting programme code entered to uppercase
						
					System.out.print("Enter Name: ");
					String name = s1.nextLine();
					
					System.out.print("Enter Maximum Courses: ");
					int maxCourses = s.nextInt();										
													
					System.out.print("Enter Award: ");
					String award = s1.nextLine();
						
					System.out.print("Enter Accreditation: ");
					String accreditation = s1.nextLine();
										
		 			try 
		 			{
		 				FileWriter output = new FileWriter ("programme.txt",true);
		  		 		
		  		 		output.write(programmeCode+"   "+name+"   "+maxCourses+"   "+award+"   "+accreditation+"\n");//Writing user input to file
		  				System.out.println("\n*******************************************************************");
		  	 			System.out.println("\n"+name+" ("+programmeCode+") was Registered Successfully!");//Informing the user that the programme has been registered successfully	
	 		 			System.out.println("\n*******************************************************************");
	 		 			output.close(); 
			 		} 
			 		catch (IOException e) 
			 		{
			 			System.err.println("Programme Could Not Be Added");	
			 		} 
			 			 
			 		break;
		    	
			 	// Quit
			    case 'q': 
			    	System.out.print("\n\n\n");
			    	break; 
			    		 
			    default: 
			    	System.out.print("\nInvald Input\n");
			}
			    	 
			System.out.print("\n-------------------------------------------------------------------");	
		    System.out.print("\n|    (A)dd Another                                                |");
		   	System.out.print("\n|    (B)ack                                                       |");
		   	System.out.print("\n-------------------------------------------------------------------\n");
		   	System.out.print("Please Enter your Choice: ");
			    	 
			CHOICE1 = INPUT.nextLine().toLowerCase(); 
		    	 
		} while(CHOICE1.charAt(0) != 'b');
		
		s.close();
		s1.close();
		INPUT.close();
	}
	
	// METHOD TO DISPLAY PROGRAMMES
	public void displayProgrammes()
	{
		char[] data= new char [1000];
		
		System.out.println("\n\n\n------------ D I S P L A Y I N G  P R O G R A M M E S -------------\n"); 
		
		// Reading data from file
		try
		{
			FileReader input = new FileReader ("programme.txt");
			input.read(data);
			System.out.println(data);
			input.close();		
		} 
		catch(IOException e) 
		{	
			System.err.println("Programmes Could Not Be Displayed");
		}
		System.out.println("\n\n\n");
	}
	
	// METHOD TO MODIFY PROGRAMME
	public void modifyProgramme()
	{
        System.out.println("Programme code: ");
              
		Course record = new Course(); //Creating object of class ProgramRecordLinkedList to add, delete and edit courses for each program
	 	
		// Calling add() record method to add static data/(Hard CodedData) to linked List
		// hr.add(record);
		
		Scanner input = new Scanner(System.in); // Creating Scanner Object to read input
		
		int option = 0; // Creating option integer variable
		
		do 
		{
			System.out.println("------------- P R O G R A M E  M O D I F I C A T I O N -------------");
			System.out.println("|  1: Add Courses                                                  |");
			System.out.println("|  2: Delete Course                                                |");
			System.out.println("|  3: Update Course                                                |");
			System.out.println("|  4: Display Course                                               |");
			System.out.println("|  9: Back                                                         |");
			System.out.println("--------------------------------------------------------------------\n");
			System.out.print("Please Enter your Choice: ");
				
			option = input.nextInt();
	
	        switch (option) 
	        {
	        	//Add Course
	        	case 1:
		        	Scanner s= new Scanner(System.in);
		     		Scanner s1= new Scanner(System.in);
		     		String CHOICE1= "a";
		     		Scanner INPUT1 = new Scanner (System.in);	     		
			     	do
		     	    {
		     	    	switch(CHOICE1.charAt(0))
		     	    	{
		     	    		case 'a':
		     	    			String choice = CHOICE1;
		     	    		 	System.out.println("\n\nCHOICE VALUE: "+choice);
		     	    		    
		     	    		    System.out.println("Enter Program Code: ");
		    					String progcode = s1.nextLine().toLowerCase();
		    					
		    					System.out.println("\nCURRENT PROGCODE:"+progcode);
		    					 					
		     					if(progcode.equals("cmpcsi123")) 
		     					{
		     						System.out.println("Enter Course Code: ");
		         					String code = s1.nextLine();
		         					System.out.println(code);
		         											
		         					System.out.println("Enter Course Name: ");
		         					String name = s1.nextLine();
		         					
		         					System.out.println("Enter Course Description: ");
		         					String desc = s1.nextLine();
		         					
		         					System.out.println("Enter Course Credits: ");
		         					int credits = s.nextInt();
		         									
		         					System.out.println("Enter Pre-Requisites: ");
		         					String prereq = s1.nextLine();
		         					System.out.println(code);
		         					
		         					//Course course = new Course(code,name,desc,credits,prereq);
		         					
		         					ProgrammeRecordManagement pr = new ProgrammeRecordManagement();
		         					
		         					boolean result = pr.add(record, code);
		         					
		         					System.out.println("RETURN TO CASE 1");
		         					
		         					if(result) 
		         					{
		         	     	 			try 
		         	     	 			{
			         	     	 			FileWriter output = new FileWriter ("compsci.txt",true);
			         	     	 			output.write(code+" ");
			         	     	 			output.write("\n");
			         	     	 			output.write(name+" ");
			         	     	 			output.write("\n");
			         	     	 			output.write(desc+" ");
			         	     	 			output.write("\n");
			         	     	 			output.write(credits+" ");
			         	     	 			output.write("\n");
			         	     	 			output.write(prereq+" ");
			         	     	 			output.write("\n");
			         	     	 			output.close(); 
		         	     	 			} 
		         	     	 			catch (IOException e) 
		         	     	 			{
		         	     	 				JOptionPane.showMessageDialog(null, "File Append Error");		
		         	     	 			} 	    	
		         					}
		         					else 
		         					{
		         						break;
		         					}      						     						
		     					}     					     					
		     			
		     	    	 case 'b': 
		     	    		 break;
		     	    		 
		     	    	 default:  
		     	    		 System.out.print("\nInvald Input\n");
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
	
		         // Case 2
		         case 2:
		        	 Scanner d1 = new Scanner(System.in);
		        	 String CHOICE2 = "";
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
	      	    		    System.out.print("Staff Record File Access");
	      	    		    System.out.print("\n\n");
	      	    		    System.out.println("Enter Program Code: ");
	     					String progcode = d1.nextLine().toLowerCase();
	     					     					
	      					if(progcode.equals("cmpcsi123")) 
	      					{
	      						System.out.println("\nCOMPUTER SCIENCE COURSES\n "+progcode);
	         					      						
	      						try 
	      						{
	      							System.out.println("Enter Course Code To Delete: ");
	      							String code = d1.nextLine().toUpperCase();
	              					System.out.println(code);	              		
	              					
	      							File inputFile = new File("C:\\Users\\aaliy\\OneDrive - The University of Technology,Jamaica\\Year 2 - Semester 1\\Object Oriented Programming\\Java\\Home & Away\\compsci.txt");
	      							File tempFile = new File("myTempFile.txt");
	      							    							
	      							FileReader fr=new FileReader("compsci.txt");  
	      							
	      							System.out.println("\nINPUT FILE: "+inputFile);
	
	      							BufferedReader reader = new BufferedReader(fr);
	      							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
	      							
	      							String line;
	      							
	      							while((line = reader.readLine()) != null) 
	      							{
	      								System.out.println("CURRENT LINE VALUE: "+line);								
	      							  
	      								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) 
	      								{
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
	      								}
	      								else 
	      								{ 	
	      									writer.write(line);
	      									writer.write("\n");				
	      								}//End if else   
	      							}//End inner while   							
	      							fr.close();
	      							reader.close();
	      							writer.flush();
	      							writer.close(); 
      							
	      						//Deleting old file and replacing with updated version
	      							inputFile.delete();
	      							File dump = new File("C:\\Users\\aaliy\\OneDrive - The University of Technology,Jamaica\\Year 2 - Semester 1\\Object Oriented Programming\\Java\\Home & Away\\compsci.txt");
	      							tempFile.renameTo(dump);
	      							
	      						}
	      						catch(Exception e) 
	      						{
	      							System.err.println("An unexpected error has occurred.");
	      						}	
	      					}//End if 
	      					
	      					break;

	      	    	 case 'q':
	      	    		 break; 
	      	    		 
	      	    	 default:  
	      	    		 System.out.print("\n\tInvald Input\n");
	      	    	 }
	      	    	 
	      	     }//End while       	
	             break;//End case 2	             
	             	
	         // Case 3
	         case 3:
	             break;//End case 3
	
	         // Case 5
	         case 4:
	            
	             break;//End case 4
	
	         // Case 6
	         case 9:
	
	            break;//End case 9
	
	         // Case 7: Default case
	         // If none above case executes
	         default:
	
	             // Print statement
	             System.out.println("\nInvalid input\n");
	             break;
	         }
     }

     // Checking condition
     while (option != 9);
     input.close();
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
			
			s.close();
			s1.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.err.println("Error: Student List cannot be found");
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