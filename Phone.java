package HomeAway;

public class Phone {
	
		private int areaCode;
		private int prefix;
		private int line;
		
		//Default Constructor
		public Phone()
		{
			areaCode=0;
			prefix=0;
			line=0;
		}
		
		//Primary Constructor 
		public Phone(int areaCode, int prefix, int line)
		{
			this.areaCode=areaCode;
			this.prefix=prefix;
			this.line=line;
		}
		
		//Copy Constructor 
		public Phone(Phone telephone)
		{
			this.areaCode= telephone.areaCode;
			this.prefix= telephone.prefix;
			this.line= telephone.line;
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
		public void SetLine(int line)
		{
			this.line=line;
		}
		public int GetLine()
		{
			return line;
		}
		
		
		// Tostring method to display attribute values
		public String toString()
		{
			String output;
			
			output = ("+areaCode+")+"-"+prefix+"-"+line;
					
			return output;
		}

		
		
		

}
