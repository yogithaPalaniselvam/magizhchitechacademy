import java.util.Scanner;
class Pyramid
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int i, k ,j;
		int mid;
		System.out.println("\n enter the odd number to form a pyramid :");
		int n=sc.nextInt();
		mid=(n+1)/2;
		for(i=0;i<mid;i++)
		{
			for(j=0;j<=n;j++)
			{
				
				if((j>=mid-i) && (j<=(mid+i)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}