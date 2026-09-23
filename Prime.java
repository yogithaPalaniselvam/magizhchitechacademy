import java.util.Scanner;
class Prime
{
	public static void main(String ar[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("\n ======================= ");
		
		System.out.print("\n ENTER THE POSITIVE NUMBER  : ");
		n=sc.nextInt();
		Prime p=new Prime();
		p.checkPrime(n);
	}
	void checkPrime(int n)
	{
		int i=2;
		if((n==1) || (n==0) || (n<0))
		{
			System.out.println(" "+n+" IS NOT A PRIME NUMBER");
		}
		else
		{
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
				
				{
					if(i==n)
					{
						System.out.println(" "+n+" IS A PRIME NUMBER");		
					}
					else if(i!=n)
					{
							System.out.println(" "+n+" IS NOT A PRIME NUMBER ");
							break;
					}
				}
			
		}
		}
		System.out.print(" ======================= ");
		
	}
}
