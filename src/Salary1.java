import java.util.Scanner;
public class Salary1 {

 

    public static void main(String[] args) {
        int n,sal;
        String name;
        float m,b,h,p,res,sp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the Employee: ");
        name=s.nextLine();
        System.out.println("Enter the Employee Number: ");
        n=s.nextInt();
        System.out.println("Enter the Annual Salary of the Employee: ");
        sal=s.nextInt();
        m=(float)sal/12;
        System.out.println("You Monthly Salary is: "+m);
        b=(float)30/100*m;
        h=(float)12/100*m;
        p=(float)12/100*m;
        sp=(float)58/100*m;
        res=(float)(b+h+sp)-p;
        System.out.println("Hello "+name);
        System.out.println("Your Net salary is: "+res);

 

    }

 

}


