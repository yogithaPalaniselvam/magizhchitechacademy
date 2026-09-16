import java.util.Scanner;
class RevStr
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int i;
		String str1,str2="";
		System.out.println(" STRING REVERSE ");
		System.out.print("Enter the String to be reversed : ");
		str1=s.nextLine();
		for(i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.print("REVERSED STRING : "+str2);
    }
	
}	
	
	