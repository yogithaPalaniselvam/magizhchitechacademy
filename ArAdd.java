import java.util.Scanner;
class ArAdd
{
	public static  void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter number of rows and coloumns :");
		r=sc.nextInt();
		c=sc.nextInt();
		int ar1[][]=new int[r][c];
		int ar2[][]=new int[r][c];
		int ar3[][]=new int[r][c];
		
		System.out.println("Enter elements for matrix 1 :");
			
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar1[i].length;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements for matrix 2 :");
			
		for(int i=0;i<ar2.length;i++)
		{
			for(int j=0;j<ar2[i].length;j++)
			{
				ar2[i][j]=sc.nextInt();
			}
		}
		System.out.println("======MATRIX 1========");
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar1[i].length;j++)
			{
				System.out.print(" "+ar1[i][j]);
			}
				System.out.println();
			
		}
		System.out.println("=======MATRIX 2=======");
		for(int i=0;i<ar2.length;i++)
		{
			for(int j=0;j<ar2[i].length;j++)
			{
				System.out.print(" "+ar2[i][j]);
			}
				System.out.println();
			
		}
		
		System.out.println("====MATRIX ADDITION====");
		for(int i=0;i<ar3.length;i++)
			{
				for(int j=0;j<ar3[i].length;j++)
				{
				
					ar3[i][j]=ar1[i][j]+ar2[i][j];
					System.out.print(" "+ar3[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("======================");
			
	}

}