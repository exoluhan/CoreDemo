import java.util.Scanner;
public class Student {

 

    public static void main(String[] args) {
        int a,b,c,d,e,n,res;
        String name;
        float avg;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of the student:");
        name=s.nextLine();
        System.out.println("Enter roll no:");
        n=s.nextInt();
        System.out.println("Enter marks scored in 5 subjects: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();
        res=a+b+c+d+e;
        avg=(float)res/5;
        System.out.println("Hello "+name);
        System.out.println("Yor average score is :" +avg);
        if( avg>=90)
        {
            System.out.println("Distintion");
        }
        else if(avg<=89 && avg>=60)
        {
            System.out.println("First class");
        }
        else if(avg<=59 && avg>=40)
        {
            System.out.println("Second class");
        }
       
        else
        {
            System.out.println("Fail");
        }
        
    }

}