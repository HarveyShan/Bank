package BankProject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Bank {
	
	//instance vairables
//	private 
	
	private HashMap<User, ArrayList<Account>> user = new HashMap<>();
	
	Scanner in = new Scanner(System.in);
	
	
	public Bank()
	{
		//initialize the user list
		showHomeScreen();
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
			showQuitScreen();
		}
	}
	
	
	public void showHomepage() {
		
		//finish this
		System.out.println("1. Create Account");
		System.out.println("2. Delete Account");
		//...
		try {
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
///*//		System.out.println("-------------------------");
//////		System.out.println("Siging up as a new user");
//////		System.out.println("---->");
//////		System.out.println("Please Choose A User Name: ");
//////		String name = in.next();
//////		System.out.println("------------------------->");
		System.out.println("Please Enter A Password: ");
	}
	
	public void showCreateAccount()
	{
		
	}
	
	public void showDeleteAccount()
	{
		
	}
	
	public void showTransferToAnotherAcc()
	{
		
	}
	
	public void showDeposit()
	{
		
	}

	public void showWithDraw()
	{
		
	}
	
	public void showAccount()
	{
		
	}
	
	public void showAllAccounts()
	{
		
	}
	
	public void showLogOut()
	{
		showHomeScreen();
	}
	
	public void showQuitScreen()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Are you sure you want to exit Charles Schwab?");
		System.out.println("1. yes I'm sure");
		System.out.println("Press anything else to go back to home screen");
		String quitChoice = in.next();
		
		if(quitChoice.equals("1"))
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Thank you for choosing Charles Schwab, have a nice day.");
			System.exit(0);
		}
		
		else
		{
			showHomeScreen();
		}
	}
}	
