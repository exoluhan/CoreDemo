import java.util.Scanner;

public class WhileSumSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n=s.nextInt();
		while(i<=n)
		{
			sum = sum +i;
			i=i+1;
			
		}
		System.out.println("sum= " +sum);

	}

}
