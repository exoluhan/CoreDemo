import java.util.Scanner;

public class ForSumSeries {

	public static void main(String[] args) {

int i,n,sum=0;
Scanner s=new Scanner(System.in);

System.out.println("Enter a number: ");
n=s.nextInt();
for(i=1;i<=n;i++)
{
	sum = sum +i;
	
	
}
System.out.println("sum= " +sum);



	}

}
