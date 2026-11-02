
package arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;


public class Student 
{
    int roll;
    int age;
    String name;
    String course;
    String institute;
    int [] mark;
    Scanner sc=new Scanner(System.in);
    Scanner sr=new Scanner(System.in);
    int n;
    
    void getDetails()
    {
        System.out.print("\n___________________________________");
        System.out.print("\n ENTER NAME       : ");
        sc.nextLine();
        System.out.print("\n ENTER AGE        : ");
        sr.nextInt();
        System.out.print("\n ENTER COURSE     : ");
        sc.nextLine();
        System.out.print("\n ENTER INSTITUTE  : ");
        institute=sc.nextLine();
        System.out.print("\n ENTER ROLL       : ");
        roll=sr.nextInt();
        System.out.print("\n ENTER NO SUBJECTS: ");
        n=sr.nextInt();
        mark=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\n ENTER MARK "+(i+1)+"     : ");
            mark[i]=sr.nextInt();
        }
        System.out.print("\n___________________________________");
    }
    void update()
    {
        System.out.print("\n___________________________________");

        int m;
        System.out.println("\nENTER WHICH SUBJECT(1 to 5) MARK SHOULD BE UPDATED ");
        m=sc.nextInt();
        mark[m]=sr.nextInt();
        System.out.println("STUDENT MARKS UPDATED");
        System.out.print("\n___________________________________");

    }
     void displayDetails()
     {
         System.out.print("\n___________________________________");
        System.out.print("\n ENTER NAME       : "+name);
        
        System.out.print("\n ENTER AGE        : "+age);
        
        System.out.print("\n ENTER COURSE     : "+course);
        
        System.out.print("\n ENTER INSTITUTE  : "+institute);
        
        System.out.print("\n ENTER ROLL       : "+roll);
        
        
        mark=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\n ENTER MARK "+(i+1)+"     : ");
            mark[i]=sr.nextInt();
        }
        System.out.print("\n___________________________________");
     }
    
    
}
class StudentMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        ArrayList<Student> stu=new ArrayList();
        do
            {
                
                System.out.println("\n1.ADD STUDENT\n2.VIEW ALL STUDENT\n3.SEARCH STUDENT\n4.UPDATE STUDENT MARK\n5.DELETE STUDENT\n6.EXIT");
                ch=sc.nextInt();
                switch(ch)
                    {
                        case 1:
                            {
                                Student s=new Student();
                                s.getDetails();
                                stu.add(s) ;
                            }
                        case 2:
                            {
                                for(Student s:stu)
                                {
                                    System.out.println("\n-------------------------");
                                    System.out.println(s);
                                    s.displayDetails();
                                    System.out.println("\n-------------------------");
                                }
                                break;
                            }
                        case 3:
                            {
                                System.out.println("\n ENTER THE ROLL NO OF STUDDENT : ");
                                int roll=sc.nextInt();
                                boolean found=false;
                                 for(Student s:stu)
                                {
                                    if(s.roll==roll)
                                    {
                                        found=true;
                                        System.out.println(s);
                                    }
                                }
                                 if(found== false)
                                 {
                                     System.out.println("NOT FOUNdD : "+roll);
                                 }
                                break;
                            }
                        case 4:
                            {
                                System.out.println("\n ENTER THE ROLL NO OF STUDDENT : ");
                                int roll=sc.nextInt();
                                boolean found=false;
                                 for(Student s:stu)
                                {
                                    if(s.roll==roll)
                                    {
                                        found=true;
                                        System.out.println(s);
                                        s.update();
                                    }
                                }
                                 if(found== false)
                                 {
                                     System.out.println("NOT FOUND : "+roll);
                                 }
                                break;
                            }
                            case 5:
                            {
                                System.out.println("\n ENTER THE ROLL NO OF STUDENT TO DELETE : ");
                                int roll=sc.nextInt();
                                boolean found=false;
                                 for(Student s:stu)
                                {
                                    if(s.roll==roll)
                                    {
                                        found=true;
                                        System.out.println(s);
                                        remove(s);                                    
                                    }
                                }
                                 if(found== false)
                                 {
                                     System.out.println("NOT FOUND : "+roll);
                                 }
                                break;
                            }
                            

                    }
            }while(ch!=6);
    }

    private static void remove(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}