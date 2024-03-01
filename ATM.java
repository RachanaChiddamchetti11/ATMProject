package ATMProject;

public class ATM {
	public int bal=1000;
	public void withdraw(int amount)
	{
	if(bal>amount)
	{
		bal=bal-amount;
		System.out.println("Withdraw successfull");
		System.out.println("remaining balane"+bal);
	}
	else
	{
		try
		{
			throw new InsufficientBalance();
		}
		catch(Exception e)
		{
		System.out.println("Insufficient balance");
	}
	}
}
	public void deposit(int amount)
	{
		System.out.println("deposit successfull");
		bal=bal+amount;
		System.out.println("total balance:"+bal);
	}
	public static void main(String[]args)
	{
		ATM a=new ATM();
		a.withdraw(100);;
		a.deposit(300);
	}
}
