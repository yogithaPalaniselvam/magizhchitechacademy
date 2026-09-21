import java.util.Scanner;
 class ArrayMenu
 {
	public static void main(String args[])
	{
		int ar[]=new int[5];
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		
		System.out.println("\n enter the elements : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(" " + (i+1 )+" :");
			ar[i]=sc.nextInt();
		    System.out.println();
			
		}
		System.out.println();
		System.out.println("ARRAY ELEMENTS DISPLAY ");
		int max=ar[0],total=0,min=ar[0];
		for(int i=0;i<5;i++)
		{
			System.out.print("ELEMENT  " + (i+1 )+" :"+ ar[i]);
			System.out.println();
			total+=ar[i];
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
			
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("SUM OF ARRAY ELEMENTS :  "+total);
		System.out.println("LEAST NUMBER IN THE ARRAY : "+min);
		System.out.println("HIGHEST NUMBER IN THE ARRAY : "+max);
		System.out.println("---------------------------------------------------");
		
		
		System.out.println();
		
		
		
		
	}
	
 }
 