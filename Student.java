package records;

//Creating Student class which is a child of the Administrator class

public class Student extends Administrator {
	
	//Attributes of student class
	
	private Address address;
	private Date dateEnrolled;
	private String progCode;
	private int enrollStatus;
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
			Date dateEnrolled, String progCode, int enrollStatus, Phone phoneNum)
	{
		super(id, name, username, password);
		this.address = address;
		this.dateEnrolled = dateEnrolled;
		this.progCode = progCode;
		this.enrollStatus = enrollStatus;
		this.phoneNum = phoneNum;
	}
	
	// Copy Constructor
	public Student(Student stu)
	{
		super(stu.id, stu.name, stu.username, stu.password);
		this.address = stu.address;
		this.dateEnrolled = stu.dateEnrolled;
		this.progCode = stu.progCode;
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
	
	public String getProgCode() {
		return progCode;
	}

	public void setProgCode(String progCode) {
		this.progCode = progCode;
	}
	
	public int getEnrollStatus() {
		return enrollStatus;
	}

	public void setEnrollStatus(int enrollStatus) {
		this.enrollStatus = enrollStatus;
	}
	
	public Phone getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Phone phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Programme viewProgrammeDetails() 
	{
		String output;
		
		output = Programme.toString();		
		
		return output; 
	}

	
	// Implementing the toString method
	public String toString()
	{
		String output;
		
		output = super.toString();
		output += "\n                                              : "+address.toString();
		output += "\n                                              : "+dateEnrolled.toString();
		output += "\nProgramme Code                                : "+progCode;
		output += "\nEnrollment Status                             : "+enrollStatus;
		output += "\n                                              : "+phoneNum.toString();				
		
		return output;
	}

}