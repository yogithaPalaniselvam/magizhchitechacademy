
package innerclassexample;

import java.util.Scanner;


public class InnerClassMain
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        int ch;
        int age,roll;
        String name;
        Institution.Student s1=new Institution().new Student();
       
        do
        {
            System.out.print("\n 1.ADD STUDENT \n2.ADD MARKS \n3.CALCULATE GRADE\n4.DISPLAY\n5.EXIT\nENTER YOUR CHOICE : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    {
                        System.out.print("ENTER NAME : ");
                        name=ss.nextLine();
                        System.out.print("ENTER ROLL : ");
                        roll=sc.nextInt();
                        System.out.print("ENTER AGE  : ");
                        age=sc.nextInt();
                        s1.addStudent(age, name, roll);
                        break;
                    }


                case 2:
                    {
                        System.out.println("\n------------------------------------------");
                        s1.getMarks();
                        System.out.println("\n------------------------------------------");    
                        break;
                    }
                case 3:
                    {
                        System.out.println("\n------------------------------------------");
                        s1.calculateGrade();
                        System.out.println("GRADE CALUCULATED");
                        System.out.println("\n------------------------------------------");
                        break;
                    }
                case 4:
                    {
                        System.out.println("\n------------------------------------------");
                        s1.Display();
                        System.out.println("\n------------------------------------------");
                        break;
                    }
            }
        }while(ch!=5);
    }
    
}

package innerclassexample;

import java.util.Scanner;


public class Institution 
{
    String collgeName="KAMRAJ UNIVERSITY COLLEGE";
    class Student
    {
        int age;
        Scanner sc=new Scanner(System.in);
        String name;
        int n;
        int roll;
        float avg;
        char grade;
        int total=0;
        int [] mark;
       

        void addStudent(int age, String name, int roll) 
        {
            this.age = age;
            this.name = name;
            this.roll = roll;
        }
        void getMarks()
        {
            System.out.print("\nENTER NO OF SUBJECTS : ");
            n=sc.nextInt();
            mark=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("\n ENTER MARK "+ (i+1) +" : ");
                mark[i]=sc.nextInt();
                total=mark[i]+total;
            }
        }
        void calculateGrade()
        {
            avg=total/n;
        }
        void Display()
        {
            
            System.out.print("\nNAME       : "+name);
            System.out.print("\nROLLNO     : "+roll);
            System.out.print("\nAGE        : "+age);
            System.out.print("\nCOLLEGE NAME : "+collgeName);
            for(int i=0;i<n;i++)
                {
                    System.out.print("\nMARK "+ (i+1) +" : "+mark[i]);

                }
            System.out.print("\nAVERAGE      : "+avg);
            System.out.print("\nTOTAL        : "+total);
            if(avg>=90)
                {
                    grade='A';
                    System.out.print("\nGRADE        : "+grade);
                }
           else if(avg>=70 && avg<89)
                {
                    grade='B';
                    System.out.print("\nGRADE        : "+grade);
                }
           else if(avg>=50 && avg<=69)
                {
                    grade='C';
                    System.out.print("\nGRADE        : "+grade);
                }
           else if(avg>=40 && avg<49)
                {
                    grade='A';
                    System.out.print("\nGRADE        : "+grade);
                }
           else if(avg<40)
                {
                    grade='F';
                    System.out.print("\nGRADE        : "+grade);
                }

            }
    }
}

