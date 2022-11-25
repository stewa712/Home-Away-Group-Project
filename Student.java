//Created By Zachary Stewart
//ID: 2101823

package HomeAway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Creating Student class which is a child of the Administrator class

public class Student extends Administrator {
	
	//Attributes of student class
	
	private Address address;
	private Date dateEnrolled;
	private String enrollStatus;
	private String progCode;
	private Phone phoneNum;
	
	// Default Constructor
	public Student()
	{
		super();
		address = new Address();
		dateEnrolled = new Date();
		enrollStatus = "";
		progCode = "";
		phoneNum = new Phone();
	}
	
	// Primary Constructor
	public Student(int id, Name name, String username, String password,Address address,String progcode,
			Date dateEnrolled,String enrollStatus, Phone phoneNum)
	{
		super(id, name, username, password);
		this.address = address;
		this.progCode = progCode;
		this.dateEnrolled = dateEnrolled;
		this.enrollStatus = enrollStatus;
		this.phoneNum = phoneNum;
	}
	
	// Copy Constructor
	public Student(Student stu)
	{
		super(stu.id, stu.name, stu.username, stu.password);
		this.address = stu.address;
		this.progCode = stu.progCode;
		this.dateEnrolled = stu.dateEnrolled;
		this.enrollStatus = stu.enrollStatus;
		this.phoneNum = stu.phoneNum;
	}
	
	// Getters and setters

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getProgCode() {
		return progCode;
	}

	public void setProgCode(String progCode) {
		this.progCode = progCode;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	
	public String getEnrollStatus() {
		return enrollStatus;
	}

	public void setEnrollStatus(String enrollStatus) {
		this.enrollStatus = enrollStatus;
	}
	
	
	
	//----------------------------------------------------V I E W   P R O G R A M----------------------------------------------------------------
	
	//Method to view details of program
	public void viewProgram() {
		
		Scanner INPUT = new Scanner (System.in);
		String CHOICE= " ";  
		
		 while(CHOICE.charAt(0) != 'q') {
			 
			 System.out.print("\n\n");	
	    	 System.out.print("\n----------- Menu -------------");	
	    	 System.out.print("\n|   (C)hoose Programme       |");
	    	 System.out.print("\n|   (Q)uit                   |");
	    	 System.out.print("\n--------------------------\n");
	     	
	    	 
	    	 CHOICE = INPUT.nextLine();
	    	 CHOICE = CHOICE.toLowerCase(); 
	    	 
	    	 switch(CHOICE.charAt(0)) {
	    	 
	    	 case 'c': 	    		  
	    		 					
	    		 try {
	    			System.out.print("\n|   Enter Programme Code     |");	
	    			Scanner c = new Scanner(System.in);
	    			String progcode = c.next();	    			
	 				Scanner fileInp = new Scanner(new File("programme.txt"));
	 				while (fileInp.hasNext())
	 			{
	 				
	 				String code = fileInp.next();
	 				
	 				System.out.println("PROG: "+progcode);
	 				System.out.println("FILE CODE: "+code);
	 				
	 					 				
	 				if(progcode.equals(code)) {
	 					
	 					
	 					System.out.println("\n\nProgramme Code   : "+progcode);
	 					
	 					String name = fileInp.next();
	 					System.out.println("Programme Name   : "+name);
						
	 					int max = fileInp.nextInt();
						System.out.println("Maximum Courses  : "+max);
																
						String award = fileInp.next();							
						System.out.println("Award            : "+award);
						
						String accred = fileInp.next();
						System.out.println("Accreditation    : "+accred);
						break;
						
	 					
	 				}else {
	 					continue;
	 				}
	 				
	 				}fileInp.close();
	 				
	 			} catch (IOException e) {
	 				
	 				System.out.println("File Read Error");
	 			}    	
	    	 }		 
		 }//End while
		
				
		
	}//End viewProgram
	
	
	
	
	//--------------------------------------------------A D D I N G    C O U R S E S--------------------------------------------------------
	
	
	
	//Method for the student to add courses
	public void addCourse() {
		
		
		Scanner d = new Scanner(System.in);
  		Scanner d1 = new Scanner(System.in);
  		String CHOICE2 = " ";
  		Scanner INPUT2 = new Scanner (System.in);	
  	 
  	 
  		          
           // Entering course record
    	while(CHOICE2.charAt(0) != 'q')
  	     {
  	    	 System.out.print("\n\n");	
  	    	 System.out.print("\n-----------------------------");	
  	    	 System.out.print("\n|  (A)dd Courses             |");
  	    	 System.out.print("\n|  (Q)uit                    |");
  	    	 System.out.print("\n-----------------------------\n");
  	     	 System.out.print("Please Enter your Choice: \n");
  	    	 
  	    	 CHOICE2 = INPUT2.nextLine();
  	    	 CHOICE2 = CHOICE2.toLowerCase(); 
  	    	 
  	    	 switch(CHOICE2.charAt(0))
  	    	 {
  	    	 case 'a':  
  	    		 
  	    		 
  	    		 
  	    		 	System.out.println("Enter Student Password: ");
  	    		 	String stupass = d.nextLine(); 		   
 							
 					
 					if(stupass.equals("ste123")) {
 						
 						File stuFile = new File("zachary.txt");							
  						
  						System.out.println("\nCOMPUTER SCIENCE PROGRAM ");  						
  						      						
  						try {
  							
  							System.out.println("Enter Course Code To Add: ");
  							String code = d1.nextLine().toUpperCase();
          					System.out.println(code);  			
          					
          					
  							File inputFile = new File("compsci.txt");
  							 							
  							FileReader fr=new FileReader("compsci.txt");  
  							
  							System.out.println("\nINPUT FILE: "+inputFile);
  							
  							Scanner scan = new Scanner(System.in);

  							BufferedReader reader = new BufferedReader(fr);
  							BufferedWriter writer = new BufferedWriter(new FileWriter(stuFile,true));
  							
  							String line;
  							
  							
  							while( (line = reader.readLine() ) != null) {
  								
  																
  							  
  								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
  									
  									
  									System.out.println("CODECHECK "+line);
  									
  									writer.write(line);
  									writer.write("\n");
  									
  									
  									String name = reader.readLine();
  									System.out.println("NMCHECK "+name);
  									
  									writer.write(name);
  									writer.write("\n");
  									
  									
  									String desc = reader.readLine();
  									System.out.println("DESCHECK "+desc);
  									
  									writer.write(desc);
  									writer.write("\n");
  									
  									
  									int cred = reader.read();
  									System.out.println("CREDCHECK "+cred);
  									writer.write(cred);
  									writer.write("\n");
  									writer.flush();
  									reader.reset();
  								
  									
  									
  									String prereq = reader.readLine();
  									System.out.println("PRECHECK "+prereq);
  									
  									writer.write(prereq); 
  									writer.write("\n");
  									break;				
  									
  									
  								}else {
  									
  									continue; 								  									
  								}
  							   
  							   
  							}//End inner while     							
  							
  							      							
  							fr.close();
  							reader.close();
  							writer.flush();
  							writer.close();	
  							
  						     							
  						}catch(Exception e) {
  							
  						}     	     	 			
  						
  					}//End if 
 					
 					
 					
 					if(stupass.equals("ade123")) {
 						
 						File stuFile = new File("aaliyah.txt");							
  						
  						System.out.println("\nCOMPUTER SCIENCE PROGRAM ");  						
  						      						
  						try {
  							
  							System.out.println("Enter Course Code To Add: ");
  							String code = d1.nextLine().toUpperCase();
          					System.out.println(code);  			
          					
          					
  							File inputFile = new File("compsci.txt");
  							 							
  							FileReader fr=new FileReader("compsci.txt");  
  							
  							System.out.println("\nINPUT FILE: "+inputFile);

  							BufferedReader reader = new BufferedReader(fr);
  							BufferedWriter writer = new BufferedWriter(new FileWriter(stuFile,true));
  							
  							String line;
  							
  							
  							while( (line = reader.readLine() ) != null) {
  								
  														
  							  
  								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
  									
  									
  									System.out.println("CODECHECK "+line);
  									
  									writer.write(line);
  									writer.write("\n");
  									
  									
  									String name = reader.readLine();
  									System.out.println("NMCHECK "+name);
  									
  									writer.write(name);
  									writer.write("\n");
  									
  									
  									String desc = reader.readLine();
  									System.out.println("DESCHECK "+desc);
  									
  									writer.write(desc);
  									writer.write("\n");
  									
  									
  									String cred = reader.readLine();
  									System.out.println("CREDCHECK "+cred);
  									writer.write(cred);
  									writer.write("\n");
  									
  									
  									String prereq = reader.readLine();
  									System.out.println("PRECHECK "+prereq);
  									
  									writer.write(prereq); 
  									writer.write("\n");
  									break;				
  									
  									
  								}else {
  									
  									continue; 								  									
  								}
  							   
  							   
  							}//End inner while     							
  							
  							      							
  							fr.close();
  							reader.close();
  							writer.flush();
  							writer.close();	
  							
  						     							
  						}catch(Exception e) {
  							
  						}     	     	 			
  						
  					}//End if 
 					
 					
 					if(stupass.equals("bro123")) {
 						
 						File stuFile = new File("aaron.txt");
 						
 						System.out.println("\nELECTRICAL ENGINEERING PROGRAM ");   						
  											
  						      						
  						try {
  							
  							System.out.println("Enter Course Code To Add: ");
  							String code = d1.nextLine().toUpperCase();
          					System.out.println(code);  			
          					
          					
  							File inputFile = new File("compsci.txt");
  							 							
  							FileReader fr=new FileReader("compsci.txt");  
  							
  							System.out.println("\nINPUT FILE: "+inputFile);

  							BufferedReader reader = new BufferedReader(fr);
  							BufferedWriter writer = new BufferedWriter(new FileWriter(stuFile,true));
  							
  							String line;
  							
  							
  							while( (line = reader.readLine() ) != null) {
  								
  														
  							  
  								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
  									
  									
  									System.out.println("CODECHECK "+line);
  									
  									writer.write(line);
  									writer.write("\n");
  									
  									
  									String name = reader.readLine();
  									System.out.println("NMCHECK "+name);
  									
  									writer.write(name);
  									writer.write("\n");
  									
  									
  									String desc = reader.readLine();
  									System.out.println("DESCHECK "+desc);
  									
  									writer.write(desc);
  									writer.write("\n");
  									
  									
  									String cred = reader.readLine();
  									System.out.println("CREDCHECK "+cred);
  									writer.write(cred);
  									writer.write("\n");
  									
  									
  									String prereq = reader.readLine();
  									System.out.println("PRECHECK "+prereq);
  									
  									writer.write(prereq); 
  									writer.write("\n");
  									break;				
  									
  									
  								}else {
  									
  									continue; 								  									
  								}
  							   
  							   
  							}//End inner while     							
  							
  							      							
  							fr.close();
  							reader.close();
  							writer.flush();
  							writer.close();	
  							
  						     							
  						}catch(Exception e) {
  							
  						}     	     	 			
  						
  					}//End if 
 					
 					
 					
 					if(stupass.equals("mil123")) {
 						
 						File stuFile = new File("kevaughn.txt");							
  						
 						System.out.println("\nSPORT SCIENCE PROGRAM ");   						
  						      						
  						try {
  							
  							System.out.println("Enter Course Code To Add: ");
  							String code = d1.nextLine().toUpperCase();
          					System.out.println(code);  			
          					
          					
  							File inputFile = new File("compsci.txt");
  							 							
  							FileReader fr=new FileReader("compsci.txt");  
  							
  							System.out.println("\nINPUT FILE: "+inputFile);

  							BufferedReader reader = new BufferedReader(fr);
  							BufferedWriter writer = new BufferedWriter(new FileWriter(stuFile,true));
  							
  							String line;
  							
  							
  							while( (line = reader.readLine() ) != null) {
  								
  												  
  								if(line.contains(code.toLowerCase())||line.contains(code.toUpperCase())) {
  									
  									
  									System.out.println("CODECHECK "+line);
  									
  									writer.write(line);
  									writer.write("\n");
  									
  									
  									String name = reader.readLine();
  									System.out.println("NMCHECK "+name);
  									
  									writer.write(name);
  									writer.write("\n");
  									
  									
  									String desc = reader.readLine();
  									System.out.println("DESCHECK "+desc);
  									
  									writer.write(desc);
  									writer.write("\n");
  									
  									
  									String cred = reader.readLine();
  									System.out.println("CREDCHECK "+cred);
  									writer.write(cred);
  									writer.write("\n");
  									
  									
  									String prereq = reader.readLine();
  									System.out.println("PRECHECK "+prereq);
  									
  									writer.write(prereq); 
  									writer.write("\n");
  									break;				
  									
  									
  								}else {
  									
  									continue; 								  									
  								}
  							   
  							   
  							}//End inner while     							
  							
  							      							
  							fr.close();
  							reader.close();
  							writer.flush();
  							writer.close();	
  							
  						     							
  						}catch(Exception e) {
  							
  						}     	     	 			
  						
  					}//End if 
  					
  			
  	    	 case 'q': break; 
  	    	 default :  System.out.print("\n\tInvald Input\n");
  	    	 }
  	    	 
  	     }//End while   
		
		
		
		
	}//End addCourse





	
	
	
	
	//Method to generate student fees
	public void generateFee() {
		
		Scanner INPUT = new Scanner (System.in);
		String CHOICE= " ";  
		
		 while(CHOICE.charAt(0) != 'q') {
			 
			 System.out.print("\n\n");	
	    	 System.out.print("\n----------- Menu -------------");	
	    	 System.out.print("\n|   (G)enerate Fees          |");
	    	 System.out.print("\n|   (Q)uit                   |");
	    	 System.out.print("\n--------------------------\n");
	     	
	    	 
	    	 CHOICE = INPUT.nextLine();
	    	 CHOICE = CHOICE.toLowerCase(); 
	    	 
	    	 switch(CHOICE.charAt(0)) {
	    	 
	    	 case 'g': 
	    		 
	    		 System.out.print("\n|   Enter Student Password     |");	
	    		 Scanner c = new Scanner(System.in);
	    		 String stupass = c.nextLine();
	    		 					
	    		 try {
	    			 
	    			 Scanner fileInp = new Scanner(new File("zachary.txt"));
	    			 System.out.println("STUPASS: "+stupass);
	    			 
	    			 if(stupass.equals("ste123")) {
	    				 
	    				 System.out.println("GEN FEE TEST");	    				
	    				 while (fileInp.hasNext()) {
	    					// String test = fileInp.next();
		    				 System.out.println("CREDIT TEST: "+fileInp.next());
	    					 
	    					 String a = fileInp.next();
	    					 String b = fileInp.next();
	    					 
	    					 int cred = fileInp.nextInt();
	    					 
	    					 System.out.println("CREDIT VALUE: "+cred);
	    					 
	    				 }//End while}
	    				 fileInp.close();
	    				 
	    			 }//End if
	 				
	 			}catch (IOException e) {
	 				
	 				System.out.println("File Read Error");
	 			} 
	    		 
	    	 }//End switch
	    	 
	    	 
		 }//End while
		
		
		
		
	}//End generateFees
	

	
	
	
	// Implementing the toString method
	public String toString()
	{
		String output;
		
		output = super.toString();
		output += "\n                                              : "+address.toString();
		output += "\n                                              : "+dateEnrolled.toString();
		output += "\nEnrollment Status                             : "+enrollStatus;
		output += "\n                                              : "+phoneNum.toString();				
		
		return output;
	}

}
