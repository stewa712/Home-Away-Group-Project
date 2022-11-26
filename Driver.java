
//Authors: Aaliyah Adebukunola & Zachary Stewart

package records;

//Importing scanner package to receive input from the user
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver 
{
	public static void main(String[] args) 
	{
		System.out.println("*******************************************************************\n");		
		System.out.println("         T H E   H O M E   &   A W A Y   I N S T I T U T E         \n");		
		System.out.println("*******************************************************************\n"); 		
		
		String username, password;
		String choice = "";
		int type = 0;
		
		//Creating objects of the Scanner class
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		Administrator adm = new Administrator(); //creating object of Administrator class
		Staff stf = new Staff(); //creating object of Staff class
		Student stu = new Student(); //creating object of Student class					
		  		
		//System Login
		do
		{
			System.out.println("********************** S Y S T E M  L O G I N *********************\n");	
			System.out.println("1: Admininstrator\n2: Staff Member\n3: Student\n0: Quit");
			System.out.print("Enter the number corresponding with the type of user you are: ");
			type = s1.nextInt();
			
			switch(type)
			{
				//Administrator
				case 1:					
	            	do
	    			{
	            		System.out.print("\nEnter username: ");
				        username = s.nextLine();
				        System.out.print("Enter password: ");
				        password = s.nextLine();
				        
	    				String un = "admin";
	    				String pw = "admin";
	    				
	    				if (username.equals(un)&& password.equals(pw))
	    				{
	    					break;				
	    				}
	    				
	    				System.out.println("Authentication Failed. Please try again.\n");   
	    				
	    			} while(true);
	    			
	    			System.out.println("Authentication Successful!\n");
	    				    				    			
	    			adm.newStaff();	//Calling newStaff method 
	    			
	    			break;
	    			
	            //Staff Member
				case 2:
					try 
					{
						do
		    			{						
							System.out.print("\nEnter username: ");
					        username = s.nextLine();
					        System.out.print("Enter password: ");
					        password = s.nextLine();
		    		
					        boolean valid = false;
							String un;
							String pw;
							Scanner fileInp = new Scanner(new File("staffusrpass.txt"));
								
							while (fileInp.hasNext())
							{
								un = fileInp.next();
								pw = fileInp.next();
									
								if(username.equals(un)&& password.equals(pw))
								{
									valid = true;
									break;
								}								
							}
								 
							if (valid==true)
							{
								break;
							}							
								
							System.out.println("Authentication Failed. Please try again.\n"); 
																										
		    			} while(true);
					} 
					catch(FileNotFoundException e)
					{
						System.out.println("Error: User information could not be retrieved.\n\n");						
						break;
					}
	    			
	    			System.out.println("Authentication Successful!\n\n\n");
	    			
					do
					{						
						System.out.println("------------------------ S T A F F  M E N U ------------------------");
						System.out.println("|  (R)egister Student                                              |");
						System.out.println("|  (C)reate Programme                                              |");
						System.out.println("|  (D)isplay Programmes                                            |");
						System.out.println("|  (M)odify Programme Details                                      |");
						System.out.println("|  (G)enerate Student List                                         |");
						System.out.println("|  (Q)uit                                                          |");
						System.out.println("--------------------------------------------------------------------\n");
						System.out.print("Please Enter your Choice: ");	
						choice = input.nextLine().toLowerCase(); //converts user input to lower case
								    	 
						switch(choice.charAt(0))
						{
							//Register Student
							case 'r':
								stf.registerStudent();
								break;
							//Create Programme
							case 'c':
								stf.createProgramme();
								break;
							//Display Programmes
							case 'd':
								stf.displayProgrammes();
								break;
							//Modify Programme Details	    		
							case 'm':
								stf.modifyProgramme();
								break;
							//Generate Student List	
							case 'g':
								stf.generateList();
								break;				    	
							//Quit	    	 		  	 
							case 'q':
								System.out.print("\n\n\n\n");
								break;
							//Other	    	 
							default:
								System.out.print("\nInvalid Input\n\n\n");	
								break;
						}								    	 
					}while (choice.charAt(0)!='q');																	
					break;
					
				//Student					
				case 3:
					try 
					{
						do
						{						
							System.out.print("\nEnter username: ");
					        username = s.nextLine();
					        System.out.print("Enter password: ");
					        password = s.nextLine();
		    		
					        boolean valid = false;
							String un;
							String pw;
							Scanner fileInp = new Scanner(new File("stuusrpass.txt"));
								
							while (fileInp.hasNext())
							{
								un = fileInp.next();
								pw = fileInp.next();
									
								if(username.equals(un)&& password.equals(pw))
								{
									valid = true;
									break;
								}								
							}
								 
							if (valid==true)
							{
								break;
							}							
								
							System.out.println("Authentication Failed. Please try again.\n"); 																										
						} while(true);
					} 
					catch(FileNotFoundException e)
					{
						System.out.println("Error: User information could not be retrieved.\n\n");						
						break;
					}
	    			
	    			System.out.println("Authentication Successful!\n\n\n");  
		
					do
					{			 
						System.out.println("---------------------- S T U D E N T  M E N U ----------------------");
						System.out.println("|  (V)iew Programme Details                                        |");
						System.out.println("|  (A)dd Course                                                    |");
						System.out.println("|  (F)Fee Breakdown                                                |");
						System.out.println("|  (P)Progress Report                                              |");
						System.out.println("|  (Q)uit                                                          |");
						System.out.println("--------------------------------------------------------------------\n");
						System.out.print("Please Enter your Choice: ");								    	 
						choice = input.nextLine().toLowerCase(); 
								    	 
						switch(choice.charAt(0))
						{
							//View Programme Details
							case 'v':
								stu.viewProgram();
								break;
							//Add Course
							case 'a':
								stu.addCourse();
								break;
							//Generate Fee Breakdown	    		
							case 'f':
								stu.generateFee();
								break;
							//Generate Progress Report	
							case 'p':
								stu.generateProgressReport();
								break;				    	
							//Quit	    	 		  	 
							case 'q':
								System.out.print("\n\n\n\n");	
								break;
							//Other	    	 
							default:
								System.out.print("\nInvalid Input\n\n\n");	
								break;
						}								    	 
					}while (choice.charAt(0)!='q');																	
					break;
					
				//Quit
				case 0:
					break;
					
				//Other	
				default:  
					System.out.println("\nInvalid Input\n");					
					break;
			}
			//closing scanner objects to prevent resource leaks
			s.close();
			s1.close();
			input.close();	
		}while(true);	
		
	}//End main
}//End class