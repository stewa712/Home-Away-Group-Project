//Author: Aaron Brown

package records;

public class Course 
{
	
	private String courseCode; 
	private String courseName; 
	private String desc;
	private int credits;
	private String preReq;
	
	
	//Default Constructor
	public Course()
	{
		this.courseCode = courseCode; 
		this.courseName = courseName; 
		this.desc = "";
		this.credits = 0;
		this.preReq = "" ;
	}
	
	//Primary Constructor
	public Course(String courseCode, String courseName, String desc, int credits,String preR)
	{
		this.courseCode = courseCode; 
		this.courseName = courseName; 
		this.desc = desc;
		this.credits = credits;
		this.preReq = preReq;
	}
	
	
	//Copy Constructor
	public Course(Course copy)
	{
		this.courseCode = copy.courseCode; 
		this.courseName = copy.courseName; 
		this.desc = copy.desc;
		this.credits = copy.credits;
		this.preReq = copy.preReq;
	}
	
	//implementing getters and setters 
	public String getCourseCode() 
	{
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) 
	{
		this.courseCode = courseCode;
	}
	
	public String getCourseName() 
	{
		return courseName;
	}
	
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}

	public String getDesc() 
	{
		return desc;
	}
	
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}

	public int getCredits() 
	{
		return credits;
	}

	public void setCredits(int credits) 
	{
		this.credits = credits;
	}

	public String getPreReq() 
	{
		return preReq;
	}

	public void setPreReq(String preReq) 
	{
		this.preReq = preReq;
	}

	//toString Method
	public String toString()
	{
		String output;
		
		output = "********* C O U R S E  D E T A I L S *********\n";
		output =  ("Name: "+courseName);
		output += ("Code: "+courseCode);
		output += ("Description: "+desc);
		output += ("Credtis: "+credits);
		output += ("Pre-Requisites: "+preReq);	
				
		return output;
	}
}

