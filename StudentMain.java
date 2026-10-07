
import java.util.Scanner;
class StudentDetail
{
	Scanner sc=new Scanner(System.in);
	int age,roll;
	String name;
	float percent;
	void add()
	{
		System.out.println("-------------------------------");
		System.out.println(" ADD STUDENT DETAIL ");
		System.out.println("-------------------------------");
		System.out.print("NAME       : ");
		name=sc.nextLine();
		System.out.print("AGE        : ");
		age=sc.nextInt();
		System.out.print("ROLL NO    : ");
		roll=sc.nextInt();
		System.out.print("PERCENTAGE : ");
		percent=sc.nextFloat();
		System.out.println("\n-------------------------------");
		
	}
	void updateDetail()
	{
		System.out.println("\n-------------------------------");
		System.out.println(" UPDATE DETAIL ");
		System.out.println("\n-------------------------------");
		System.out.println("\n1.NAME UPDATE\n2.AGE UPDATE\n3.ROLL NO UPDATE\n4.PERCENTAGE UPDATE\n0.EXIT");
		int ch=sc.nextInt();
		if(ch==1)
		{
		
			System.out.println("\n-------------------------------");
			System.out.print("ENTER THE NEW NAME :");
			name=sc.nextLine();
			System.out.print("\n NAME CHANGED : "+name);
			System.out.println("\n-------------------------------");
			
		}
		else if(ch==2)
		{
			System.out.println("\n-------------------------------");
			System.out.print("ENTER THE NEW AGE :");
			age=sc.nextInt();
			System.out.print("\n AGE CHANGED : "+age);
			System.out.println("\n-------------------------------");
			
		}
		else if(ch==3)
		{
			System.out.println("\n-------------------------------");
			System.out.print("ENTER THE NEW ROLL NO :");
			roll=sc.nextInt();
			System.out.print("\n ROLL CHANGED : "+roll);
			System.out.println("\n-------------------------------");
			
		}
		else if(ch==4)
		{
			System.out.println("\n-------------------------------");
			System.out.print("ENTER THE NEW PERCENTAGE:");
			percent=sc.nextFloat();
			System.out.print("\n AGE CHANGED : "+percent+ "%");
			System.out.println("\n-------------------------------");
			
		}
		else
		{
			System.out.println("EXITED ");
			
		}
		
	}
	void display()
	{
		System.out.println("-------------------------------");
		System.out.println("    STUDENT DETAIL ");
		System.out.println("-------------------------------");
		System.out.print("\nNAME       : "+name);
		System.out.print("\nAGE        : "+age);
		System.out.print("\nROLL NO    : "+roll);
		System.out.print("\nPERCENTAGE : "+percent+"%");
		System.out.println("\n-------------------------------");
	}
	
}
class StudentMain
{
	public static void main(String ar[])
	{	
		Scanner sc1=new Scanner(System.in);
		StudentDetail s=new StudentDetail();
		s.add();
		int choice;
		System.out.println(" ENTER CHOICE \n1.UPDATE DETAIL \n2.DISPLAY DETAIL\n0.EXIT ");
		choice=sc1.nextInt();
		do
		{
		if(choice==1)
		{
			s.updateDetail();
		}
		else if(choice==2)
		{
			s.display();
		}
		System.out.println(" ENTER CHOICE \n1.UPDATE DETAIL \n2.DISPLAY DETAIL\n0.EXIT ");
		choice=sc1.nextInt();
		}while(choice!=0);
	}
}