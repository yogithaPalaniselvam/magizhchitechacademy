import java.util.Scanner;
abstract class Transport
{
	int id;
	Scanner sr=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	String name;
	String from;
	String to;
	float distance;
	float fare;
	void getDetails()
	{
		System.out.println("-------------------------");
		System.out.println("ENTER DETAILS ");
		System.out.println("-------------------------");
		System.out.print("\nEnter ID   : ");
		id=sr.nextInt();
		System.out.print("\nEnter NAME : ");
		name=sc.nextLine();
		System.out.print("\nENTER STARTING    : ");
		from=sc.nextLine();
		System.out.print("\n1.BANGLORE\n2.COIMBATORE\n3.MADURAI\n4.TRICHY\n5.SALEM\nENTER DESTINATION : ");
		int des=sr.nextInt();
		System.out.println("-------------------------");
		System.out.println("  ***TICKET BOOKED***");
		System.out.println("-------------------------");
		if(des==2)
		{
			distance=500;
			to="coimbatore";
		}
		else if(des==1)
		{
			distance=350;
			to="banglore";
		}
		else if(des==3)
		{
			distance=350;
			to="madurai";
		}
		else if(des==4)
		{
			distance=350;
			to="trichy";
		}
		else if(des==5)
		{
			distance=350;
			to="salem";
		}
		else
		{
			System.out.print("invalid destination");
		}
		
	}
	abstract void calculateFare();
	abstract void displayTicket();
	
}
class CityBus extends Transport
{
	
	@Override
	void calculateFare()
	{
		fare=distance*5;
		System.out.print("\n-------------------------------");
		System.out.print("\nFARE CALCULATED : "+fare);
		System.out.print("\n-------------------------------");
		
		
	}
	@Override
	void displayTicket()
	{
		System.out.println("-----------------------------");
		System.out.println(" CITYBUS TICKET DETAILS ");
		System.out.println("-----------------------------");
		System.out.print("\nNAME        : "+name);
		System.out.print("\nID          : "+id);
		System.out.print("\nFrom        : "+from);
		System.out.print("\nTo          : "+to);
		System.out.print("\nDISTANCE    : "+distance);
		System.out.print("\nFARE        : "+fare);
		System.out.print("\n\n-------------------------------");
	}
	
}
class LuxuryBus extends Transport
{
	
	@Override
	void calculateFare()
	{
		fare=(distance*20)+200;
		System.out.print("\n-------------------------------");
		System.out.print("\nFARE CALCULATED : "+fare);
		System.out.print("\n-------------------------------");
		
		
	}
	@Override
	void displayTicket()
	{
		System.out.println("-----------------------------");
		System.out.println(" LUXURYBUS TICKET DETAILS ");
		System.out.println("-----------------------------");
		System.out.print("\nNAME        : "+name);
		System.out.print("\nID          : "+id);
		System.out.print("\nFrom        : "+from);
		System.out.print("\nTo          : "+to);
		System.out.print("\nDISTANCE    : "+distance);
		System.out.print("\nFARE        : "+fare);
		System.out.print("\n\n-------------------------------");
	}
	
}
class TransportMain
{
	public static void main(String args[])
	{
		int ch;
		int n=0;
		Scanner sc=new Scanner(System.in);
		CityBus cb=new CityBus();
		LuxuryBus ob=new LuxuryBus();
		
		do{
			System.out.print("\nENTER CHOICE \n1.CITY BUS BOOKING\n2.LUXURY BUS BOOKING\n3.CALCULATE FAIR \n4.DISPLAY TICKET\n5.EXIT\n");
			ch=sc.nextInt();
			switch (ch)
			{
				
				case 1:
				{
					
					cb.getDetails();
					n=1;
					break;
				}
				case 2:
				{
					
					ob.getDetails();
					n=2;
					break;
				}
				case 3:
				{
					if(n==1)
					{
						cb.calculateFare();
						break;
					}
					else if(n==2)
					{
						ob.calculateFare();
						break;
					}
				}
				case 4:
				{
					if(n==1)
					{
						cb.displayTicket();
						break;
					}
					else if(n==2)
					{
						ob.displayTicket();
						break;
					}
				}
				default:
				{
					System.out.print("\n-------------------------------");
					System.out.println("********EXITED***********");
					System.out.print("\n-------------------------------");
					
				}
				
			}
		}while(ch!=5);
	}
}