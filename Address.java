//Author: Kevaughn Miles

package records;

public class Address 
{
	private int stNum;
	private String stName;
	private String parish;
	private String country;
	
	//Default Constructor
	public Address()
	{
		stNum = 15;
		stName = "Cherry Road";
		parish = "Kingston";
		country = "Japan";
	}
	
	//Primary Constructor
	public Address (int stNum, String stName, String parish, String country)
	{
		this.stNum = stNum;
		this.stName = stName;
		this.parish = parish;
		this.country = country;
	}
	
	//Copy Constructor
	public Address (Address obj)
	{
		this.stNum = obj.stNum;
		this.stName = obj.stName;
		this.parish = obj.parish;
		this.country = obj.country;
	}
	
	// Getters and Setters
	public int GetStNum()
	{
		return stNum;
	}
	
	public void SetStNum(int stNum)
	{
		this.stNum = stNum;
	}
	
	public String GetStName ()
	{
		return stName;
	}
	
	public void SetStName(String stName)
	{
		this.stName = stName;
	}
	
	public String GetParish()
	{
		return parish;
	}
	
	public void SetParish(String parish)
	{
		this.parish = parish;
	}
	
	public String GetCountry()
	{
		return country;
	}
	
	public void SetCountry(String country)
	{
		this.country = country;
	}
	
	//toString Method
	public String toString()
	{
		String output;
		
		output = (stNum+" "+stName+", "+parish+", "+country);
				
		return output;
	}
}