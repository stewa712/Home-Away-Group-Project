import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	

	
	IDandPasswords(){
		
		int n=5; 
		for(int i=0;i<n;i++) {
		String year = "2022";
		String Pcode1 = "CIT204";
		
		logininfo.put(year+Pcode1+i,"StuPass"+i); 
		
		}
	}
	
   protected HashMap<String, String> getLoginInfo()
	{
		return logininfo;
	}
	
	
}
