
import java.util.Scanner;

public class AbstractMain
{
    public static void main(String args[])
    {
         System.out.println("-------------------------------");
         System.out.println(" PERMANENT EMPLOYEE");
         System.out.println("-------------------------------");
         PermanentEmployee pt1=new PermanentEmployee("JEEVAN",590000);
         pt1.display();
         pt1.sal();
         System.out.println("-------------------------------");
         System.out.println("PARTTIME EMPLOYEE");
         System.out.println("-------------------------------");
         PartTimeEmployee pt=new PartTimeEmployee("LOGESH",5,300);
         pt.display();
         pt.sal();
         System.out.println("-------------------------------");

    }
}
abstract  class Employee 
{
    
    String name;
    Employee(String name)
    {
        this.name=name; 
    }
    void display()
    {
        System.out.println(" NAME  : "+name);
    }
    abstract void sal();
}

class PermanentEmployee extends Employee
{
    int salary;
    PermanentEmployee(String name,int salary)
    {
        super(name);
        this.salary=salary;
    }
    @Override
    void sal()
    {
        System.out.println("MONTHLY SALARY OF FULLTIME EMPLOYEE : "+salary);
    }
    
}
class PartTimeEmployee extends Employee
{
    int hours;
    int priceperhour;
    PartTimeEmployee(String name,int hours,int priceperhour)
    {
        super(name);
        this.hours=hours;
        this.priceperhour=priceperhour;
    }
    @Override
    void sal()
    {
        System.out.println("MONTHLY SALARY OF PARTTIME EMPLOYEE : "+(priceperhour*hours));
    }
    
}
