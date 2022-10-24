public class Date 
{
	private int day;
	private int month;
	private int year;
	
	// Default Constructor
	public Date()
	{
		day = 00;
		month = 00;
		year = 1900;
	}
	
	// Primary constructor
	public Date(int day, int month, int year)
	{
		this.day= day;
		this.month = month;
		this.year = year;
	}
	
	// Copy Constructor
	public Date(Date obj)
	{
		this.day = obj.day;
		this.month = obj.month;
		this.year = obj.year;
	}
	
	// Implementing the Getters and Setters or Accessors and Mutators
	public int GetDay()
	{
		return day;
	}
	
	public void SetDay(int day)
	{
		this.day = day;
	}
	
	public int GetMonth()
	{
		return month;
	}
	
	public void SetMonth(int month)
	{
		this.month = month;
	}
	
	public int GetYear()
	{
		return year;
	}

	public void SetYear(int year)
	{
		this.year = year;
	}
	
	// Display Method
	public void Display()
	{
		System.out.println(day+"/"+month+"/"+year); // 00/00/0000
	}	
}
