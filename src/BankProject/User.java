package BankProject;

import java.util.Random;
import java.util.Scanner;

public class User {

	private String name;
	private String password;
	private int userID;
	private int balance;
	private static int userIdCount = 68249;
	
	Scanner in = new Scanner(System.in);
	
	
	public User(String theName, String thePassword)
	{
		name = theName;
		password = thePassword;
		userID = userIdCount;
		userID++;
		System.out.println("Your UserID is " + userID);

	}

	public int getUserID()
	{
		return userID;
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
