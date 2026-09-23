import java.util.Scanner;
class Fibonocci
{
	public static void main(String ar[])
	{

		Scanner sc=new Scanner (System.in);
		int n;
		int first=0,second=1,count=3,sum=0;
		System.out.println("=====FIBANOCCI SERIES=====");
		System.out.println("ENTER HOW MANY NUMBERS IN SERIES");
		n=sc.nextInt();
		System.out.println(" \nFIBONOCCI SERIES :\n"+first+"\n"+second);
		Fibonocci fb=new Fibonocci();
		fb.fib(n,sum,first,second,count);
		
	}
	void fib(int n,int sum,int first,int second,int count)
	{
		while( count<=n)
		{
			sum=first+second;
			first=second;
			second=sum;
			System.out.println("\n"+sum);
			count++;
		}
	}
}