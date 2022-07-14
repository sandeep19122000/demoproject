package excep;
class insufficientFundException extends Exception
{
	private double amount;
	public insufficientFundException(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
}

class checkingaccount
{
	private double balance;
	public checkingaccount()
	{
		
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount) throws insufficientFundException
	{
		if(amount<=balance)
			balance=balance-amount;
	
	else
	{
		double needs=amount-balance;
		throw new insufficientFundException(needs);
	}
}
}
public class bankdemo {
public static void main(String[] args) {
	checkingaccount c=new checkingaccount();
	c.deposit(500.00);
	try
	{
	
	System.out.println("withdrawing rs.100/-");
	c.withdraw(100.00);
	System.out.println("withdrawing 600.00/-");
	c.withdraw(600.00);
	}
	catch(insufficientFundException ie)
	{
		System.out.println("sorry u r not allowed for this amount"+ie.getAmount());
	}
}
}
