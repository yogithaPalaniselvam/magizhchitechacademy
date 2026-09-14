import java.util.Scanner;
class BankLoan
	{
		public static void main(String ar[])
			{
				Scanner si=new Scanner(System.in);
				Scanner ss=new Scanner(System.in);
				byte age;
				String name;
				int cibil;
				float sal;
				boolean cus;
				System.out.println("--------------------------------------------------");
				System.out.println("       BANK LOAN APPLICATION");
				System.out.println("--------------------------------------------------");
				System.out.println("ENTER THE DETAILS:");
				System.out.print("NAME      : ");name=ss.nextLine();
				System.out.print("AGE       : ");age=si.nextByte();
				System.out.print("SALARY    : ");sal=si.nextFloat();
				System.out.print("CIBILSCORE: ");cibil=si.nextInt();
				System.out.print("EXISTING CUSTOMER 1.true,2.false :");cus=si.nextBoolean();
				System.out.println("\n-------------------------------------------------");
				System.out.println("                  ACCOUNT DETAILS");
				System.out.println("\n-------------------------------------------------");
				System.out.println("NAME      : "+name);
				System.out.println("AGE       : "+age);
				System.out.println("SALARY    : "+sal);
				System.out.println("CIBILSCORE: "+cibil);
				System.out.println("EXISTING CUTOMER : "+((cus==true)?"Yes":"no"));
				
				System.out.println("\n-------------------------------------------------");
				
				
				if(age>=21)
					{
						if(sal>=20000)
							{
								if(cibil>=750)
									{
										if (cus==true)
							            {
												System.out.println(name+" YOU ARE ELIGIBLE FOR PREMIUM LOAN ");
											}
										else	
											{
												System.out.println(name+" YOU ARE ELIGIBLE FOR STANDARD LOAN");
											
											}
									}
								else if((cibil>=650) && (cibil<=749))
									{	
										System.out.println(name+" YOU ARE ELIGIBLE FOR SMALL LOAN ");
									}
								else
									{
										System.out.println(name+" YOU ARE NOT ELIGIBLE !!CIBIL SCORE IS LOW");
									}
							}
							
						
						else
							{
									System.out.println(name+" YOUR SALARY IS NOT ELIGIBLE TO APLLY FOR LOAN ");
							}
					}
				else
					{
						System.out.println(name+" YOUR AGE SHOULD BE 21 TO APPLY FOR LOAN "); 
						
					}
				System.out.print("\n-------------------------------------------------");
					
			}
					
	}	
	