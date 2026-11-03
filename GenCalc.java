/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericex;

import java.util.Scanner;

class Calculator <T extends Number>
{
    T a,b;
    T s;

    public Calculator(T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    void add()
    {
        if((a instanceof Integer )&& (b instanceof Integer))
        {
        System.out.println("SUM OF "+ a +"+"+b+"="+(a.intValue()+b.intValue()));
        }
        else if((a instanceof Double)&& (b instanceof Double))
        {
            System.out.println("SUM OF "+ a +"+"+b+"="+(a.doubleValue()+b.doubleValue()));
        }

    }
    void sub()
    {
        if((a instanceof Integer )&& (b instanceof Integer))
        {
        System.out.println("SUB OF "+ a +"+"+b+"="+(a.intValue()-b.intValue()));
        }
        else if((a instanceof Double)&& (b instanceof Double))
        {
            System.out.println("SUB OF "+ a +"+"+b+"="+(a.doubleValue()-b.doubleValue()));
        }

    }
    
}
public class CalcGen
{
    public static void main(String[] args) 
    {
    
        Scanner sc=new Scanner(System.in);

        int ch;
        do
        {
            System.out.println("ENTER CHOICE\n1.INTEGER CALC\n2.DOUBLE CALC\n3.EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("ENTER AN INTEGER VALUE A and B");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    Calculator<Integer> obj=new Calculator<>(a,b);
                    obj.add();
                    obj.sub();
                    break;
                case 2:
                    System.out.println("ENTER AN DOUBLE VALUE A and B");
                    double a1=sc.nextDouble();
                    double b1=sc.nextDouble();
                    Calculator<Double> obj1=new Calculator<>(a1,b1);
                    obj1.add();
                    obj1.sub();
                    break;
                    
            }
        }while(ch!=3);    
    }
}
