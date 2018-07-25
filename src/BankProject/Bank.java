package BankProject;
import java.util.Scanner;
import java.util.Random;
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
		System.out.println("Press any other key to exit Charles Schwab");
		System.out.println("-------------------------");
		
		Scanner in = new Scanner(System.in);
		String choice = in.next();
		//signing up 
		
		if(choice.equals("1"))
		{
			User newUser = new User();
		}
		//exit if user dont want to open account 
		else
		{
			System.out.println("Thank you for choosing Charles Schwab, have a great day");
		}
		
		String userInput = in.next();
		//user want to open account, keep program running
		//open either a saving or checking account for user 
		if(userInput.equals("1"))
		{
			System.out.println("What Type Of Account Would You Like To Open?");
			System.out.println("1.Checking");
			System.out.println("2.Saving");
		}
		//quits the program if user dont want to open either account 
		else
		{
			System.out.println("Thank you for choosing Charles Schwab, have a great day");
		}	
	}
}	
