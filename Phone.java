//Author: Zachary Stewart
	
package records;

public class Phone {
	
		private int areaCode;
		private int prefix;
		private int lineNum;
		
		//Default Constructor
		public Phone()
		{
			areaCode = 0;
			prefix = 0;
			lineNum = 0;
		}
		
		//Primary Constructor 
		public Phone(int areaCode, int prefix, int lineNum)
		{
			this.areaCode = areaCode;
			this.prefix = prefix;
			this.lineNum = lineNum;
		}
		
		//Copy Constructor 
		public Phone(Phone telephone)
		{
			this.areaCode = telephone.areaCode;
			this.prefix = telephone.prefix;
			this.lineNum = telephone.lineNum;
		}
		
		//Getters and Setters 
		public void SetAreaCode (int areaCode)
		{
			this.areaCode=areaCode;
		}
		public int GetAreaCode()
		{
			return areaCode;
		}
		public void SetPrefix(int prefix)
		{
			this.prefix=prefix;
		}
		public int GetPrefix()
		{
			return prefix;
		}
		public void SetLineNum(int lineNum)
		{
			this.lineNum=lineNum;
		}
		public int GetLineNum()
		{
			return lineNum;
		}
		
		
		// Tostring method to display attribute values
		public String toString()
		{
			String output;
			
			output = ("("+areaCode+")"+prefix+"-"+lineNum);
					
			return output;
		}
}