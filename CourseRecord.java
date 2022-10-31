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
	public static CourseRecords CG;

	public static void main(String[] args)  
	{
	
	CreateCourse();
	
	String CHOICE= " ";   
     System.out.print("Course Record File Access");
     System.out.print("\n\n");	
     
     
     while(CHOICE.charAt(0) != 'q')
     {
    	 System.out.print("\n\n");	
    	 System.out.print("\n---------Main Menu--------");	
    	 System.out.print("\n|   (C)reate A Record    |");
    	 System.out.print("\n|   (E)dit A Record      |");
    	 System.out.print("\n|   (D)isplay Record     |");
    	 System.out.print("\n|   (Q)uit               |");
    	 System.out.print("\n--------------------------\n");
     	 System.out.print("Please Enter your Choice: \n");
    	 
    	 CHOICE = INPUT.nextLine();
    	 CHOICE = CHOICE.toLowerCase(); 
    	 
    	 switch(CHOICE.charAt(0))
    	 {
    	 case 'c': CreateCourse(); break;
    	 case 'e': EditCourse(); break; 
    	 case 'd': DisplayCourse();break; 
    	 case 'q': break; 
    	 default :  System.out.print("\n\tInvald Input\n");
    	 }
     }
     
     System.out.print("\n\n");
}
	
//------------------------------------------------------------------------------------------------------------
	
	public static void CreateCourse()
	{
	CG = new CourseRecords();
	
	}
	
	
	
	
//------------------------------------------------------------------------------------------------------------	
	public static void SaveCourse()
	{
		try {
			File DATAFILE = new File ("CourseRecord.txt");
			FileOutputStream DATA = new FileOutputStream(DATAFILE);
			PrintStream SAVE = new PrintStream(DATA); 
			SAVE.println(CG.GetCode());
			SAVE.println(CG.GetName());
			SAVE.println(CG.GetDesc());
			SAVE.println(CG.GetCredits()); 
			SAVE.println(CG.GetPreR());
			
			SAVE.close();
			DATA.close();
			System.out.print("\n\tSuccess! DATA was Saved.");
		}
		catch(Exception X)
		{System.out.print("\n\tFile Acess Error. Could Not SAVE");
		
	}
	
}
//------------------------------------------------------------------------------------------------------------

public static void EditCourse() {
	
	System.out.print("\n Edit Course Infromation");
	
	 LoadCourse();
	 
    String code= " " ; 
	String name = " " ; 
	String desc = " " ; 
	int credits= 0 ; 
	String preR=" " ; 
	
	 System.out.print("\n code   :  " ); 
	 code = INPUT.nextLine();
	 CG.SetCode(code); 
	 
	 System.out.print("\n Name   :  " ); 
	 name = INPUT.nextLine();
	 CG.SetName(name);
	 
	 System.out.print("\n desc :  " );
	 desc = INPUT.nextLine();
	 CG.SetDesc(desc); 
	 
	 System.out.print("\n Credits :  " ); 
	 credits= Integer.parseInt(INPUT.nextLine());
	 CG.SetCredits(credits);
	 
	 System.out.print("\n preR :  " ); 
	 preR= INPUT.nextLine(); 
	 CG.SetPreR(preR); 
	 
	 SaveCourse();
		
}


//------------------------------------------------------------------------------------------------------------

public static void DisplayCourse() {
	
	
	System.out.print("\n-------Course Infromation--------");
	
	System.out.print("\n code    : "+ CG.GetCode()); 
    System.out.print("\n Name    :" + CG.GetName()); 
	System.out.print("\n desc    :" + CG.GetDesc()); 
	System.out.print("\n Credits :" + CG.GetCredits());  
	System.out.print("\n preR    : "+ CG.GetPreR()); 
	System.out.print("\n---------------------------------");
	 		
}

//------------------------------------------------------------------------------------------------------------

public static void LoadCourse() {
	
    String code= " " ; 
	String name = " " ; 
	String desc = " " ; 
	int credits= 0 ; 
	String preR=" " ; 
	
	try {
		
		File DATAFILE = new File ("CourseRecord.txt");
		FileInputStream DATA = new FileInputStream(DATAFILE); 
		InputStreamReader DATASTREAM = new InputStreamReader(DATA);
		BufferedReader DATAREADER = new BufferedReader(DATASTREAM);
		
		code= DATAREADER.readLine();
		CG.SetCode(code);
		
		name= DATAREADER.readLine();
		CG.SetName(name);
		
		desc= DATAREADER.readLine();
		CG.SetDesc(desc);
		
		credits= Integer.parseInt( DATAREADER.readLine());
		CG.SetCredits(credits);
	
		preR = DATAREADER.readLine();
		CG.SetPreR(preR);
		
		
		DATAREADER.close();
		DATASTREAM.close();
		DATA.close();
		
	}
	catch (Exception X )
	{System.out.print("\n\tFile Acess Error. Could Not load DATA");
    }
	

}
	
}

	 
 

	