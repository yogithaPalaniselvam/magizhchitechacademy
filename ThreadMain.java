package threadexample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintDelay extends Thread
{
    int a=1;
    @Override
    public void run()
    {
        for(a=1;a<=5;a++)
        {
            System.out.println(" "+a);
            try  
            {
              sleep(1000);
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(PrintDelay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class ThreadMain {

   
    public static void main(String[] args) 
    {
        PrintDelay p=new PrintDelay();
        p.start();
        
    }
    
}
