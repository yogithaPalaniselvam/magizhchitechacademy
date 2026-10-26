
package PinLoginMain;
import java.util.Scanner;
class Loggin
{
    int pincode=344567;
    int pin;
    Scanner sc=new Scanner(System.in);
   
    void log()throws Exception
    {
        try
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("ENTER PIN :");
                pin=sc.nextInt();
                if(pin==pincode)
                {
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                }
                else
                {
                    System.out.println("REMAINING ATTEMPT :"+(3-i));
                }
                if(i==3)
                {
                    throw new Exception("ACCOUNT LOCKED");
                }
            }
         }
            catch(Exception ee)
            {
                System.out.println("FAILED : "+ee.getMessage());
            }
    }
}
public class PinLoginMain
{
    public static void main(String args[])throws Exception
    {
        Loggin l=new Loggin();
        l.log();
    }
}
