/*
 * Aaliyah Adebukunola (2103579)
 */

package records;

import java.io.BufferedReader;
import java.io.File;
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
	
	Scanner s = new Scanner(System.in);
	
	public void registerStudent()
	{
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);
			
		String CHOICE= " ";   

	      
	    while(CHOICE.charAt(0) != 'q')
	    {
		    	 System.out.print("\n------STUDENT REGISTRATION------");	
		    	 System.out.print("\n|  (C)reate A New Student File |");
		    	 System.out.print("\n|  (A)dd A Record              |");
		    	 System.out.print("\n|  (D)isplay Record            |");
		    	 System.out.print("\n|  (Q)uit                      |");
		    	 System.out.print("\n-------------------------------\n");
		     	 System.out.print("Please Enter your Choice: ");
		    	 
		    	 CHOICE = INPUT.nextLine();
		    	 CHOICE = CHOICE.toLowerCase(); 
		    	 
		    	 switch(CHOICE.charAt(0))
		    	 {
		    	 case 'c': 
		    	
		    		 //Creating the file 
		    			File myFile = new File ("student.txt");
		    			File myFile1 = new File ("studentlogin.txt");
		    			
		    			try {
		    				if(myFile.createNewFile())
		    				{
		    					System.out.println("Student File Ceated Successfully");
		    				}
		    				else {
		    					System.out.println("Student File Creation Error");
		    				} 
		    			} catch (IOException e) {
		    				System.out.println("Student File Error");
		    			}
		    			
		    			try {
		    				if(myFile1.createNewFile())
		    				{
		    					System.out.println("Student Login File Ceated Successfully");
		    				}
		    				else {
		    					System.out.println("Student Login File Creation Error");
		    				} 
		    			} catch (IOException e) {
		    				System.out.println("Student Login File Error");
		    			}
		    		 
		    		 break;
		    		    		 
		    	 case 'a':
		    		 Scanner INPUT1 = new Scanner (System.in);
		    		 String CHOICE1= "c";
		    		 
		    		 do
		    		 {
		   		    	 switch(CHOICE1.charAt(0))
		   		    	 {
		   		    	 	case 'c':  	
		   		    	 		System.out.println("\n-----ADDING STUDENT RECORD-----");  
		   												
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
		   				        
		   				        programmeCode = programmeCode.toUpperCase(); 
		   				     
		   				        System.out.println("\nEnter Contact Number");
		   				        System.out.print("Area Code: ");
		   						int area = s.nextInt();
		   						System.out.print("Prefix: ");
		   						int prefix = s.nextInt();
		   						System.out.print("Line Number: ");
		   						int line = s.nextInt();
		   						
		   				        int enrollStatus = 0;
		   				        
		   						LocalDate currentdate = LocalDate.now();
		   						int currentYear = currentdate.getYear();
		   						
		   						int record = 0;
			   				    try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) 
			   				    {
			   				      while (reader.readLine() != null) 
			   				    	  record++;
			   				    } 
			   				    catch (IOException e) 
			   				    {
			   				          e.printStackTrace();
			   				    }
			   				      
		   						String idNum = currentYear+programmeCode+record;
		   				    		
		   		 			try 
		   		 			{
			   		 			FileWriter output = new FileWriter ("student.txt",true);
			   		 			
			   		 			output.write(idNum+"   "+fName+"   "+mName+"   "+lName+"   "+password+"   "+address+"   "+enrollStatus+"   "+day+"/"+month+"/"+year+"   "+programmeCode+"   ("+area+")"+prefix+"-"+line+"\n");
			   		 			
			   		 			System.out.println("\n*******************************************************************************************");
			   		 			System.out.println("\n"+fName+" "+lName+" ("+idNum+") was Registered Successfully!");	
			   		 			output.close(); 
		   		 			} 
		   		 			catch (IOException e) 
		   		 			{
		   		 				System.out.println("File Append Error");	
		   		 			} 
		   		 			
		   		 			try 
		   		 			{
		   			 			FileWriter output = new FileWriter ("studentlogin.txt",true);
		   			 			
		   			 			output.write(idNum+" ");
		   			 			output.write("\n");
		   			 			output.write(password+" ");
		   			 			output.write("\n");

		   			 
		   			 			System.out.println("\nUsername: "+idNum+"\nPassword: "+password);
		   			 			System.out.println("\n*******************************************************************************************");
		   			 			output.close(); 
		   			 		} 
		   		 			catch (IOException e) 
		   		 			{
		   			 				System.out.println("File Append Error");	
		   			 		} 
		   		 			break;
		   		    	   	 
		   		    	 case 'q': 
		   		    		 break; 
		   		    		 
		   		    	 default: 
		   		    		 System.out.print("\n\tInvald Input\n");
		   		    	 }
		   		    	 
		   		    	 System.out.print("\n-------------------------------");	
		   		    	 System.out.print("\n|         (C)ontinue          |");
		   		    	 System.out.print("\n|         (Q)uit              |");
		   		    	 System.out.print("\n-------------------------------\n");
		   		     	 System.out.print("Please Enter your Choice: ");
		   		    	 
		   		    	 CHOICE1 = INPUT1.nextLine();
		   		    	 CHOICE1 = CHOICE1.toLowerCase(); 
		   		    	 
		   		     }while(CHOICE1.charAt(0) != 'q');//End while
		    		System.out.println("\n\n");			    		 
		    		
		    		break;	    		
		    		    
		    	 
		    		    	 
		    	 case 'd': 
		    		 
		    		char[] data= new char [1000];
						
		 			try {
		 				
		 				FileReader input = new FileReader ("student.txt");
		 				input.read(data);
		 				System.out.println("\nStudent Records");
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
	
	public void createProgramme()
	{	
		//Creating the file 
		File myFile = new File ("programme.txt");
		
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner INPUT = new Scanner (System.in);
		Scanner INPUT1 = new Scanner (System.in);
		String CHOICE1= "c";
		
		try 
		{
			if(myFile.createNewFile())
			{
				System.out.println("Programme File Ceated Successfully");
			}
			else 
			{
				System.out.println("Programme File Creation Error");
			} 
		} 
		catch (IOException e) 
		{
			System.out.println("Programme File Error");
		}
		
		do
		{
		    	 switch(CHOICE1.charAt(0))
		    	 {
		    	 	case 'c':  	
		    	 		System.out.println("\n-----PROGRAMME CREATION-----");  
												
						System.out.print("\nEnter Programme Code: ");
						String programmeCode = s1.nextLine();
						
						programmeCode = programmeCode.toUpperCase(); 
						
						System.out.print("\nEnter Name: ");
						String name = s1.nextLine();
						
						System.out.print("\nEnter Maximum Courses: ");
						int maxCourses = s.nextInt();										
													
						System.out.print("\nEnter Award: ");
						String award = s1.nextLine();
						
						System.out.print("\nEnter Accreditation: ");
						String accreditation = s1.nextLine();
						
			 			try 
			 			{
		  		 			FileWriter output = new FileWriter ("programme.txt",true);
		  		 			
		  		 			output.write(programmeCode+"   "+name+"   "+maxCourses+"   "+award+"   "+accreditation+"\n");
		  		 			
		  		 			System.out.println("\n*******************************************************************************************");
		  		 			System.out.println("\n"+name+" ("+programmeCode+") was Registered Successfully!");	
		  		 			output.close(); 
			 			} 
			 			catch (IOException e) 
			 			{
			 				System.out.println("File Append Error");	
			 			} 
			 			
			 			 
			 			break;
		    	   	 
			    	 case 'q': 
			    		 break; 
			    		 
			    	 default: 
			    		 System.out.print("\n\tInvald Input\n");
			    	 }
			    	 
			    	 System.out.print("\n-------------------------------");	
			    	 System.out.print("\n|         (C)ontinue          |");
			    	 System.out.print("\n|         (Q)uit              |");
			    	 System.out.print("\n-------------------------------\n");
			     	 System.out.print("Please Enter your Choice: ");
			    	 
			    	 CHOICE1 = INPUT1.nextLine();
			    	 CHOICE1 = CHOICE1.toLowerCase(); 
		    	 
		}while(CHOICE1.charAt(0) != 'q');//End while
		
		System.out.println("\n");	
	}
	
	public void displayProgramme()
	{
		char[] data= new char [1000];
		
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
			System.out.println("File Read Error");
		}
	}
	
	public void modifyProgramme()
	{
        System.out.println("Programme code: ");
        
		/* allow:
		 * addition, 
		 * removal, 
		 * editing of programmes
		*/
	} 
	
	public void generateList()
	{	
		System.out.println("********* S T U D E N T  L I S T  G E N E R A T I O N *********\n");
		
        System.out.println("Programme code: ");
        
        
        //a list of students should be generated according to the programme code entered.
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