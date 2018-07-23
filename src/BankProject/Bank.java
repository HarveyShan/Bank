package BankProject;
import java.util.Scanner;
public class Bank {

	public Bank()
	{
		showHomeScreen();
	}
	
	public void showHomeScreen()
	{
		System.out.println("Welcome to Charles Schwab");
		System.out.println("-------------------------");
		System.out.println("Please Sign up  or Register");
		System.out.println("1. Sign up");
		System.out.println("2. Log In");
		System.out.println("-------------------------");
		
		Scanner in = new Scanner(System.in);
		String choice = in.next();
		if(choice.equals("1"))
		{
			System.out.println("-------------------------");
			System.out.println("Sign Up");
			System.out.println("---->");
			System.out.println("Please Choose A User Name: ");
			String name = in.next();
			System.out.println("------------------------->");
			System.out.println("Please Enter An All Number Password: ");
			int password = in.nextInt();
			
			
			System.out.println("");
			System.out.println("<------------------------->");
			System.out.println("You Currently Have Zero Accounts");
			System.out.println("Would You Like To Open A New Account?");
			System.out.println("1. Yes I Would Like To Open A New Account");
			System.out.println("2. No I Want To Exit This Program Now");
		}
	}
	
	
	
	
}
