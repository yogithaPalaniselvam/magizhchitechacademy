import java.util.Scanner;
class Extract
	{
		public static void main (String ar[])
			{
				Scanner sr=new Scanner(System.in);
				System.out.print("Enter the symbols of * and #: ");
				String s=sr.nextLine();
				int hash=0,star=0;
				for(int i=0;i<s.length();i++)
				{	
					if(s.charAt(i)=='*')
					{
						star++;
					}
					else if(s.charAt(i)=='#')
					{
						hash++;
					}
					else	
					{
						System.out.println(" INVALID");
					}
				}
				System.out.println("TOTAL NUMBERS OF STARS IN "+s+" :"+star);
				System.out.println("TOTAL NUMBER OF HASH IN "+s+" :"+hash);
			}
	}
					