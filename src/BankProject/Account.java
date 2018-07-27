package BankProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {

	private int accID;
	private int balance;
	private String type;
	private ArrayList<Transaction> transactions;
	
	int idCount = 1000;
	
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
	
	//shouldn't be in User class 
	public void printTransactionLog(int userInputAccountID)
	{
		
	}
	
	public void printTransactionLog(String type)
	{
		
	}
}
