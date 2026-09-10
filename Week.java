//3. Write a Java program to print the day name based on number (1–7). using scanner like 1-->monday,2-->Tuesday
import java.util.Scanner;
class Week
	{
		public static void main(String ar[])
			{
				Scanner sc=new Scanner(System.in);
				byte num;
				System.out.println("WEEK DAYS");
				System.out.println("ENTER ANY NUMBER FROM 1 TO 7");
				num=sc.nextByte();
				switch(num)
					{
						case 1:
							{
								System.out.println(" 1 IS MONDAY ");
								break;
							}
						case 2:
							{
							
								System.out.println(" 2 IS TUESDAY ");
								break;
							}	
						case 3:
							{
							
								System.out.println(" 3 IS WEDNESDAY ");
								break;
							}
						case 4:
							{
							
								System.out.println(" 4 IS THURSDAY ");
								break;
							}
						case 5:
							{
							
								System.out.println(" 5 IS FRIDAY ");
								break;
							}
						case 6:
							{
							
								System.out.println(" 6 IS SATURDAY ");
								break;
							}
						case 7:
							{
							
								System.out.println(" 7 IS SUNDAY ");
								break;
							}
						default:
							{
								System.out.println("INVALID CHOICE");
							}
					}
			}	
	}		