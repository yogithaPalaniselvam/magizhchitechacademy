import java.util.Scanner;
class BubbleSort

{
	void bubble(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
			}
		}
		System.out.print("\nSORTED ARRA : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" " +ar[i]);
		}
		System.out.print("\nLARGEST NUMBER IN ARRAY : "+ar[ar.length-1]);
		
	}
	int[] get()
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number of elements in array :");
		n=sc.nextInt();
		int br[]=new int[n];
		System.out.println("\nEnter array elements");
		for(int i=0;i<n;i++)
		{
			br[i]=sc.nextInt();
		}
		return br;
	}
	public static void main(String args[])
	{
		BubbleSort bs=new BubbleSort();
		int ar[]=bs.get();
		bs.bubble(ar);
		
	}
}