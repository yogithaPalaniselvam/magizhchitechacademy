import java.util.Scanner;
class Student 
{
	private int age;
	private String name;
	Scanner sc=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	void getDetails()
	{
		System.out.println("-----------------------------");
		System.out.print("ENTER NAME   : ");
		name=sr.nextLine();
		System.out.print("\nENTER AGE    : ");
		age=sc.nextInt();
		System.out.println("\n-----------------------------");
		
	}
	void displayDetails()
	{
		System.out.println("-----------------------------");
	    System.out.println("   STUDENT DETAILS   ");
		System.out.println("-----------------------------");
		System.out.print("\nNAME          : "+name);
		System.out.print("\nAGE           : "+age);
		System.out.println("\n-----------------------------");
	}
	void updateName()
	{
		System.out.print("ENTER THE NAME :");
		name=sr.nextLine();
		System.out.println("\nNAME UPDATED ");
	}
	void updateAge()
	{
		System.out.print("ENTER THE AGE :");
		age=sc.nextInt();
		System.out.println("\nAGE UPDATED ");
		
	}
}
class StudentDetailMain
{
	public static void main(String args[])
	{
		Student s =new Student();
		int choice;
	    Scanner sc=new Scanner(System.in);
		s.getDetails();
		do
		{
		    System.out.println("\n-----------------------------");
			System.out.println("\nSTUDENT RECORDS ");
		    System.out.println("\n-----------------------------");
			System.out.println("\n1.DISPLAY \n2.UPDATE NAME \n3.UPDATE AGE \n4.EXIT");
			System.out.print("\nENTER THE CHOICE ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					s.displayDetails();
					break;
				}
				case 2:
				{
					s.updateName();
					break;
				}
				case 3:
				{
					s.updateAge();
					break;
				}
				default:
				{
				System.out.println("\n INVALID CHOICE");
				break;
				}
			}		
		}while(choice!=4);
	}
}