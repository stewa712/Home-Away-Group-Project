package records;

public class Programme 
{
	private String code;
	private String name;
	private int maxCourses;
	private String award;
	private String accred;

	// Default Constructor
	public Programme()
	{
		code = "";
		name = "";
		maxCourses = 0;
		award = "";
		accred = "";
	}
	
	// Primary constructor 
	public Programme(String code, String name, int maxCourses, String award, String accred)
	{
		this.code = code;
		this.name = name;
		this.maxCourses = maxCourses;
		this.award = award;
		this.accred = accred;
	}
	
	// Copy Constructor
	public Programme(Programme copy)
	{
		this.code = copy.code;
		this.name = copy.name;
		this.maxCourses = copy.maxCourses;
		this.award = copy.award;
		this.accred = copy.accred;
	}
	
	// Getters and Setters
	public String getCode() 
	{
		return code;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getMaxCourses() 
	{
		return maxCourses;
	}

	public void setMaxCourses(int maxCourses) 
	{
		this.maxCourses = maxCourses;
	}

	public String getAward() 
	{
		return award;
	}

	public void setAward(String award) 
	{
		this.award = award;
	}

	public String getAccred() 
	{
		return accred;
	}

	public void setAccred(String accred) 
	{
		this.accred = accred;
	}
	
	// Tostring Method
	public String toString()
	{
		String output;
		
		output = "PROGRAMME DETAILS";
		output += "\nCode                      : "+code;
		output += "\nName                      : "+name;
		output += "\nMaximum Number of Courses : "+maxCourses;
		output += "\nAward                     : "+award;
		output += "\nAccreditation             : "+accred;
		
		return output;
	}
}
