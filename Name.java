//Author: Kevaughn Miles

package records;

public class Name 
{
	
	private String fName;
	private String mName;
	private String lName;
	
	//Default Constructor
	public Name()
	{
		fName = "";
		mName = "";
		lName = "";
	}
	
	//Primary Constructor
	public Name (String fName, String mName, String lName)
	{
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
	
	//Copy Constructor
	public Name (Name obj)
	{
		this.fName = obj.fName;
		this.mName = obj.mName;
		this.lName = obj.lName;
	}
	
	// Getters and Setters	
	public String GetFName ()
	{
		return fName;
	}
	
	public void SetFName(String fName)
	{
		this.fName = fName;
	}
	
	public String GetMName()
	{
		return mName;
	}
	
	public void SetMName(String mName)
	{
		this.mName = mName;
	}
	
	public String GetLName()
	{
		return lName;
	}
	
	public void SetLName(String lName)
	{
		this.lName = lName;
	}
	
	//toString Method
	public String toString()
	{
		String output;
		
		output = (fName+" "+mName+" "+lName);
				
		return output;
	}
}

