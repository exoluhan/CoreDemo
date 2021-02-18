import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		
		int a;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		a=s.nextInt();
		if(a>=-9 && a<=9)
		{
			System.out.println(a+" is single digit number");
		}
		else
		{
			System.out.println(a+" is double digit number");
		}
		

	}

}
