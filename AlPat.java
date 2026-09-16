
class AlPat
{
	public static void main (String ar[])
		{
			String letters="ABCDE";
			System.out.println("ALPHABET PATTERN ");
			for(int i=0;i<=letters.length()-1;i++)
			{
				for(int j=0;j<=i;j++)
					{
						System.out.print("" +letters.charAt(j));
					}
				System.out.println();
			}
		}
		}