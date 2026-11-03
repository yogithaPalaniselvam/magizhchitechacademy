
package enumexample;

import java.util.Scanner;

enum Days
{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
class Day
{
     Scanner sc=new Scanner(System.in);
     void showAllDays()
     {
           for(Days d:Days.values())
           {
               System.out.println(" "+d);
           }

         
     }
     void check()
     {
            System.out.println("ENTER THE DAYS IN WEEK");
            String today=sc.nextLine().toUpperCase().trim();
            Days tr=Days.valueOf(today);
            if((tr==Days.SATURDAY ) ||(tr==Days.SUNDAY))
            {
                System.out.println(tr+"->WEEK END");
            }     
            else
            {
                System.out.println(tr+"->WEEKDAY");
            }
     }
 }
public class EnumEx
{

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int ch;
       do
       {
            System.out.println("ENTER YOUR CHOICE\n1.SHOW ALL DAYS\n2.CHECK WEEKEND OR WEEKDAY\n3.EXIT");
             ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        Day d=new Day();
                        d.showAllDays();
                        break;
                case 2:
                    Day d1=new Day();
                    d1.check();
                    break;
            }
       }while(ch!=3);
    }
    
}
