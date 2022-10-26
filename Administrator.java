package HomeAway;

import java.util.Scanner ;  

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
	public Administrator(int id, Name name, String username, String password)
	{
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		
	}
	
	// Copy Constructor
	public Administrator(Administrator obj)
	{
		this.id = obj.id;
		this.name = obj.name;
		this.username = obj.username;
		this.password = obj.password;
		
	}

	//Generating the Accesors and Mutators
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

	void newStaff() {
		
		System.out.println("Enter Administrator ID: ");
		Scanner usrid = new Scanner(System.in);
		this.id = usrid.nextInt();
		System.out.println("\nAdministrator ID: "+id);		
		setID(id);
		System.out.println("\nEnter Administrator Username: ");
		Scanner usrname = new Scanner(System.in);
		this.username = usrname.nextLine();
		System.out.println("\nAdministrator Username: "+username);		
		setUsername(username);
		System.out.println("\nEnter Administrator Password: ");
		Scanner usrpswrd = new Scanner(System.in);
		this.username = usrpswrd.nextLine();
		System.out.println("\nAdministrator Password: "+password);		
		setPassword(password);
				
	}
	
	// Tostring method to display attribute values
	public String toString()
	{
		String output;
		
		output = "I.D                                             : "+id;
		output +="\n                                              : "+name.nameString();
		output +="\nUsername                                      : "+username;
		output +="\nPassword                                      : "+password;		
		return output;
	}


}
