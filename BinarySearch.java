import java.util.Scanner;
class BinarySearch
{
	void getArrayAndSearch()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("ENTER THE SORTED ARRAY ELEMENTS ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("------------------------------------------");
		System.out.println("ENTER THE ELEMENT TO BE FOUND ");
		int target=sc.nextInt();
		int start=0,end=n,mid=0;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(ar[mid]==target)
			{
			System.out.println( " TARGET  : "+target+" FOUND\n INDEX : "+mid+" POSITION : "+(mid+1));
			break;
			}
			else if(ar[mid]<target)
			{
				start=mid+1;
			}
			else if(ar[mid]>target)
			{
				end=mid-1;
			}
		}
		if(start>end)
		{
			System.out.println(" TARGET "+target+" NOT IN THE ARRAY\n INDEX : -1");
		}
	}
		
	public static void main(String args[])
	{
		
		System.out.println("------------------------------------------");
		System.out.println("            BINARY SEARCH ");
		System.out.println("------------------------------------------");
		BinarySearch bs=new BinarySearch();
		bs.getArrayAndSearch();
		System.out.println("------------------------------------------");
		
		
	}
}