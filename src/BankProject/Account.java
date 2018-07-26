package BankProject;

import java.util.Scanner;
import java.util.Random;

public class Account {

	private int accID;
	private int balance;
	private String type;
	private static int idCount = 1;
	
	
	public Account(int theBalance, String theAccountType)
	{
		accID = idCount;
		balance = theBalance;
		this.type = theAccountType;
		idCount++;
		
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
