class PrintE
{
	public static void main(String ar[])
		{
			int s=50,e=100;
			System.out.println(" PRINT EVEN NUMBERS BETWEEN "+s+" AND "+e);
			while(s<=e)
				{
					if(s%2==0)
					{	
						System.out.println("  "+s);
					}
				    s++;
				}
		}
}