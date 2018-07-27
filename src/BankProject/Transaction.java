package BankProject;

public class Transaction {
	private int transactionID;
	private int amount;
	private String type;
	
	public Transaction(int theTransactionID, int theAmount, String theType)
	{
		transactionID = theTransactionID;
		amount = theAmount;
		type = theType;
	}
	
	public void getTime()
	{
		System.out.println(java.time.LocalTime.now());  
	}
	
	public void getType()
	{
		
	}
	
	
}
