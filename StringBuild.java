

package stringexamples;
import java.util.Scanner;
class GenUnicode
{
    void generate(String name,String dept,int year)
    {
        String nam=name.substring(0, 3);
        String dep=dept.substring(0,3);
        System.out.println("UNICODE: "+nam.toUpperCase()+"-"+dep.toUpperCase()+"-"+year);
    }
    
}
public class StringBuild
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        String dept;
        int year;
        System.out.println("--------------------------");
        System.out.println("UNICODE GENERATE");
        System.out.println("--------------------------");
        System.out.println("ENTER NAME : ");
        name=sc.nextLine();
        System.out.println("ENTER DEPARTMENT : ");
        dept=sc.nextLine();
        System.out.println("ENTER YEAR : ");
        year=sc.nextInt();
        GenUnicode gc=new GenUnicode();
        gc.generate(name, dept, year);
        System.out.println("--------------------------");

    }
}
