package records;

import java.util.Scanner;

public class Login 
{
	public static void main(String args[])
	{
		String username, password;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("********* S Y S T E M  L O G I N *********\n");
		
		while (true) 
		{
            System.out.print("Enter username: ");
            username = s.nextLine();
            System.out.print("Enter password: ");
            password = s.nextLine();
            
            if(username.equals("user") && password.equals("user")) 
            {
                break;
            }
            
            System.out.println("Authentication Failed. Please try again.\n");
        }
		
        System.out.println("Authentication Successful.\n");
	}
}
