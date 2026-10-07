
import java.util.Scanner;
class BankAccount
{
	int choice=0;
	float amount=1000;
	String name;
	int account;
	Scanner sc=new Scanner(System.in);
	int get()
	{
		System.out.println("----------------------------");
		System.out.println("   WELCOME TO BANK");
		System.out.println("----------------------------");
		System.out.println("ENTER YOUR CHOICE ");
		System.out.println("\n1.DEPOSIT \n2.WITHDRAW \n3.DISPLAY BALANCE \n4.EXIT :");
		choice=sc.nextInt();
		return choice;
	}
	void details()
	{
		System.out.println("-----------------------------");
		System.out.println("   ENTER YOUR DETAILS");
		System.out.println("-----------------------------");
		System.out.print("NAME : ");
		name=sc.nextLine();
		System.out.print("\nACCOUNT NUMBER : ");
		account=sc.nextInt();
		System.out.println("\n-----------------------------");
		
	}
	void deposit()
	{
		float dep;
		System.out.print("ENTER THE AMOUNT TO BE DEPOSITED :");
		dep=sc.nextFloat();
		System.out.println("-----------------------------");
		System.out.println(dep+" DEPOSITED");
		amount=dep+amount;
		System.out.println("\n-----------------------------");
		
	}
	void withdraw()
	{
		float wid;
		System.out.println("ENTER THE AMOUNT TO BE WITHDRAW ");
		wid=sc.nextFloat();
		System.out.println("\n-----------------------------");
		if(wid>amount)
		{
			System.out.println("INSUFFICIENT BALANCE ");
			System.out.print("ACCOUNT BALANCE : "+amount);
		}
		else
		{
			System.out.print(" AMOUNT WITDRAWED : "+wid);
			amount=amount-wid;
		}
		System.out.println("\n-----------------------------");
	}
	void display()
	{
		System.out.println("-----------------------------");
		System.out.print("\nNAME             : "+name);
		System.out.print("\nACCOUNT NUMBER   : "+account);
		System.out.print("\nACCOUNT BALANCE  : "+amount);
		System.out.println("\n-----------------------------");
		
	}
}
class MainBank
{
	public static void main(String args[])
	{
		BankAccount ob=new BankAccount();
		ob.details();
		int ch=ob.get();
		while(ch!=4)
		{
			if(ch==1)
			{
				ob.deposit();
			}
			else if(ch==2)
			{
				ob.withdraw();
			}
			else if(ch==3)
			{
				ob.display();
			}
			ch=ob.get();
		}
	}
	
}