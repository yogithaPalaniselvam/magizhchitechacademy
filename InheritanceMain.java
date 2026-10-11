import java.util.Scanner;
class Person
{
	Scanner sc=new Scanner(System.in);
	int age;
	String name;
	void get()
	{
		System.out.println("-------------------------");
		System.out.println("PERSON DETAILS ");
		System.out.println("-------------------------");
		System.out.print("ENTER NAME  : ");
		name=sc.nextLine();
		System.out.print("ENTER AGE  : ");
		age=sc.nextInt();
		System.out.println("-------------------------");
	}
	void print()
	{
		System.out.println("NAME        : "+name);
		System.out.println("AGE         : "+age);
	}
	
}
class Student extends Person
{
	int rollNo;
	int marks;
	float percent;
	Student(int roll,int marks)
	{
		rollNo=roll;
		this.marks=marks;
	}
	@Override
	void print()
	{
		super.print();
		System.out.println("ROLL NO     : "+rollNo);
		System.out.println("MARKS OF 5  : "+marks);
		System.out.println("PERCENT     : "+(marks/5));
		System.out.println("-------------------------");	
	}
}
class InheritanceMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int roll;
		int marks;
		System.out.println("-------------------------");
		System.out.print("ENTER STUDENT ROLL        : ");
		roll=sc.nextInt();
		System.out.print("\nENTER STUDENT TOTAL MARKS : ");
		marks=sc.nextInt();
		Student stu1=new Student(roll,marks);
		stu1.get();
		stu1.print();
		System.out.println("-------------------------");
		
	}
}
