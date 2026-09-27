import java.util.Scanner;;
class OverFlow 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in); 
		int a;
		System.out.println("Enter the integer value : ");
		a=sc.nextInt();
		byte b=(byte)a;
		System.out.println("THE VALUE : "+b);
	}
}