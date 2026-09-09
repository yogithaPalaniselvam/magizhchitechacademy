class CalcCon
	{
		public static void main(String ar[])
			{
				int num1,num2;
				num1=30;
				num2=32;
				int choice=2;
				System.out.println("OPTION 1,ADDITION 2,SUBTRACTION 3,MULTIPLICATION 4,DIVISION");
				if(choice==1)
					{
						System.out.println("ADDITION  : "+num1+"+"+num2+"="+(num1+num2));
					}
				else if(choice==2)
					{
						System.out.println("SUBTRACTION : "+num1+"-"+num2+"="+(num1-num2));
					}
				else if (choice==3)
					{
						System.out.println("MULTIPLICATION : "+num1+"*"+num2+"="+(num1*num2));
					}
				else if(choice==3)
					{
						System.out.println("DIVISION  : "+num1+"/"+num2+"="+(num1/num2));
					
					}
				else
					{
						System.out.println("IVALID OPTION");
					}
			}
	}