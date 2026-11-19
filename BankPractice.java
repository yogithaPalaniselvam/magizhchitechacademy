
package practiceprogram;

import java.util.Scanner;

public class BankPractice 
{
    public static void main(String[] args) 
    {
        Bank b=new Bank();
        int ch;
        float amount;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("\nENTER YOUR CHOICE\n 1.DEPOSIT\n2.BALANCE\n3.WITHDRAW\n4.TRANSACTION COUNT\n 5.EXIT\n ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("ENTER AMOUNT TO DEPOSIT ");
                    amount=sc.nextFloat();
                    b.dep(amount);
                    System.out.println("------------------------------");
                    break;
                    case 2:
                    System.out.println("------------------------------");
                    b.bal();
                    System.out.println("------------------------------");
                    break;
                    case 3:
                    System.out.println("------------------------------");
                    System.out.println("ENTER AMOUNT TO WITHDRAW ");
                    amount=sc.nextFloat();
                    b.withdraw(amount);
                    System.out.println("\n------------------------------");
                    break;
                    case 4:
                    System.out.println("\n------------------------------");
                    b.transactionCount();
                    System.out.println("\n------------------------------");
                    break;
                    case 5:
                    System.out.println("------------------------------");
                        System.out.println("EXITED");
                    System.out.println("\n------------------------------");
                    break;
                    
            }
        }while(ch!=5);
       
        
    }
}
class Bank
{
    float bal;
    static int count;
    void dep(float amount)
    {
        bal=bal+amount;
        count=count+1;
        System.out.println("\n-----------------------------");
        System.out.print("  \nDEPOSIT   : "+amount);
        System.out.print("  \nBALANCE   : "+bal);
        System.out.print("\n-------------------------------");
    }
    void withdraw(float amount)
    {
        if(bal<amount)
        {
        System.out.println("\n-----------------------------");          
            System.out.println("INSUFFICIENT BALANCE");
        System.out.println("\n-----------------------------");
        
        }
        else
        {
        bal=bal-amount;
        count=count+1;
        System.out.println("\n-----------------------------");
        
        System.out.print("\nWITHDRAWN  : "+amount);
        System.out.print("\nBALANCE    : "+bal);
        System.out.print("\n-------------------------------");
        }
    }
    void bal()
    {
        System.out.println("-----------------------------");
        System.out.print(" \nBALANCE    : "+bal);
        System.out.print("\n-------------------------------");
    }
    void transactionCount()
    {
        System.out.println("-----------------------------");
        System.out.print(" \nTRANSACTION COUNT    : "+count);
        System.out.print("\n-------------------------------");
    }
    
}