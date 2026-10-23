
package staticandfinal;

public class Bank 
{
    public static final String BANK_NAME="ABC BANK";
    public static final float INTEREST_RATE=7.5f;
    static
    {
        System.out.println("----------------------------------------");
        System.out.println("WELCOME TO ABC BANK ");
        System.out.println("----------------------------------------");

        
    }
    public static void calclulateInterest(Double principle,int years)
    {
        
        double amount=(principle*years*INTEREST_RATE)/100;
        System.out.println("BANK NAME                  : "+BANK_NAME);
        System.out.println("INTEREST RATE              : "+INTEREST_RATE);
        System.out.println("PRINCIPLE AMOUNT           : "+principle);
        System.out.println("YEARS OF INVESTMENT        : "+years);
        System.out.println("TOTAL AMOUNT's  INTEREST   : "+amount);
        
    }
    
}

