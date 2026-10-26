
package exceptionexample;
 class AmountInsufficient extends Exception
{
    public AmountInsufficient(String s)
    {
        super(s);
    }
    
}

 class Atm 
    {
     
        float balance;
        float withdraw;
        Atm(float balance)
        {
            this.balance=balance;
        }
        void draw(int withdraw) throws AmountInsufficient
                {
                    if(withdraw>balance)
                    {
                        System.out.println("BALANCE  : "+balance);
                        throw  new AmountInsufficient("INSUFFICIENT BALANCE IN ACCOUNT ");
                    }
                    else
                    {
                        balance=balance-withdraw;
                        System.out.println("BALANCE  : "+balance);
                    }
                }
    }
public class AtmMain
{
    public static void main(String args[])
    {
        
        Atm a=new Atm(100000);
        try
        {
            a.draw(30000);
        }
        catch(AmountInsufficient e)
        {
            System.out.println("INVALID :"+e.getMessage()); 
        }
    }
}
