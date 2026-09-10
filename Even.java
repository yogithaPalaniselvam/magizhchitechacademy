//2. Write a Java program to check whether a number is even or odd. using Scanner
//3. Write a Java program to print the day name based on number (1–7). using scanner like 1-->monday,2-->Tuesday
import java.util.Scanner;
class Even
	{
		public static void main(String ar[])
			{
				Scanner sc=new Scanner(System.in);
				int num;
				System.out.println("ENTER THE NUMBER TO CHECK EVEN OR ODD");
				num=sc.nextInt();
				if(num==0)
					{
						System.out.println(num+" IS NEITHER EVEN NOR ODD ");
					}										
				else if(num%2==0)
					{
						System.out.print(num+" IS EVEN NUMBER ");
					}
				else
					{
						System.out.println(num +" IS ODD NUMBER ");
					}
			}
	}
	
				