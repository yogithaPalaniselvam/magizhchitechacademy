class LeapYear
	{
		public static void main (String ar[])
			{
				int year=2004;
				if(year%4==0)
					{
						if(year%100==00)
							{
								if(year%400==0)
									{
										System.out.println(year+" IS A LEAP YEAR");
									}
								else
									{
										System.out.println(year+" IS NOT A LEAP YEAR");
									}
							}
						else
							{
								System.out.println(year+" IS  A LEAP YEAR ");
							}
					}
				else
					{
						System.out.println(year+" IS NOT A LEAP YEAR");
					}
			}
	
	}