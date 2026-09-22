import java.util.Scanner;
class ArrMax
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][3];
		int max=0;
		System.out.println("\n enter the elements of the array " );
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
				
			}	
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(max<ar[i][j])
				{
					max=ar[i][j];
				}
				
			}
			System.out.println();
			
		}
		System.out.println("MATRIX's MAXIMUM NUMBER");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print (" " + ar[i][j]);
				
			}
			System.out.println();
			
		}
		System.out.print("The Greatest Number : "+max);
	}
}
		
		