package HomeAway;

//Creating Administrator Parent Class

public class Administrator {	
	
	//Attributes of Administrator Class
	
	protected int id;
	protected Name name;
	protected String username;
	protected String password;
	
	// Default Constructor
	public Administrator()
	{
		id = 0000;
		name = new Name();
		username = "";
		password = "";
		
	}
	
	// Primary Constructor 
	public Administrator(int id, Name name, string username, string password)
	{
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		
	}
	
	// Copy Constructor
	public Adminstrator(Administrator obj)
	{
		this.id = obj.id;
		this.name = obj.name;
		this.username = obj.username;
		this.password = obj.password;
		
	}

	//Generating the getters and setters
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	// Tostring method to display attribute values
	public String toString()
	{
		String output;
		
		output = "I.D                                             : "+id;
		output +="\n                                              : "+name.toString();
		output +="\nUsername                                      : "+username;
		output +="\nPassword                                      : "+password;		
		return output;
	}


}
