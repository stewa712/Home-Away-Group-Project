public class Name {
	
	private String fname;
	private String mname;
	private String lname;
	
	//Default Constructor
	public Name()
	{
		fname = "James";
		mname = "Arnold";
		lname = "Bond";
	}
	
	//Primary Constructor
	public Name ( String fname, String mname, String lname)
	{
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
	
	//Copy Constructor
	public Name (Name obj)
	{
		this.fname = obj.fname;
		this.mname = obj.mname;
		this.lname = obj.lname;
	}
	
	// Getters and Setters
	
	public String GetFname ()
	{
		return fname;
	}
	
	public void SetFName(String fname)
	{
		this.fname = fname;
	}
	
	public String GetMName()
	{
		return mname;
	}
	
	public void SetMName(String mname)
	{
		this.mname = mname;
	}
	
	public String GetLName()
	{
		return lname;
	}
	
	public void SetLName(String lname)
	{
		this.lname = lname;
	}
	
	public void Display()
	{
		System.out.println("First Nane: "+fname+" ");
		System.out.println("Middle Name: "+mname+" ");
		System.out.println("Last Name: "+lname+" ");
		System.out.println(":       "+fname+" "+mname+", "+lname);
	}
}

}
