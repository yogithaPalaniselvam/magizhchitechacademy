
package practiceprogram;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample
{
    public static void main(String[] args) throws IOException {
        Biodata b=new Biodata();
        b.getDetails();
        b.addData();
    }
}
class Biodata
{
    int age ;
    String name;
    String gender;
    String birth;
    String blood;
    String quali;
    String clg;
    float percentage;
    String skills[]=new String[10];
    int experience;
    String phone;
    String email;
    String address;
    String father;
    String mother;
    int n;
    Scanner sc=new Scanner(System.in);
    Scanner sr=new Scanner(System.in);
    File f=new File("C:\\Users\\lakhs\\OneDrive\\Documents\\GitHubPrograms","data1.txt");
    
    void getDetails()
    {
        System.out.print("\n----------------------------------------");
        System.out.println("\nENTER PERONAL DETAILS");
        System.out.print("\nNAME         : ");
        name=sc.nextLine();
        System.out.print("\nAGE          : ");
        age=sr.nextInt();
        System.out.print("\nDATEOFBIRTH  : ");
        birth=sc.nextLine();
        System.out.print("\nGENDER  : ");
        gender=sc.nextLine();
        System.out.print("\nBLOOD GROUP  : ");
        blood=sc.nextLine();
        System.out.print("\nENTER EDUCATIONZL QUALIFICATION ");
        System.out.print("\nQUALIFICATION: ");
        quali=sc.nextLine();
        System.out.print("\nCOLLEGE NAME : ");
        clg=sc.nextLine();
        System.out.print("\nPERCENTAGE   : ");
        percentage=sr.nextFloat();
        System.out.print("\nENTER SKILLS YOU KNOW :\n no of SKILLS :");
        n=sr.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("\nSKILLS "+(i+1)+" : ");
            skills[i]=sc.nextLine();
            
        }
        System.out.print("\nEXPERIENCE   : ");
        experience=sr.nextInt();
        System.out.print("\nENTER CONTACT DETAILS ");
        System.out.print("\nPHONE NUMBER : ");
        phone=sc.nextLine();
        System.out.print("\nEMAIL        : ");
        email=sc.nextLine();
        System.out.print("\nADDRESS      : ");
        address=sc.nextLine();
        System.out.print("\nFATHER      : ");
        father=sc.nextLine();
        System.out.print("\nMOTHER     : ");
        mother=sc.nextLine();
        System.out.print("\n----------------------------------------");
        
    }
    void addData() throws IOException
    {
        if(f.createNewFile())
        {
            System.out.println("\nFILE CREATED : "+f.getName());

        }
        else
        {
            System.out.println("\nFILE ALREADY EXISTS");
        }
        FileWriter fw=new  FileWriter(f);
        fw.write("---------------------------------------");
        fw.write("              BIODATA   ");
        fw.write("----------------------------------------");
        fw.write("\nPERSONAL DETAIL");
        fw.write("\nNAME       : "+ name);
        fw.write("\nAGE        : "+ age);
        fw.write("\nGENDER     : "+ gender);
        fw.write("\nBIRTH      : "+ birth);
        fw.write("\nBLOOD GROUP: "+blood);
        fw.write("\nEDUCATIONAL DETAILS");
        fw.write("\nQUALIFICATION: "+quali);
        fw.write("\nCOLLEGE NAME : "+clg);
        fw.write("\nPERCENTAGE : "+String.valueOf(percentage));
        fw.write("\nEXPEREINCE : "+experience);
        fw.write("\nSKILLS");
        for(int i=0;i<n;i++)
        {
            fw.write(skills[i]+",");
        }
        
        fw.write("\nCONTACT");
        fw.write("\nPHONE NUMBER : "+phone);
        fw.write("\nEMAIL       : "+email);
        fw.write("\nADDRESS      : "+address);
        fw.write("FAMILY DETAIL");
        fw.write("\nFATHER NAME  : "+father);
        fw.write("\nMOther NAME  : "+mother);
        fw.write("\n----------------------------------------\n");
        fw.close();
        FileReader fr=new FileReader(f);
        Scanner sf=new Scanner(fr);
        while(sf.hasNextLine())
        {
            String str=sf.nextLine();
            System.out.println(str);
        }
        
    }
}