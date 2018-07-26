package BankProject;

import java.util.Scanner;

public class Account {

	private int accID;
	private int balance;
	private String type;
	private static int idCount = 1000;
	
	
	public Account(int theBalance, String theAccountType)
	{
		accID = idCount;
		balance = theBalance;
		this.type = theAccountType;
		idCount++;
		System.out.println("Your account ID is " + accID);
	}
	
	
	public int getBalance()
	{
		return balance;
	}
	
	public void printTransactionLog()
	{
		
	}
	
	public void printTransactionLog(String type)
	{
		
	}
}
