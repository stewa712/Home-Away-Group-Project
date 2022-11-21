package HomeAway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

//Class
public class ProgramRecordLinkedList {

 public void modifyProgram()
 {
	 
		
		Course record = new Course();
	 			
     
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
     	    	 System.out.print("\n|  (E)nter Program Code      |");
     	    	 System.out.print("\n|  (Q)uit                    |");
     	    	 System.out.print("\n-----------------------------\n");
     	     	 System.out.print("Please Enter your Choice: \n");
     	    	 
     	    	 CHOICE1 = INPUT1.nextLine();
     	    	 CHOICE1 = CHOICE1.toLowerCase(); 
     	    	 
     	    	 switch(CHOICE1.charAt(0))
     	    	 {
     	    	 case 'e':  	    		 
     	    		 
     	    		 	
     	    		 	
     	    		 	String choice = CHOICE1;
     	    		 	System.out.println("\n\nCHOICE VALUE: "+choice);
     	    		 	
     	    		    System.out.print("Staff Record File Access");
     	    		    System.out.print("\n\n");
     	    		    
     	    		    System.out.println("Enter Program Code: ");
    					String progcode = s1.nextLine().toLowerCase();
    					
    					   					
     	    		 	     					
     					if(progcode.equals("cmpcsi123")) {    						
     						
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
         					
         					Course course = new Course(code,name,desc,credits,prereq);
         					
         					ProgramRecordManagement pr = new ProgramRecordManagement();
         					
         					boolean result = pr.add(record, code);
         					
         					      			
         					if(result) {
         						

         	     	 			try {
         	     	 			FileWriter output = new FileWriter ("compsci.txt",true);
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
         						
         					}else {
         						break;
         					}      					

     						
     						
     					}     					
     					
     			
     	    	 case 'q': break; 
     	    	 default :  System.out.print("\n\tInvald Input\n");
     	    	 }
     	    	 
     	     }//End while       	

             break;

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
      	    		 
      	    		 	
      	    		 	      	    		 	
      	    		    System.out.print("Staff Record File Access");
      	    		    System.out.print("\n\n");
      	    		    
      	    		    System.out.println("Enter Program Code: ");
     					String progcode = d1.nextLine().toLowerCase();
     					
     					
      	    		 	     					
      					if(progcode.equals("cmpcsi123")) {
      						
      						System.out.println("\nCOMPUTER SCIENCE COURSES\n "+progcode);
         					
      						
      						      						
      						try {
      							
      							System.out.println("Enter Course Code To Delete: ");
      							String code = d1.nextLine().toUpperCase();
              						System.out.println(code);
              					
              					             					
      							File inputFile = new File("compcsi.txt");
      							File tempFile = new File("myTempFile.txt");
      							 
      							//Scanner fscan = new Scanner(inputFile);
      							
      						    //System.out.println(fscan.nextLine());
      							
      						       							
      							
      							FileReader fr=new FileReader("compsci.txt");  
      							
      							System.out.println("\nINPUT FILE: "+inputFile);

      							BufferedReader reader = new BufferedReader(fr);
      							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
      							
      							String line;
      							
      							
      							while( (line = reader.readLine() ) != null) {
      								
      								
      							  
      								if(line.contains(code)) {
      									
      									System.out.println("PASS!");
      									break;
      								}else {
      									continue;
									
      								}//End if else
      							   
      							   
      							}//End inner while							
      							      							
      							writer.close(); 
      							reader.close(); 
      							boolean successful = tempFile.renameTo(inputFile);
      							
      							
              					System.out.println("Enter Course Name: ");
              					String name = d1.nextLine();
              					
              					System.out.println("Enter Course Description: ");
              					String desc = d1.nextLine();
              					
              					System.out.println("Enter Course Credits: ");
              					int credits = d.nextInt();
              									
              					System.out.println("Enter Pre-Requisites: ");
              					String prereq = d1.nextLine();
              					System.out.println(code);
      							
      							
      						}catch(Exception e) {
      							
      						}     	     	 			
      						
      					}//End if     					
      					
      			
      	    	 case 'q': break; 
      	    	 default :  System.out.print("\n\tInvald Input\n");
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
 }

 // Method 2
 // Menu - Static menu for displaying options
 public static void menu()
 {

     // Printing statements displaying menu on console
     System.out.println("\nMENU");
     System.out.println("1: Add Course");
     System.out.println("2: Delete Course");
     System.out.println("3: Update Course");
     System.out.println("4: Display Course");
     System.out.println("9: Go Back");
     System.out.print("Enter your selection : ");
     System.out.println("\n\n");
 }
 
 
}//End class progreclinkedlist
