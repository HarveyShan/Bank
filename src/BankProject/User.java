package BankProject;

import java.util.Random;
import java.util.Scanner;

public class User {

	private String name;
	private String password;
	private int userID;
	private int balance;
	Scanner in = new Scanner(System.in);
	
	
	Random UserID = new Random();
	int newUserID = UserID.nextInt(100000);
	
//	public User()
//	{
//		//create account
//		System.out.println("-------------------------");
//		System.out.println("Siging up as a new user");
//		System.out.println("---->");
//		System.out.println("Please Choose A User Name: ");
//		String name = in.next();
//		System.out.println("------------------------->");
//		System.out.println("Please Enter A Password: ");
//		String password = in.next();
//		// generate user ID for the user 
//		System.out.println("<------------------------->");
//		System.out.println("Thank you for choosing Charles Schwabs");
//		System.out.println("Your User ID is " + newUserID);
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		System.out.println("You Currently Have Zero Accounts");
//		System.out.println("Would You Like To Open A New Account?");
//		System.out.println(" ");
//		System.out.println("1. Yes I Would Like To Open A New Account");
//		System.out.println("Press any other key other than 1 to exit the program");
//	}
	
	public User(String theName, String thePassword, int theUserID)
	{
		//these are backwards
		theName = name;
		thePassword = password;
		theUserID = userID;
	}

	public void setPassword()
	{
		System.out.println("");
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setList()
	{

	}
	
	public String getUserName()
	{
		return name;
	}
	
	public int spend()
	{
		
		return balance;
	}
	
}
