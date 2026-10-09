import java.util.Scanner;
class Library
{
	int id;
	String author;
	String title;
	boolean isAvailable;
	Library(int i,String tit,String auth,boolean isAv)
	{
		id=i;
		author=auth;
		title=tit;
		isAvailable=isAv;
		System.out.println("\n DATA INITIALISED BY CONSTRUCTOR");
		
	}
	void display()
	{
		
		System.out.println("\n ------------------------");
		System.out.println("\n BOOK DETAILS ");
		System.out.println("\n ------------------------");
		System.out.println("\n BOOK ID   : "+id);
		System.out.println("\n TITLE     : "+title);
		System.out.println("\n AUTHOR    : "+author);
		System.out.println("\n AVAILABLE : "+isAvailable);
		System.out.println("\n -------------------------");
		
	}
	void borrowBook()
	{
		System.out.println("\n BOOK BORROWED ");
		isAvailable=false;
	
	}
	void returnBook()
	{
		System.out.println("\n BOOK RETURNNED ");
		isAvailable=true;
	}
	
}
class LibraryMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		int id;
		String title,author;
		boolean isAvailable;
		System.out.println("\n ENTER HOW MANY BOOKS ");
		int n=sc.nextInt();
		Library book[]=new Library[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n ENTER DETAILS OF BOOK "+(i+1));
			id=sc.nextInt();
			title=st.nextLine();
			author=st.nextLine();
			isAvailable=sc.nextBoolean();
			book[i]=new Library(id,author,title,isAvailable);
			System.out.println("\n BOOK "+(i+1)+"STORED");
			
		}
		for(int i=0;i<n;i++)
		{
			book[i].display();
		}
		for(int i=0;i<n;i++)
		{
			book[i].borrowBook();
		}
		for(int i=0;i<n;i++)
		{
			book[i].display();
		}
		for(int i=0;i<n;i++)
		{
			book[i].returnBook();
		}
	}
}