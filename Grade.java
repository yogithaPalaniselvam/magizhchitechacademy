class Grade
	{
		public static void main(String ar[])
			{
				float gr=78f;
				if(gr<50)
					{
						System.out.println("GRADE : FAIL");
					}
				else if(gr<=60)
					{
						System.out.println("GRADE : B");
					}
				else if(gr<=70)
					{
					
					System.out.println("GRADE : A");
					}
				else if(gr<=80)
					{
						System.out.println("GRADE : A+");
					}
				else if(gr>81 && gr<=100)
					{
						System.out.println("GRADE : O+");
					}
					
				else
					{
						System.out.println("IVALID GRADE");
					}
			}
	}	
	