import java.util.Scanner;

interface Payment 
{
    void pay(double amount);
}


class PaymentByCard implements Payment
{
    double amount;
    double get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the CARD Payment amount :");
        amount=sc.nextDouble();
        return amount;
    }     

    @Override
    public void pay(double amount)
    {
        System.out.print("PAYMENT BY CARD RECIEVED SUCCESSFULLY  : "+amount);
    }     
            
}



class PaymentByUPI implements Payment
{
    double amount;
    double get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the UPI Payment amount :");
        amount=sc.nextDouble();
        return amount;
    }     

    @Override
    public void pay(double amount)
    {
        System.out.print("PAYMENT BY UPI RECIEVED SUCCESSFULLY  : "+amount);
    }     
            
}

class PaymentMain
{
    public static void main(String args[])
    {
        PaymentByCard pa=new PaymentByCard();
        double amount=pa.get();
        pa.pay(amount);
        System.out.println();
        PaymentByUPI pa1=new PaymentByUPI();
        amount=pa1.get();
        pa1.pay(amount);
    }
    
}
