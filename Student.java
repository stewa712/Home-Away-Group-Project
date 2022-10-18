package HomeAway;

//Creating Student class which is a child of the Administrator class

public class Student extends Administrator {
	
	//Attributes of student class
	
	private Address address;
	private Date dateEnrolled;
	private String enrollStatus;
	private Phone phoneNum;
	
	// Default Constructor
	public Student()
	{
		super();
		address = new Address();
		dateEnrolled = new Date();
		enrollStatus = "";
		phoneNum = new Phone();
	}
	
	// Primary Constructor
	public Student(int id, Name name, String username, String password,Address address,
			Date dateEnrolled,String enrollStatus, Phone phoneNum)
	{
		super(id, name, username, password);
		this.address = address;
		this.dateEnrolled = dateEnrolled;
		this.enrollStatus = enrollStatus;
		this.phoneNum = phoneNum;
	}
	
	// Copy Constructor
	public Student(Student stu)
	{
		super(stu.id, stu.name, stu.username, stu.password);
		this.address = stu.address;
		this.dateEnrolled = stu.dateEnrolled;
		this.enrollStatus = stu.enrollStatus;
		this.phoneNum = stu.phoneNum;
	}
	
	// Getters and setters

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	
	public String getEnrollStatus() {
		return enrollStatus;
	}

	public void setEnrollStatus(String enrollStatus) {
		this.enrollStatus = enrollStatus;
	}
	
	public Program viewProgramDetails() 
	{
		String output;
		
		output = Program.toString();		
		
		return output; 
	}

	
	
	
	// Implementing the toString method
	public String toString()
	{
		String output;
		
		output = super.toString();
		output += "\n                                              : "+address.toString();
		output += "\n                                              : "+dateEnrolled.toString();
		output += "\nEnrollment Status                             : "+enrollStatus;
		output += "\n                                              : "+phoneNum.toString();				
		
		return output;
	}

}
