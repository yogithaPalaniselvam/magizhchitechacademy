import java.util.Scanner;
class ArrayEx
{
	void printArray(int ar[])
	{
		System.out.println("  ARRAY ELEMENTS : ");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}
	void total(int ar[])
	{
		int tot=0;
		for(int i=0;i<ar.length;i++)
		{
			tot=tot+ar[i];
		}
		System.out.println("\n THE SUM OF ARRAY ELEMENTS : "+tot);
		System.out.println(" THE AVERAGE OF ARRAY ELEMENTS : "+(tot/ar.length));
		
	}
	void maxAndMin(int ar[])
	{
		int max=ar[0],min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
			max=ar[i];
			}
			
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(" MAXIMUM : "+max);
		System.out.println(" MINIMUM : "+min);
		
	}
	void countEvenAndOdd(int ar[])
	{
		int evenCount=0,oddCount=0;
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]%2==0)
		{
		evenCount++;
		}
		else
		{
		oddCount++;
		}
		}
		System.out.println(" EVEN COUNT : "+evenCount);
		System.out.println(" ODD COUNT  : "+oddCount);
		
		
	}
	void countOccurence(int ar[],int num)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]==num)
		{
		count++;
		}
		}
		System.out.println(num+" COUNT : "+count);
		
	}
	void reverse(int ar[])
	{
		System.out.println(" REVERSE ARRAY ELEMENTS : ");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		
	}
	void check(int ar[],int n)
	{
		boolean b=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
			{
				 b=true;
				System.out.println(" "+n+" FOUND IN THE ARRAY");
				break;
			}
			
		}
		if(b==false)
		{
				System.out.println(" "+n+" NOT FOUND IN THE ARRAY");
			
		}
	}
	void secMax(int ar[])
	{
		int max=ar[0],sec=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				sec=max;
				max=ar[i];
			
			}
			
		}
		System.out.println("SECOND MAX : "+sec);
	}
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			int num;
			
		int ar[]={23,54,6,67,6,8,87};
		ArrayEx ae=new ArrayEx();
		System.out.println("---------------------------------");
		System.out.println("COUNT EVEN OR ODD ARRAY ELEMENTS ");
		ae.countEvenAndOdd(ar);
		System.out.println("---------------------------------");
		System.out.println(" MAXIMUM AND MINIMUM ");
		ae.maxAndMin(ar);
		System.out.println("---------------------------------");
		System.out.println("PRINT ARRAY ELEMENTS ");
		ae.printArray(ar);
		System.out.println("---------------------------------");
		System.out.println("TOTAL");
		ae.total(ar);
		System.out.println("---------------------------------");
		System.out.println("CHECK FOR GIVEN NUMBER");
		System.out.println("enter the number to be found in array : ");
		num=sc.nextInt();
		ae.check(ar,num);
		System.out.println("---------------------------------");
		System.out.println("REVERSE AN ARRAY ");		
		ae.reverse(ar);
		System.out.println("\n---------------------------------");
		System.out.println("enter the number to be found occurence : ");
		num=sc.nextInt();
		System.out.println("COUNT OCCURENCE ");
		ae.countOccurence(ar,num);
		System.out.println("---------------------------------");
		System.out.println("SECOND MAXIMUM ");
		ae.secMax(ar);
		System.out.println("---------------------------------");
		
		}
}