import java.util.Scanner;;
class ExplicitCasting 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in); 
		double a;
		int b;
		System.out.println("Enter the Double value : ");
		a=sc.nextDouble();
		int  d=(int ) a;
		System.out.println("THE VALUE : "+d);
	}
}