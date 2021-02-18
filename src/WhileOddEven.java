
public class WhileOddEven {
	public static void main(String[] args) {
		
		int i=1;
		System.out.println("Odd   Even");
		while(i<=10)// displays nos from 1-10 
		{
			if(i%2!=0)
			{
				System.out.println(i+" \t"+(i+1));
			}
			
			i=i+1;
		}
		
	}
}
