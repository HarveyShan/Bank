package BankProject;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Bank {
	
	//instance vairables
//	private 
	
	public Bank()
	{
		//initialize the user list
		showHomeScreen();
	}
	
	public void showHomepage() {
		
		//finish this
		System.out.println("1. Create Account");
		System.out.println("2. Delete Account");
		//...
		try {
			Scanner in = new Scanner(System.in);
			int input = in.nextInt();
			
			switch(input) {
			case 1:
				showCreateAccount();
			case 2: 
				showDeleteAccount();
			}
			//...
		}
		catch(InputMismatchException e) {
			showHomepage();
		}
		
	}
	
	public void showLoginScreen() {
		System.out.println("Please Login");
	}
	
	public void showSignUpScreen() {
		System.out.println("Please Sign up");
	}
	
	//first thing users see
	public void showHomeScreen()
	{
		System.out.println("Welcome to Charles Schwab");
		System.out.println("------------------------------------------");
		System.out.println("Please Sign up  or Register");
		System.out.println("1. Sign up");
		System.out.println("2. Log In");
		System.out.println("Press any other key to exit Charles Schwab");
		System.out.println("------------------------------------------");
		
		Scanner in = new Scanner(System.in);
		String choice = in.next();
		
		//signing up 
		if(choice.equals("1"))
		{
			showSignUpScreen();
		}
		else if(choice.equals("2")) 
		{
			showLoginScreen();
		}
		//exit if user dont want to open account 
		else
		{
			System.out.println("Thank you for choosing Charles Schwab, have a great day");
			System.exit(0);
		}
		
	}
}	
