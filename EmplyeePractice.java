
package practiceprogram;

import java.util.Scanner;


public class EmployeeMain 
{
    public static void main(String[] args)
    {
        
    
    int ch;
    Scanner sc=new Scanner(System.in);
    Emp e[]=new Emp[100];
    int id;
    int count=0;
    String name;
    float sal;
    Scanner ss=new Scanner(System.in);
    do
    {
        System.out.println("Enter Choice\n1.View\n2.Search\n3.Add\n4.Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("     VIEW EMPLOYEE LIST");
                System.out.println("-----------------------------");
                for(int i=0;i<count;i++)
                {
                     e[i].view();
                     System.out.println("\n-----------------------------");
                }
               
                System.out.println("\n-----------------------------");
                break;
            case 2:
                System.out.println("-----------------------------");
                System.out.println("   SEARCH EMPLOYEE LIST");
                System.out.println("-----------------------------");
                System.out.println("ENTER EMPLOYEE ID :");
                id=sc.nextInt();
                for(int i=0;i<count;i++)
                {
                   if(e[i].id==id)
                    {
                        System.out.println("\nEMPLOYEE ID  FOUND ");
                        e[i].search(id);
                    }                            
                    else
                    {
                        System.out.println("\nEMPLOYEE ID NOT FOUND");
                    }
                }
                System.out.println("\n-----------------------------");
                break;
            case 3:
                System.out.println("\n-----------------------------");
                System.out.println("   ADD EMPLOYEE ");
                System.out.println("\n-----------------------------");
                System.out.println("ENTER EMPLOYEE ID :");
                id=sc.nextInt();
                System.out.println("ENTER EMPLOYEE NAME :");
                name=ss.nextLine();
                System.out.println("ENTER EMPLOYEE SALARY :");
                sal=sc.nextFloat();
                e[count]=new Emp();
                e[count].add(id,name,sal);
                count++;
                System.out.println("\n-----------------------------");
                break;
            case 4:
                System.out.println("\n-----------------------------");
                System.out.println("EXITED");
                System.out.println("\n-----------------------------");
                break;
        }
        
     }while(ch!=4);
    }
}
class Emp
{
    int id;
    float sal;
    String name;
  
    void add(int id,String name,float sal)
    {
        this.id=id;
        this.sal=sal;
        this.name=name;
        int count=0;
        System.out.println("\nEMPLOYEE "+(count+1)+"ADDED");
        
    }
    void view()
    {
        System.out.print("\nID      : "+id);
        System.out.print("\nNAME    : "+name);
        System.out.print("\nSALARY  : "+sal);
    }
    void search(int id)
    {
        
        System.out.print("\nID      : "+id);
        System.out.print("\nNAME    : "+name);
        System.out.print("\nSALARY  : "+sal);
    }
}