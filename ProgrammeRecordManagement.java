package records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProgrammeRecordManagement {
	
	// Creating an empty LinkedList
    LinkedList<Record> list;
 
    // Default Constructor
    public ProgrammeRecordManagement()
    {
        list = new LinkedList<>();
    }
 
    // Method 1
    // Adding Record
    // @param record
    public boolean add(Course record,String code)
    {
 
        // Checking if a record already exists or not,
        // if not add it to Record list, Otherwise
        // error display message
    	
    	try {
    		
    		File inputFile = new File("compcsi.txt");
        	FileReader fr=new FileReader("compsci.txt");  
    			
    			
    		BufferedReader reader = new BufferedReader(fr);
    		
    		String line;
    		
    		
    		System.out.println("");
    			
    			
    			while( (line = reader.readLine() ) != null) {			  
    				if(line.contains(code)) {
    					
    					System.out.println("Record already exists in the Record list");
    					return false;
    				}else {
    					continue;   					
    					//list.add(record);
    				}
    				
 					
    				
    			   
    			}//End inner while
    			
    			
    			
    		
    	}catch(Exception e) {
    		
    	}
    	
    	return true;
    	
      
    }//End method add
    
    
    
 
    // Method 2
    // Searching Record
    // @param idNimber
    //  @return
    public boolean find(int idNimber)
    {
 
        // Iterating record list
        // using for eacj loop
        for (Record l : list) {
 
        	/*
        	
            // Checking record by id Number
            if (l.getIdNumber() == idNimber) {
 
                System.out.println(l);
                return true;
            }
            
            */
        }
        return false;
    }
 
    // Method 3
    // Delete Record
    // @param recIdNumber
    public void delete(int recIdNumber)
    {
        Record recordDel = null;
 
        // Iterating record list
        for (Record ll : list) {
        	
        	/*
            // Finding record to be deleted by id Number
            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
            
            */
        }
 
        // If recordDel is null, then show error message,
        // otherwise remove the record from Record list
        if (recordDel == null) {
 
            // Displaying no record found
            System.out.println("Invalid record Id");
        }
      /*  else 
        {
            list.remove(recordDel);
 
            // Display message for successful deletion of
            // record
            System.out.println("Successfully removed record from the list");
        }*/
    }
 
    // Method 4
    // Finding Record
    // @param idNumber
    // @return
    public Record findRecord(int idNumber)
    {
 
        // Iterate Record list
        // using for each loop
        for (Record l : list) {
        	
        	/*
            // Checking record by id Number.
            if (l.getIdNumber() == idNumber) {
                return l;
            }
            
            */
        }
 
        return null;
    }
 
    // Method 5
    // Update Record
    // @param id
    // @param input
    public void update(int id, Scanner input)
    {
 
        if (find(id)) {
            Record rec = findRecord(id);
 
            // Display message only
            System.out.print(
                "What is the new Student id Number ? ");
            int idNumber = input.nextInt();
 
            // Display message only
            System.out.print(
                "What is the new Student contact Number ");
            int contactNumber = input.nextInt();
            input.nextLine();
 
            // Display message only
            System.out.print(
                "What is the new Student Name ? ");
            String name = input.nextLine();
 
  //          rec.setIdNumber(idNumber);
    //        rec.setName(name);
      //      rec.setContactNumber(contactNumber);
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            // Print statement
            System.out.println(
                "Record Not Found in the Student list");
        }
    }
 
    // Method 6
    // Display Records
    public void display()
    {
 
        // If record list is empty then
        // print the message below
        if (list.isEmpty()) {
 
            // Print statement
            System.out.println("The list has no records\n");
        }
        // Iterating Record list
        // using for each loop
        for (Record record : list) {
 
            // Printing the list
            System.out.println(record.toString());
        }
    }

}
