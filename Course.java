package HomeAway;

public class Course {
	
	private String code ; 
	private String name; 
	private String desc;
	private int credits;
	private String preR;
	
	
	//Default Constructor
	public Course()
	{
		this.code=code; 
		this.name = name; 
		this.desc="Empty";
		this.credits=3;
		this.preR="Empty" ;
	}
	
	//Primary Constructor
	public Course(String code, String name, String desc, int credits,String preR)
	{
		this.code=code; 
		this.name = name; 
		this.desc=desc;
		this.credits=credits;
		this.preR=preR;
	}
	
	
	//Copy Constructor
	public Course(Course copy)
	{
		this.code=copy.code; 
		this.name = copy.name; 
		this.desc=copy.desc;
		this.credits=copy.credits;
		this.preR=copy.preR;
	}
	
	//implementing getters and setters 
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}


	public String getPreR() {
		return preR;
	}

	public void setPreR(String preR) {
		this.preR = preR;
	}


	public void Display(){

		System.out.println("Name: "+name);
		System.out.println("Code: "+code);
		System.out.println("Description: "+desc);
		System.out.println("Credtis: "+credits);
		System.out.println("Pre-Requisites: "+preR);
		
	}

}
