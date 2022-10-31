import java.io.File;
import java.util.ArrayList;  
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class CourseRecord {
	
	
	
	public static Scanner INPUT = new Scanner (System.in);
	public static String code ; 
	public static String name; 
	public static String desc;
	public static int credits;
	public static String preR;
	
	public static void main(String[] args)  
	{
	
	String CHOICE= " ";   
     System.out.print("Course Record File Access");
     System.out.print("\n\n");	
     
     
     while(CHOICE.charAt(0) != 'q')
     {
    	 System.out.print("\n========Main Menu========");	
    	 System.out.print("\n\n|   (C)reate A Record    |");
    	 System.out.print("\n\n|   (E)dit A Record      |");
    	 System.out.print("\n\n|   (D)isplay Record     |");
    	 System.out.print("\n\n|   (S)ave A Record      |");
    	 System.out.print("\n\n|   (L)oad A Record      |");
    	 System.out.print("\n\n|   (Q)uit               |");
    	 System.out.print("\n=======================\n\n\t");
    	 
    	 CHOICE = INPUT.nextLine();
    	 CHOICE = CHOICE.toLowerCase(); 
    	 
    	 switch(CHOICE.charAt(0))
    	 {
    	 case 'c': break;
    	 case 'e': EditCourse(); break; 
    	 case 'd': DisplayCourse();break; 
    	 case 's': SaveCourse();break;
    	 case 'l': LoadCourse(); break; 
    	 case 'q': break; 
    	 default :  System.out.print("\n\tInvald Input\n");
    	 }
     }
     
     System.out.print("\n\n");
}
	
//------------------------------------------------------------------------------------------------------------
	public static void SaveCourse()
	{
		try {
			File DATAFILE = new File ("CourseRecord.txt");
			FileOutputStream DATA = new FileOutputStream(DATAFILE);
			PrintStream SAVE = new PrintStream(DATA); 
			SAVE.println(code);
			SAVE.println(name);
			SAVE.println(desc);
			SAVE.println(credits); 
			SAVE.println(preR);
			
			SAVE.close();
			DATA.close();
			System.out.print("/n\tSuccess! DATA was Saved.");
		}
		catch(Exception X)
		{System.out.print("\n\tFile Acess Error. Could Not SAVE");
		
	}
	
}
//------------------------------------------------------------------------------------------------------------

public static void EditCourse() {
	
	System.out.print("/nEdit Course Infromation");
	

	 System.out.print("\n code   :  " ); 
		 code= INPUT.nextLine(); 
	
	 System.out.print("\n Name   :  " ); 
	 name= INPUT.nextLine(); 
	 
	 
	 System.out.print("\n desc :  " ); 
	 desc= INPUT.nextLine(); 
	 
	 System.out.print("\n Credits :  " ); 
	 credits= Integer.parseInt(INPUT.nextLine());
	 
	 System.out.print("\n preR :  " ); 
	 preR= INPUT.nextLine(); 
		
}


//------------------------------------------------------------------------------------------------------------

public static void DisplayCourse() {
	
	
	System.out.print("/n Course Infromation");
	
	System.out.print("\n code  : " + code  ); 
	
	 
	 System.out.print("\n Name   :"  + name ); 
	
	
	 System.out.print("\n desc :"  + desc ); 
	
	 System.out.print("\n Credits :"  + credits); 
	
	 
	 System.out.print("\n preR : " + preR ); 
	 		
}

//------------------------------------------------------------------------------------------------------------

public static void LoadCourse() {
	
	
	try {
		
		File DATAFILE = new File ("CourseRecord.txt");
		FileInputStream DATA = new FileInputStream(DATAFILE); 
		InputStreamReader DATASTREAM = new InputStreamReader(DATA);
		BufferedReader DATAREADER = new BufferedReader(DATASTREAM);
		
		code= DATAREADER.readLine();
		name= DATAREADER.readLine();
		desc= DATAREADER.readLine();
		credits= Integer.parseInt( DATAREADER.readLine());
		preR = DATAREADER.readLine();
		
		DATAREADER.close();
		DATASTREAM.close();
		DATA.close();
		
	}
	catch (Exception X )
	{System.out.print("\n\tFile Acess Error. Could Not load DATA");
    }
	

}
	
}

	 
 

	