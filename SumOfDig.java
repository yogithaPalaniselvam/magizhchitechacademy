import java.util.Scanner;
class SumOfDig
{    
 public static void main(String ar[])
	{
    Scanner sc=new Scanner(System.in);
	int num,sum=0,ex;
	System.out.println(" FIND THE SUM OF DIGITS ");
	System.out.print("Enter the number : ");
	num=sc.nextInt();
	int d=num;
	while(((num%10)!=0)||(num!=0))
		{
			ex=num%10;
			sum=sum+ex;
			num=num/10;
		}
	System.out.println("Sum of digits  of "+d+" : "+sum);
	}
}