package BankProject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Bank {
	
	//instance variables
//	private 
	
	private HashMap<User, ArrayList<Account>> userbase = new HashMap<>();
	private int yourID;
	private User newUser;
	private ArrayList<Account> theAccounts;
	Scanner in = new Scanner(System.in);
	private String thePassword;
	
	
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
		//exit if user don't want to open account 
		else
		{
			showQuitScreen();
		}
	}
	
	
	public void showHomepage() {
		
		//finish this
		System.out.println("1. Create Account");
		System.out.println("2. Delete Account");
		System.out.println("3. Transfer to another account");
		System.out.println("4. Deposit");
		System.out.println("5. Withdraw");
		System.out.println("6. Show account details");
		System.out.println("7. Delete User");
		System.out.println("8. Log out ");
		System.out.println("9. Exit Charles Schwab");
		
		//...
		try {
			int input = in.nextInt();
			
			switch(input) {
			case 1:
				showCreateAccount();
			case 3: 
				showDeleteAccount();
			case 4: 
				showDeposit();
			case 5: 
				showWithdraw();
			case 6: 
				showAccount();
			case 7: 
				showDeleteUser();
			case 8: 
				showLogOut();
			case 9: 
				showQuitScreen();
				
			default:
				System.out.println("Please choose a valid entry");
				showHomepage();
			}
			//...
		}
		catch(InputMismatchException e) {
			System.out.println("Please choose a valid entry");
			showHomepage();
		}
	}
	
	public void showLoginScreen() {
		System.out.println("Login Screen");
		System.out.println("----------------------------------------->");
		System.out.println("Please Enter your UserID");
		int userInputID = in.nextInt();
		System.out.println("Please enter your password");
		String userInputPassword = in.next();
//		System.out.println(yourID);
//		System.out.println(thePassword);
		try 
		{
			if(userInputID == yourID)
			{
				showHomepage();
			}
//			else
//			{
//				System.out.println("Your ID is invalid");
//				showLoginScreen();
//			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Your ID is invalid");
			showLoginScreen();
		}
		
		
	}
	
	public void showSignUpScreen() {
		System.out.println("------------------------------->");
		System.out.println("Siging up as a new user");
		System.out.println("------------------------------->");
		System.out.println("Please Choose A User Name: ");
		String name = in.next();
		System.out.println("------------------------------->");
		System.out.println("Please Enter A Password: ");
		String password = in.next();
		//creating a new user
		
		thePassword = password; //instance
		
		newUser = new User(name, password);
		
		yourID = newUser.getUserID(); // yourID now holds the user's id 
		yourID++;
		
		System.out.println("------------------------------->");
		System.out.println("Thank you for joining joining Charles Schwab, press 1 to go back to home screen");
		System.out.println("Press any other key to exit Charles Schwab");
		String userChoice = in.next();
		
		if(userChoice.equals("1"))
		{
			showHomeScreen();
		}
		
		else
		{
			showQuitScreen();
		}
		
	}
	
	public void showCreateAccount()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to create a checking or saving account?");
		System.out.println("1. checking");
		System.out.println("2. saving");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String typeOfAccount = in.next(); //takes in type of account 
		System.out.println("How much money would you like to put into the account right now?");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int amountToStartWith = in.nextInt();
		
		int accountCount = 1;
		
		if(accountCount <= 5)
		{
			try
			{
				if(typeOfAccount.equals("1"))
				{
					String checking = "Checking Account";
					Account newAccount = new Account(amountToStartWith, checking);
					theAccounts.add(newAccount);
				}
				else if (typeOfAccount.equals("2"))
				{
					String saving = "Saving Account";
					Account newAccount = new Account(amountToStartWith, saving);
					theAccounts.add(newAccount);
				}
				else
				{
					System.out.println("You did not enter a valid option");
					showCreateAccount();
				}
				userbase.put(newUser, theAccounts);
				accountCount++;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter a valid option");
				showCreateAccount();
			}
		}
		
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

	public void showWithdraw()
	{
		
	}
	
	public void showAccount()
	{
		
	}
	
	public void showAllAccounts()
	{
		
	}
	
	public void showDeleteUser()
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
