
package arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollManagement 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        ArrayList<Employee> employees = new ArrayList();
        
        do
        {
            System.out.println("\n1.ADD EMPLOYEE\n2.VIEW ALL EMPLOYEES\n3.SEARCH EMPLOYEE\n4.CALCULATE NET SALARY\n5.UPDATE BASIC SALARY\n6.DELETE EMPLOYEE\n7.EXIT");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    {
                        Employee emp = new Employee();
                        System.out.print("\n ENTER EMPLOYEE ID    : ");
                        int id = sc.nextInt();
                        
                        // Check for unique ID constraint
                        boolean exists = false;
                        for(Employee e : employees)
                        {
                            if(e.empId == id)
                            {
                                exists = true;
                                break;
                            }
                        }
                        
                        if(exists)
                        {
                            System.out.println("ERROR: EMPLOYEE ID ALREADY EXISTS!");
                        }
                        else
                        {
                            emp.get(id);
                            employees.add(emp);
                            System.out.println("EMPLOYEE ADDED SUCCESSFULLY!");
                        }
                        break;
                    }
                case 2:
                    {
                        if(employees.isEmpty())
                        {
                            System.out.println("NO RECORDS FOUND.");
                        }
                        for(Employee e : employees)
                        {
                            System.out.println("\n-------------------------");
                            e.display();
                            System.out.println("\n-------------------------");
                        }
                        break;
                    }
                case 3:
                    {
                        System.out.println("\n ENTER THE ID OF EMPLOYEE : ");
                        int id = sc.nextInt();
                        boolean found = false;
                        for(Employee e : employees)
                        {
                            if(e.empId == id)
                            {
                                found = true;
                                e.display();
                            }
                        }
                        if(found == false)
                        {
                            System.out.println("EMPLOYEE NOT FOUND : " + id);
                        }
                        break;
                    }
                case 4:
                    {
                        System.out.println("\n ENTER THE ID OF EMPLOYEE FOR NET SALARY : ");
                        int id = sc.nextInt();
                        boolean found = false;
                        for(Employee e : employees)
                        {
                            if(e.empId == id)
                            {
                                found = true;
                                double hra = 0.20 * e.basicSalary;
                                double da = 0.10 * e.basicSalary;
                                double pf = 0.05 * e.basicSalary;
                                double netSalary = e.basicSalary + hra + da - pf;
                                
                                System.out.println("----------------------------------");
                                System.out.println("EMPLOYEE NAME : " + e.name);
                                System.out.println("NET SALARY    : Rs." + netSalary);
                                System.out.println("----------------------------------");
                            }
                        }
                        if(found == false)
                        {
                            System.out.println("EMPLOYEE NOT FOUND : " + id);
                        }
                        break;
                    }
                case 5:
                    {
                        System.out.println("\n ENTER THE ID OF EMPLOYEE TO UPDATE SALARY : ");
                        int id = sc.nextInt();
                        boolean found = false;
                        for(Employee e : employees)
                        {
                            if(e.empId == id)
                            {
                                found = true;
                                System.out.print("ENTER NEW BASIC SALARY: ");
                                e.basicSalary = sc.nextDouble();
                                System.out.println("SALARY UPDATED SUCCESSFULLY!");
                            }
                        }
                        if(found == false)
                        {
                            System.out.println("EMPLOYEE NOT FOUND : " + id);
                        }
                        break;
                    }
                case 6:
                    {
                        System.out.println("\n ENTER THE ID NO OF EMPLOYEE TO DELETE : ");
                        int id = sc.nextInt();
                        int deleteIndex = -1;
                        
                        for(int i = 0; i < employees.size(); i++)
                        {
                            if(employees.get(i).empId == id)
                            {
                                deleteIndex = i;
                                break;
                            }
                        }
                        
                        if(deleteIndex != -1)
                        {
                            employees.remove(deleteIndex);
                            System.out.println("EMPLOYEE DELETED SUCCESSFULLY!");
                        }
                        else
                        {
                            System.out.println("EMPLOYEE NOT FOUND : " + id);
                        }
                        break;
                    }
            }
        } while(ch != 7);
    }
}

class Employee
{
    int empId;
    String name;
    String department;
    double basicSalary;
    
    Scanner sc = new Scanner(System.in);
    Scanner sr = new Scanner(System.in);
    
    void get(int verifiedId)
    {
        empId = verifiedId;
        System.out.print(" ENTER EMPLOYEE NAME  : ");
        name = sr.nextLine();
        System.out.print(" ENTER DEPARTMENT     : ");
        department = sr.nextLine();
        System.out.print(" ENTER BASIC SALARY   : ");
        basicSalary = sc.nextDouble();
    }
    
    void display()
    {
        System.out.println("----------------------------------");
        System.out.println("EMPLOYEE ID    : " + empId);
        System.out.println("EMPLOYEE NAME  : " + name);
        System.out.println("DEPARTMENT     : " + department);
        System.out.println("BASIC SALARY   : Rs." + basicSalary);
        System.out.println("----------------------------------");
    }
}
