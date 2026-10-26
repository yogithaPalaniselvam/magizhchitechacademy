
package exceptionexample;
import java.util.Scanner;
class Mark
{
    int marks[]=new int[5];
    Scanner sc=new Scanner(System.in);
    void getMarks()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                
                marks[i]=sc.nextInt();
                if((marks[i]<0)||(marks[i]>100))
                {
                    throw new IllegalArgumentException("INVALID NUMBER FOR MARKS ENTER MARKS >=0 AND <=100");
                }
            }
            
            
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("INVALID MARKS"+e.getMessage());
        }
    }
    void display()
    {
         for(int i=0;i<5;i++)
            {
                System.out.println("MARK "+(i+1)+" : "+marks[i]);
            }
    }
    
}
public class MarkExMain 
{
    public static void main(String args[])throws IllegalArgumentException
    {
        System.out.println("----------------------------");
        System.out.println("STUDENT MARKSATEMENT");
        System.out.println("----------------------------");
        Mark m=new Mark();
        int choice;
        do
        {
            System.out.print("ENTER YOUR CHOICE : \n1.ENTER STUDENT MARKS\n2,DISPLAY MARKS\n3.EXIT");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            if(choice==1)
            {
                m.getMarks();
            }
            else if(choice==2)
            {
                m.display();
            }
            else
            {
                break;
            }
        }while(choice!=3);
        
    }
}
