package records;

import java.util.Scanner;

public class Staff extends User
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
		Student stu = new Student();
		
		System.out.println("********* S T U D E N T  R E G I S T R A T I O N *********\n");
		
		System.out.println("Name: ");
		//stu.setName(s.next());
 
        System.out.println("Address: ");
        //stu.setCode(s.next());
        
        System.out.println("Date Enrolled: ");
        //stu.setMaxCourses(s.nextInt());
        
        System.out.println("Programme Code: ");
        //stu.setAward(s.next());
        
        System.out.println("Enrolment Status: ");
        //stu.setAccred(s.next());
        
        System.out.println("Contact Number: ");
        //stu.setAccred(s.next());
        
        System.out.println(stu.getName()+" has been added.");
        
        /*generate a student record
         *student id number should be generated using the current year, programme code and a sequence that starts at zero (0)
         *enrollment status should be set to zero (0)
		*/
	}
	
	public void createProgramme()
	{
		Programme p = new Programme();
		
		System.out.println("********* P R O G R A M M E  C R E A T I O N *********\n");
		
        System.out.println("Programme code: ");
        p.setCode(s.next());
        
		System.out.println("Programme name: ");
		p.setName(s.next());
        
        System.out.println("Maximum courses: ");
        p.setMaxCourses(s.nextInt());
        
        System.out.println("Award: ");
        p.setAward(s.next());
        
        System.out.println("Accreditation: ");
        p.setAccred(s.next());
        
        System.out.println(p.getName()+"("+p.getCode()+") has been added.");
	}
	
	public void modifyProgramme()
	{
		Programme p = new Programme();
		
		System.out.println("********* P R O G R A M M E  M O D I F I C A T I O N *********\n");
		
        System.out.println("Programme code: ");
        p.setCode(s.next());
        
		/* allow:
		 * addition, 
		 * removal, 
		 * editing of programmes
		*/
	} 
	
	public void generateList()
	{
		Programme p = new Programme();
		
		System.out.println("********* S T U D E N T  L I S T  G E N E R A T I O N *********\n");
		
        System.out.println("Programme code: ");
        p.setCode(s.next());
        
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