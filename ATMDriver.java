package ATMProject;

import java.util.Scanner;

public class ATMDriver {
	public void withdraw(int amount)
	{
		System.out.println("Withdraw successful");
		System.out.println("Remaining balance"+amount);
	}
	public void deposit(int amount)
	{
		System.out.println("Deposit successful");
		System.out.println("Total balance:"+amount);
	}
	public void showAmount(int amount)
	{
		System.out.println("Total amount"+amount);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int bal=1000;
		boolean start=true;
		ATMDriver a=new ATMDriver();
		while(start)
		{
			System.out.println("Choose atm options");
			System.out.println("1.withdraw\n2.deposit\n3.show amount\n4.Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("enter withdraw amount");
				int amount1=sc.nextInt();
				if(bal>amount1)
				{
					bal=bal-amount1;
					a.withdraw(bal);
				}
				else
				{
					throw new InsufficientBalance1();
				}
				break;
			case 2:

				System.out.println("Enter amount deposited");
				int depositAmount=sc.nextInt();
				bal=bal+depositAmount;
				a.deposit(bal);
				break;
			
				
				case 3:
					a.showAmount(bal);
				
					break;
					
				case 4:
				{
					System.out.println("Thank you visit again");
					start=false;
				}
				break;
			}
		}
	}
}
