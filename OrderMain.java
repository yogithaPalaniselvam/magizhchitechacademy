
package enumexample;

import java.util.Scanner;

enum OrderDetail
{
    PACKED,SHIPPED,DELIVERED,CANCELLED
}
class Order 
{
   
    OrderDetail status=OrderDetail.SHIPPED;
    void showStatus()
    {
        switch(status)
        {
            case PACKED ->{System.out.println("ORDER PACKED");}
            case SHIPPED->{System.out.println("ORDER SHIPPED!!!WILL DELIVER SOON");}
            case DELIVERED->{System.out.println("ORDER OUT FOR DELIVERY AND DELIVERED");}
            case CANCELLED->{System.out.println("ORDER CANCELLED !!OOOPS");}
            
        }
    }  
    void  check()
        {
            if(status==OrderDetail.DELIVERED)
            {
                System.out.println("DELIVERED THE PRODUCT SUCCESSFULL");
            }
            else
            {
                System.out.println("DELIVER PENDING");
            }
        }
    
}
public class OrderMain
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do   
        {
            System.out.println("ENTER CHOICE\n1.SHOW STATUS\n2.CHECK ORDER RECIEVED\n3.EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
                 case 1:
                     Order o=new Order();
                     o.showStatus();
                     break;
                 case 2:
                     Order o1=new Order();
                     o1.check();
                     break;
            }
                    
                        
        }while (ch!=3);
    }
}