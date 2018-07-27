package BankProject;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	private String name;
	private String password;
	private int userID;
	private int balance;
	
	
	int userIdCount = 68249;
	
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
	
//	public void spend(int accountID, int amount, String type)
//	{
//		Transaction newTransaction = new Transaction(accountID, amount, type);
//		transactions.add(newTransaction);
//	}
	
}
