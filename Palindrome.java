import java.util.Scanner;
class Palindrome
{
	public static void main(String ar[])
	{
		int num,newNum=0,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("PALINDROME OR NOT");
		System.out.println("ENTER THE NUMBER :");
		num=sc.nextInt();
		s=num;
		while((num%10!=0)||(num>0))
		{
			
			newNum*=10;
			newNum=newNum+(num%10);
			num=num/10;
		}
		if(newNum==s)
		{
		System.out.print(" THE NUMBER "+s+" IS PALINDROM");
		}
		else
		{
		System.out.print(" THE NUMBER "+s+" IS NOT PALINDROM ");
		}
	}
}
			