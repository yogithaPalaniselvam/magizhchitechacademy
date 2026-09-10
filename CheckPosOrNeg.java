//1.  Write a Java program to check whether a number is positive or negative using Scanner.
//2. Write a Java program to check whether a number is even or odd. using Scanner
//3. Write a Java program to print the day name based on number (1–7). using scanner like 1-->monday,2-->Tuesday

import java.util.Scanner;
class CheckPosOrNeg
	{
		public static void main(String ar[])
			{
				int num;
				Scanner sc=new Scanner(System.in);
				System.out.println("CHECK POSITIVE OR NEGATIVE");
				System.out.print("ENTER THE NUMBER   : ");
				num=sc.nextInt();
				if(num<0)
					{
						System.out.println(num+" IS NEGATIVE ");
					}
				else if(num>0)
					{
						System.out.println(num+" IS POSITIVE ");
					}
				else 
					{
						System.out.println(num+" IS NEITHER NEGATIVE OR POSITIVE ");
					}
			}
	}
				