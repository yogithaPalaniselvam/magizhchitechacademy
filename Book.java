
package arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement 
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        ArrayList<Book> books=new ArrayList();
        do
            {
                
                System.out.println("\n1.ADD BOOK\n2.VIEW ALL BOOK\n3.SEARCH BOOK\n4.STATUS\n5.DELETE BOOK\n6.EXIT");
                ch=sc.nextInt();
                switch(ch)
                    {
                        case 1:
                            {
                                Book b=new Book();
                                b.get();
                                books.add(b);
                                break;
                            }
                        case 2:
                            {
                                for(Book b:books)
                                {
                                    System.out.println("\n-------------------------");
                                    System.out.println(b);
                                    b.display();
                                    System.out.println("\n-------------------------");
                                }
                                break;
                            }
                        case 3:
                            {
                                System.out.println("\n ENTER THE Id OF BOOK : ");
                                int id=sc.nextInt();
                                boolean found=false;
                                 for(Book b:books)
                                {
                                    if(b.bookId==id)
                                    {
                                        found=true;
                                        System.out.println(b);
                                    }
                                }
                                 if(found== false)
                                 {
                                     System.out.println("BOOK NOT FOUNdD : "+id);
                                 }
                                break;
                            }
                        case 4:
                            {
                                System.out.println("\n ENTER THE ID OF BOOK : ");
                                int id=sc.nextInt();
                                boolean found=false;
                                 for(Book b:books)
                                {
                                    if(b.bookId==id)
                                    {
                                        found=true;
                                        if(b.status==true)
                                        {
                                             System.out.println("/nSTATUS     : AVAILABLE");

                                        }
                                        else
                                        {
                                             System.out.println("\nSTATUS     : ISSUED");

                                        }
                                            
                                        
                                    }
                                }
                                 if(found== false)
                                 {
                                     System.out.println("\nNOT FOUND : "+id);
                                 }
                                break;
                            }
                            case 5:
                            {
                                System.out.println("\n ENTER THE ID NO OF BOOK TO DELETE : ");
                                int id=sc.nextInt();
                                boolean found=false;
                                 for(Book b:books)
                                {
                                    if(b.bookId==id)
                                    {
                                        found=true;
                                        System.out.println(b);
                                        remove(b);                                    
                                    }
                                }
                                 if(found== false)
                                 {
                                     System.out.println("NOT FOUND : "+id);
                                 }
                                break;
                            }
                            

                    }
            }while(ch!=6);
                
    }

    private static void remove(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Book
{
    int bookId;
        String name;
        Scanner sc=new Scanner(System.in);
        Scanner sr=new Scanner(System.in);
        String author;
        Boolean status=true;
        void get()
        {
            System.out.println("----------------------------------");
            System.out.print("\n ENTER BOOK ID    : ");
            bookId=sc.nextInt();
            System.out.print("\n ENTER BOOK NAME  : ");
            name=sr.nextLine();
            System.out.print("\n ENTER BOOK AUTHOR: ");
            author=sr.nextLine();
            status=true;
            System.out.println("\n----------------------------------");

        }
        void display()
        {
            System.out.println("----------------------------------");
            System.out.print("\nBOOK ID    : "+bookId);
            
            System.out.print("\nBOOK NAME  : "+name);
           
            System.out.print("\nBOOK AUTHOR: "+author);
            if(status==true)
                {
                    System.out.print("\nSTATUS   : AVAILABLE");

                }
             else
                {
                    System.out.print("\nSTATUS   : ISSUED");

                }
            
            System.out.println("----------------------------------");
        }
    
}