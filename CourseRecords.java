

class CourseRecords {
	
	
	
	public CourseRecords() {System.out.print("\n Building a Course");}
	
	void SetCode(String X) {code=X;}
	void SetName(String X) {name=X;}
	void SetDesc(String X) {desc=X;}
	void SetCredits(int X) {credits=X;}
	void SetPreR(String X) {preR=X;}
	
	String GetCode() {return code;}
	String GetName() {return name;}
	String GetDesc() {return desc;}
	int GetCredits() {return credits;}
	String GetPreR() {return preR;}
	
	private String code ; 
	private String name; 
	private String desc;
	private int credits;
	private String preR;
	
	
}
	