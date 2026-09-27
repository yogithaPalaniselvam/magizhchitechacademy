import java.util.Scanner;;
class ImplicitCasting 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in); 
		int a;
		System.out.println("Enter the integer value : ");
		a=sc.nextInt();
		double d=a;
		System.out.println("THE VALUE : "+d);
	}
}