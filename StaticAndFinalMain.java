
package staticandfinal;
import java.util.Scanner;

public class StaticAndFinalMain {

    public static void main(String[] args) 
    {
 
       Scanner sc=new Scanner(System.in);
       double prin;
       int years;
        System.out.println("ENTER PRINCIPLE AMOUNT : ");
        prin=sc.nextDouble();
        System.out.println("ENTER INVESTMENT YEARS : ");
        years=sc.nextInt();
        Bank.calclulateInterest(prin, years);
        System.out.println("---------------------------------------");
    }
    
}
