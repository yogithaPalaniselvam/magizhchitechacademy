
import java.util.Scanner;
class CountDigit
{
	public static void main(String ar[])
		{
			Scanner sc=new Scanner(System.in);
			int num,count=0;
			System.out.println("FIND NUMBER OF DIGITS");
			System.out.print("ENTER THE NUMBER TO FIND DIGITS : ");num=sc.nextInt();
			int s=num;
			while(num>0)
			{	
				count+=1;
				num/=10;
			}
			System.out.print("NO OF DIGITS IN "+s+" IS : "+count);
		}
}