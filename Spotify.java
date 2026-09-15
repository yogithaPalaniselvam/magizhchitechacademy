import java.util.Scanner;
class Spotify
{	
	public static void main(String ar[])
		{
			Scanner sc=new Scanner(System.in);
			Scanner ss=new Scanner(System.in);
			int opt;
			do
			{
			System.out.println("-------------------------------");
			System.out.println("    WELCOME TO SPOTIFY ");
			System.out.println("-------------------------------");
			System.out.println("ENTER YOUR OPTION :\n1.ILAYARAJA \n2.YUVAN \n3.A.R.RAHMAN \n4.ANIRUDH \n5.HARRISH JEYARAJ \n6.EXIT");
			opt=sc.nextInt();
			if(opt==1)
				{
					System.out.println("==================================================");
					System.out.println("ILAYARAJAVIN ISAI MALAIYIL NANAYA THAYAARAHHH>>>>>");
					System.out.println("==================================================");
					System.out.println(" WHAT's YOUR MOOD \n1.MELODY \n2.KUTHU \n3.MOTIVATIONAL \n4.SAD");
					System.out.print("ENTER YOUR CHOICE: ");
					int o=sc.nextInt();
					if(o==1)
						{
							System.out.println("------------------------------");
							System.out.println("     **MELODY MINDS**");
							System.out.println("------------------------------");
							System.out.println("\n1.Oru kili uruguthu....");
							System.out.println("\n2.Kuzhaloodhum kannanukku....");
							System.out.println("\n3.Ennai thottu....");
							System.out.println("\n4.Raja Raja cholan.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING MELODY.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING ORU KILI URUGUTHU...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING KUZHALOODHUM KANNANUKKU....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING ENNAI THOTTTU ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING RAJA RAJA CHOLAN.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						
						else if(o==2)
						{
							System.out.println("------------------------------");
							System.out.println("     **KUTHHU PAATTU**");
							System.out.println("------------------------------");
							System.out.println("\n1.OORAVITTU ORRRUVANDHU....");
							System.out.println("\n2.NOORU VARUSHAM....");
							System.out.println("\n3.AASAI NOORUVAGAI....");
							System.out.println("\n4.ASAI ATHIGAM VACHU.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING OORAVITTU ORRRUVANDHU...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING NOORU VARUSHAM....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING AASAI NOORUVAGAI ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING ASAI ATHIGAM VACHU.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==3)
						{
							System.out.println("------------------------------");
							System.out.println("   **MOTIVATIONAL HITZ**");
							System.out.println("------------------------------");
							System.out.println("\n1.KELADI KANMANI....");
							System.out.println("\n2.ORU KOOTIL VALUM....");
							System.out.println("\n3.SORGAME ENDRAALUM....");
							System.out.println("\n4.VETRI MEL VETRI.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------------");
							System.out.println("\n.......PLAYING MOTIVATIONAL SONGS.......");
							System.out.println("\n----------------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING KELADI KANMANI...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYINGORU KOOTIL....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING SORGAME ENDRALUM ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING VETRI MEl VETRI.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==4)
						{
							System.out.println("------------------------------");
							System.out.println("     **SAD SWARANGAL**");
							System.out.println("------------------------------");
							System.out.println("\n1.KANNE KALAIMAANE....");
							System.out.println("\n2.THENE THENPAANDI Neeye....");
							System.out.println("\n3.PAADI PARANDHA KILI....");
							System.out.println("\n4.NILAVE Vaa.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING KANNE KALAIMAANE...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING THENE THENPAANDI Neeye....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING PAADI PARANDHA KILI ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING NILAVE Vaa.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else
						{
							System.out.println("INVALID OPTION");
						}
				}
			else if(opt==2)
				{
					System.out.println("==================================================");
					System.out.println("                  YUVAN YUGAM                    ");
					System.out.println("==================================================");
					System.out.println(" WHAT's YOUR MOOD \n1.MELODY \n2.KUTHU \n3.MOTIVATIONAL \n4.SAD");
					System.out.print("ENTER YOUR CHOICE: ");
					int o=sc.nextInt();
					if(o==1)
						{
							System.out.println("------------------------------");
							System.out.println("     **MELODY MINDS**");
							System.out.println("------------------------------");
							System.out.println("\n1.AATHADI MANASUDHAN....");
							System.out.println("\n2.CHINNA SIRISU....");
							System.out.println("\n3.VEN MEGAM....");
							System.out.println("\n4.IYYAYYAYOOO.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING MELODY.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING AATHADI MANASUDHAN...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING CHINNA SIRISU....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING VEN MEGAM ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING IYYAYYAYOOO.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						
						else if(o==2)
						{
							System.out.println("------------------------------");
							System.out.println("     **KUTHHU PAATTU**");
							System.out.println("------------------------------");
							System.out.println("\n1.MACHI OPEN THE BOTTLE....");
							System.out.println("\n2.SAROJA SAMANIKALO....");
							System.out.println("\n3.NO MONEY NO HONEY....");
							System.out.println("\n4.VILAYADU MANKATHU.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING MACHI OPEN THE BOTTLE...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING SAROJA SAMANIKALO....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING  NO MONEY NO HONEY....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING VILAYADU MAnKATHA.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==3)
						{
							System.out.println("------------------------------");
							System.out.println("   **MOTIVATIONAL HITZ**");
							System.out.println("------------------------------");
							System.out.println("\n1.EDHIRTHU NIL....");
							System.out.println("\n2.ORU NALIL....");
							System.out.println("\n3.NIMIRNDHU NIL....");
							System.out.println("\n4.UNAKULE MIRUGAM.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------------");
							System.out.println("\n.......PLAYING MOTIVATIONAL SONGS.......");
							System.out.println("\n----------------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING EDHIRTHU NIL...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING ORU NALIL...");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING NIMIRNDHU NIL....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING UNAKULE MIRUGAM.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==4)
						{
							System.out.println("------------------------------");
							System.out.println("     **SAD SWARANGAL**");
							System.out.println("------------------------------");
							System.out.println("\n1.KADHAL VALATHEN....");
							System.out.println("\n2.EDHO ONDRU ENNAI....");
							System.out.println("\n3.POGADHEY....");
							System.out.println("\n4.NINAITHU NINAITHU.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING KADHAL VALATHEN...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING EDHO ONDRU ENNAI.....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING POGADHEY....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING NINAITHU NINAITHU.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else
						{
							System.out.println("INVALID OPTION");
						}
				}
			else if(opt==3)
				{
					System.out.println("==================================================");
					System.out.println("      RAHUMANIN ISAI UNIVERSE");
					System.out.println("==================================================");
					System.out.println(" WHAT's YOUR MOOD \n1.MELODY \n2.KUTHU \n3.MOTIVATIONAL \n4.SAD");
					System.out.print("ENTER YOUR CHOICE: ");
					int o=sc.nextInt();
					if(o==1)
						{
							System.out.println("------------------------------");
							System.out.println("     **MELODY MINDS**");
							System.out.println("------------------------------");
							System.out.println("\n1.NETRU ILLADHA MAATTRAM....");
							System.out.println("\n2.ENNA SOLLA POGIRAI....");
							System.out.println("\n3.ENNAVALE ADI ENNAVALE...");
							System.out.println("\n4.MALARGALE MALARGALE.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING MELODY.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING NETRU ILLADHA MAATTRAM..");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING ENNA SOLLA POGIRAI....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING ENNAVALE ADI ENNAVALE....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING MALARGALE MALARGALE.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						
						else if(o==2)
						{
							System.out.println("------------------------------");
							System.out.println("     **KUTHHU PAATTU**");
							System.out.println("------------------------------");
							System.out.println("\n1.THAYYA THAYYA....");
							System.out.println("\n2.MUKKALA MUKABILA....");
							System.out.println("\n3.URVASHI URVASHI....");
							System.out.println("\n4.AATHICHUDI AATHICHUDI.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING THAYYA THAYYA....");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING MUKKALA MUKABILA.....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING URVASHI URVASHI ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING AATHICHUDI AATHICHUDI.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==3)
						{
							System.out.println("------------------------------");
							System.out.println("   **MOTIVATIONAL HITZ**");
							System.out.println("------------------------------");
							System.out.println("\n1.VANDHE MAATARAM....");
							System.out.println("\n2.ORUVAN ORUVAN MUDHAL....");
							System.out.println("\n3.SAKTHIKODUUU....");
							System.out.println("\n4.KAPPAL AERRI....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------------");
							System.out.println("\n.......PLAYING MOTIVATIONAL SONGS.......");
							System.out.println("\n----------------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING VANDHE MAATARAM...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYINGORU ORUVAN ORUVAN MUDHAL....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING SSAKTHIKODUUU. ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING KAPPAL AERRI.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==4)
						{
							System.out.println("------------------------------");
							System.out.println("     **SAD SWARANGAL**");
							System.out.println("------------------------------");
							System.out.println("\n1.PONGATRILE....");
							System.out.println("\n2.MARUDHANI MARUDHANI....");
							System.out.println("\n3.MINALE ENN VALVIN....");
							System.out.println("\n4.ORU POIYAVADHU SOL.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING PONGATRILE..");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING MARUDHANI MARUDHANI...");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING MINALE ENN VALVIN ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING ORU POIYAVADHU SOL.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else
						{
							System.out.println("INVALID OPTION");
						}
					}
				else if(opt==4)
					{
					System.out.println("==================================================");
					System.out.println("      ANIRUDH SONGS");
					System.out.println("==================================================");
					System.out.println(" WHAT's YOUR MOOD \n1.MELODY \n2.KUTHU \n3.MOTIVATIONAL \n4.SAD");
					System.out.print("ENTER YOUR CHOICE: ");
					int o=sc.nextInt();
					if(o==1)
						{
							System.out.println("------------------------------");
							System.out.println("     **MELODY MINDS**");
							System.out.println("------------------------------");
							System.out.println("\n1.NEEYUM NANUM ANBE....");
							System.out.println("\n2.VELICHA POVAE....");
							System.out.println("\n3.PO INDRU NEEYAGA...");
							System.out.println("\n4.NEE PAARTHA VILIGAL.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING MELODY.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING NEEYUM NANUM ANBE.");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING VELICHA POVAE....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING PO INDRU NEEYAGA....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING NEE PAARTHA VILIGAL...");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						
						else if(o==2)
						{
							System.out.println("------------------------------");
							System.out.println("     **KUTHHU PAATTU**");
							System.out.println("------------------------------");
							System.out.println("\n1.VAATHI RAID....");
							System.out.println("\n2.NAAN READYDHAN....");
							System.out.println("\n3.BADASSMAAH...");
							System.out.println("\n4.VANDHA EDAM....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING VAATHI RAID....");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING NAAN READYDHAN.....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING BADASSMAAH....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING VANDHA EDAM.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==3)
						{
							System.out.println("------------------------------");
							System.out.println("   **MOTIVATIONAL HITZ**");
							System.out.println("------------------------------");
							System.out.println("\n1.VELAI ILLA PATTADHARI....");
							System.out.println("\n2.BOOMI ENNA SUTHUDHEI....");
							System.out.println("\n3.EDHIR NEECAHL ADI....");
							System.out.println("\n4.SURVIVA....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------------");
							System.out.println("\n.......PLAYING MOTIVATIONAL SONGS.......");
							System.out.println("\n----------------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING VELAI ILLA PATTADHARI....");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING ORUBOOMI ENNA SUTHUDHEI.....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING EDHIR NEECAHL ADI.....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING SURVIVA.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==4)
						{
							System.out.println("------------------------------");
							System.out.println("     **SAD SWARANGAL**");
							System.out.println("------------------------------");
							System.out.println("\n1.PORKANDA SINGAM....");
							System.out.println("\n2.KANAVE KANAVE....");
							System.out.println("\n3.KANNANA KANNE....");
							System.out.println("\n4.JODI NILAVE.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING PORKANDA SINGAM..");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING KANAVE KANAVE...");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING KANNANA KANNE. ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING JODI NILAVE....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else
						{
							System.out.println("INVALID OPTION");
						}
					}
				else if(opt==5)
					{
					System.out.println("==================================================");
					System.out.println("      HARRISH JEYARAJ SONGS");
					System.out.println("==================================================");
					System.out.println(" WHAT's YOUR MOOD \n1.MELODY \n2.KUTHU \n3.MOTIVATIONAL \n4.SAD");
					System.out.print("ENTER YOUR CHOICE: ");
					int o=sc.nextInt();
					if(o==1)
						{
							System.out.println("------------------------------");
							System.out.println("     **MELODY MINDS**");
							System.out.println("------------------------------");
							System.out.println("\n1.UNNALE UNNALE....");
							System.out.println("\n2.ANUL MAELE....");
							System.out.println("\n3.EDHO ONDRU...");
							System.out.println("\n4.VASEEGARA.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------");
							System.out.println("\n.......PLAYING MELODY.......");
							System.out.println("\n----------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING UNNALE UNNALE...");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING ANUL MAELE....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING EDHO ONDRU....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING VASEEGARA...");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						
						else if(o==2)
						{
							System.out.println("------------------------------");
							System.out.println("     **KUTHHU PAATTU**");
							System.out.println("------------------------------");
							System.out.println("\n1.THIRUNELVELI ALWADA....");
							System.out.println("\n2.AARADI KAATHE...");
							System.out.println("\n3.SODA BOTTTLE...");
							System.out.println("\n4.ARUVA MEESA....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING THIRUNELVELI ALWADA....");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING AARADI KAATHE.....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING SODA BOTTTLE....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING ARUVA MEESA.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==3)
						{
							System.out.println("------------------------------");
							System.out.println("   **MOTIVATIONAL HITZ**");
							System.out.println("------------------------------");
							System.out.println("\n1.INNUM ENNA THOZHA....");
							System.out.println("\n2.KARKA KARKA....");
							System.out.println("\n3.PALA PALA....");
							System.out.println("\n4.ENNAI ARINDHAAL....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------------");
							System.out.println("\n.......PLAYING MOTIVATIONAL SONGS.......");
							System.out.println("\n----------------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING INNUM ENNA THOZHA....");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING KARKA KARKA.....");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING PALA PALA .....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING ENNAI ARINDHAAL.....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						else if(o==4)
						{
							System.out.println("------------------------------");
							System.out.println("     **SAD SWARANGAL**");
							System.out.println("------------------------------");
							System.out.println("\n1.VENMADHI VENMADHIYE....");
							System.out.println("\n2.OH MANAMAE....");
							System.out.println("\n3.YAMMA YAMMA....");
							System.out.println("\n4.OTHAILE.....");
							System.out.print("\nENTER YOUR CHOICE :");int ch=sc.nextInt();
							System.out.println("\n----------------------------------");
							System.out.println("\n.......PLAYING KUTHU PAATTU.......");
							System.out.println("\n----------------------------------");
							if(ch==1)
								{
									System.out.println("PLAYING VENMADHI VENMADHIYE..");
								}
							else if(ch==2)
								{
									System.out.println("PLAYING OH MANAME...");
								}
							else if(ch==3)
								{
									System.out.println("PLAYING YAMMA YAMMA. ....");
								}
							else if(ch==4)
								{
									System.out.println("PLAYING OTHAILE....");
								}
							else
								{
									System.out.println("OOPS WRONG CHOICE ");
								}
							System.out.println("\n----------------------------");
							System.out.println("\n*******THANKYOU******");
							System.out.println("\n----------------------------");
						}
						
					}
					else if(opt==6)
					{
							sc.close();
					}
					else
						{
							System.out.println("INVALID OPTION");
						}	
			}while(true);
			}
	}