
package genericex;

import java.util.Scanner;

class Storage <T>
{
    T value;
    Storage(T value)
    {
        this.value=value;
    }
    void display()
    {
        System.out.println(" "+value);
    }
}

public class GenericExMain {

   
    public static void main(String[] args) 
    {
      
        Scanner scc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        int ch;
        do
        {
            System.out.println("ENTER CHOICE\n1.STRING VALUE GENERIC\n2.INTEGER VALUE\n3.EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("ENTER AN INTEGER VALUE");
                    String name=scc.nextLine();
                    Storage <String> obj=new Storage<>(name);
                    System.out.println("STRING VALUES ADDED");
                    obj.display();
                    break;
                case 2:
                    System.out.println("ENTER AN INTEGER VALUE");
                    int a=sc.nextInt();
                    Storage <Integer> obj1=new Storage<>(a);
                    System.out.println("INTEGER VALUES ADDED");
                    obj1.display();
                    break;
                    
            }
        }while(ch!=3);
    }
    
}
