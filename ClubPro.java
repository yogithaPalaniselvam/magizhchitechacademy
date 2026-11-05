package arraylistexample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentClubManagement 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        Set<String> clubMembers = new HashSet<>();
        
        do
        {
            System.out.println("\n1.ADD MEMBER\n2.REMOVE MEMBER\n3.CHECK MEMBER STATUS\n4.VIEW ALL MEMBERS\n5.TOTAL STRENGTH\n6.EXIT");
            ch = sc.nextInt();
            sc.nextLine(); // Clear scanner buffer
            
            switch(ch)
            {
                case 1:
                    {
                        System.out.print("\n ENTER STUDENT NAME TO ADD: ");
                        String name = sc.nextLine();
                        
                        // HashSet return true if added, false if it is a duplicate
                        if(clubMembers.add(name))
                        {
                            System.out.println(name + " ADDED TO THE CLUB SUCCESSFULLY!");
                        }
                        else
                        {
                            System.out.println("REGISTRATION FAILED: " + name + " IS ALREADY A MEMBER!");
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.print("\n ENTER STUDENT NAME TO REMOVE: ");
                        String name = sc.nextLine();
                        
                        if(clubMembers.remove(name))
                        {
                            System.out.println(name + " REMOVED FROM THE CLUB.");
                        }
                        else
                        {
                            System.out.println("MEMBER NOT FOUND : " + name);
                        }
                        break;
                    }
                case 3:
                    {
                        System.out.print("\n ENTER STUDENT NAME TO CHECK: ");
                        String name = sc.nextLine();
                        
                        if(clubMembers.contains(name))
                        {
                            System.out.println("STATUS     : ACTIVE MEMBER");
                        }
                        else
                        {
                            System.out.println("STATUS     : NOT A MEMBER");
                        }
                        break;
                    }
                case 4:
                    {
                        if(clubMembers.isEmpty())
                        {
                            System.out.println("THE CLUB HAS NO ACTIVE MEMBERS.");
                        }
                        else
                        {
                            System.out.println("\n----------- CLUB ROSTER -----------");
                            for(String member : clubMembers)
                            {
                                System.out.println("- " + member);
                            }
                            System.out.println("-----------------------------------");
                        }
                        break;
                    }
                case 5:
                    {
                        System.out.println("TOTAL CLUB MEMBERS: " + clubMembers.size());
                        break;
                    }
            }
        } while(ch != 6);
    }
}

