
package threadexample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThread 
{
    public static void main(String[] args) {
        Multiple m=new Multiple(18,"yogi");
        Multiple m1=new Multiple(13,"kavin");
        Thread t=new Thread(m);
        Thread t1=new Thread(m1);
        t.start();
       
        t1.start();
    }
}
class Multiple implements Runnable
{
    int age;
    String name;
    Multiple(int age,String name)
            {
               this.age=age;
               this.name=name;
            }
    @Override
    public void run() {
        for(int i=0;i<20;i++)
        {
            if(age>=18)
            {
                
                System.out.println(name+" is "+age +"eligible");
                
        
            }
            else
            {
                System.out.println(name+ " is"+age+"not Eligible");
            }
         }
    }
    
}