package records;

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
	public Staff(String faculty, String department, Date dateEmployed)
	{
		super();
		this.faculty = faculty;
		this.department = department;
		this.dateEmployed = dateEmployed;
	}
	
	// Copy Constructor
	public Staff(Staff copy)
	{
		super();
		this.faculty = copy.faculty;
		this.department = copy.department;
		this.dateEmployed = copy.dateEmployed;
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
	
	// Tostring Method
	public String toString()
	{
		String output;
		
		output = super.toString();
		output += "Faculty                      : "+faculty;
		output += "\nDepartment                 : "+department;
		output += "\nDate Employed              : "+dateEmployed.toString();
		
		return output;
	}
}
