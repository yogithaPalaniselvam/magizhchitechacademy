
package stringexamples;

import java.util.Scanner;
 class StringOTP
{
    String otp="4589";
    void check(String otp)
    {
        if(otp.equals(this.otp))
        {
            System.out.println("OTP VERIFIED SUCCESSFULLY");
        }
        else
        {
            System.out.println("OTP INCORRECT");
        }
        this.otp.concat("67");
        System.out.println("OTP : "+otp);
        
    }
    
}
public class StringEx
{

   
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("-------------------");
         System.out.println("OTP VERIFICATION");
         System.out.println("-------------------");
         System.out.print("ENTER OTP : ");
         String otp=sc.nextLine();
         StringOTP s=new StringOTP();
         s.check(otp);
         System.out.println("-------------------");
    }
    
}
