//Author: Aaliyah Adebukunola

package records;

public class Programme 
{
	private String progCode;
	private String progName;
	private int maxCourses;
	private String award;
	private String accred;

	// Default Constructor
	public Programme()
	{
		progCode = "";
		progName = "";
		maxCourses = 0;
		award = "";
		accred = "";
	}
	
	// Primary constructor 
	public Programme(String progCode, String progName, int maxCourses, String award, String accred)
	{
		this.progCode = progCode;
		this.progName = progName;
		this.maxCourses = maxCourses;
		this.award = award;
		this.accred = accred;
	}
	
	// Copy Constructor
	public Programme(Programme copy)
	{
		this.progCode = copy.progCode;
		this.progName = copy.progName;
		this.maxCourses = copy.maxCourses;
		this.award = copy.award;
		this.accred = copy.accred;
	}
	
	// Getters and Setters
	public String getProgCode() 
	{
		return progCode;
	}

	public void setProgCode(String progCode) 
	{
		this.progCode = progCode;
	}

	public String getProgName() 
	{
		return progName;
	}

	public void setName(String progName) 
	{
		this.progName = progName;
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
	
	// toString Method
	public String toString()
	{
		String output;
		
		output = "********* P R O G R A M M E  D E T A I L S *********\n";
		output += "\nCode                      : "+progCode;
		output += "\nName                      : "+progName;
		output += "\nMaximum Number of Courses : "+maxCourses;
		output += "\nAward                     : "+award;
		output += "\nAccreditation             : "+accred;
		
		return output;
	}
}
