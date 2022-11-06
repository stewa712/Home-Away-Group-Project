package records;

public class Name {
	
	private String fName;
	private String mName;
	private String lName;
	
	//Default Constructor
	public Name()
	{
		fName = "James";
		mName = "Arnold";
		lName = "Bond";
	}
	
	//Primary Constructor
	public Name ( String fName, String mName, String lName)
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
	
	public void Display()
	{
		System.out.println("First Nane: "+fName+" ");
		System.out.println("Middle Name: "+mName+" ");
		System.out.println("Last Name: "+lName+" ");
		System.out.println(":       "+fName+" "+mName+", "+lName);
	}
}

