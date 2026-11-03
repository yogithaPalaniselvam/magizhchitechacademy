
package enumexample;

import static enumexample.TrafficLight.GREEN;
import static enumexample.TrafficLight.RED;
import static enumexample.TrafficLight.YELLOW;
import java.util.Scanner;

enum TrafficLight
{
    RED,YELLOW,GREEN
}
class Signal
{
     Scanner sc=new Scanner(System.in);
     void meaning()
     {
            System.out.println( RED +"->STOP");
            System.out.println( YELLOW +"->GETREADY");
            System.out.println( GREEN +"->GO");

         
     }
     void check()
     {
            System.out.println("ENTER THE SIGNAL RED OR YELLOW OR GREEN");
            String signal=sc.nextLine().toUpperCase().trim();
            TrafficLight tr=TrafficLight.valueOf(signal);
            switch(tr)
            {
                case RED:
                    System.out.println("->STOP");
                    break;
                    case YELLOW:
                    System.out.println("->GET READY");
                    break;
                    case GREEN:
                    System.out.println("->GO");
                    break;
                
            }
                
     }
 }
public class EnumExampleMain 
{

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int ch;
       do
       {
            System.out.println("ENTER YOUR CHOICE\n1.SHOW SIGNAL MEANING \n2.SIGNAL CHECK\n3.EXIT");
             ch=sc.nextInt();
            switch(ch)
            {
                case 11
                        
                    Signal s=new Signal();
                    s.meaning();
                    break;
                case 2:
                    Signal s1=new Signal();
                    s1.check();
                    break;
            }
       }while(ch!=3);
    }
    
}
