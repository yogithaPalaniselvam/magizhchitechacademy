
package staticandfinal;

import java.util.Scanner;

 class College 
{
    public static  final String collegeName ="MKU COLLEGE";
    public final int regFee;
    public static int studentCount=0;
    String name;
    
    College(String name,int regFee)
            {
                this.regFee=regFee;
                this.name=name;
                studentCount=studentCount+1;
                
            }
    static void displayCollegeDetails()
            {
                System.out.print("\n-------------------------------");
                System.out.print("\nCOLLEGE NAME     : "+collegeName);
                System.out.print("\nTOTAL STUDENTS   : "+ studentCount);
                System.out.print("\n-------------------------------");

            }
    void displayFee()
            {
                System.out.print("\nSTUDENT NAME     : "+name);
                System.out.print("\nREGISTRATION FEE : "+regFee);
                System.out.println("\n-------------------------------");

            }    
}
public class CollegeMain

        {
           static  Scanner sc=new Scanner(System.in);
           static  Scanner sr=new Scanner(System.in);
            static int fee;
            static String name;
            static void getData()
            {
                System.out.println("ENTER NAME : ");
                name=sr.nextLine();
                System.out.println("ENTER FEE :");
                fee=sc.nextInt();
            }
            public static void main(String args[])
            {
                
                getData();
                College c=new College(name,fee);
                College.displayCollegeDetails();
                c.displayFee();
                getData();
                College c1=new College(name,fee);
                College.displayCollegeDetails();
                c1.displayFee();
                
                
            }

       }
          
